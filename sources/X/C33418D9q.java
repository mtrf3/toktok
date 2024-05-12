package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D9q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33418D9q extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33418D9q() {
        C32856Cuy.vj(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(15.71f, 36.5f);
        dij.LJIIJ(-1.0f, -0.66f, -1.92f, -1.44f, -2.73f, -2.33f);
        dij.LJIIJ(2.47f, -3.02f, 6.24f, -4.81f, 11.01f, -4.81f);
        dij.LJIIJ(4.78f, 0.0f, 8.56f, 1.79f, 11.03f, 4.81f);
        dij.LJIIJ(-0.81f, 0.88f, -1.73f, 1.67f, -2.73f, 2.33f);
        dij.LJIIJ(-1.81f, -2.24f, -4.62f, -3.53f, -8.3f, -3.53f);
        dij.LJIIJ(-3.67f, 0.0f, -6.47f, 1.29f, -8.28f, 3.53f);
        dij.LIZLLL();
        dij.LJIIIIZZ(32.47f, 18.67f);
        dij.LJIIIZ(8.47f, 8.47f, true, false, -16.95f, -0.01f);
        dij.LJIIIZ(8.47f, 8.47f, false, false, 16.94f, 0.0f);
        dij.LIZLLL();
        dij.LJIILIIL(-13.34f, 0.0f);
        dij.LJIIIZ(4.87f, 4.87f, true, true, 9.74f, 0.0f);
        dij.LJIIIZ(4.87f, 4.87f, false, true, -9.74f, 0.0f);
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
