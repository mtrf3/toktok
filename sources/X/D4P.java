package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D4P extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D4P() {
        this.LIZJ.LJIIIIZZ(21.8f, 24.22f);
        C32856Cuy.Ao(this.LIZJ);
        this.LIZJ.LJIIIIZZ(30.6f, 24.22f);
        this.LIZJ.LJIIJ(0.0f, 1.24f, -0.98f, 2.25f, -2.2f, 2.25f);
        this.LIZJ.LJIIJ(-1.21f, 0.0f, -2.2f, -1.01f, -2.2f, -2.25f);
        this.LIZJ.LJIILJJIL(0.99f, -2.25f, 2.2f, -2.25f, true);
        this.LIZJ.LJIIJ(1.22f, 0.0f, 2.2f, 1.0f, 2.2f, 2.25f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.s1(dij);
        dij.LJIILIIL(13.93f, 8.1f);
        dij.LJIIJ(0.44f, 0.0f, 0.78f, 0.38f, 0.73f, 0.83f);
        dij.LJIIL(-1.7f, 14.97f);
        dij.LJIIIZ(0.74f, 0.74f, false, true, -0.72f, 0.67f);
        dij.LJIIJJI(-18.1f);
        dij.LJIIIZ(0.74f, 0.74f, false, true, -0.73f, -0.67f);
        dij.LJIIL(-1.69f, -14.97f);
        dij.LJIIIZ(0.74f, 0.74f, false, true, 0.73f, -0.84f);
        dij.LJIIJJI(21.48f);
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
