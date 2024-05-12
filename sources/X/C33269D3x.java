package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D3x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33269D3x extends AbstractC39455Fe7 {
    public C33269D3x() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(12.0f, 7.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p2.LJIILL(32.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p2.LJIIJJI(24.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        C32856Cuy.q9(this.LIZJ);
        C32856Cuy.C6(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        p3.LJIJ(7.0f);
        C32856Cuy.LLLLIILL(this.LIZJ);
        this.LIZJ.LJIILIIL(16.0f, 2.57f);
        C32856Cuy.m9(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(5.88f);
        this.LIZJ.LJII(28.0f, 9.57f);
        this.LIZJ.LIZLLL();
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIIZZ(7.0f, 8.0f);
        p5.LJIIIZ(5.0f, 5.0f, false, true, 5.0f, -5.0f);
        C32856Cuy.LJIILJJIL(this.LIZJ);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 1.36f, 0.53f);
        this.LIZJ.LJIIL(13.0f, 12.0f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, true, 41.0f, 17.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(23.0f);
        p6.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, 5.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJI(12.0f);
        p7.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, -5.0f);
        p7.LJIJ(8.0f);
        p7.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
