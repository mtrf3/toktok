package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D14 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D14() {
        this.LIZJ.LJIIIIZZ(15.2f, 1.0f);
        C32856Cuy.ef(this.LIZJ);
        C32856Cuy.Ua(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        C40084FoG.LJ(this.LIZJ, "p", -18.0f);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.LLLLLLIL(dij);
        dij.LJIIIZ(19.5f, 19.5f, true, false, 0.0f, -39.0f);
        dij.LJIIIZ(19.5f, 19.5f, false, false, 0.0f, 39.0f);
        dij.LIZLLL();
        dij.LJIILIIL(-9.72f, -27.46f);
        dij.LJIIJ(-0.31f, -0.42f, -0.44f, -1.03f, 0.02f, -1.5f);
        dij.LJIIJ(0.46f, -0.45f, 1.07f, -0.32f, 1.49f, 0.0f);
        dij.LJIIL(1.04f, 0.7f);
        dij.LJIIJ(2.43f, 1.65f, 8.3f, 5.62f, 9.49f, 6.81f);
        dij.LJIIJ(1.47f, 1.47f, 1.0f, 3.42f, -0.05f, 4.47f);
        dij.LJIIJ(-1.05f, 1.05f, -3.0f, 1.52f, -4.47f, 0.05f);
        dij.LJIIJ(-1.19f, -1.2f, -5.16f, -7.06f, -6.8f, -9.49f);
        dij.LJIIL(-0.72f, -1.04f);
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
