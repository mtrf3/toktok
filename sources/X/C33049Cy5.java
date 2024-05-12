package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cy5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33049Cy5 extends AbstractC39455Fe7 {
    public C33049Cy5() {
        this.LIZJ.LJIIIIZZ(21.0f, 3.25f);
        this.LIZJ.LIZJ(4.75f, 4.75f, false, false, 16.25f, 8.0f);
        C32856Cuy.A1(this.LIZJ);
        this.LIZJ.LJI(7.6f);
        C32856Cuy.Je(this.LIZJ);
        this.LIZJ.LJ(6.0f, 10.76f, 6.0f, 11.04f, 6.0f, 11.6f);
        C32856Cuy.fh(this.LIZJ);
        C32856Cuy.yb(this.LIZJ);
        this.LIZJ.LJIIL(1.68f, 23.23f);
        this.LIZJ.LJIIJ(0.07f, 1.0f, 0.13f, 1.83f, 0.23f, 2.51f);
        this.LIZJ.LJIIJ(0.11f, 0.71f, 0.28f, 1.38f, 0.64f, 2.0f);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, false, false, 2.38f, 2.21f);
        this.LIZJ.LJIIIZ(5.6f, 5.6f, false, false, 2.04f, 0.5f);
        this.LIZJ.LJIIJ(0.69f, 0.05f, 1.52f, 0.05f, 2.52f, 0.05f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(9.88f);
        this.LIZJ.LJIIJ(1.0f, 0.0f, 1.83f, 0.0f, 2.52f, -0.05f);
        this.LIZJ.LJIIIZ(5.6f, 5.6f, false, false, 2.04f, -0.5f);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, false, false, 2.38f, -2.2f);
        this.LIZJ.LJIIIZ(5.6f, 5.6f, false, false, 0.64f, -2.01f);
        this.LIZJ.LJIIJ(0.1f, -0.68f, 0.16f, -1.52f, 0.23f, -2.51f);
        this.LIZJ.LJII(38.43f, 14.0f);
        C32856Cuy.yb(this.LIZJ);
        C32856Cuy.U7(this.LIZJ);
        this.LIZJ.LJIIJJI(-8.65f);
        C32856Cuy.f(this.LIZJ);
        this.LIZJ.LIZJ(4.75f, 4.75f, false, false, 27.0f, 3.25f);
        C32856Cuy.W(this.LIZJ);
        this.LIZJ.LJIIIIZZ(28.25f, 10.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-8.5f);
        C32856Cuy.f(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f);
        C32856Cuy.E0(this.LIZJ);
        this.LIZJ.LJIIJ(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f);
        C32856Cuy.LJLZ(this.LIZJ);
        this.LIZJ.LJIILIIL(-7.65f, 9.0f);
        C32856Cuy.g3(this.LIZJ);
        C32856Cuy.Pk(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(8.0f, 16.0f);
        C32856Cuy.Pk(this.LIZJ);
        C32856Cuy.g3(this.LIZJ);
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
