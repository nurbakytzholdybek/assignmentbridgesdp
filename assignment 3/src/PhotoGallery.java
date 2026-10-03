public abstract class PhotoGallery {
    private GalleryRenderer renderer;

    public PhotoGallery(GalleryRenderer renderer) {
        setRenderer(renderer);
    }

    public final void setRenderer(GalleryRenderer renderer) {
        if (renderer == null) {
            throw new IllegalArgumentException(
                    "Renderer cannot be null"
            );
        }

        this.renderer = renderer;
    }

    protected void displayPhoto(String photo) {
        renderer.renderPhoto(photo);
    }

    public abstract void show(String photo);
}