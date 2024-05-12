package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D2V extends AbstractC39455Fe7 {
    public D2V() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(16.5f, 8.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(32.0f);
        p2.LJIIIZ(8.0f, 8.0f, false, true, 8.0f, 8.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(15.5f);
        C32856Cuy.Yb(this.LIZJ);
        C32856Cuy.n9(this.LIZJ);
        C32856Cuy.ah(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(16.5f);
        C32856Cuy.Ul(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIIZZ(12.0f, 12.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, 4.0f);
        p6.LJIILL(20.0f);
        p6.LJIIIZ(4.0f, 4.0f, false, false, 4.0f, 4.0f);
        C32856Cuy.LJIJI(this.LIZJ);
        C32856Cuy.sj(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIJ(16.0f);
        p7.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, -4.0f);
        C32856Cuy.LLLLIILL(this.LIZJ);
        this.LIZJ.LJIILIIL(7.57f, 7.68f);
        this.LIZJ.LJIIL(8.0f, 5.5f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.0f, 1.64f);
        this.LIZJ.LJIIL(-8.0f, 5.5f);
        this.LIZJ.LIZJ(1.0f, 1.0f, false, true, 18.0f, 31.5f);
        C32856Cuy.Z0(this.LIZJ);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.57f, -0.82f);
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
