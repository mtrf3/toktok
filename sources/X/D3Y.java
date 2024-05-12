package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D3Y extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D3Y() {
        this.LIZJ.LJIIIIZZ(28.3f, 8.17f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(11.54f);
        this.LIZJ.LJIIJ(0.0f, 0.98f, 1.11f, 1.53f, 1.89f, 0.94f);
        this.LIZJ.LJIIL(3.43f, -2.35f);
        this.LIZJ.LJIIJ(0.4f, -0.3f, 1.35f, -0.32f, 1.77f, -0.02f);
        this.LIZJ.LJIIL(3.73f, 2.5f);
        this.LIZJ.LJIIJ(0.78f, 0.55f, 1.85f, 0.0f, 1.85f, -0.96f);
        this.LIZJ.LJIJ(8.17f);
        this.LIZJ.LJIIJ(0.0f, -0.64f, -0.53f, -1.17f, -1.17f, -1.17f);
        this.LIZJ.LJI(29.47f);
        this.LIZJ.LJIIJ(-0.64f, 0.0f, -1.17f, 0.53f, -1.17f, 1.17f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(24.36f, 8.94f);
        C32856Cuy.An(dij);
        C32856Cuy.LJJLIIIJ(dij);
        dij.LJIIIZ(3.3f, 3.3f, false, false, 5.3f, 2.62f);
        dij.LJIIL(2.83f, -2.17f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.19f, -0.02f);
        dij.LJIIL(3.39f, 2.4f);
        dij.LJIIJ(0.28f, 0.2f, 0.49f, 0.5f, 0.49f, 0.85f);
        dij.LJIILL(6.16f);
        dij.LJIIIZ(3.4f, 3.4f, false, true, -3.4f, 3.4f);
        dij.LJI(15.07f);
        dij.LJIIL(-5.84f, 5.85f);
        dij.LIZJ(1.6f, 1.6f, false, true, 6.5f, 39.4f);
        dij.LJIJ(12.35f);
        dij.LJIIIZ(3.4f, 3.4f, false, true, 3.4f, -3.4f);
        dij.LJIIJJI(14.46f);
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
