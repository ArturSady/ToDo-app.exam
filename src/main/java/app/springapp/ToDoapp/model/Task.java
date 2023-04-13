package app.springapp.ToDoapp.model;

import jakarta.persistence.*;


@Entity
@Table(name = "tasks")
 class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
      private int id;
      private String description;
      private boolean done;

    public Task() {
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}