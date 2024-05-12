package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D4J extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D4J() {
        this.LIZJ.LJIIIIZZ(21.08f, 20.14f);
        this.LIZJ.LJIIJ(0.0f, 2.14f, -1.3f, 3.89f, -2.92f, 3.89f);
        this.LIZJ.LJIIJ(-1.61f, 0.0f, -2.92f, -1.75f, -2.92f, -3.9f);
        this.LIZJ.LJIIJ(0.0f, -2.14f, 1.31f, -3.89f, 2.92f, -3.89f);
        this.LIZJ.LJIIJ(1.61f, 0.0f, 2.92f, 1.75f, 2.92f, 3.9f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(29.84f, 24.03f);
        this.LIZJ.LJIIJ(1.61f, 0.0f, 2.92f, -1.75f, 2.92f, -3.9f);
        this.LIZJ.LJIIJ(0.0f, -2.14f, -1.31f, -3.89f, -2.92f, -3.89f);
        this.LIZJ.LJIIJ(-1.61f, 0.0f, -2.92f, 1.75f, -2.92f, 3.9f);
        this.LIZJ.LJIIJ(0.0f, 2.14f, 1.3f, 3.89f, 2.92f, 3.89f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(6.0f, 15.27f);
        dij.LJ(6.0f, 10.7f, 9.7f, 7.0f, 14.27f, 7.0f);
        dij.LJIIJJI(19.46f);
        dij.LJ(38.3f, 7.0f, 42.0f, 10.7f, 42.0f, 15.27f);
        dij.LJIILL(11.68f);
        dij.LJIIJ(0.0f, 0.4f, -0.16f, 0.76f, -0.43f, 1.03f);
        dij.LJIIL(-14.6f, 14.6f);
        dij.LJIIJ(-0.26f, 0.26f, -0.62f, 0.42f, -1.02f, 0.42f);
        dij.LJI(14.27f);
        dij.LIZJ(8.27f, 8.27f, false, true, 6.0f, 34.73f);
        dij.LJIJ(15.27f);
        dij.LIZLLL();
        dij.LJIILIIL(21.4f, 22.75f);
        dij.LJIIL(9.62f, -9.61f);
        dij.LJIIJJI(-4.26f);
        dij.LJIIIZ(5.35f, 5.35f, false, false, -5.35f, 5.35f);
        dij.LJIILL(4.26f);
        dij.LIZLLL();
        dij.LJIIIIZZ(14.28f, 9.92f);
        dij.LJIIIZ(5.35f, 5.35f, false, false, -5.35f, 5.35f);
        dij.LJIILL(19.46f);
        dij.LJIIJ(0.0f, 2.96f, 2.4f, 5.35f, 5.35f, 5.35f);
        dij.LJIIJJI(10.22f);
        dij.LJIILL(-5.36f);
        dij.LJIIL(-0.49f, 0.01f);
        dij.LJIIJ(-3.87f, 0.0f, -7.37f, -1.6f, -9.71f, -4.2f);
        dij.LJIIIZ(1.95f, 1.95f, false, true, 2.88f, -2.6f);
        dij.LJIIIZ(9.18f, 9.18f, false, false, 7.87f, 2.85f);
        dij.LJIIJ(1.2f, -3.1f, 4.2f, -5.3f, 7.72f, -5.3f);
        dij.LJIIJJI(6.32f);
        dij.LJIJ(15.28f);
        dij.LJIIJ(0.0f, -2.96f, -2.4f, -5.35f, -5.35f, -5.35f);
        dij.LJI(14.27f);
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
