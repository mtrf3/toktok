package X;

import android.graphics.Bitmap;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Ckw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32234Ckw implements InterfaceC32232Cku {
    public final /* synthetic */ C32235Ckx LIZ;
    public final /* synthetic */ CountDownLatch LIZIZ;

    @Override // X.InterfaceC32232Cku
    public final void LIZ(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            this.LIZ.LIZ = bitmap.copy(bitmap.getConfig(), true);
        }
        this.LIZIZ.countDown();
    }

    public C32234Ckw(C32235Ckx c32235Ckx, CountDownLatch countDownLatch) {
        this.LIZ = c32235Ckx;
        this.LIZIZ = countDownLatch;
    }
}
