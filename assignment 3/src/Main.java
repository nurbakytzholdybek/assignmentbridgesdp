public class Main {

    public static void main(String[] args) {
        GalleryRenderer desktop = new DesktopRenderer();
        GalleryRenderer mobile = new MobileRenderer();

        System.out.println("=== Simple Gallery on Desktop ===");

        PhotoGallery simpleGallery = new SimpleGallery(desktop);
        simpleGallery.show("mountains.jpg");

        System.out.println("\n=== Switching to Mobile ===");

        simpleGallery.setRenderer(mobile);
        simpleGallery.show("mountains.jpg");

        System.out.println("\n=== Slideshow Gallery on Mobile ===");

        PhotoGallery slideshowGallery = new SlideshowGallery(mobile);
        slideshowGallery.show("travel.jpg");

        System.out.println("\n=== Switching to Desktop ===");

        slideshowGallery.setRenderer(desktop);
        slideshowGallery.show("travel.jpg");
    }
}