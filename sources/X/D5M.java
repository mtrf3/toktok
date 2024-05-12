package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D5M extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D5M() {
        C32856Cuy.Ld(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -16777216);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(32.87f, 22.3f);
        dij.LJIIJ(-4.83f, -2.87f, -12.8f, -3.14f, -17.42f, -1.74f);
        dij.LJIIIZ(1.4f, 1.4f, true, true, -0.82f, -2.68f);
        dij.LJIIJ(5.3f, -1.61f, 14.1f, -1.3f, 19.68f, 2.0f);
        dij.LJIIIZ(1.4f, 1.4f, false, true, -1.44f, 2.42f);
        dij.LIZLLL();
        dij.LJIILIIL(-0.16f, 4.25f);
        dij.LJIIJ(-0.33f, 0.55f, -1.05f, 0.72f, -1.6f, 0.39f);
        dij.LJIIJ(-4.04f, -2.48f, -10.18f, -3.2f, -14.95f, -1.75f);
        dij.LJIIIZ(1.17f, 1.17f, false, true, -0.68f, -2.24f);
        dij.LJIIJ(5.45f, -1.65f, 12.22f, -0.85f, 16.85f, 2.0f);
        dij.LJIIJ(0.55f, 0.33f, 0.72f, 1.05f, 0.38f, 1.6f);
        dij.LIZLLL();
        dij.LJIILIIL(-1.83f, 4.09f);
        dij.LJIIIZ(0.93f, 0.93f, false, true, -1.29f, 0.3f);
        dij.LJIIJ(-3.52f, -2.15f, -7.95f, -2.63f, -13.17f, -1.44f);
        dij.LJIIIZ(0.93f, 0.93f, true, true, -0.42f, -1.82f);
        dij.LJIIJ(5.71f, -1.3f, 10.62f, -0.75f, 14.57f, 1.67f);
        dij.LJIIJ(0.44f, 0.27f, 0.58f, 0.84f, 0.3f, 1.29f);
        dij.LIZLLL();
        dij.LJIIIIZZ(24.0f, 9.0f);
        dij.LJIIIZ(15.0f, 15.0f, true, false, 0.0f, 30.0f);
        dij.LJIIIZ(15.0f, 15.0f, false, false, 0.0f, -30.0f);
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
