package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DB2 extends AbstractC39455Fe7 {
    public DB2() {
        C32856Cuy.LLJI(this.LIZJ);
        this.LIZJ.LJIILIIL(-8.85f, -15.27f);
        this.LIZJ.LJII(21.88f, 24.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-6.73f, -6.73f);
        C32856Cuy.uk(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(0.7f, -0.7f);
        C32856Cuy.pk(this.LIZJ);
        this.LIZJ.LJII(24.0f, 21.88f);
        this.LIZJ.LJIIL(6.73f, -6.73f);
        C32856Cuy.pk(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(0.7f, 0.7f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, 0.0f, 1.42f);
        this.LIZJ.LJII(26.12f, 24.0f);
        this.LIZJ.LJIIL(6.73f, 6.73f);
        C32856Cuy.L3(this.LIZJ);
        this.LIZJ.LJII(24.0f, 26.12f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(-6.73f, 6.73f);
        C32856Cuy.Pd(this.LIZJ);
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
