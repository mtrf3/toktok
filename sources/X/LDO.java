package X;

import android.graphics.drawable.Animatable;
import android.view.View;

/* loaded from: classes10.dex */
public final class LDO extends AbstractC72439Sbr {
    public final /* synthetic */ C72207SVn LJLIL;

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
    }

    public LDO(C72207SVn c72207SVn) {
        this.LJLIL = c72207SVn;
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        int i;
        int LIZIZ;
        Number valueOf;
        int i2 = 90;
        if (c2047581v != null) {
            i2 = c2047581v.LIZIZ;
        }
        if (c2047581v != null) {
            i = c2047581v.LIZ;
        } else {
            i = 64;
        }
        float f = i2 / i;
        double d = f;
        if (d > 1.7d) {
            LIZIZ = C7MY.LIZIZ(50);
        } else if (d >= 1.4d) {
            LIZIZ = C7MY.LIZIZ(54);
        } else if (d >= 1.2d) {
            LIZIZ = C7MY.LIZIZ(58);
        } else {
            LIZIZ = C7MY.LIZIZ(64);
        }
        float f2 = LIZIZ * f;
        if (f2 > O6R.LJJIIZ(C32151Nz.LJIIZILJ(90))) {
            valueOf = C1FJ.LIZIZ(90);
        } else {
            valueOf = Float.valueOf(f2);
        }
        this.LJLIL.LIZLLL(LIZIZ, valueOf.intValue());
    }
}
