package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9L extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D9L() {
        this.LIZJ.LJIIIIZZ(24.0f, 37.4f);
        this.LIZJ.LJIIIZ(13.4f, 13.4f, true, false, 0.0f, -26.8f);
        this.LIZJ.LJIIIZ(13.4f, 13.4f, false, false, 0.0f, 26.8f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(40.5f, 24.0f);
        this.LIZJ.LJIIIZ(16.5f, 16.5f, true, true, -33.0f, 0.0f);
        this.LIZJ.LJIIIZ(16.5f, 16.5f, false, true, 33.0f, 0.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.EVEN_ODD);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(27.13f, 27.18f);
        dij.LJIIIZ(2.0f, 2.0f, false, false, 0.93f, -1.32f);
        dij.LJIIL(1.84f, -9.33f);
        dij.LJIIIZ(0.6f, 0.6f, false, false, -0.9f, -0.63f);
        dij.LJIIL(-8.14f, 4.92f);
        dij.LJIIIZ(2.0f, 2.0f, false, false, -0.92f, 1.32f);
        dij.LJIIL(-1.84f, 9.33f);
        dij.LJIIJ(-0.1f, 0.52f, 0.45f, 0.9f, 0.9f, 0.63f);
        I9A.LIZIZ(dij, 8.13f, -4.92f, -5.04f, -0.45f);
        dij.LJIIL(3.11f, -1.89f);
        dij.LJIIL(0.7f, -3.57f);
        dij.LJIIL(-3.1f, 1.89f);
        dij.LJIIL(-0.7f, 3.57f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
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
