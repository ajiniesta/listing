package listing

application(title: 'Listing', sizeToScene: true, centerOnScreen: true) {
    scene(fill: WHITE, width: 400, height: 300) {
        fxml(app.getResourceAsURL('Listing.fxml').text) {
            labelInput.textProperty().bind(model.messageProperty())
            buttonLoad.textProperty().bind(model.messageButtonLoadProperty())
            buttonRemove.textProperty().bind(model.messageButtonRemoveProperty())
            buttonLoad.onAction(controller.onLoad)
            buttonRemove.onAction(controller.onRemove)
        }
    }
}
