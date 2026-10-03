public class SlideshowGallery extends PhotoGallery {

    public SlideshowGallery(GalleryRenderer renderer) {
        super(renderer);
    }

    @Override
    public void show(String photo) {
        System.out.println("Slideshow: starting slide");
        displayPhoto(photo);
        System.out.println("Slideshow: slide finished");
    }
}