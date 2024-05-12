package X;

import android.graphics.Bitmap;
import android.view.PixelCopy;

/* renamed from: X.OHx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class PixelCopyOnPixelCopyFinishedListenerC61661OHx implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ InterfaceC88471Ynr<Bitmap, Boolean, C76800UCe> LIZ;
    public final /* synthetic */ Bitmap LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public PixelCopyOnPixelCopyFinishedListenerC61661OHx(InterfaceC88471Ynr<? super Bitmap, ? super Boolean, C76800UCe> interfaceC88471Ynr, Bitmap bitmap) {
        this.LIZ = interfaceC88471Ynr;
        this.LIZIZ = bitmap;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        if (i == 0) {
            this.LIZ.invoke(this.LIZIZ, Boolean.TRUE);
        } else {
            this.LIZ.invoke(null, Boolean.FALSE);
        }
    }
}
