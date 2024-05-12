package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D5N extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D5N() {
        C32856Cuy.L5(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -16777216);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(34.06f, 22.07f);
        dij.LJIIJ(-5.48f, -3.25f, -14.52f, -3.55f, -19.75f, -1.96f);
        dij.LJIIIZ(1.59f, 1.59f, true, true, -0.93f, -3.05f);
        dij.LJIIJ(6.0f, -1.82f, 16.0f, -1.47f, 22.3f, 2.28f);
        dij.LJIIIZ(1.59f, 1.59f, false, true, -1.62f, 2.73f);
        dij.LIZLLL();
        dij.LJIILIIL(-0.18f, 4.82f);
        dij.LJIIJ(-0.39f, 0.63f, -1.2f, 0.82f, -1.83f, 0.44f);
        dij.LJIIJ(-4.56f, -2.81f, -11.53f, -3.62f, -16.94f, -1.98f);
        dij.LJIIIZ(1.33f, 1.33f, false, true, -0.77f, -2.54f);
        dij.LJIIJ(6.18f, -1.87f, 13.85f, -0.97f, 19.1f, 2.26f);
        dij.LJIIJ(0.62f, 0.38f, 0.82f, 1.2f, 0.44f, 1.82f);
        dij.LIZLLL();
        dij.LJIILIIL(-2.08f, 4.63f);
        dij.LJIIJ(-0.3f, 0.5f, -0.96f, 0.66f, -1.46f, 0.35f);
        dij.LJIIJ(-4.0f, -2.44f, -9.02f, -2.99f, -14.93f, -1.64f);
        dij.LJIIIZ(1.06f, 1.06f, true, true, -0.48f, -2.06f);
        dij.LJIIJ(6.48f, -1.48f, 12.03f, -0.85f, 16.52f, 1.9f);
        dij.LJIIJ(0.5f, 0.3f, 0.65f, 0.95f, 0.35f, 1.45f);
        dij.LIZLLL();
        dij.LJIIIIZZ(24.0f, 7.0f);
        dij.LJIIIZ(17.0f, 17.0f, true, false, 0.0f, 34.0f);
        dij.LJIIIZ(17.0f, 17.0f, false, false, 0.0f, -34.0f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-14756000);
        this.LIZ.add(LIZIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
