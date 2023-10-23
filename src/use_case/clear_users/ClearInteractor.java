package use_case.clear_users;

import entity.User;

import java.util.List;

public class ClearInteractor implements ClearInputBoundary {
    private final ClearUserDataAccessInterface clearUserDataAccessInterface;
    private final ClearOutputBoundary clearOutputBoundary;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface, ClearOutputBoundary clearOutputBoundary) {
        this.clearUserDataAccessInterface = clearUserDataAccessInterface;
        this.clearOutputBoundary = clearOutputBoundary;
    }
    @Override
    public void execute() {
        List<User> users = clearUserDataAccessInterface.deleteAll();
        clearOutputBoundary.view(new ClearOutputData(users));
    }
}
