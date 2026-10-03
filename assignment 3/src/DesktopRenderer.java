public class DesktopRenderer implements GalleryRenderer {

    @Override
    public void renderPhoto(String photo) {
        System.out.println("Desktop: displaying " + photo);
    }
}
