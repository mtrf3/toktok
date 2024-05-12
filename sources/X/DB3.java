package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DB3 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public DB3() {
        this.LIZJ.LJIIIIZZ(28.09f, 10.9f);
        this.LIZJ.LJIIIZ(13.0f, 13.0f, false, true, -17.2f, 17.18f);
        this.LIZJ.LJIIJ(0.46f, -0.1f, 0.92f, -0.24f, 1.37f, -0.4f);
        this.LIZJ.LJIIJ(3.0f, -1.05f, 6.31f, -3.2f, 9.27f, -6.16f);
        this.LIZJ.LJIIJ(2.95f, -2.95f, 5.1f, -6.25f, 6.15f, -9.26f);
        this.LIZJ.LJIIJ(0.16f, -0.45f, 0.3f, -0.9f, 0.4f, -1.36f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(8.53f, 25.4f);
        this.LIZJ.LJIIIZ(8.88f, 8.88f, false, false, 2.75f, -0.55f);
        this.LIZJ.LJIIJ(2.49f, -0.87f, 5.42f, -2.74f, 8.13f, -5.45f);
        this.LIZJ.LJIIJ(2.7f, -2.7f, 4.57f, -5.63f, 5.44f, -8.13f);
        this.LIZJ.LJIIJ(0.83f, -2.38f, 0.64f, -3.94f, 0.04f, -4.74f);
        this.LIZJ.LJIIIZ(12.96f, 12.96f, false, false, -8.82f, -3.3f);
        this.LIZJ.LJIIIZ(13.0f, 13.0f, false, false, -9.54f, 21.66f);
        this.LIZJ.LJIIJ(0.44f, 0.32f, 1.1f, 0.53f, 2.0f, 0.51f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIILIIL(31.62f, 20.6f);
        dij.LJIIL(9.9f, 13.97f);
        dij.LJIIIZ(4.98f, 4.98f, false, true, -6.95f, 6.94f);
        dij.LJIIL(-13.97f, -9.9f);
        dij.LJIIIZ(15.93f, 15.93f, false, false, 11.01f, -11.0f);
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
