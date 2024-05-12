package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DC6 extends AbstractC39455Fe7 {
    public DC6() {
        this.LIZJ.LJIIIIZZ(35.0f, 10.76f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.22f, -0.98f);
        this.LIZJ.LJIIL(-15.99f, 3.64f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.78f, 0.97f);
        C32856Cuy.L9(this.LIZJ);
        this.LIZJ.LJIIJ(0.03f, 2.17f, -2.2f, 4.43f, -5.4f, 5.28f);
        this.LIZJ.LJIIJ(-3.56f, 0.96f, -6.96f, -0.2f, -7.6f, -2.57f);
        this.LIZJ.LJIIJ(-0.63f, -2.37f, 1.74f, -5.07f, 5.3f, -6.02f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(9.2f, 9.2f, false, true, 3.7f, -0.25f);
        this.LIZJ.LJIJ(14.39f);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, false, true, 3.9f, -4.87f);
        this.LIZJ.LJIIL(15.98f, -3.64f);
        this.LIZJ.LIZJ(5.0f, 5.0f, false, true, 39.0f, 10.76f);
        this.LIZJ.LJIILL(22.36f);
        this.LIZJ.LJIIJ(0.08f, 2.2f, -2.17f, 4.5f, -5.4f, 5.36f);
        this.LIZJ.LJIIJ(-3.56f, 0.95f, -6.96f, -0.2f, -7.6f, -2.57f);
        this.LIZJ.LJIIJ(-0.63f, -2.38f, 1.74f, -5.08f, 5.3f, -6.03f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(9.2f, 9.2f, false, true, 3.7f, -0.25f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(10.76f);
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
