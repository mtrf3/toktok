package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DDp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33521DDp extends AbstractC39455Fe7 {
    public C33521DDp() {
        C32856Cuy.S5(this.LIZJ);
        this.LIZJ.LJIILIIL(4.97f, 10.34f);
        this.LIZJ.LJIIIZ(4.73f, 4.73f, false, true, 4.65f, -4.82f);
        this.LIZJ.LJIIIZ(4.73f, 4.73f, false, true, 4.64f, 4.82f);
        this.LIZJ.LJIIIZ(4.73f, 4.73f, false, true, -4.64f, 4.82f);
        this.LIZJ.LJIIIZ(4.73f, 4.73f, false, true, -4.65f, -4.82f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-2.18f, 11.7f);
        this.LIZJ.LJIIIZ(7.21f, 7.21f, false, true, 6.83f, -5.13f);
        this.LIZJ.LJIIIZ(7.21f, 7.21f, false, true, 6.82f, 5.13f);
        this.LIZJ.LJIIJ(0.23f, 0.74f, -0.36f, 1.44f, -1.12f, 1.44f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(8.68f);
        this.LIZJ.LJIIJ(-0.77f, 0.0f, -1.36f, -0.7f, -1.13f, -1.44f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(20.58f, -12.37f);
        this.LIZJ.LJIIJJI(10.99f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.38f, 1.38f, false, true, 0.0f, 2.76f);
        this.LIZJ.LJI(28.13f);
        this.LIZJ.LJIIIZ(1.38f, 1.38f, true, true, 0.0f, -2.76f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-1.38f, 6.9f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(0.0f, -0.76f, 0.62f, -1.38f, 1.38f, -1.38f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(2.74f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.38f, 1.38f, false, true, 0.0f, 2.76f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(-2.74f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJ(-0.76f, 0.0f, -1.38f, -0.62f, -1.38f, -1.38f);
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
