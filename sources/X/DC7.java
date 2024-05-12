package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DC7 extends AbstractC39455Fe7 {
    public DC7() {
        C32856Cuy.Ld(this.LIZJ);
        this.LIZJ.LJIILIIL(7.33f, -4.16f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(-0.33f, 0.64f, -0.33f, 1.48f, -0.33f, 3.16f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(5.4f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(0.0f, 1.68f, 0.0f, 2.52f, 0.33f, 3.16f);
        p3.LJIIIZ(3.0f, 3.0f, false, false, 1.3f, 1.31f);
        p3.LJIIJ(0.65f, 0.33f, 1.49f, 0.33f, 3.17f, 0.33f);
        C32856Cuy.m0(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(1.68f, 0.0f, 2.52f, 0.0f, 3.16f, -0.33f);
        p4.LJIIIZ(3.0f, 3.0f, false, false, 1.31f, -1.3f);
        p4.LJIIJ(0.33f, -0.65f, 0.33f, -1.49f, 0.33f, -3.17f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(-5.4f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJ(0.0f, -1.68f, 0.0f, -2.52f, -0.33f, -3.16f);
        p6.LJIIIZ(3.0f, 3.0f, false, false, -1.3f, -1.31f);
        this.LIZJ.LJ(23.71f, 11.0f, 22.87f, 11.0f, 21.2f, 11.0f);
        C32856Cuy.vb(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJ(-1.68f, 0.0f, -2.52f, 0.0f, -3.16f, 0.33f);
        p7.LJIIIZ(3.0f, 3.0f, false, false, -1.31f, 1.3f);
        p7.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
