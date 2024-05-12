package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D97 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D97() {
        this.LIZJ.LJIIIIZZ(29.51f, 23.45f);
        this.LIZJ.LJIIIZ(8.42f, 8.42f, false, true, -2.06f, 1.6f);
        this.LIZJ.LJIIJ(-2.23f, 1.27f, -4.0f, 1.3f, -5.49f, 0.8f);
        this.LIZJ.LJIIIZ(9.81f, 9.81f, false, true, -3.77f, -2.54f);
        this.LIZJ.LJIIIZ(1.03f, 1.03f, false, false, -1.4f, -0.07f);
        this.LIZJ.LJIIL(-1.46f, 1.27f);
        this.LIZJ.LJIIIZ(0.92f, 0.92f, false, false, -0.07f, 1.34f);
        this.LIZJ.LJIIIZ(13.8f, 13.8f, false, false, 5.47f, 3.66f);
        this.LIZJ.LJIIJ(2.62f, 0.86f, 5.55f, 0.65f, 8.67f, -1.13f);
        this.LIZJ.LJIIJ(1.42f, -0.8f, 2.55f, -1.75f, 3.41f, -2.82f);
        this.LIZJ.LJIIJ(0.34f, -0.41f, 0.2f, -1.01f, -0.25f, -1.3f);
        this.LIZJ.LJIIL(-1.63f, -1.05f);
        this.LIZJ.LJIIJ(-0.46f, -0.29f, -1.06f, -0.15f, -1.42f, 0.24f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.ma(dij);
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
