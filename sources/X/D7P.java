package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D7P extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D7P() {
        C32856Cuy.Wa(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(34.57f, 23.5f);
        dij.LJIIJ(0.27f, 0.32f, 0.24f, 0.8f, -0.08f, 1.07f);
        dij.LJIIL(-0.37f, 0.33f);
        dij.LJIIIZ(0.75f, 0.75f, true, true, -1.02f, -1.1f);
        dij.LJIIL(0.4f, -0.37f);
        dij.LJIIIZ(0.75f, 0.75f, false, true, 1.07f, 0.08f);
        dij.LIZLLL();
        dij.LJIILIIL(-2.6f, 2.57f);
        dij.LJIIJ(0.34f, 0.24f, 0.42f, 0.7f, 0.17f, 1.04f);
        dij.LJIIJ(-0.19f, 0.27f, -0.37f, 0.55f, -0.54f, 0.82f);
        dij.LJIIIZ(0.75f, 0.75f, true, true, -1.28f, -0.78f);
        dij.LJIIL(0.6f, -0.91f);
        dij.LJIIIZ(0.75f, 0.75f, false, true, 1.05f, -0.17f);
        dij.LIZLLL();
        dij.LJIILIIL(-2.07f, 3.6f);
        dij.LJIIJ(0.4f, 0.12f, 0.61f, 0.54f, 0.48f, 0.94f);
        dij.LJIIJ(-0.1f, 0.3f, -0.18f, 0.62f, -0.25f, 0.94f);
        dij.LJIIIZ(0.75f, 0.75f, false, true, -1.47f, -0.34f);
        dij.LJIIJ(0.09f, -0.36f, 0.18f, -0.7f, 0.3f, -1.06f);
        dij.LJIIJ(0.12f, -0.4f, 0.54f, -0.61f, 0.94f, -0.49f);
        dij.LIZLLL();
        dij.LJIILIIL(-0.87f, 4.06f);
        dij.LJIIJ(0.41f, 0.01f, 0.74f, 0.36f, 0.73f, 0.77f);
        dij.LJIIL(-0.01f, 0.5f);
        dij.LJIIIZ(0.75f, 0.75f, false, true, -1.5f, 0.0f);
        dij.LJIILL(-0.54f);
        dij.LJIIIZ(0.75f, 0.75f, false, true, 0.78f, -0.73f);
        dij.LIZLLL();
        dij.LJIIIIZZ(13.43f, 23.5f);
        dij.LJIIIZ(0.75f, 0.75f, false, false, 0.08f, 1.07f);
        dij.LJIIL(0.37f, 0.33f);
        dij.LJIIIZ(0.75f, 0.75f, true, false, 1.02f, -1.1f);
        dij.LJIIIZ(19.5f, 19.5f, false, false, -0.4f, -0.37f);
        dij.LJIIIZ(0.75f, 0.75f, false, false, -1.07f, 0.08f);
        dij.LIZLLL();
        dij.LJIILIIL(2.6f, 2.57f);
        dij.LJIIIZ(0.75f, 0.75f, false, false, -0.17f, 1.04f);
        dij.LJIIJ(0.19f, 0.27f, 0.37f, 0.55f, 0.54f, 0.82f);
        dij.LJIIIZ(0.75f, 0.75f, true, false, 1.28f, -0.78f);
        dij.LJIIL(-0.6f, -0.91f);
        dij.LJIIIZ(0.75f, 0.75f, false, false, -1.05f, -0.17f);
        dij.LIZLLL();
        dij.LJIILIIL(2.07f, 3.6f);
        dij.LJIIIZ(0.75f, 0.75f, false, false, -0.48f, 0.94f);
        dij.LJIIJ(0.1f, 0.3f, 0.18f, 0.62f, 0.25f, 0.94f);
        dij.LJIIIZ(0.75f, 0.75f, false, false, 1.47f, -0.34f);
        dij.LJIIIZ(14.3f, 14.3f, false, false, -0.3f, -1.06f);
        dij.LJIIIZ(0.75f, 0.75f, false, false, -0.94f, -0.49f);
        dij.LIZLLL();
        dij.LJIILIIL(0.87f, 4.06f);
        dij.LJIIIZ(0.75f, 0.75f, false, false, -0.73f, 0.77f);
        dij.LJIIL(0.01f, 0.5f);
        dij.LJIIIZ(0.75f, 0.75f, false, false, 1.5f, 0.0f);
        dij.LJIILL(-0.54f);
        dij.LJIIIZ(0.75f, 0.75f, false, false, -0.78f, -0.73f);
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
