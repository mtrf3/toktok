package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D7R extends AbstractC39455Fe7 {
    public D7R() {
        this.LIZJ.LJIIIIZZ(15.5f, 5.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p.LJIIJJI(15.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p.LJIILL(2.0f);
        C32856Cuy.yn(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-15.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p3.LJIJ(5.0f);
        p3.LIZLLL();
        this.LIZJ.LJIIIIZZ(10.0f, 15.0f);
        C32856Cuy.lf(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(34.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p4.LJIILL(2.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        C32856Cuy.LJ(this.LIZJ);
        this.LIZJ.LJIIL(-2.0f, 26.0f);
        C32856Cuy.qh(this.LIZJ);
        this.LIZJ.LJIIL(-2.0f, -26.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(7.5f, 6.0f);
        C32856Cuy.Lb(this.LIZJ);
        this.LIZJ.LJIILIIL(9.0f, 0.0f);
        C32856Cuy.Lb(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
