package X;

import android.media.Image;
import android.media.ImageReader;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class P7A implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ Map.Entry LJLIL;
    public final /* synthetic */ P7H LJLILLLLZI;

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Image acquireNextImage = imageReader.acquireNextImage();
        if (acquireNextImage == null) {
            return;
        }
        P6E p6e = new P6E(acquireNextImage.getWidth(), acquireNextImage.getHeight(), System.currentTimeMillis() * 1000);
        p6e.LJI(new P6Y(acquireNextImage.getPlanes()), this.LJLILLLLZI.LIZLLL.LLLIIL(((Integer) this.LJLIL.getKey()).intValue()), this.LJLILLLLZI.LIZIZ, ((Integer) this.LJLIL.getKey()).intValue());
        if (((ConcurrentHashMap) this.LJLILLLLZI.LJIILL).get(this.LJLIL.getKey()) != null) {
            ((P7P) ((ConcurrentHashMap) this.LJLILLLLZI.LJIILL).get(this.LJLIL.getKey())).onFrameCaptured(p6e);
        }
        acquireNextImage.close();
    }

    public P7A(P7H p7h, Map.Entry entry) {
        this.LJLILLLLZI = p7h;
        this.LJLIL = entry;
    }
}
