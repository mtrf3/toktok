package X;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.View;

/* loaded from: classes15.dex */
public final class VGK {
    public final int LIZ;
    public final int LIZIZ;
    public VGG LIZJ;
    public int LIZLLL = -1;
    public int LJ = -1;
    public SurfaceTexture LJFF;
    public Surface LJI;
    public VGJ LJII;
    public InterfaceC88472Yns<? super Bitmap, C76800UCe> LJIIIIZZ;
    public View LJIIIZ;
    public HandlerThread LJIIJ;

    public VGK(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }

    public final void LIZ(View view, InterfaceC88472Yns<? super Bitmap, C76800UCe> interfaceC88472Yns, int i, int i2) {
        int i3 = this.LIZ;
        int i4 = this.LIZIZ;
        this.LJIIIZ = view;
        this.LJIIIIZZ = interfaceC88472Yns;
        HandlerThread LIZ = C06M.LIZ("ViewCapture");
        new Handler(LIZ.getLooper()).post(new VGH(this, i3, i4, interfaceC88472Yns, i, i2, view));
        this.LJIIJ = LIZ;
    }
}
