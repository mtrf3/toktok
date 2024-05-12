package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D5i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33306D5i extends AbstractC39455Fe7 {
    public C33306D5i() {
        this.LIZJ.LJIIIIZZ(28.0f, 6.0f);
        C32856Cuy.E8(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(10.0f);
        p.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, 4.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(20.0f);
        p2.LJIIIZ(4.0f, 4.0f, false, false, 4.0f, 4.0f);
        C32856Cuy.LJIIZILJ(this.LIZJ);
        C32856Cuy.Fi(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(2.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p3.LJIJ(7.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p4.LJIIJJI(-2.0f);
        p4.LIZLLL();
        this.LIZJ.LJIIIIZZ(16.0f, 28.1f);
        this.LIZJ.LJIILL(-8.2f);
        this.LIZJ.LJIIJ(0.0f, -0.4f, 0.43f, -0.63f, 0.77f, -0.42f);
        this.LIZJ.LJIIL(6.55f, 4.1f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, 0.0f, 0.84f);
        this.LIZJ.LJIIL(-6.55f, 4.1f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, -0.77f, -0.42f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(38.0f, 38.0f);
        C32856Cuy.LJ(this.LIZJ);
        C32856Cuy.h9(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(3.0f);
        p5.LJIIIZ(4.0f, 4.0f, false, true, 4.0f, 4.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(20.0f);
        p6.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, 4.0f);
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
