package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Czj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33151Czj extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C33151Czj() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.M5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZJ.LJIIIIZZ(36.67f, 18.83f);
        this.LIZJ.LJIIJ(-3.02f, 0.0f, -5.24f, 2.15f, -6.41f, 5.28f);
        this.LIZJ.LJIIJ(-0.1f, 0.25f, -0.38f, 0.4f, -0.64f, 0.3f);
        this.LIZJ.LJIIL(-1.9f, -0.62f);
        this.LIZJ.LJIIIZ(0.49f, 0.49f, false, true, -0.31f, -0.63f);
        this.LIZJ.LJIIJ(1.41f, -3.83f, 4.46f, -7.33f, 9.26f, -7.33f);
        this.LIZJ.LJIIJ(4.9f, 0.0f, 8.88f, 3.98f, 8.88f, 8.89f);
        this.LIZJ.LJIIJ(0.0f, 2.66f, -1.65f, 5.04f, -3.63f, 6.68f);
        this.LIZJ.LJIIIZ(11.94f, 11.94f, false, true, -6.6f, 2.8f);
        this.LIZJ.LJIIIZ(0.48f, 0.48f, false, true, -0.5f, -0.48f);
        C32856Cuy.LJJLIL(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.53f);
        this.LIZJ.LIZJ(9.1f, 9.1f, false, false, 40.0f, 29.1f);
        this.LIZJ.LJIIJ(1.61f, -1.34f, 2.54f, -2.95f, 2.54f, -4.37f);
        this.LIZJ.LJIIIZ(5.88f, 5.88f, false, false, -5.88f, -5.89f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(38.44f, 41.78f);
        this.LIZJ.LJIIIZ(2.44f, 2.44f, true, true, -4.88f, 0.0f);
        this.LIZJ.LJIIIZ(2.44f, 2.44f, false, true, 4.88f, 0.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJFF = LIZ;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(1.5f, 8.63f);
        dij.LJ(1.5f, 5.52f, 4.02f, 3.0f, 7.13f, 3.0f);
        dij.LJIIJJI(57.74f);
        dij.LJIIJ(3.11f, 0.0f, 5.63f, 2.52f, 5.63f, 5.63f);
        dij.LJIILL(43.3f);
        dij.LJIIJ(0.0f, 3.11f, -2.52f, 5.63f, -5.63f, 5.63f);
        dij.LJI(18.06f);
        dij.LJIIL(-14.0f, 14.0f);
        dij.LIZJ(1.5f, 1.5f, false, true, 1.5f, 70.5f);
        dij.LJIJ(8.62f);
        dij.LIZLLL();
        dij.LJIILIIL(3.0f, 58.25f);
        dij.LJII(16.38f, 55.0f);
        dij.LJIIIZ(1.5f, 1.5f, false, true, 1.06f, -0.44f);
        dij.LJIIJJI(47.44f);
        dij.LJIIIZ(2.62f, 2.62f, false, false, 2.62f, -2.62f);
        dij.LJIJ(8.63f);
        dij.LIZJ(2.62f, 2.62f, false, false, 64.87f, 6.0f);
        dij.LJI(7.13f);
        dij.LIZJ(2.62f, 2.62f, false, false, 4.5f, 8.63f);
        dij.LJIILL(58.25f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJI.LIZ, this.LJFF);
    }
}
