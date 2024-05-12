package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cz3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33109Cz3 extends AbstractC39455Fe7 {
    public C33109Cz3() {
        this.LIZJ.LJIIIIZZ(8.0f, 8.5f);
        this.LIZJ.LIZJ(3.5f, 3.5f, false, false, 4.5f, 12.0f);
        C32856Cuy.LJLLI(this.LIZJ);
        this.LIZJ.LIZJ(3.5f, 3.5f, false, false, 8.0f, 39.5f);
        C32856Cuy.LJJIIJ(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(3.5f, 3.5f, false, false, 3.5f, -3.5f);
        C32856Cuy.j9(this.LIZJ);
        this.LIZJ.LIZJ(3.5f, 3.5f, false, false, 39.0f, 8.5f);
        C32856Cuy.W6(this.LIZJ);
        this.LIZJ.LJIIIIZZ(7.5f, 12.0f);
        C32856Cuy.J1(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(31.0f);
        p2.LJIIJ(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        C32856Cuy.LJLJI(this.LIZJ);
        this.LIZJ.LJIIL(-7.6f, -5.7f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, -1.85f, 0.04f);
        this.LIZJ.LJII(10.46f, 36.5f);
        C32856Cuy.LLLLLZ(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, -0.5f);
        p3.LJIJ(12.0f);
        p3.LIZLLL();
        this.LIZJ.LJIILIIL(23.54f, 11.4f);
        this.LIZJ.LJIIL(8.46f, 6.35f);
        C32856Cuy.J9(this.LIZJ);
        C32856Cuy.C5(this.LIZJ);
        this.LIZJ.LJI(15.18f);
        this.LIZJ.LJIIL(15.86f, -13.1f);
        this.LIZJ.LIZLLL();
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIIZZ(17.0f, 22.0f);
        C32856Cuy.hk(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
