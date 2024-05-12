package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* renamed from: X.CyT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33073CyT extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33073CyT() {
        this.LIZJ.LIZIZ(new RectF(0.0f, 0.0f, 48.0f, 48.0f), 4.8f, 4.8f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -32712);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(9.02f, 11.2f);
        dij.LJI(5.9f);
        C32856Cuy.B4(dij);
        dij.LJIJ(8.8f);
        dij.LJIIJ(0.0f, -0.44f, 0.36f, -0.8f, 0.8f, -0.8f);
        dij.LJIIJJI(4.4f);
        dij.LJIIJ(0.75f, 0.0f, 1.4f, 0.52f, 1.56f, 1.25f);
        dij.LJIIL(0.79f, 3.55f);
        dij.LJI(37.1f);
        dij.LJIIIZ(1.6f, 1.6f, false, true, 1.52f, 2.1f);
        dij.LJIIL(-3.2f, 9.6f);
        dij.LJIIIZ(1.6f, 1.6f, false, true, -1.52f, 1.1f);
        dij.LJI(15.5f);
        dij.LJIIL(0.88f, 4.0f);
        dij.LJI(33.1f);
        dij.LJIIJ(0.44f, 0.0f, 0.8f, 0.36f, 0.8f, 0.8f);
        C32856Cuy.F9(dij);
        C32856Cuy.LLJLLIL(dij);
        dij.LJIIJJI(-18.0f);
        dij.LJIIIZ(1.6f, 1.6f, false, true, -1.56f, -1.25f);
        dij.LJII(9.02f, 11.2f);
        dij.LIZLLL();
        dij.LJIIIIZZ(19.5f, 37.6f);
        dij.LJIIIZ(3.2f, 3.2f, true, true, -6.4f, 0.0f);
        dij.LJIIIZ(3.2f, 3.2f, false, true, 6.4f, 0.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(31.5f, 40.8f);
        C32856Cuy.l0(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-1);
        this.LIZ.add(LIZIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
