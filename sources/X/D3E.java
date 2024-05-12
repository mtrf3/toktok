package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D3E extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public D3E() {
        this.LIZJ.LIZ(24.0f, 24.0f, 24.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -16095550);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(25.28f, 21.86f);
        dij.LJIIIZ(5.42f, 5.42f, false, true, 2.63f, -2.24f);
        dij.LJIIIZ(5.24f, 5.24f, false, true, 2.03f, -0.36f);
        dij.LJIIJ(1.1f, 0.0f, 2.2f, 0.13f, 3.2f, 0.63f);
        dij.LJIIJ(1.5f, 0.74f, 2.2f, 2.04f, 2.55f, 3.59f);
        dij.LJIIJ(0.23f, 1.14f, 0.34f, 2.3f, 0.31f, 3.47f);
        dij.LJIILL(8.47f);
        dij.LJIIJ(0.0f, 0.24f, -0.06f, 0.31f, -0.3f, 0.3f);
        dij.LJIIJJI(-4.36f);
        dij.LJIIJ(-0.26f, 0.0f, -0.33f, -0.05f, -0.33f, -0.32f);
        dij.LJIILL(-8.03f);
        dij.LJIIJ(0.01f, -0.56f, -0.04f, -1.13f, -0.16f, -1.68f);
        dij.LJIIJ(-0.32f, -1.5f, -1.27f, -2.19f, -2.8f, -2.04f);
        dij.LJIIJ(-1.52f, 0.16f, -2.36f, 1.04f, -2.57f, 2.69f);
        dij.LJIIJ(-0.05f, 0.43f, -0.07f, 0.85f, -0.07f, 1.28f);
        dij.LJIILL(7.78f);
        dij.LJIIJ(0.0f, 0.27f, -0.07f, 0.33f, -0.33f, 0.33f);
        dij.LJI(20.7f);
        dij.LJIIJ(-0.24f, 0.0f, -0.3f, -0.07f, -0.3f, -0.3f);
        dij.LJIJ(19.97f);
        dij.LJIIJ(0.0f, -0.27f, 0.08f, -0.31f, 0.32f, -0.31f);
        dij.LJIIJJI(4.16f);
        dij.LJIIJ(0.27f, 0.0f, 0.32f, 0.08f, 0.31f, 0.32f);
        dij.LJIILL(1.84f);
        dij.LJIIL(0.09f, 0.04f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-131330);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ);
        this.LJI = LIZ;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(17.26f, 27.68f);
        dij2.LJIILL(7.72f);
        dij2.LJIIJ(0.0f, 0.26f, -0.06f, 0.33f, -0.33f, 0.33f);
        dij2.LJIIJJI(-4.38f);
        dij2.LJIIJ(-0.22f, 0.0f, -0.3f, -0.05f, -0.3f, -0.3f);
        dij2.LJIJ(19.96f);
        dij2.LJIIJ(0.0f, -0.21f, 0.04f, -0.3f, 0.26f, -0.3f);
        dij2.LJIIJ(1.48f, 0.02f, 2.96f, 0.02f, 4.44f, 0.0f);
        dij2.LJIIJ(0.27f, 0.0f, 0.3f, 0.1f, 0.3f, 0.32f);
        dij2.LJIILL(7.71f);
        dij2.LIZLLL();
        dij2.LJIIIIZZ(11.88f, 14.55f);
        dij2.LJIIIZ(2.9f, 2.9f, true, true, 5.78f, 0.0f);
        dij2.LJIIIZ(2.9f, 2.9f, false, true, -5.78f, 0.0f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-131586);
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
