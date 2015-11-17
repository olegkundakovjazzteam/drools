package pack;

import java.beans.PropertyChangeSupport;

/**
 *
 */
public class State {
    public static final int NOTRUN = 0;
    public static final int FINISHED = 1;

    private final PropertyChangeSupport changes =
            new PropertyChangeSupport(this);

    private String name;
    private int state;

//    public State(String name, int state) {
//        this.name = name;
//        this.state = state;
//    }

    public State(String name) {
        this.name = name;
        state = NOTRUN;
    }

    public State() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getState() {
        return state;
    }

    public void setState(final int newState) {
        int oldState = this.state;
        this.state = newState;
        this.changes.firePropertyChange("state", oldState, newState);
    }
}