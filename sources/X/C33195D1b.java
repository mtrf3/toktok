package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D1b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33195D1b extends AbstractC39455Fe7 {
    public C33195D1b() {
        this.LIZJ.LJIIIIZZ(40.0f, 42.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(8.0f);
        p.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        this.LIZJ.LJIJ(25.4f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 0.68f, -1.5f);
        this.LIZJ.LJII(10.0f, 21.0f);
        C32856Cuy.f(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, -2.0f);
        C32856Cuy.LJJII(this.LIZJ);
        C32856Cuy.LJJJJIZL(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(18.0f, 14.66f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 1.32f, 0.5f);
        this.LIZJ.LJIIL(10.0f, 8.74f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 0.68f, 1.5f);
        C32856Cuy.L9(this.LIZJ);
        C32856Cuy.G0(this.LIZJ);
        C32856Cuy.h9(this.LIZJ);
        C32856Cuy.p6(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(7.5f);
        this.LIZJ.LJIIL(2.68f, -2.35f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(2.0f, 2.0f, false, true, 1.32f, -0.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(16.0f, 33.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p5.LJIIJJI(2.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p5.LJIILL(5.0f);
        C32856Cuy.E0(this.LIZJ);
        this.LIZJ.LJIJ(26.31f);
        this.LIZJ.LJIIL(-8.0f, -7.0f);
        this.LIZJ.LJIIL(-8.0f, 7.0f);
        C32856Cuy.L9(this.LIZJ);
        C32856Cuy.E0(this.LIZJ);
        C32856Cuy.g1(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
