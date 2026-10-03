public class MobileRenderer implements GalleryRenderer {

    @Override
    public void renderPhoto(String photo) {
        System.out.println("Mobile: displaying " + photo);
    }
}