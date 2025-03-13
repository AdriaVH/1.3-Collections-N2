package ex2.classes;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {
    private String name;
    private int score;


    @Override
    public int compareTo(Restaurant r2) {
        int order = r2.getName().compareToIgnoreCase(getName());

        if (order == 0) {
            order = Integer.compare(r2.getScore(), getScore());
        }
        return order;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Restaurant that)) return false;
        return score == that.score && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    public Restaurant(String name, int score) {
        setName(name);
        setScore(score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

}
