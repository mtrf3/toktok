package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cvg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32900Cvg extends AbstractC39455Fe7 {
    public C32900Cvg() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(8.0f, 10.0f);
        C32856Cuy.Cn(this.LIZJ);
        C32856Cuy.LJLLJ(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p2.LJIIJJI(32.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        C32856Cuy.n9(this.LIZJ);
        C32856Cuy.Bn(this.LIZJ);
        this.LIZJ.LJI(22.65f);
        this.LIZJ.LJIIL(-1.75f, -4.37f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.93f, -0.63f);
        C32856Cuy.W6(this.LIZJ);
        this.LIZJ.LJIILIIL(-5.0f, 1.0f);
        C32856Cuy.ji(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(11.97f);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, false, true, 4.64f, 3.14f);
        this.LIZJ.LJIIL(0.74f, 1.86f);
        C32856Cuy.R6(this.LIZJ);
        C32856Cuy.ki(this.LIZJ);
        C32856Cuy.LJLJLJ(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, 5.0f);
        p4.LJI(8.0f);
        p4.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, -5.0f);
        C32856Cuy.LLZLL(this.LIZJ);
        this.LIZJ.LJIILIIL(22.0f, 7.0f);
        C32856Cuy.An(this.LIZJ);
        this.LIZJ.LJIILL(8.62f);
        this.LIZJ.LJIIL(3.43f, -2.98f);
        C32856Cuy.ok(this.LIZJ);
        this.LIZJ.LJIIL(1.3f, 1.52f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.1f, 1.4f);
        this.LIZJ.LJIIL(-7.4f, 6.42f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -1.3f, 0.0f);
        this.LIZJ.LJIIL(-7.4f, -6.41f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.1f, -1.41f);
        this.LIZJ.LJIIL(1.3f, -1.52f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.42f, -0.1f);
        this.LIZJ.LJII(22.0f, 27.62f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(19.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p5.LJIIJJI(2.0f);
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
