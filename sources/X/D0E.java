package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D0E extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D0E() {
        C32856Cuy.R4(this.LIZJ);
        this.LIZJ.LJI(23.48f);
        C32856Cuy.Sb(this.LIZJ);
        this.LIZJ.LJIILL(-2.67f);
        C32856Cuy.Tb(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(16.8f);
        this.LIZJ.LJIIIZ(0.3f, 0.3f, false, false, -0.15f, 0.04f);
        this.LIZJ.LJIIL(-4.8f, 2.94f);
        this.LIZJ.LJIIIZ(0.3f, 0.3f, false, false, -0.15f, 0.25f);
        C32856Cuy.l1(this.LIZJ);
        C32856Cuy.X6(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(9.05f);
        this.LIZJ.LJIIIZ(0.3f, 0.3f, false, true, -0.25f, -0.14f);
        this.LIZJ.LJIIIZ(18.0f, 18.0f, false, true, -2.89f, -9.81f);
        this.LIZJ.LIZLLL();
        C32856Cuy.em(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(20.43f, 31.9f);
        dij.LJIIJ(0.17f, 0.0f, 0.3f, 0.13f, 0.3f, 0.3f);
        dij.LJIILL(12.5f);
        C32856Cuy.X6(dij);
        dij.LJIIJJI(-2.95f);
        C32856Cuy.Sb(dij);
        dij.LJIILL(-9.47f);
        dij.LJIIIZ(0.06f, 0.06f, false, false, -0.1f, -0.05f);
        dij.LJIIL(-2.39f, 1.43f);
        dij.LJIIIZ(0.3f, 0.3f, false, true, -0.45f, -0.25f);
        dij.LJIILL(-2.32f);
        dij.LJIIJ(0.0f, -0.1f, 0.05f, -0.2f, 0.14f, -0.26f);
        dij.LJIIL(3.01f, -1.84f);
        dij.LJIIIZ(0.3f, 0.3f, false, true, 0.16f, -0.04f);
        dij.LJIIJJI(2.88f);
        dij.LIZLLL();
        dij.LJIIIIZZ(27.74f, 35.17f);
        dij.LJIIIZ(0.3f, 0.3f, false, true, 0.27f, 0.17f);
        dij.LJIIL(1.09f, 2.31f);
        dij.LJIIJ(0.1f, 0.23f, 0.43f, 0.23f, 0.54f, 0.0f);
        dij.LJIIL(1.15f, -2.31f);
        dij.LJIIIZ(0.3f, 0.3f, false, true, 0.27f, -0.17f);
        dij.LJIIJJI(2.81f);
        dij.LJIIIZ(0.3f, 0.3f, false, true, 0.27f, 0.44f);
        dij.LJIIL(-2.32f, 4.33f);
        dij.LJIIIZ(0.3f, 0.3f, false, false, 0.0f, 0.29f);
        dij.LJIIL(2.43f, 4.31f);
        dij.LJIIJ(0.11f, 0.2f, -0.03f, 0.46f, -0.26f, 0.46f);
        dij.LJI(31.2f);
        dij.LJIIIZ(0.3f, 0.3f, false, true, -0.26f, -0.17f);
        dij.LJIIL(-1.3f, -2.45f);
        dij.LJIIIZ(0.3f, 0.3f, false, false, -0.54f, 0.0f);
        dij.LJIIL(-1.26f, 2.45f);
        dij.LJIIIZ(0.3f, 0.3f, false, true, -0.27f, 0.17f);
        dij.LJIIJJI(-2.83f);
        dij.LJIIJ(-0.23f, 0.0f, -0.38f, -0.26f, -0.26f, -0.46f);
        dij.LJIIL(2.45f, -4.31f);
        dij.LJIIIZ(0.3f, 0.3f, false, false, 0.0f, -0.3f);
        dij.LJIIL(-2.3f, -4.32f);
        dij.LJIIIZ(0.3f, 0.3f, false, true, 0.27f, -0.44f);
        dij.LJIIJJI(2.84f);
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
