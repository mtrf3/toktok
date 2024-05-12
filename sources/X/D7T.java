package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D7T extends AbstractC39455Fe7 {
    public D7T() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(41.0f, 4.2f);
        this.LIZJ.LJIJ(34.17f);
        this.LIZJ.LJIIL(4.7f, 4.7f);
        C32856Cuy.m3(this.LIZJ);
        C32856Cuy.mk(this.LIZJ);
        this.LIZJ.LJII(8.29f, 7.12f);
        C32856Cuy.We(this.LIZJ);
        this.LIZJ.LJIIL(3.48f, 3.48f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(7.4f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 0.87f, -1.0f);
        p2.LJIIL(24.4f, -3.18f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.13f, 1.0f);
        p2.LIZLLL();
        this.LIZJ.LJIILIIL(-22.28f, 7.7f);
        this.LIZJ.LJII(33.83f, 27.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(3.77f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(9.44f);
        this.LIZJ.LJII(18.72f, 11.9f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(8.82f, 19.41f);
        this.LIZJ.LJIIL(9.15f, 9.16f);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, false, true, -9.15f, -9.15f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(18.0f, 37.01f);
        this.LIZJ.LJIJ(21.77f);
        this.LIZJ.LJIIL(-3.4f, -3.4f);
        C32856Cuy.D9(this.LIZJ);
        C32856Cuy.m6(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(7.0f, 7.0f, true, false, 7.0f, 7.0f);
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
