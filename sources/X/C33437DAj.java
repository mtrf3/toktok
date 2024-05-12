package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DAj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33437DAj extends AbstractC39455Fe7 {
    public C33437DAj() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(5.0f, 10.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p.LJIILL(2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        C32856Cuy.an(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p2.LJI(5.0f);
        p2.LIZLLL();
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIIZZ(26.0f, 30.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p4.LJIIJJI(7.0f);
        C32856Cuy.Z8(this.LIZJ);
        C32856Cuy.F1(this.LIZJ);
        C32856Cuy.Rd(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(7.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p5.LJIIJJI(-2.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p5.LJIILL(-7.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(-7.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p6.LJIILL(-2.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(4.0f, 35.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p7.LJIIJJI(16.0f);
        p7.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p7.LJIILL(2.0f);
        p7.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p7.LJI(5.0f);
        p7.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p7.LJIILL(-2.0f);
        p7.LIZLLL();
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIIIZZ(4.0f, 23.0f);
        p9.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJJI(16.0f);
        p10.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p10.LJIILL(2.0f);
        p10.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p10.LJI(5.0f);
        p10.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p10.LJIILL(-2.0f);
        p10.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
