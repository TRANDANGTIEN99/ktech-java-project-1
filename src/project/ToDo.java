package project;

public class ToDo {
    private String create;
    private String edit;
    private String finish;
    private String delete;
    private String exit;



    public ToDo(String create, String edit, String finish, String delete, String exit) {
        this.create = create;
        this.edit = edit;
        this.finish = finish;
        this.delete = delete;
        this.exit = exit;
    }

    public String getCreate() {
        return create;
    }

    public void setCreate(String create) {
        this.create = create;
    }

    public String getEdit() {
        return edit;
    }

    public void setEdit(String edit) {
        this.edit = edit;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }

    public String getExit() {
        return exit;
    }

    public void setExit(String exit) {
        this.exit = exit;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "create='" + create + '\'' +
                ", edit='" + edit + '\'' +
                ", finish='" + finish + '\'' +
                ", delete='" + delete + '\'' +
                ", exit='" + exit + '\'' +
                '}';
    }
}