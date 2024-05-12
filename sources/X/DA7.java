package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DA7 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public DA7() {
        this.LIZJ.LJIILIIL(36.2f, 5.64f);
        this.LIZJ.LJIIL(-21.0f, 3.2f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -1.6f, 1.96f);
        this.LIZJ.LJIILL(19.9f);
        this.LIZJ.LJIIJ(0.0f, 0.14f, -1.72f, 0.74f, -2.6f, 1.05f);
        this.LIZJ.LJIIL(-0.5f, 0.18f);
        this.LIZJ.LJIIJ(-1.4f, 0.47f, -3.9f, 1.73f, -3.9f, 4.95f);
        this.LIZJ.LJIIIZ(4.15f, 4.15f, false, false, 3.9f, 4.28f);
        this.LIZJ.LJIIJ(3.6f, 0.22f, 7.1f, -2.28f, 7.1f, -5.78f);
        this.LIZJ.LJIILL(-19.6f);
        this.LIZJ.LJIIL(17.0f, -2.74f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(10.7f);
        this.LIZJ.LJIIJ(0.0f, 0.32f, 0.3f, 0.56f, 0.62f, 0.48f);
        this.LIZJ.LJIIL(2.62f, -0.65f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.76f, -0.97f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-15.0f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -2.4f, -1.96f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIILIIL(29.25f, 35.89f);
        dij.LJIIL(1.92f, -2.46f);
        dij.LJIIL(-2.55f, -3.27f);
        dij.LJIIJ(-0.58f, -0.78f, -0.37f, -2.67f, 0.77f, -3.7f);
        dij.LJIIJ(0.23f, -0.21f, 0.65f, -0.35f, 0.77f, -0.2f);
        dij.LJIIL(3.29f, 4.24f);
        dij.LJIIL(3.3f, -4.23f);
        dij.LJIIJ(0.11f, -0.16f, 0.53f, -0.02f, 0.76f, 0.19f);
        dij.LJIIJ(1.14f, 1.03f, 1.35f, 2.92f, 0.77f, 3.7f);
        dij.LJIIL(-2.55f, 3.27f);
        dij.LJIIL(1.92f, 2.46f);
        dij.LJIIIZ(3.27f, 3.27f, true, true, -2.69f, 2.4f);
        dij.LJIIL(-1.51f, -1.93f);
        dij.LJIIL(-1.5f, 1.94f);
        dij.LJIIIZ(3.28f, 3.28f, true, true, -2.7f, -2.41f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
