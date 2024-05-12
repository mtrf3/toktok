package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CzM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33128CzM extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33128CzM() {
        this.LIZJ.LJIIIIZZ(24.0f, 1.26f);
        this.LIZJ.LIZJ(21.75f, 21.75f, false, false, 3.77f, 31.01f);
        this.LIZJ.LJIIJJI(4.65f);
        this.LIZJ.LJIIL(3.94f, -3.3f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, 1.93f, -0.7f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(5.08f);
        C32856Cuy.fl(this.LIZJ);
        C32856Cuy.z1(this.LIZJ);
        this.LIZJ.LJIIJJI(21.86f);
        this.LIZJ.LIZJ(21.75f, 21.75f, false, false, 24.0f, 1.26f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(24.4f, 6.0f);
        this.LIZJ.LJIIJ(0.46f, 0.0f, 0.93f, 0.5f, 1.0f, 1.0f);
        this.LIZJ.LJIIL(0.18f, 1.06f);
        this.LIZJ.LJIIJ(0.5f, 2.81f, 1.82f, 10.28f, 1.82f, 11.94f);
        this.LIZJ.LJIIJ(0.0f, 2.0f, -1.6f, 3.0f, -3.0f, 3.0f);
        this.LIZJ.LJIILJJIL(-3.0f, -1.0f, -3.0f, -3.0f, true);
        this.LIZJ.LJIIJ(0.0f, -1.66f, 1.32f, -9.13f, 1.82f, -11.94f);
        this.LIZJ.LJII(23.4f, 7.0f);
        this.LIZJ.LJIIJ(0.07f, -0.5f, 0.54f, -1.0f, 1.0f, -1.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(19.37f, 30.01f);
        dij.LJIIJJI(-5.08f);
        dij.LJII(10.0f, 33.61f);
        dij.LJIILL(4.31f);
        dij.LJIIL(4.78f, -4.12f);
        dij.LJIIJJI(0.17f);
        dij.LJIJ(47.0f);
        dij.LJIIJJI(4.42f);
        dij.LJIILL(-17.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(33.1f, 47.01f);
        C32856Cuy.P6(dij);
        dij.LJIIL(-4.2f, -6.8f);
        dij.LJIIL(3.76f, -6.2f);
        dij.LJIIJJI(-4.9f);
        dij.LJIIL(-1.82f, 4.0f);
        dij.LJIIJJI(-0.17f);
        dij.LJIIL(-1.77f, -4.0f);
        C32856Cuy.LJI(dij);
        dij.LJIIL(3.8f, 6.3f);
        dij.LJIIL(-4.17f, 6.7f);
        dij.LJIIJJI(4.9f);
        dij.LJIIL(2.34f, -4.63f);
        dij.LJIIJJI(0.14f);
        dij.LJIIL(2.19f, 4.63f);
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
