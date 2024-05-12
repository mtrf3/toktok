package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D5p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33313D5p extends AbstractC39455Fe7 {
    public C33313D5p() {
        this.LIZJ.LJIIIIZZ(17.83f, 4.0f);
        this.LIZJ.LIZJ(3.83f, 3.83f, false, false, 14.0f, 7.83f);
        C32856Cuy.j9(this.LIZJ);
        this.LIZJ.LJI(9.83f);
        this.LIZJ.LIZJ(3.83f, 3.83f, false, false, 6.0f, 15.83f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(24.34f);
        this.LIZJ.LIZJ(3.83f, 3.83f, false, false, 9.83f, 44.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(24.34f);
        this.LIZJ.LIZJ(3.83f, 3.83f, false, false, 38.0f, 40.17f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-4.34f);
        p3.LJIIJJI(4.17f);
        this.LIZJ.LIZJ(3.83f, 3.83f, false, false, 46.0f, 32.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(7.83f);
        this.LIZJ.LIZJ(3.83f, 3.83f, false, false, 42.17f, 4.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJI(17.83f);
        this.LIZJ.LIZLLL();
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILIIL(16.34f, 8.0f);
        C32856Cuy.u6(this.LIZJ);
        C32856Cuy.pf(this.LIZJ);
        this.LIZJ.LIZJ(3.83f, 3.83f, false, false, 34.17f, 12.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(10.0f, 40.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIJ(16.0f);
        p7.LJIIJJI(24.0f);
        p7.LJIILL(24.0f);
        C32856Cuy.LLLLIIIILLL(this.LIZJ);
        this.LIZJ.LJIILIIL(8.95f, -20.47f);
        C32856Cuy.LJJIZ(this.LIZJ);
        this.LIZJ.LJIILIIL(5.84f, 7.97f);
        this.LIZJ.LJIIL(-5.04f, 3.28f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIILL(-6.56f);
        this.LIZJ.LJIIL(5.04f, 3.28f);
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
