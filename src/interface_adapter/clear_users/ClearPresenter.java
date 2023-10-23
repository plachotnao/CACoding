package interface_adapter.clear_users;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;
import entity.User;

import java.util.stream.Collectors;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
    }

    private String getUsernames(ClearOutputData data) {
        return data.getDeletedUsers().stream().map(User::getName).collect(Collectors.joining("\n"));
    }

    @Override
    public void view(ClearOutputData data) {
        ClearState clearState = clearViewModel.getState();
        String formattedUsernames = getUsernames(data);

        clearState.setUsernames(formattedUsernames);
        clearViewModel.firePropertyChanged();
    }
}
