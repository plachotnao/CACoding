package interface_adapter.clear_users;
import java.util.Objects;

public class ClearState {
    private String usernames;
    public ClearState() {
    }
    public ClearState(String usernames) {
        this.usernames = usernames;
    }
    public void setUsernames(String formattedUsernames) {
        this.usernames=formattedUsernames;
    }

    public Object getUsernames() {
        return usernames;
    }
}
