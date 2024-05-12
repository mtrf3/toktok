package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DAT extends AbstractC39455Fe7 {
    public DAT() {
        C32856Cuy.LLJI(this.LIZJ);
        this.LIZJ.LJIILIIL(2.12f, -32.7f);
        this.LIZJ.LJIIL(9.3f, 9.29f);
        C32856Cuy.l2(this.LIZJ);
        this.LIZJ.LJII(29.17f, 26.0f);
        C32856Cuy.la(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(16.17f);
        p.LJIIL(-5.88f, -5.88f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 0.0f, -1.41f);
        p.LJIIL(1.42f, -1.42f);
        C32856Cuy.rk(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
