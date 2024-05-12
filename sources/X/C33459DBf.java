package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DBf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33459DBf extends AbstractC39455Fe7 {
    public C33459DBf() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(6.0f, 10.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p2.LJIILL(2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p2.LJIIJJI(4.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p2.LJIILL(-2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p2.LJI(6.0f);
        p2.LIZLLL();
        C32856Cuy.M1(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(4.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p3.LJIILL(-2.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p3.LJI(6.0f);
        p3.LIZLLL();
        this.LIZJ.LJIIIIZZ(5.0f, 35.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p4.LJIIJJI(4.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p4.LJIILL(2.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJI(6.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p5.LJIILL(-2.0f);
        p5.LIZLLL();
        this.LIZJ.LJIILIIL(11.0f, -25.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p6.LJIILL(2.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p6.LJIIJJI(26.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p6.LJIILL(-2.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p6.LJI(16.0f);
        p6.LIZLLL();
        C32856Cuy.M1(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(26.0f);
        p7.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p7.LJIILL(-2.0f);
        p7.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p7.LJI(16.0f);
        p7.LIZLLL();
        this.LIZJ.LJIILIIL(-1.0f, 13.0f);
        C32856Cuy.ze(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
