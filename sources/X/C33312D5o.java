package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D5o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33312D5o extends AbstractC39455Fe7 {
    public C33312D5o() {
        this.LIZJ.LJIIIIZZ(22.77f, 2.46f);
        this.LIZJ.LJII(3.59f, 17.42f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, false, 4.82f, 21.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(17.5f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(4.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(11.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        C32856Cuy.LJJLJLI(this.LIZJ);
        C32856Cuy.Tm(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(17.5f, 31.0f);
        C32856Cuy.o5(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(4.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        C32856Cuy.S(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p5.LJIILL(-4.0f);
        p5.LIZLLL();
        this.LIZJ.LJIIIIZZ(17.5f, 41.0f);
        C32856Cuy.o5(this.LIZJ);
        C32856Cuy.B1(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        p6.LJIIJJI(-9.0f);
        p6.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        C32856Cuy.e1(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
