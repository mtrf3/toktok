package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cwx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32979Cwx extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C32979Cwx() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.bd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -13377375);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(15.0f, 34.38f);
        dij.LJIIIZ(9.0f, 9.0f, false, true, -6.06f, -15.65f);
        dij.LJII(6.0f, 15.53f);
        dij.LJIIJJI(6.54f);
        dij.LJIIIZ(20.38f, 20.38f, false, true, 22.94f, 0.0f);
        C32856Cuy.T6(dij);
        dij.LJIIL(-2.94f, 3.2f);
        dij.LJIIIZ(8.97f, 8.97f, false, true, 2.93f, 6.65f);
        dij.LJIIIZ(9.0f, 9.0f, false, true, -15.1f, 6.6f);
        dij.LJII(24.0f, 35.12f);
        dij.LJIIL(-2.88f, -3.14f);
        dij.LJIIIZ(8.96f, 8.96f, false, true, -6.12f, 2.4f);
        dij.LIZLLL();
        dij.LJIILIIL(23.05f, -5.62f);
        dij.LIZJ(6.09f, 6.09f, true, false, 27.93f, 22.0f);
        dij.LJIIIZ(6.09f, 6.09f, false, false, 10.12f, 6.76f);
        dij.LIZLLL();
        dij.LJIILIIL(-7.3f, -12.47f);
        dij.LJIIIZ(17.47f, 17.47f, false, false, -13.5f, 0.0f);
        dij.LJ(21.09f, 17.76f, 24.0f, 21.2f, 24.0f, 25.21f);
        dij.LJIIJ(0.0f, -4.0f, 2.91f, -7.45f, 6.76f, -8.92f);
        dij.LIZLLL();
        dij.LJIIIIZZ(18.4f, 20.32f);
        dij.LJIIIZ(6.09f, 6.09f, true, false, -6.77f, 10.12f);
        dij.LJIIIZ(6.09f, 6.09f, false, false, 6.77f, -10.12f);
        dij.LIZLLL();
        dij.LJIIIIZZ(15.0f, 28.57f);
        C32856Cuy.C9(dij);
        dij.LJIILIIL(18.0f, 0.0f);
        C32856Cuy.C9(dij);
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZIZ2.setStyle(Paint.Style.FILL);
        LIZIZ2.setColor(-16777216);
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
