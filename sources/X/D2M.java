package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D2M extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public D2M() {
        C32856Cuy.Z6(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(31.0f, 13.42f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, -0.35f, -0.47f);
        dij.LJ(28.7f, 12.35f, 26.48f, 12.0f, 24.0f, 12.0f);
        dij.LJ(12.55f, 12.0f, 6.82f, 19.52f, 6.0f, 23.8f);
        dij.LJ(6.82f, 28.08f, 12.55f, 36.0f, 24.0f, 36.0f);
        dij.LJIILJJIL(17.18f, -7.92f, 18.0f, -12.2f, true);
        dij.LJIIIZ(8.58f, 8.58f, false, false, -0.44f, -1.5f);
        dij.LJIIIZ(0.49f, 0.49f, false, false, -0.45f, -0.3f);
        C32856Cuy.E(dij);
        dij.LJIIJ(-0.37f, 0.0f, -0.62f, 0.4f, -0.47f, 0.75f);
        dij.LJIIJ(0.16f, 0.37f, 0.28f, 0.72f, 0.37f, 1.05f);
        dij.LJ(39.03f, 27.3f, 34.08f, 34.0f, 24.0f, 34.0f);
        dij.LJ(13.92f, 34.0f, 8.97f, 27.3f, 8.05f, 23.8f);
        dij.LJ(8.95f, 20.37f, 13.86f, 14.0f, 24.0f, 14.0f);
        dij.LJIIJ(2.4f, 0.0f, 4.5f, 0.36f, 6.32f, 0.94f);
        dij.LJIIJ(0.33f, 0.11f, 0.68f, -0.13f, 0.68f, -0.48f);
        dij.LJIILL(-1.04f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJI = LIZ2;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        C32856Cuy.gi(dij2);
        dij2.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ2);
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
