package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D4G extends AbstractC39455Fe7 {
    public D4G() {
        C32856Cuy.Ee(this.LIZJ);
        this.LIZJ.LJIIL(-3.64f, 0.37f);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, false, false, -4.95f, 5.47f);
        C32856Cuy.J9(this.LIZJ);
        this.LIZJ.LIZJ(5.5f, 5.5f, false, false, 8.0f, 41.5f);
        C32856Cuy.LJJIIJZLJL(this.LIZJ);
        C32856Cuy.L0(this.LIZJ);
        this.LIZJ.LJIJ(15.62f);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, false, false, -4.95f, -5.47f);
        this.LIZJ.LJIIL(-3.65f, -0.37f);
        C32856Cuy.v7(this.LIZJ);
        this.LIZJ.LJIIIIZZ(24.0f, 18.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(7.0f, 7.0f, true, false, 7.0f, 7.0f);
        C32856Cuy.Ij(this.LIZJ);
        C32856Cuy.gd(this.LIZJ);
        C32856Cuy.z1(this.LIZJ);
        this.LIZJ.LJIIIZ(11.0f, 11.0f, true, true, -11.0f, -11.0f);
        this.LIZJ.LJIILL(-3.33f);
        this.LIZJ.LJIIIZ(0.6f, 0.6f, false, true, 0.95f, -0.48f);
        this.LIZJ.LJIIL(7.2f, 5.2f);
        this.LIZJ.LJIIJ(0.42f, 0.3f, 0.42f, 0.92f, 0.0f, 1.22f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-7.2f, 5.2f);
        this.LIZJ.LJIIIZ(0.6f, 0.6f, false, true, -0.95f, -0.48f);
        C32856Cuy.LLZZ(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
