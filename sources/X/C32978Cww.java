package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cww, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32978Cww extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C32978Cww() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.bd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -15483504);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(15.44f, 8.0f);
        dij.LJIIJ(-3.0f, 0.0f, -5.44f, 2.39f, -5.44f, 5.33f);
        dij.LJIILL(21.34f);
        dij.LIZJ(5.39f, 5.39f, false, false, 15.44f, 40.0f);
        dij.LJIIJJI(17.12f);
        dij.LJIIJ(3.0f, 0.0f, 5.44f, -2.39f, 5.44f, -5.33f);
        dij.LJIJ(13.33f);
        dij.LIZJ(5.39f, 5.39f, false, false, 32.56f, 8.0f);
        dij.LJI(15.44f);
        dij.LIZLLL();
        dij.LJIILIIL(3.12f, 8.38f);
        dij.LJIIIZ(0.77f, 0.77f, false, false, -0.78f, 0.76f);
        dij.LJIILL(1.53f);
        C32856Cuy.qi(dij);
        dij.LJIILL(-1.53f);
        C32856Cuy.yg(dij);
        dij.LJIILIIL(0.0f, 6.1f);
        dij.LJIIIZ(0.77f, 0.77f, false, false, -0.78f, 0.76f);
        dij.LJIILL(1.52f);
        C32856Cuy.qi(dij);
        dij.LJIILL(-1.52f);
        C32856Cuy.yg(dij);
        dij.LJIILIIL(-0.78f, 6.85f);
        dij.LJIIJ(0.0f, -0.42f, 0.35f, -0.76f, 0.78f, -0.76f);
        dij.LJIIJJI(6.22f);
        dij.LJIIJ(0.43f, 0.0f, 0.78f, 0.34f, 0.78f, 0.76f);
        dij.LJIILL(1.53f);
        dij.LJIIJ(0.0f, 0.42f, -0.35f, 0.76f, -0.78f, 0.76f);
        dij.LJIIJJI(-6.22f);
        dij.LJIIIZ(0.77f, 0.77f, false, true, -0.78f, -0.76f);
        dij.LJIILL(-1.53f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZIZ2.setStyle(Paint.Style.FILL);
        LIZIZ2.setColor(-1);
        this.LIZ.add(LIZIZ2);
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
