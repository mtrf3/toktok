package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D76 extends AbstractC39455Fe7 {
    public D76() {
        C32856Cuy.Lk(this.LIZJ);
        this.LIZJ.LJIIJ(2.6f, 0.0f, 4.93f, 0.44f, 7.0f, 1.27f);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, false, false, -1.0f, 3.9f);
        this.LIZJ.LJIIIZ(14.56f, 14.56f, false, false, -6.0f, -1.17f);
        C32856Cuy.ye(this.LIZJ);
        this.LIZJ.LJIIIIZZ(29.2f, 30.64f);
        C32856Cuy.El(this.LIZJ);
        this.LIZJ.LJIIL(4.95f, 4.95f);
        this.LIZJ.LJIIL(4.95f, -4.95f);
        C32856Cuy.Vj(this.LIZJ);
        C32856Cuy.xk(this.LIZJ);
        this.LIZJ.LJII(39.81f, 37.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(4.95f, 4.95f);
        C32856Cuy.wk(this.LIZJ);
        this.LIZJ.LJIIL(-1.4f, 1.41f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -1.43f, 0.0f);
        this.LIZJ.LJIIL(-4.95f, -4.95f);
        this.LIZJ.LJIIL(-4.95f, 4.95f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.4f, 0.0f);
        this.LIZJ.LJIIL(-1.43f, -1.4f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.0f, -1.43f);
        this.LIZJ.LJII(34.15f, 37.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(-4.95f, -4.95f);
        C32856Cuy.G8(this.LIZJ);
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
