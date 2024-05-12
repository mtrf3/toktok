package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D05 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D05() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(16.0f, 9.0f);
        C32856Cuy.aa(this.LIZJ);
        C32856Cuy.LJ(this.LIZJ);
        C32856Cuy.t9(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -6.0f, -3.0f, -9.0f, -9.0f, -9.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(16.0f);
        p2.LJIJ(9.0f);
        p2.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(9.0f, 16.0f);
        dij.LJIIJJI(18.0f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, 5.0f, 5.0f);
        dij.LJIILL(18.0f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, 5.0f);
        dij.LJI(9.0f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, -5.0f);
        dij.LJIJ(21.0f);
        C32856Cuy.dd(dij);
        dij.LJIILIIL(9.48f, 4.54f);
        dij.LJIIIZ(0.62f, 0.62f, false, false, -1.14f, 0.0f);
        dij.LJIIL(-2.24f, 5.38f);
        dij.LJIIIZ(0.62f, 0.62f, false, true, -0.52f, 0.38f);
        dij.LJIIL(-5.8f, 0.46f);
        dij.LJIIIZ(0.62f, 0.62f, false, false, -0.35f, 1.1f);
        dij.LJIIL(4.42f, 3.78f);
        dij.LJIIJ(0.17f, 0.15f, 0.25f, 0.39f, 0.2f, 0.61f);
        dij.LJIIL(-1.35f, 5.66f);
        dij.LJIIJ(-0.13f, 0.54f, 0.45f, 0.96f, 0.92f, 0.67f);
        dij.LJIIL(4.97f, -3.03f);
        dij.LJIIJ(0.2f, -0.12f, 0.45f, -0.12f, 0.64f, 0.0f);
        dij.LJIIL(4.97f, 3.03f);
        dij.LJIIIZ(0.62f, 0.62f, false, false, 0.93f, -0.67f);
        dij.LJIIL(-1.35f, -5.66f);
        dij.LJIIIZ(0.62f, 0.62f, false, true, 0.2f, -0.61f);
        dij.LJIIL(4.41f, -3.79f);
        dij.LJIIIZ(0.62f, 0.62f, false, false, -0.35f, -1.09f);
        dij.LJIIL(-5.8f, -0.46f);
        dij.LJIIIZ(0.62f, 0.62f, false, true, -0.52f, -0.38f);
        dij.LJIIL(-2.24f, -5.38f);
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
