package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D53 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D53() {
        C32856Cuy.q7(this.LIZJ);
        this.LIZJ.LJIIIZ(1.82f, 1.82f, false, false, 0.0f, 3.64f);
        this.LIZJ.LJIIJ(9.01f, 0.0f, 16.36f, 7.42f, 16.36f, 16.64f);
        this.LIZJ.LJIIIZ(16.7f, 16.7f, false, true, -7.84f, 14.22f);
        this.LIZJ.LJIIIZ(1.82f, 1.82f, true, false, 1.92f, 3.09f);
        this.LIZJ.LIZJ(20.33f, 20.33f, false, false, 44.0f, 24.29f);
        this.LIZJ.LJ(44.0f, 13.1f, 35.07f, 4.0f, 24.0f, 4.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(13.57f, 11.46f);
        this.LIZJ.LJIIIZ(1.82f, 1.82f, true, false, -2.34f, -2.79f);
        this.LIZJ.LJIIIZ(20.22f, 20.22f, false, false, -2.8f, 2.87f);
        this.LIZJ.LJIIIZ(1.82f, 1.82f, true, false, 2.85f, 2.27f);
        this.LIZJ.LJIIIZ(16.63f, 16.63f, false, true, 2.29f, -2.35f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(8.55f, 18.78f);
        this.LIZJ.LJIIIZ(1.82f, 1.82f, true, false, -3.44f, -1.18f);
        this.LIZJ.LIZJ(20.43f, 20.43f, false, false, 4.0f, 24.28f);
        this.LIZJ.LJIIIZ(1.82f, 1.82f, false, false, 3.64f, 0.0f);
        this.LIZJ.LJIIIZ(17.16f, 17.16f, false, true, 0.91f, -5.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(8.59f, 29.78f);
        this.LIZJ.LJIIIZ(1.82f, 1.82f, false, false, -3.4f, 1.28f);
        this.LIZJ.LJIIIZ(19.13f, 19.13f, false, false, 4.72f, 7.09f);
        this.LIZJ.LJIIIZ(1.82f, 1.82f, false, false, 2.51f, -2.63f);
        this.LIZJ.LJIIIZ(15.5f, 15.5f, false, true, -3.83f, -5.74f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(18.15f, 39.38f);
        this.LIZJ.LJIIIZ(1.82f, 1.82f, false, false, -1.13f, 3.46f);
        this.LIZJ.LJIIIZ(24.1f, 24.1f, false, false, 10.4f, 0.98f);
        this.LIZJ.LJIIIZ(1.82f, 1.82f, true, false, -0.43f, -3.6f);
        this.LIZJ.LJIIIZ(21.2f, 21.2f, false, true, -8.84f, -0.84f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(22.4f, 18.12f);
        dij.LJIIIZ(1.6f, 1.6f, true, true, 3.2f, 0.0f);
        dij.LJIILL(4.28f);
        dij.LJIIJJI(4.28f);
        dij.LJIIIZ(1.6f, 1.6f, true, true, 0.0f, 3.2f);
        dij.LJI(25.6f);
        dij.LJIILL(4.28f);
        dij.LJIIIZ(1.6f, 1.6f, false, true, -3.2f, 0.0f);
        dij.LJIILL(-4.27f);
        dij.LJIIJJI(-4.28f);
        dij.LJIIIZ(1.6f, 1.6f, false, true, 0.0f, -3.2f);
        dij.LJIIJJI(4.28f);
        dij.LJIILL(-4.28f);
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
