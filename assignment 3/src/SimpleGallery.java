public class SimpleGallery extends PhotoGallery {

    public SimpleGallery(GalleryRenderer renderer) {
        super(renderer);
    }

    @Override
    public void show(String photo) {
        System.out.println("Simple gallery:");
        displayPhoto(photo);
    }
}