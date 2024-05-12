package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D4U extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D4U() {
        this.LIZJ.LJIIIIZZ(34.14f, 10.11f);
        this.LIZJ.LJIIJ(0.0f, -0.89f, 0.96f, -1.42f, 1.68f, -0.92f);
        this.LIZJ.LJIIL(6.7f, 4.65f);
        this.LIZJ.LJIIJ(0.64f, 0.44f, 0.64f, 1.4f, 0.0f, 1.84f);
        this.LIZJ.LJIIL(-6.7f, 4.65f);
        this.LIZJ.LJIIJ(-0.72f, 0.5f, -1.68f, -0.03f, -1.68f, -0.92f);
        this.LIZJ.LJIILL(-2.35f);
        this.LIZJ.LJIIJ(-4.3f, 0.85f, -8.01f, 3.75f, -9.92f, 7.92f);
        this.LIZJ.LJIIJ(-3.0f, 6.54f, -9.4f, 10.7f, -16.43f, 10.7f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(6.08f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(-0.6f, 0.0f, -1.08f, -0.49f, -1.08f, -1.1f);
        this.LIZJ.LJIILL(-2.22f);
        this.LIZJ.LJIIJ(0.0f, -0.62f, 0.48f, -1.12f, 1.08f, -1.12f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(1.71f);
        this.LIZJ.LJIIJ(5.36f, 0.0f, 10.24f, -3.18f, 12.53f, -8.16f);
        this.LIZJ.LJIIIZ(18.23f, 18.23f, false, true, 13.82f, -10.52f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(10.1f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(34.14f, 35.5f);
        dij.LJIILL(2.39f);
        dij.LJIIJ(0.0f, 0.89f, 0.96f, 1.42f, 1.68f, 0.92f);
        dij.LJIIL(6.7f, -4.65f);
        dij.LJIIJ(0.64f, -0.44f, 0.64f, -1.4f, 0.0f, -1.84f);
        dij.LJIIL(-6.7f, -4.65f);
        dij.LJIIJ(-0.72f, -0.5f, -1.68f, 0.03f, -1.68f, 0.92f);
        C32856Cuy.E9(dij);
        dij.LJIIIZ(13.7f, 13.7f, false, true, -6.57f, -3.32f);
        dij.LJIIIZ(1.15f, 1.15f, false, false, -1.75f, 0.2f);
        dij.LJIIL(-1.3f, 2.07f);
        dij.LJIIJ(-0.29f, 0.46f, -0.21f, 1.07f, 0.2f, 1.41f);
        dij.LJIIIZ(18.95f, 18.95f, false, false, 9.42f, 4.15f);
        dij.LIZLLL();
        dij.LJIIIIZZ(5.0f, 13.48f);
        dij.LJIILL(2.22f);
        dij.LJIIJ(0.0f, 0.61f, 0.48f, 1.11f, 1.08f, 1.11f);
        dij.LJIIJJI(1.71f);
        dij.LJIIJ(3.53f, 0.0f, 6.84f, 1.38f, 9.35f, 3.73f);
        dij.LJIIJ(0.5f, 0.48f, 1.32f, 0.44f, 1.72f, -0.13f);
        dij.LJIIL(1.25f, -1.79f);
        dij.LJIIJ(0.32f, -0.44f, 0.27f, -1.05f, -0.12f, -1.42f);
        dij.LJIIIZ(17.88f, 17.88f, false, false, -12.2f, -4.83f);
        dij.LJI(6.08f);
        dij.LJIIJ(-0.6f, 0.0f, -1.08f, 0.5f, -1.08f, 1.1f);
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
