package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D0W extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D0W() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(19.0f, 4.0f);
        p.LJIIIZ(10.0f, 10.0f, true, true, 0.0f, 20.0f);
        p.LJIIIZ(10.0f, 10.0f, false, true, 0.0f, -20.0f);
        p.LIZLLL();
        p.LJIILIIL(0.0f, 4.0f);
        p.LJIIIZ(6.0f, 6.0f, true, false, 0.01f, 12.01f);
        p.LJIIIZ(6.0f, 6.0f, false, false, 0.0f, -12.0f);
        p.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.EVEN_ODD);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(19.0f, 27.0f);
        dij.LJIIJ(4.36f, 0.0f, 8.01f, 1.25f, 10.8f, 3.46f);
        dij.LJIIIZ(10.05f, 10.05f, false, false, -2.96f, 2.76f);
        dij.LJ(24.79f, 31.79f, 22.16f, 31.0f, 19.0f, 31.0f);
        C32856Cuy.Sl(dij);
        dij.LJIIIIZZ(37.6f, 21.89f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.88f, -1.0f);
        dij.LJIIL(6.4f, -0.76f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.12f, 1.0f);
        dij.LJIILL(2.98f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.88f, 1.0f);
        dij.LJII(41.0f, 25.6f);
        C32856Cuy.M9(dij);
        dij.LJIIIZ(6.0f, 6.0f, true, true, -6.0f, -6.0f);
        dij.LJIIJJI(2.6f);
        dij.LJIJ(21.89f);
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
