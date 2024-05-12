package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DDV extends AbstractC39455Fe7 {
    public DDV() {
        this.LIZJ.LJIIIIZZ(23.31f, 6.55f);
        this.LIZJ.LJII(8.37f, 21.5f);
        this.LIZJ.LJIIJ(-0.95f, 0.94f, -1.73f, 1.73f, -2.32f, 2.42f);
        this.LIZJ.LJIIIZ(6.9f, 6.9f, false, false, -1.4f, 2.33f);
        this.LIZJ.LJIIIZ(6.75f, 6.75f, false, false, 0.0f, 4.18f);
        this.LIZJ.LJIIIZ(6.9f, 6.9f, false, false, 1.4f, 2.33f);
        this.LIZJ.LJIIJ(0.59f, 0.7f, 1.37f, 1.48f, 2.32f, 2.42f);
        this.LIZJ.LJIIL(2.0f, 2.0f);
        this.LIZJ.LJIIJ(0.95f, 0.95f, 1.73f, 1.74f, 2.43f, 2.32f);
        this.LIZJ.LJIIJ(0.2f, 0.18f, 0.4f, 0.35f, 0.62f, 0.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(7.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p.LJIILL(2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p.LJIIJJI(34.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p.LJIILL(-2.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p2.LJI(21.0f);
        this.LIZJ.LJIIJ(0.22f, -0.15f, 0.43f, -0.32f, 0.63f, -0.5f);
        this.LIZJ.LJIIJ(0.7f, -0.58f, 1.48f, -1.37f, 2.43f, -2.32f);
        this.LIZJ.LJII(39.0f, 22.24f);
        this.LIZJ.LJIIJ(0.95f, -0.95f, 1.73f, -1.73f, 2.32f, -2.42f);
        this.LIZJ.LJIIIZ(6.9f, 6.9f, false, false, 1.4f, -2.34f);
        this.LIZJ.LJIIIZ(6.75f, 6.75f, false, false, 0.0f, -4.17f);
        this.LIZJ.LJIIIZ(6.9f, 6.9f, false, false, -1.4f, -2.33f);
        this.LIZJ.LJIIJ(-0.59f, -0.7f, -1.37f, -1.48f, -2.32f, -2.43f);
        this.LIZJ.LJIIL(-2.0f, -2.0f);
        this.LIZJ.LJIIIZ(44.48f, 44.48f, false, false, -2.42f, -2.32f);
        this.LIZJ.LJIIIZ(6.9f, 6.9f, false, false, -2.34f, -1.4f);
        this.LIZJ.LJIIIZ(6.75f, 6.75f, false, false, -4.17f, 0.0f);
        this.LIZJ.LJIIIZ(6.9f, 6.9f, false, false, -2.33f, 1.4f);
        this.LIZJ.LJIIJ(-0.7f, 0.59f, -1.48f, 1.37f, -2.43f, 2.32f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(7.98f, 27.33f);
        this.LIZJ.LJIIJ(0.09f, -0.26f, 0.27f, -0.59f, 0.74f, -1.14f);
        this.LIZJ.LJIIJ(0.48f, -0.58f, 1.16f, -1.26f, 2.17f, -2.27f);
        this.LIZJ.LJIIL(2.56f, -2.55f);
        this.LIZJ.LJII(24.19f, 32.1f);
        this.LIZJ.LJIIL(-2.56f, 2.56f);
        this.LIZJ.LJIIIZ(43.03f, 43.03f, false, true, -2.26f, 2.18f);
        this.LIZJ.LJIIJ(-0.56f, 0.47f, -0.89f, 0.65f, -1.15f, 0.73f);
        this.LIZJ.LJIIJ(-0.65f, 0.22f, -1.36f, 0.22f, -2.01f, 0.0f);
        this.LIZJ.LJIIJ(-0.26f, -0.08f, -0.6f, -0.26f, -1.15f, -0.73f);
        this.LIZJ.LJIIIZ(42.99f, 42.99f, false, true, -2.27f, -2.18f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(-1.9f, -1.9f);
        this.LIZJ.LJIIIZ(43.03f, 43.03f, false, true, -2.17f, -2.27f);
        this.LIZJ.LJIIIZ(3.52f, 3.52f, false, true, -0.74f, -1.15f);
        this.LIZJ.LJIIIZ(3.25f, 3.25f, false, true, 0.0f, -2.0f);
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
