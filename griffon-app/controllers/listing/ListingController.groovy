package listing

class ListingController {
    def model
    def view

    // void mvcGroupInit(Map args) {
    //    // this method is called after model and view are injected
    // }

    // void mvcGroupDestroy() {
    //    // this method is called when the group is destroyed
    // }

    def onLoad = {
        println "Loading.... "
    }

    def onRemove = {
        println "Removing...."
    }
}
