package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CxH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32999CxH extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C32999CxH() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZJ.LJIIIIZZ(20.89f, 21.55f);
        this.LIZJ.LIZJ(3.18f, 3.18f, false, false, 24.0f, 25.43f);
        this.LIZJ.LJIIJ(2.05f, 0.0f, 3.57f, -1.9f, 3.11f, -3.88f);
        this.LIZJ.LJIIL(-2.3f, -10.08f);
        this.LIZJ.LJIIIZ(0.83f, 0.83f, false, false, -1.62f, 0.0f);
        this.LIZJ.LJIIL(-2.3f, 10.08f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJFF = LIZ;
        DIJ dij = new DIJ();
        this.LJI = dij;
        C32856Cuy.r2(dij);
        dij.LJIIIIZZ(18.42f, 45.0f);
        dij.LJIIJJI(2.88f);
        dij.LJIJ(33.78f);
        dij.LJIIJJI(-3.9f);
        dij.LJIIL(-1.74f, 1.88f);
        dij.LJIILL(3.43f);
        dij.LJIIL(2.77f, -2.94f);
        dij.LJIILL(8.86f);
        dij.LIZLLL();
        dij.LJIILIIL(10.91f, 0.0f);
        C32856Cuy.i0(dij);
        dij.LJII(29.8f, 40.6f);
        dij.LJIIL(2.45f, -4.0f);
        dij.LJIIJJI(-3.22f);
        C32856Cuy.t7(dij);
        dij.LJIIJJI(-3.24f);
        C32856Cuy.od(dij);
        dij.LJIIL(1.65f, -2.98f);
        dij.LJIIL(1.56f, 2.98f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJI.LIZ, this.LJFF);
    }
}
