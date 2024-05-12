package X;

import android.graphics.Bitmap;
import com.lynx.canvas.loader.CanvasResourceResolver;

/* loaded from: classes15.dex */
public final class VUC extends AbstractC32209CkX {
    public final /* synthetic */ CanvasResourceResolver LIZ;

    public VUC(CanvasResourceResolver canvasResourceResolver) {
        this.LIZ = canvasResourceResolver;
    }

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<W5A>> w4w) {
        if (w4w.LJFF() != null) {
            O5Y.LJIILIIL("KryptonImageLoader", w4w.LJFF().getMessage());
            this.LIZ.LIZ(w4w.LJFF().getMessage());
        } else {
            O5Y.LJIILIIL("KryptonImageLoader", "imageLoadFailed");
            this.LIZ.LIZ("");
        }
    }

    @Override // X.AbstractC32209CkX
    public final void LJI(Bitmap bitmap) {
        O5Y.LJJJ("KryptonImageLoader", "load image success");
        if (bitmap != null) {
            if (bitmap.getHeight() * bitmap.getWidth() * 4 != bitmap.getByteCount()) {
                this.LIZ.LIZ("Decode type of bitmap may not correct !!!");
                return;
            } else {
                this.LIZ.LIZIZ(bitmap);
                return;
            }
        }
        this.LIZ.LIZ("Empty bitmap !!!");
    }
}
