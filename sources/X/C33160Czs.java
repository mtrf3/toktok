package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Czs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33160Czs extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33160Czs() {
        this.LIZJ.LJIIIIZZ(7.1f, 25.78f);
        this.LIZJ.LJIIJ(-0.13f, -0.5f, 0.0f, -1.12f, 0.62f, -1.95f);
        this.LIZJ.LJIIJ(0.61f, -0.83f, 1.49f, -1.55f, 2.16f, -2.04f);
        this.LIZJ.LJIIIZ(44.76f, 44.76f, false, true, 8.83f, -4.86f);
        this.LIZJ.LJIIJ(4.34f, -1.74f, 8.94f, -2.6f, 12.5f, -1.09f);
        this.LIZJ.LJIIJ(1.72f, 0.73f, 3.5f, 2.28f, 5.16f, 4.17f);
        this.LIZJ.LJIIL(0.17f, 0.18f);
        this.LIZJ.LJIIJ(-1.4f, -0.56f, -2.9f, -1.02f, -4.33f, -1.18f);
        this.LIZJ.LJIIJ(-4.99f, -0.54f, -9.99f, 1.8f, -13.8f, 4.07f);
        this.LIZJ.LJIIJ(-1.67f, 0.99f, -3.2f, 2.01f, -4.46f, 2.86f);
        this.LIZJ.LJIIL(-0.62f, 0.42f);
        this.LIZJ.LIZJ(39.92f, 39.92f, false, true, 11.0f, 27.8f);
        this.LIZJ.LJIIL(-0.22f, 0.1f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, -3.68f, -2.12f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(33.48f, -3.62f);
        this.LIZJ.LJIIJ(-2.05f, -2.94f, -5.2f, -6.72f, -8.58f, -8.16f);
        this.LIZJ.LJIIJ(-8.66f, -3.68f, -21.0f, 4.5f, -23.3f, 6.17f);
        this.LIZJ.LJIIJ(-1.47f, 1.07f, -4.24f, 3.46f, -3.53f, 6.12f);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, false, false, 6.12f, 3.54f);
        this.LIZJ.LJIIJ(0.77f, -0.2f, 2.09f, -1.1f, 3.78f, -2.23f);
        this.LIZJ.LJ(19.3f, 24.75f, 25.87f, 20.34f, 32.0f, 21.0f);
        this.LIZJ.LJIIJ(2.27f, 0.25f, 5.02f, 1.5f, 7.2f, 2.69f);
        this.LIZJ.LJIIIZ(44.22f, 44.22f, false, true, 2.03f, 1.17f);
        this.LIZJ.LJIIJ(0.45f, 0.27f, 0.98f, -0.23f, 0.7f, -0.67f);
        this.LIZJ.LJIIIZ(49.08f, 49.08f, false, false, -1.35f, -2.03f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(27.42f, 38.64f);
        C32856Cuy.a5(dij);
        C32856Cuy.bc(dij);
        dij.LJIILL(-9.81f);
        dij.LJII(31.61f, 31.0f);
        C32856Cuy.a4(dij);
        dij.LJIIL(0.71f, -0.7f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, 0.0f, -0.71f);
        dij.LJIIL(-4.24f, -4.25f);
        C32856Cuy.A5(dij);
        dij.LJIIL(-4.25f, 4.25f);
        C32856Cuy.U4(dij);
        dij.LJIILL(9.81f);
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
