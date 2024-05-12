package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D4M extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D4M() {
        this.LIZJ.LJIIIIZZ(35.0f, 29.69f);
        C32856Cuy.jh(this.LIZJ);
        this.LIZJ.LJIIIIZZ(13.0f, 29.69f);
        C32856Cuy.jh(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(13.0f, 36.78f);
        dij.LJIIIZ(11.0f, 11.0f, false, true, -7.4f, -19.12f);
        dij.LJII(2.0f, 13.75f);
        C32856Cuy.G0(dij);
        dij.LJIIIZ(24.91f, 24.91f, false, true, 28.03f, 0.0f);
        dij.LJI(46.0f);
        dij.LJIIL(-3.6f, 3.91f);
        dij.LIZJ(10.97f, 10.97f, false, true, 46.0f, 25.8f);
        dij.LJIIIZ(11.0f, 11.0f, false, true, -18.48f, 8.06f);
        dij.LJII(24.0f, 37.68f);
        dij.LJIIL(-3.52f, -3.83f);
        dij.LIZJ(10.95f, 10.95f, false, true, 13.0f, 36.78f);
        dij.LIZLLL();
        dij.LJIILIIL(28.18f, -6.86f);
        dij.LJIIIZ(7.44f, 7.44f, true, false, -12.37f, -8.27f);
        dij.LJIIIZ(7.44f, 7.44f, false, false, 12.37f, 8.27f);
        dij.LIZLLL();
        dij.LJIILIIL(-8.92f, -15.24f);
        dij.LJIIIZ(21.35f, 21.35f, false, false, -16.52f, 0.0f);
        dij.LJIIJ(4.7f, 1.8f, 8.26f, 6.0f, 8.26f, 10.9f);
        dij.LJIIJ(0.0f, -4.9f, 3.56f, -9.1f, 8.26f, -10.9f);
        dij.LIZLLL();
        dij.LJIIIIZZ(17.14f, 19.6f);
        dij.LJIIIZ(7.44f, 7.44f, true, false, -8.27f, 12.37f);
        dij.LJIIIZ(7.44f, 7.44f, false, false, 8.27f, -12.37f);
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
