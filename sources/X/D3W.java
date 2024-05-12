package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D3W extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D3W() {
        this.LIZJ.LJIIIIZZ(38.88f, 41.7f);
        C32856Cuy.Zh(this.LIZJ);
        this.LIZJ.LJIIL(-3.86f, -3.86f);
        this.LIZJ.LJIIIZ(24.57f, 24.57f, false, false, 6.27f, -9.69f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -0.66f);
        this.LIZJ.LJ(41.0f, 15.8f, 32.66f, 9.0f, 23.0f, 9.0f);
        this.LIZJ.LJIIJ(-3.27f, 0.0f, -6.35f, 0.73f, -9.12f, 2.05f);
        this.LIZJ.LJII(9.12f, 6.29f);
        C32856Cuy.zk(this.LIZJ);
        this.LIZJ.LJII(6.29f, 7.71f);
        C32856Cuy.Jk(this.LIZJ);
        this.LIZJ.LJIIL(32.59f, 32.59f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-22.0f, -27.66f);
        this.LIZJ.LIZJ(17.8f, 17.8f, false, true, 23.0f, 13.0f);
        this.LIZJ.LJIIJ(12.75f, 0.0f, 17.0f, 12.0f, 17.0f, 12.0f);
        this.LIZJ.LJIILJJIL(-1.38f, 3.9f, -4.93f, 7.25f, true);
        this.LIZJ.LJIIL(-4.54f, -4.55f);
        this.LIZJ.LIZJ(7.99f, 7.99f, false, false, 23.0f, 17.0f);
        this.LIZJ.LJIIJ(-0.95f, 0.0f, -1.86f, 0.16f, -2.7f, 0.47f);
        this.LIZJ.LJIIL(-3.43f, -3.43f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(1.87f, 24.67f);
        this.LIZJ.LJIIIZ(24.64f, 24.64f, false, true, 5.8f, -9.23f);
        this.LIZJ.LJIIL(2.77f, 2.78f);
        this.LIZJ.LJ(7.25f, 21.46f, 6.0f, 25.0f, 6.0f, 25.0f);
        this.LIZJ.LJIILJJIL(4.25f, 12.0f, 17.0f, 12.0f, true);
        this.LIZJ.LJIIIZ(18.0f, 18.0f, false, false, 5.42f, -0.8f);
        this.LIZJ.LJIIL(3.05f, 3.05f);
        this.LIZJ.LIZJ(21.2f, 21.2f, false, true, 23.0f, 41.0f);
        this.LIZJ.LJIIJ(-9.83f, 0.0f, -17.93f, -6.63f, -21.13f, -15.67f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.0f, -0.66f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(15.0f, 25.0f);
        dij.LJIIJ(0.0f, -0.68f, 0.08f, -1.35f, 0.24f, -1.98f);
        dij.LJIIL(9.74f, 9.73f);
        dij.LIZJ(8.02f, 8.02f, false, true, 15.0f, 25.0f);
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
