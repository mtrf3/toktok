package X;

import android.media.Image;
import android.media.ImageReader;

/* loaded from: classes12.dex */
public final class P7C implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ P7M LJLIL;

    public P7C(P7M p7m) {
        this.LJLIL = p7m;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Image acquireLatestImage = imageReader.acquireLatestImage();
        try {
            if (acquireLatestImage == null) {
                return;
            }
            try {
                P6E p6e = new P6E(acquireLatestImage.getWidth(), acquireLatestImage.getHeight(), System.currentTimeMillis() * 1000);
                P6Y p6y = new P6Y(acquireLatestImage.getPlanes());
                int LLLFFI = this.LJLIL.LIZLLL.LLLFFI();
                P7M p7m = this.LJLIL;
                p6e.LJI(p6y, LLLFFI, p7m.LIZIZ, p7m.LIZLLL.LLLLLIL());
                P7P p7p = this.LJLIL.LIZ;
                if (p7p != null) {
                    p7p.onFrameCaptured(p6e);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        } finally {
            acquireLatestImage.close();
        }
    }
}
