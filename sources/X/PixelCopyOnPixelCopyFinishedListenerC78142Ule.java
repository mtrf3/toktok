package X;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import kotlin.jvm.internal.o;

/* renamed from: X.Ule, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class PixelCopyOnPixelCopyFinishedListenerC78142Ule implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ C78140Ulc LIZ;
    public final /* synthetic */ Bitmap LIZIZ;

    public PixelCopyOnPixelCopyFinishedListenerC78142Ule(C78140Ulc c78140Ulc, Bitmap bitmap) {
        this.LIZ = c78140Ulc;
        this.LIZIZ = bitmap;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        if (i == 0) {
            C78140Ulc c78140Ulc = this.LIZ;
            Bitmap destBitmap = this.LIZIZ;
            o.LJIIIIZZ(destBitmap, "destBitmap");
            c78140Ulc.LIZIZ(destBitmap);
        }
    }
}
