package project.components;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import project.controllers1.partials.UserCardController;
import project.models.User;

public class UserCardComponent {
    public Node getContent(User user, EventHandler<ActionEvent> editHandler, EventHandler<ActionEvent> deleteHandler, EventHandler<ActionEvent> activeHandler) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../view/partials/user-card.fxml"));
        Node node = loader.load();

        UserCardController controller = loader.getController();
        controller.setUser(user);
        controller.setOnEditAction(editHandler);
        controller.setOnDeleteAction(deleteHandler);
        controller.setOnActiveAction(activeHandler);

        return node;
    }
}