package listing

import groovyx.javafx.beans.FXBindable
import griffon.util.GriffonNameUtils

class ListingModel {
    @FXBindable String message
    @FXBindable String messageButtonLoad
    @FXBindable String messageButtonRemove

    void mvcGroupInit(Map args) {
        message = app.getMessage('label.labelInput', app.locale)
        messageButtonLoad = app.getMessage('button.load', app.locale)
        messageButtonRemove = app.getMessage('button.remove', app.locale)
    }
}
