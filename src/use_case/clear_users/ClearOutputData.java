package use_case.clear_users;
import entity.User;
import java.util.List;

public class ClearOutputData {
    private final List<User> deletedUsers;

    public ClearOutputData(List<User> usersDeleted) {
        this.deletedUsers = usersDeleted;
    }

    public List<User> getDeletedUsers() {
        return deletedUsers;
    }
}
