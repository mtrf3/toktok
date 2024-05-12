package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9N extends AbstractC39455Fe7 {
    public D9N() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(9.52f, 0.23f);
        this.LIZJ.LJIIJ(1.88f, -0.61f, 3.47f, 6.09f, 7.39f, 8.09f);
        this.LIZJ.LJIIJ(3.93f, 2.0f, 10.28f, -0.66f, 10.89f, 1.23f);
        this.LIZJ.LJIIJ(0.62f, 1.88f, -6.08f, 3.47f, -8.08f, 7.39f);
        this.LIZJ.LJIIJ(-2.0f, 3.93f, 0.65f, 10.28f, -1.23f, 10.89f);
        this.LIZJ.LJIIJ(-1.9f, 0.62f, -3.48f, -6.08f, -7.4f, -8.08f);
        this.LIZJ.LJIIJ(-3.92f, -2.0f, -10.28f, 0.65f, -10.9f, -1.23f);
        this.LIZJ.LJIIJ(-0.6f, -1.9f, 6.1f, -3.48f, 8.1f, -7.4f);
        this.LIZJ.LJ(10.29f, 7.2f, 7.63f, 0.84f, 9.52f, 0.22f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(24.92f, 23.03f);
        this.LIZJ.LJIIJ(-1.0f, -0.27f, -1.63f, 3.23f, -3.6f, 4.37f);
        this.LIZJ.LJIIJ(-1.97f, 1.14f, -5.32f, -0.06f, -5.6f, 0.93f);
        this.LIZJ.LJIIJ(-0.25f, 0.99f, 3.25f, 1.63f, 4.39f, 3.6f);
        this.LIZJ.LJIIJ(1.14f, 1.97f, -0.06f, 5.32f, 0.93f, 5.59f);
        this.LIZJ.LJIIJ(0.99f, 0.26f, 1.63f, -3.24f, 3.6f, -4.38f);
        this.LIZJ.LJIIJ(1.97f, -1.14f, 5.32f, 0.06f, 5.58f, -0.93f);
        this.LIZJ.LJIIJ(0.27f, -1.0f, -3.23f, -1.63f, -4.37f, -3.6f);
        this.LIZJ.LJIIJ(-1.14f, -1.97f, 0.06f, -5.32f, -0.93f, -5.58f);
        this.LIZJ.LIZLLL();
        C32856Cuy.m5(this.LIZJ);
        C32856Cuy.LJLJLLL(this.LIZJ);
        C32856Cuy.Be(this.LIZJ);
        C32856Cuy.ro(this.LIZJ);
        this.LIZJ.LJIIJ(5.0f, 2.54f, 4.82f, 10.75f, 11.02f, 8.74f);
        this.LIZJ.LJIIJ(6.2f, -2.02f, 1.23f, -8.55f, 3.78f, -13.55f);
        this.LIZJ.LJIILJJIL(10.75f, -4.82f, 8.74f, -11.02f, true);
        C32856Cuy.y4(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
