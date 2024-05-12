package X;

import android.media.Image;
import android.media.ImageReader;

/* loaded from: classes12.dex */
public final class P7B implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ P7I LJLIL;

    public P7B(P7I p7i) {
        this.LJLIL = p7i;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Image acquireNextImage = imageReader.acquireNextImage();
        if (acquireNextImage == null) {
            return;
        }
        P6E p6e = new P6E(acquireNextImage.getWidth(), acquireNextImage.getHeight(), System.currentTimeMillis() * 1000);
        P6Y p6y = new P6Y(acquireNextImage.getPlanes());
        int LLLFFI = this.LJLIL.LIZLLL.LLLFFI();
        P7I p7i = this.LJLIL;
        p6e.LJI(p6y, LLLFFI, p7i.LIZIZ, p7i.LIZLLL.LLLLLIL());
        P7P p7p = this.LJLIL.LIZ;
        if (p7p != null) {
            p7p.onFrameCaptured(p6e);
        }
        acquireNextImage.close();
    }
}
