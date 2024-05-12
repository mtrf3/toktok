package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DDW extends AbstractC39455Fe7 {
    public DDW() {
        this.LIZJ.LJIIIIZZ(44.45f, 24.66f);
        this.LIZJ.LJIIIZ(0.96f, 0.96f, false, true, 1.3f, 0.52f);
        this.LIZJ.LJIIJ(3.02f, 7.91f, 0.28f, 17.2f, -6.6f, 22.21f);
        this.LIZJ.LJIIIZ(0.96f, 0.96f, false, true, -1.37f, -0.28f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-0.76f, -1.17f);
        this.LIZJ.LJIIJ(-0.3f, -0.47f, -0.17f, -1.08f, 0.28f, -1.4f);
        this.LIZJ.LJIIIZ(15.84f, 15.84f, false, false, 5.33f, -17.97f);
        this.LIZJ.LJIIJ(-0.19f, -0.52f, 0.03f, -1.1f, 0.54f, -1.34f);
        Q7L.LIZLLL(this.LIZJ, "p", 1.28f, -0.57f);
        this.LIZJ.LJIILIIL(-7.3f, 3.27f);
        this.LIZJ.LJIIJ(0.5f, -0.23f, 1.1f, 0.0f, 1.26f, 0.52f);
        this.LIZJ.LJIIJ(1.48f, 4.36f, 0.01f, 9.34f, -3.62f, 12.21f);
        this.LIZJ.LJIIJ(-0.43f, 0.34f, -1.05f, 0.2f, -1.35f, -0.26f);
        this.LIZJ.LJIIL(-0.76f, -1.18f);
        this.LIZJ.LJIIJ(-0.3f, -0.46f, -0.17f, -1.07f, 0.25f, -1.43f);
        this.LIZJ.LJIIIZ(7.75f, 7.75f, false, false, 2.36f, -7.95f);
        this.LIZJ.LJIIJ(-0.16f, -0.53f, 0.06f, -1.12f, 0.57f, -1.34f);
        Q7L.LIZLLL(this.LIZJ, "p", 1.28f, -0.57f);
        this.LIZJ.LJIIIIZZ(15.55f, 4.6f);
        this.LIZJ.LJ(7.91f, 4.6f, 1.6f, 10.54f, 1.6f, 18.0f);
        this.LIZJ.LJIIJ(0.0f, 3.5f, 1.4f, 6.67f, 3.66f, 9.05f);
        this.LIZJ.LJIIL(-0.64f, 11.87f);
        this.LIZJ.LJIIJ(-0.17f, 3.4f, 6.28f, 3.48f, 8.43f, 3.48f);
        this.LIZJ.LJIIJ(2.11f, 0.0f, 8.63f, -0.09f, 8.43f, -3.47f);
        this.LIZJ.LJIIL(-0.15f, -3.89f);
        this.LIZJ.LJIIL(0.55f, 0.1f);
        this.LIZJ.LJIIJ(2.17f, 0.42f, 5.61f, 1.08f, 6.91f, -0.86f);
        this.LIZJ.LJIIJ(0.93f, -1.39f, 0.76f, -3.48f, 0.63f, -5.2f);
        this.LIZJ.LJIIIZ(18.8f, 18.8f, false, true, -0.07f, -0.99f);
        this.LIZJ.LJIIJ(1.44f, -0.42f, 3.47f, -1.34f, 2.97f, -3.17f);
        this.LIZJ.LJIIJ(-0.39f, -1.45f, -1.45f, -2.73f, -2.42f, -3.9f);
        this.LIZJ.LJIIL(-0.58f, -0.72f);
        this.LIZJ.LJIIJ(0.14f, -0.75f, 0.21f, -1.52f, 0.21f, -2.3f);
        this.LIZJ.LJIIJ(0.0f, -7.46f, -6.32f, -13.4f, -13.97f, -13.4f);
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
