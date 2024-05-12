package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes15.dex */
public final class WEO extends W4V<InterfaceC81599W0t> {
    public final /* synthetic */ WEQ LIZIZ;
    public final /* synthetic */ W4W LIZJ;
    public final /* synthetic */ ImageView LIZLLL;
    public final /* synthetic */ Drawable LJ;
    public final /* synthetic */ C62875Olz LJFF;

    @Override // X.W4V, X.W4Z
    public final void LJ(String str, Throwable th) {
        Drawable drawable = this.LJ;
        if (drawable != null) {
            this.LIZLLL.setImageDrawable(drawable);
            this.LIZLLL.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        WEQ weq = this.LIZIZ;
        if (weq != null) {
            WEP wep = (WEP) weq;
            wep.LIZJ.setImageDrawable(wep.LIZ.LIZIZ(wep.LIZLLL.LIZIZ));
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LJI(Object obj, String str) {
        WEQ weq = this.LIZIZ;
        if (weq != null) {
            weq.getClass();
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        C81392Vwy c81392Vwy;
        Bitmap underlyingBitmap;
        try {
            c81392Vwy = (C81392Vwy) this.LIZJ.getResult();
            if (c81392Vwy != null) {
                try {
                    W5A w5a = (W5A) c81392Vwy.LJI();
                    if ((w5a instanceof W5C) && (underlyingBitmap = ((W5C) w5a).getUnderlyingBitmap()) != null) {
                        ImageView imageView = this.LIZLLL;
                        this.LJFF.getClass();
                        imageView.setImageBitmap(C62875Olz.LIZIZ(underlyingBitmap));
                        this.LIZLLL.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.LIZJ.close();
                    C81392Vwy.LJ(c81392Vwy);
                    throw th;
                }
            }
            this.LIZJ.close();
            C81392Vwy.LJ(c81392Vwy);
            WEQ weq = this.LIZIZ;
            if (weq != null) {
                WEP wep = (WEP) weq;
                C70842RrC c70842RrC = wep.LIZ.LJIILJJIL;
                if (c70842RrC != null) {
                    c70842RrC.LJIIJ(wep.LIZIZ);
                }
                ((WEP) this.LIZIZ).LIZJ.LJZ = true;
            }
        } catch (Throwable th2) {
            th = th2;
            c81392Vwy = null;
        }
    }

    public WEO(C62875Olz c62875Olz, WEP wep, W4W w4w, ImageView imageView, Drawable drawable) {
        this.LJFF = c62875Olz;
        this.LIZIZ = wep;
        this.LIZJ = w4w;
        this.LIZLLL = imageView;
        this.LJ = drawable;
    }
}
