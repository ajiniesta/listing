application {
    title = 'Listing'
    startupGroups = ['listing']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "listing"
    'listing' {
        model      = 'listing.ListingModel'
        view       = 'listing.ListingView'
        controller = 'listing.ListingController'
    }

}
