package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8G extends AbstractC39455Fe7 {
    public D8G() {
        this.LIZJ.LJIIIIZZ(38.45f, 2.26f);
        this.LIZJ.LJIIJ(-0.37f, 1.62f, -0.96f, 3.4f, -1.88f, 4.32f);
        this.LIZJ.LJIIJ(-0.91f, 0.91f, -2.69f, 1.5f, -4.3f, 1.87f);
        this.LIZJ.LJIIJ(-0.36f, 0.08f, -0.36f, 1.02f, 0.0f, 1.1f);
        this.LIZJ.LJIIJ(1.61f, 0.37f, 3.39f, 0.96f, 4.3f, 1.87f);
        this.LIZJ.LJIIJ(0.92f, 0.92f, 1.51f, 2.7f, 1.88f, 4.32f);
        this.LIZJ.LJIIJ(0.08f, 0.35f, 1.02f, 0.35f, 1.1f, 0.0f);
        this.LIZJ.LJIIJ(0.37f, -1.62f, 0.96f, -3.4f, 1.87f, -4.32f);
        this.LIZJ.LJIIJ(0.92f, -0.91f, 2.7f, -1.5f, 4.32f, -1.87f);
        this.LIZJ.LJIIJ(0.35f, -0.08f, 0.35f, -1.02f, 0.0f, -1.1f);
        this.LIZJ.LJIIJ(-1.62f, -0.37f, -3.4f, -0.96f, -4.32f, -1.87f);
        this.LIZJ.LJIIJ(-0.91f, -0.92f, -1.5f, -2.7f, -1.87f, -4.32f);
        this.LIZJ.LJIIJ(-0.08f, -0.35f, -1.02f, -0.35f, -1.1f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(28.0f, 7.71f);
        this.LIZJ.LJIIJ(0.0f, -0.4f, -0.32f, -0.71f, -0.71f, -0.71f);
        this.LIZJ.LIZJ(4.29f, 4.29f, false, false, 23.0f, 11.29f);
        C32856Cuy.LJJLIIIJ(this.LIZJ);
        this.LIZJ.LJIIL(-4.95f, 0.43f);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, true, false, 0.82f, 4.95f);
        this.LIZJ.LJIIL(4.13f, -0.36f);
        this.LIZJ.LJIILL(4.48f);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, true, false, 5.0f, 0.38f);
        C32856Cuy.LJJLI(this.LIZJ);
        this.LIZJ.LJIIL(11.8f, -1.03f);
        this.LIZJ.LJIIIZ(4.29f, 4.29f, false, false, 3.9f, -4.64f);
        this.LIZJ.LJIIIZ(0.71f, 0.71f, false, false, -0.78f, -0.65f);
        this.LIZJ.LJII(28.0f, 22.35f);
        this.LIZJ.LJIJ(7.71f);
        this.LIZJ.LIZLLL();
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(28.0f, 39.0f);
        C32856Cuy.rh(this.LIZJ);
        this.LIZJ.LJIIIIZZ(11.75f, 23.77f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, true, true, 0.52f, 5.98f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, -0.52f, -5.98f);
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
