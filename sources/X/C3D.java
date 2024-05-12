package X;

import android.graphics.Bitmap;

/* loaded from: classes6.dex */
public final class C3D implements C0GM {
    public final /* synthetic */ C30451BxH LIZ;
    public final /* synthetic */ C68322mC<Bitmap> LIZIZ;

    @Override // X.C0GM
    public final void LIZ(C0GY c0gy) {
        C29701Eo c29701Eo;
        C29701Eo c29701Eo2 = this.LIZ.LIZIZ;
        if (c29701Eo2 != null) {
            c29701Eo2.removeLottieOnCompositionLoadedListener(this);
        }
        Bitmap bitmap = this.LIZIZ.element;
        if (bitmap != null && (c29701Eo = this.LIZ.LIZIZ) != null) {
            c29701Eo.updateBitmap("image_4", bitmap);
        }
    }

    public C3D(C30451BxH c30451BxH, C68322mC<Bitmap> c68322mC) {
        this.LIZ = c30451BxH;
        this.LIZIZ = c68322mC;
    }
}
