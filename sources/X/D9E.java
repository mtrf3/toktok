package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9E extends AbstractC39455Fe7 {
    public D9E() {
        this.LIZJ.LJIIIIZZ(32.49f, 5.62f);
        this.LIZJ.LJIIIZ(8.0f, 8.0f, false, false, -11.32f, 0.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-4.06f, 4.06f);
        C32856Cuy.Ik(this.LIZJ);
        this.LIZJ.LJIIL(1.41f, 1.4f);
        C32856Cuy.Ek(this.LIZJ);
        this.LIZJ.LJII(24.0f, 8.45f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, true, 5.66f, 0.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(9.9f, 9.9f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, true, 0.0f, 5.66f);
        this.LIZJ.LJIIL(-4.07f, 4.07f);
        C32856Cuy.Hl(this.LIZJ);
        this.LIZJ.LJIIL(4.06f, -4.06f);
        this.LIZJ.LJIIIZ(8.0f, 8.0f, false, false, 0.0f, -11.32f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(-9.9f, -9.9f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(12.5f, 19.93f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.41f);
        p4.LJIIL(-1.41f, -1.41f);
        C32856Cuy.yk(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(-4.06f, 4.06f);
        this.LIZJ.LJIIIZ(8.0f, 8.0f, false, false, 0.0f, 11.32f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIL(9.9f, 9.9f);
        this.LIZJ.LJIIIZ(8.0f, 8.0f, false, false, 11.3f, 0.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIL(4.07f, -4.07f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.42f);
        p9.LJIIL(-1.41f, -1.41f);
        C32856Cuy.zk(this.LIZJ);
        this.LIZJ.LJII(24.0f, 39.56f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, true, -5.66f, 0.0f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIL(-9.9f, -9.9f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, true, 0.0f, -5.66f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIIL(4.07f, -4.07f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(5.13f, 7.6f);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, 1.42f);
        p12.LJIIL(1.41f, 1.41f);
        C32856Cuy.Ek(this.LIZJ);
        DIJ p13 = this.LIZJ;
        o.LJIIIZ(p13, "p");
        p13.LJIIL(9.9f, -9.9f);
        DIJ p14 = this.LIZJ;
        o.LJIIIZ(p14, "p");
        p14.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.41f);
        p14.LJIIL(-1.41f, -1.41f);
        C32856Cuy.zk(this.LIZJ);
        DIJ p15 = this.LIZJ;
        o.LJIIIZ(p15, "p");
        p15.LJIIL(-9.9f, 9.9f);
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
