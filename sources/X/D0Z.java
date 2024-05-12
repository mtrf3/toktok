package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D0Z extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D0Z() {
        C32856Cuy.O8(this.LIZJ);
        this.LIZJ.LJIILIIL(-5.0f, 7.0f);
        C32856Cuy.LLJZIJLIL(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(25.23f, 6.55f);
        dij.LJIIIZ(2.5f, 2.5f, false, false, -2.46f, 0.0f);
        dij.LJII(9.27f, 14.2f);
        dij.LIZJ(2.5f, 2.5f, false, false, 8.0f, 16.37f);
        dij.LJIILL(15.26f);
        dij.LJIIJ(0.0f, 0.9f, 0.48f, 1.73f, 1.27f, 2.17f);
        dij.LJIIL(13.5f, 7.65f);
        dij.LJIIJ(0.76f, 0.43f, 1.7f, 0.43f, 2.46f, 0.0f);
        dij.LJIIL(13.5f, -7.65f);
        dij.LIZJ(2.5f, 2.5f, false, false, 40.0f, 31.63f);
        dij.LJIJ(16.37f);
        dij.LJIIJ(0.0f, -0.9f, -0.48f, -1.73f, -1.27f, -2.17f);
        I9A.LIZIZ(dij, -13.5f, -7.65f, -1.48f, 1.74f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, 0.5f, 0.0f);
        dij.LJIIL(13.5f, 7.65f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, 0.25f, 0.43f);
        dij.LJIILL(15.26f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.25f, 0.43f);
        dij.LJIIL(-13.5f, 7.65f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, 0.0f);
        dij.LJIIL(-13.5f, -7.65f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.25f, -0.43f);
        dij.LJIJ(16.37f);
        dij.LJIIJ(0.0f, -0.18f, 0.1f, -0.34f, 0.25f, -0.43f);
        dij.LJIIL(13.5f, -7.65f);
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
