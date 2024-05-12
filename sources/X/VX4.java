package X;

import android.graphics.Bitmap;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes15.dex */
public final class VX4 extends AbstractC32209CkX {
    public final /* synthetic */ VX3 LIZ;
    public final /* synthetic */ CountDownLatch LIZIZ;
    public final /* synthetic */ W4W LIZJ;

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<W5A>> w4w) {
        this.LIZ.onFailed();
        if (w4w != null) {
            w4w.close();
        }
        this.LIZIZ.countDown();
    }

    @Override // X.AbstractC32209CkX
    public final void LJI(Bitmap bitmap) {
        if (this.LIZJ.LIZIZ() && bitmap != null) {
            this.LIZ.LIZ(bitmap.copy(bitmap.getConfig(), true));
            this.LIZJ.close();
        }
        this.LIZIZ.countDown();
    }

    public VX4(VX3 vx3, CountDownLatch countDownLatch, W4W w4w) {
        this.LIZ = vx3;
        this.LIZIZ = countDownLatch;
        this.LIZJ = w4w;
    }
}
