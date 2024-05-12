package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D4B extends AbstractC39455Fe7 {
    public D4B() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(14.0f, 23.0f);
        C32856Cuy.Qh(this.LIZJ);
        C32856Cuy.K0(this.LIZJ);
        C32856Cuy.ak(this.LIZJ);
        this.LIZJ.LJIIIIZZ(38.15f, 22.6f);
        this.LIZJ.LJIIIZ(1.04f, 1.04f, false, true, -0.3f, -0.6f);
        this.LIZJ.LIZJ(14.0f, 14.0f, false, false, 26.0f, 10.14f);
        this.LIZJ.LJIIIZ(1.04f, 1.04f, false, true, -0.6f, -0.29f);
        this.LIZJ.LJII(23.15f, 7.6f);
        this.LIZJ.LJIIJ(-0.58f, -0.6f, -0.24f, -1.58f, 0.6f, -1.59f);
        C32856Cuy.A6(this.LIZJ);
        this.LIZJ.LJIIIZ(18.0f, 18.0f, false, true, 18.0f, 18.27f);
        this.LIZJ.LJIIJ(-0.01f, 0.83f, -1.0f, 1.17f, -1.59f, 0.59f);
        this.LIZJ.LJIIL(-2.26f, -2.27f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(7.59f, 23.14f);
        this.LIZJ.LJIIJ(-0.6f, -0.58f, -1.58f, -0.24f, -1.59f, 0.6f);
        C32856Cuy.w9(this.LIZJ);
        this.LIZJ.LJIIIZ(18.0f, 18.0f, false, false, 18.27f, 18.0f);
        this.LIZJ.LJIIJ(0.83f, -0.01f, 1.17f, -1.0f, 0.59f, -1.59f);
        this.LIZJ.LJIIL(-2.27f, -2.26f);
        this.LIZJ.LJIIIZ(1.04f, 1.04f, false, false, -0.59f, -0.3f);
        this.LIZJ.LIZJ(14.0f, 14.0f, false, true, 10.14f, 26.0f);
        this.LIZJ.LJIIIZ(1.04f, 1.04f, false, false, -0.29f, -0.6f);
        this.LIZJ.LJII(7.6f, 23.15f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(22.43f, 34.24f);
        this.LIZJ.LJIIL(10.6f, 10.6f);
        C32856Cuy.Dk(this.LIZJ);
        this.LIZJ.LJIIL(10.6f, -10.6f);
        C32856Cuy.Gk(this.LIZJ);
        this.LIZJ.LJIIL(-10.6f, -10.6f);
        C32856Cuy.yk(this.LIZJ);
        this.LIZJ.LJIIL(-10.6f, 10.6f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, 1.42f);
        p2.LIZLLL();
        this.LIZJ.LJIILIIL(11.31f, 5.66f);
        this.LIZJ.LJIIL(-6.36f, -6.37f);
        this.LIZJ.LJIIL(6.36f, -6.36f);
        this.LIZJ.LJIIL(6.37f, 6.36f);
        this.LIZJ.LJIIL(-6.37f, 6.37f);
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
