package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CzK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33126CzK extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33126CzK() {
        this.LIZJ.LJIIIIZZ(35.0f, 17.38f);
        this.LIZJ.LJIIIZ(2.88f, 2.88f, true, true, -5.76f, 0.0f);
        this.LIZJ.LJIIIZ(2.88f, 2.88f, false, true, 5.76f, 0.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(9.5f, 5.0f);
        dij.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, 4.0f);
        dij.LJIILL(30.0f);
        C32856Cuy.tj(dij);
        dij.LJIIJJI(28.85f);
        C32856Cuy.sj(dij);
        dij.LJIJ(9.0f);
        dij.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, -4.0f);
        dij.LJI(9.5f);
        dij.LIZLLL();
        dij.LJIILIIL(28.85f, 2.0f);
        C32856Cuy.wm(dij);
        dij.LJIILL(23.28f);
        dij.LJIIL(-20.48f, -9.7f);
        dij.LJIIIZ(5.0f, 5.0f, false, false, -5.7f, 1.03f);
        dij.LJII(7.5f, 30.4f);
        dij.LJIJ(9.0f);
        dij.LJIIJ(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        dij.LJIIJJI(28.85f);
        dij.LIZLLL();
        dij.LJIILIIL(2.0f, 27.5f);
        C32856Cuy.M9(dij);
        C32856Cuy.vm(dij);
        dij.LJI(9.5f);
        C32856Cuy.um(dij);
        dij.LJIILL(-5.75f);
        dij.LJIIL(8.09f, -8.24f);
        dij.LJIIIZ(3.0f, 3.0f, false, true, 3.42f, -0.62f);
        dij.LJIIL(21.34f, 10.1f);
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
