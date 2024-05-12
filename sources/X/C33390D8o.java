package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D8o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33390D8o extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33390D8o() {
        this.LIZJ.LJIIIIZZ(0.84f, 17.65f);
        this.LIZJ.LIZJ(4.07f, 4.07f, false, true, 4.22f, 13.0f);
        this.LIZJ.LJII(46.8f, 6.25f);
        this.LIZJ.LJIIIZ(4.07f, 4.07f, false, true, 4.65f, 3.38f);
        this.LIZJ.LJIIL(0.34f, 2.11f);
        this.LIZJ.LJIIL(16.15f, 3.03f);
        this.LIZJ.LJIIIZ(4.07f, 4.07f, false, true, 3.26f, 4.69f);
        this.LIZJ.LJIIL(-7.02f, 41.1f);
        this.LIZJ.LJIIIZ(4.07f, 4.07f, false, true, -4.68f, 3.33f);
        this.LIZJ.LJIIL(-21.09f, -3.5f);
        this.LIZJ.LJIIL(-26.04f, 4.13f);
        this.LIZJ.LJIIIZ(4.07f, 4.07f, false, true, -4.66f, -3.38f);
        this.LIZJ.LJII(0.84f, 17.65f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(47.12f, 41.23f);
        this.LIZJ.LJIIL(12.05f, 2.0f);
        this.LIZJ.LJIIJ(0.55f, 0.09f, 1.07f, -0.28f, 1.17f, -0.84f);
        this.LIZJ.LJIIL(7.02f, -41.1f);
        this.LIZJ.LJIIJ(0.1f, -0.55f, -0.27f, -1.07f, -0.81f, -1.17f);
        this.LIZJ.LJII(52.3f, 14.94f);
        this.LIZJ.LJIIL(6.05f, 38.18f);
        this.LIZJ.LJIIIZ(4.07f, 4.07f, false, true, -3.38f, 4.65f);
        this.LIZJ.LJIIL(-7.0f, 1.11f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(4.7f, 16.01f);
        this.LIZJ.LJIIJ(-0.56f, 0.09f, -0.94f, 0.6f, -0.85f, 1.16f);
        this.LIZJ.LJIIL(6.82f, 43.04f);
        this.LIZJ.LJII(21.4f, 43.55f);
        this.LIZJ.LJIIIZ(2.54f, 2.54f, false, true, 3.58f, -0.7f);
        this.LIZJ.LJIIL(5.97f, 4.11f);
        this.LIZJ.LJIIL(8.96f, -13.95f);
        this.LIZJ.LJIIIZ(2.54f, 2.54f, false, true, 3.65f, -0.66f);
        this.LIZJ.LJIIL(9.52f, 7.07f);
        this.LIZJ.LJIIL(-4.64f, -29.31f);
        this.LIZJ.LJIIJ(-0.09f, -0.56f, -0.6f, -0.93f, -1.16f, -0.85f);
        this.LIZJ.LJIIL(-42.6f, 6.75f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(49.8f, 38.75f);
        this.LIZJ.LJIIJ(0.55f, -0.09f, 0.92f, -0.61f, 0.84f, -1.17f);
        this.LIZJ.LJIIL(-1.57f, -9.88f);
        this.LIZJ.LJIIL(-11.57f, -8.58f);
        this.LIZJ.LJIIL(-8.96f, 13.93f);
        this.LIZJ.LJIIIZ(2.54f, 2.54f, false, true, -3.58f, 0.7f);
        this.LIZJ.LJIIL(-5.96f, -4.11f);
        this.LIZJ.LJIIL(-10.05f, 15.58f);
        this.LIZJ.LJIIL(40.84f, -6.47f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(17.02f, 23.13f);
        dij.LJIIIZ(3.56f, 3.56f, true, false, 1.11f, 7.04f);
        dij.LJIIIZ(3.56f, 3.56f, false, false, -1.11f, -7.04f);
        dij.LIZLLL();
        dij.LJIILIIL(-5.97f, 4.55f);
        dij.LJIIIZ(6.61f, 6.61f, true, true, 13.06f, -2.07f);
        dij.LJIIIZ(6.61f, 6.61f, false, true, -13.06f, 2.07f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
