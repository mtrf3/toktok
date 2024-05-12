package X;

import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.media.ImageReader;

/* loaded from: classes12.dex */
public final class P7V implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ YQ8 LJLIL;

    public P7V(YQ8 yq8) {
        this.LJLIL = yq8;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        TotalCaptureResult totalCaptureResult;
        Image acquireNextImage = imageReader.acquireNextImage();
        if (acquireNextImage == null) {
            this.LJLIL.LJJJZ(-1000, new Exception("no image data"));
            return;
        }
        YQ8 yq8 = this.LJLIL;
        if (acquireNextImage.getFormat() != 256) {
            totalCaptureResult = this.LJLIL.LJJLIIIJ;
        } else {
            totalCaptureResult = null;
        }
        yq8.LJJL(acquireNextImage, totalCaptureResult);
        this.LJLIL.LJJLIIIJ = null;
        acquireNextImage.close();
    }
}
