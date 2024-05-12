package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D9t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33421D9t extends AbstractC39455Fe7 {
    public C33421D9t() {
        this.LIZJ.LJIIIIZZ(6.5f, 40.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(7.5f);
        p.LJIIJ(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(2.0f);
        p2.LJIIJ(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(31.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(31.0f);
        p4.LJIIJ(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(2.0f);
        p5.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, 0.5f);
        C32856Cuy.LLLLLZ(this.LIZJ);
        this.LIZJ.LIZJ(1.5f, 1.5f, false, true, 6.5f, 40.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(33.6f, -26.38f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJ(0.23f, 0.15f, 0.3f, 0.46f, 0.15f, 0.7f);
        this.LIZJ.LJIIL(-9.28f, 14.34f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, true, -2.14f, 0.4f);
        this.LIZJ.LJIIL(-8.23f, -5.99f);
        this.LIZJ.LJIIL(-6.71f, 11.2f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, -0.69f, 0.17f);
        this.LIZJ.LJIIL(-1.72f, -1.03f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, -0.17f, -0.69f);
        this.LIZJ.LJIIL(7.56f, -12.6f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, true, 2.17f, -0.44f);
        this.LIZJ.LJIIL(8.27f, 6.02f);
        this.LIZJ.LJIIL(8.42f, -13.02f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, 0.7f, -0.14f);
        this.LIZJ.LJIIL(1.67f, 1.08f);
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
