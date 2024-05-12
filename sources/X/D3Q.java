package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D3Q extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public D3Q() {
        this.LIZJ.LJIIIIZZ(14.92f, 40.93f);
        this.LIZJ.LJII(25.64f, 32.0f);
        this.LIZJ.LJIIIZ(17.66f, 17.66f, false, true, -8.96f, -8.23f);
        this.LIZJ.LJIIL(-8.6f, 10.32f);
        this.LIZJ.LJIIIZ(4.86f, 4.86f, false, false, 6.84f, 6.84f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(29.28f, 28.97f);
        this.LIZJ.LJIIIZ(13.64f, 13.64f, false, false, 11.63f, -2.7f);
        this.LIZJ.LJIIJ(-0.7f, -0.03f, -1.4f, -0.13f, -2.08f, -0.27f);
        this.LIZJ.LJIIJ(-3.5f, -0.7f, -7.27f, -2.68f, -10.58f, -5.65f);
        this.LIZJ.LJIIJ(-3.3f, -2.97f, -5.66f, -6.51f, -6.74f, -9.92f);
        this.LIZJ.LJIIJ(-0.23f, -0.72f, -0.4f, -1.46f, -0.52f, -2.2f);
        this.LIZJ.LJIIIZ(13.53f, 13.53f, false, false, -1.45f, 12.1f);
        this.LIZJ.LJIIJ(1.55f, 4.3f, 5.21f, 7.6f, 9.74f, 8.64f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -49299);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(39.63f, 22.08f);
        dij.LJIIJ(-2.69f, -0.54f, -5.83f, -2.13f, -8.7f, -4.7f);
        dij.LJIIJ(-2.87f, -2.58f, -4.78f, -5.54f, -5.6f, -8.15f);
        dij.LJIIJ(-0.76f, -2.37f, -0.55f, -4.15f, 0.18f, -5.27f);
        dij.LJIIIZ(13.6f, 13.6f, false, true, 19.14f, 17.52f);
        dij.LJIIJ(-1.05f, 0.75f, -2.73f, 1.07f, -5.02f, 0.6f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-49299);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ);
        this.LJI = LIZ;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(18.8f, 2.71f);
        dij2.LJIIIZ(0.62f, 0.62f, false, false, -0.7f, -0.6f);
        dij2.LJIIL(-7.26f, 0.9f);
        dij2.LJIIJ(-0.3f, 0.04f, -0.52f, 0.3f, -0.52f, 0.6f);
        dij2.LJIILL(9.63f);
        dij2.LJI(8.39f);
        dij2.LJIIIZ(4.38f, 4.38f, true, false, 4.4f, 4.38f);
        dij2.LJIJ(7.57f);
        dij2.LJIIIZ(0.3f, 0.3f, false, true, 0.26f, -0.3f);
        dij2.LJIIL(5.33f, -0.62f);
        dij2.LJIIIZ(0.5f, 0.5f, false, false, 0.42f, -0.49f);
        dij2.LJIJ(2.71f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-16595489);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
        canvas.drawPath(this.LJII.LIZ, this.LJI);
    }
}
