package X;

import android.graphics.Bitmap;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes6.dex */
public final class CKV implements ILayerControl.CatchViewPic {
    public final /* synthetic */ C68322mC<Bitmap> LIZ;
    public final /* synthetic */ C68322mC<CountDownLatch> LIZIZ;

    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl.CatchViewPic
    public final void onError(Exception exc) {
        this.LIZIZ.element.countDown();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ttlivestreamer.livestreamv2.core.ILayerControl.CatchViewPic
    public final void onSucceed(Bitmap bitmap) {
        this.LIZ.element = bitmap;
        this.LIZIZ.element.countDown();
    }

    public CKV(C68322mC<Bitmap> c68322mC, C68322mC<CountDownLatch> c68322mC2) {
        this.LIZ = c68322mC;
        this.LIZIZ = c68322mC2;
    }
}
