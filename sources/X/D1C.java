package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D1C extends AbstractC39455Fe7 {
    public D1C() {
        this.LIZJ.LJIILIIL(13.34f, 5.34f);
        this.LIZJ.LJIIL(-9.3f, 9.3f);
        C32856Cuy.C8(this.LIZJ);
        this.LIZJ.LJIIL(1.91f, 1.91f);
        C32856Cuy.Dk(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(5.28f, -5.28f);
        C32856Cuy.LL(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(2.7f);
        C32856Cuy.Dn(this.LIZJ);
        this.LIZJ.LJIJ(12.67f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(5.28f, 5.28f);
        C32856Cuy.Dk(this.LIZJ);
        this.LIZJ.LJIIL(1.9f, -1.9f);
        C32856Cuy.Gk(this.LIZJ);
        this.LIZJ.LJIIL(-9.29f, -9.3f);
        this.LIZJ.LJIIIZ(2.35f, 2.35f, false, false, -3.32f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(30.65f, 35.33f);
        C32856Cuy.LLILZLL(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(2.7f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(28.33f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIL(5.28f, -5.28f);
        C32856Cuy.pk(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIL(1.9f, 1.9f);
        C32856Cuy.n3(this.LIZJ);
        this.LIZJ.LJIIJ(-0.92f, 0.91f, -2.4f, 0.91f, -3.32f, 0.0f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIL(-9.3f, -9.3f);
        C32856Cuy.uk(this.LIZJ);
        this.LIZJ.LJIIL(1.91f, -1.9f);
        C32856Cuy.pk(this.LIZJ);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIL(5.28f, 5.28f);
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
