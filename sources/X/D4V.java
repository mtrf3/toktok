package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D4V extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D4V() {
        this.LIZJ.LJIIIIZZ(12.37f, 20.08f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.05f, 1.41f);
        this.LIZJ.LJIIL(10.17f, 9.92f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 2.73f, 0.0f);
        this.LIZJ.LJIIL(10.17f, -9.92f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.05f, -1.41f);
        this.LIZJ.LJIIL(-1.37f, -1.46f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.41f, -0.05f);
        this.LIZJ.LJIIL(-8.8f, 8.64f);
        this.LIZJ.LJIIL(-8.81f, -8.64f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.41f, 0.05f);
        this.LIZJ.LJIIL(-1.37f, 1.46f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(4.0f, 11.1f);
        dij.LJIIIZ(6.9f, 6.9f, false, true, 6.9f, -6.9f);
        dij.LJIIJJI(26.2f);
        dij.LJIIIZ(6.9f, 6.9f, false, true, 6.9f, 6.9f);
        dij.LJIILL(26.2f);
        dij.LJIIIZ(6.9f, 6.9f, false, true, -6.9f, 6.9f);
        dij.LJI(10.9f);
        dij.LIZJ(6.9f, 6.9f, false, true, 4.0f, 37.3f);
        dij.LJIJ(11.1f);
        dij.LIZLLL();
        dij.LJIILIIL(6.9f, -2.9f);
        dij.LIZJ(2.9f, 2.9f, false, false, 8.0f, 11.1f);
        dij.LJIILL(26.2f);
        dij.LJIIJ(0.0f, 1.6f, 1.3f, 2.9f, 2.9f, 2.9f);
        dij.LJIIJJI(26.2f);
        dij.LJIIJ(1.6f, 0.0f, 2.9f, -1.3f, 2.9f, -2.9f);
        dij.LJIJ(11.1f);
        dij.LJIIJ(0.0f, -1.6f, -1.3f, -2.9f, -2.9f, -2.9f);
        dij.LJI(10.9f);
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
