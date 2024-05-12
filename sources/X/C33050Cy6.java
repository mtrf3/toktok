package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cy6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33050Cy6 extends AbstractC39455Fe7 {
    public C33050Cy6() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(2.0f, 13.0f);
        C32856Cuy.O5(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(24.0f);
        p2.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, 5.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(7.0f);
        p3.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, -5.0f);
        C32856Cuy.LLZLLLL(this.LIZJ);
        this.LIZJ.LJIILIIL(9.0f, -5.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, 5.0f);
        p4.LJIILL(2.0f);
        C32856Cuy.LJJIIZ(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(-2.0f);
        p5.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, -5.0f);
        C32856Cuy.LLLLIIL(this.LIZJ);
        this.LIZJ.LJIIIIZZ(6.0f, 19.0f);
        C32856Cuy.C1(this.LIZJ);
        C32856Cuy.LJIILIIL(this.LIZJ);
        C32856Cuy.LJJLJLI(this.LIZJ);
        DIL.LIZ(this.LIZJ, "p", 6.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILIIL(16.0f, 0.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(6.83f);
        this.LIZJ.LJIIIZ(1.95f, 1.95f, true, false, 3.9f, 0.0f);
        C32856Cuy.q9(this.LIZJ);
        DIL.LIZ(this.LIZJ, "p", 22.0f);
        this.LIZJ.LJIILIIL(7.9f, 0.0f);
        C32856Cuy.C1(this.LIZJ);
        C32856Cuy.T6(this.LIZJ);
        C32856Cuy.LJJLJLI(this.LIZJ);
        this.LIZJ.LJI(29.9f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(6.0f, 37.0f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p9.LJIIJJI(34.0f);
        p9.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        C32856Cuy.z9(this.LIZJ);
        this.LIZJ.LJI(29.78f);
        this.LIZJ.LJIIIZ(5.95f, 5.95f, false, true, -11.66f, 0.0f);
        C32856Cuy.LLLLLLZ(this.LIZJ);
        C78269Unh.LIZJ(this.LIZJ, "p", 10.0f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
