package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CxG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32998CxG extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C32998CxG() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.J7(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -65536);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(36.61f, 14.63f);
        dij.LJIIIZ(3.82f, 3.82f, false, true, 2.74f, 2.65f);
        dij.LJIIJ(0.65f, 2.34f, 0.65f, 7.22f, 0.65f, 7.22f);
        dij.LJIILJJIL(0.0f, 4.88f, -0.65f, 7.22f, true);
        dij.LJIIIZ(3.82f, 3.82f, false, true, -2.74f, 2.65f);
        dij.LJ(34.2f, 35.0f, 24.5f, 35.0f, 24.5f, 35.0f);
        dij.LJIILJJIL(-9.7f, 0.0f, -12.11f, -0.63f, true);
        dij.LJIIIZ(3.82f, 3.82f, false, true, -2.74f, -2.65f);
        dij.LJ(9.0f, 29.38f, 9.0f, 24.5f, 9.0f, 24.5f);
        dij.LJIILJJIL(0.0f, -4.88f, 0.65f, -7.22f, true);
        dij.LJIIJ(0.36f, -1.3f, 1.4f, -2.3f, 2.74f, -2.65f);
        dij.LJ(14.8f, 14.0f, 24.5f, 14.0f, 24.5f, 14.0f);
        dij.LJIILJJIL(9.7f, 0.0f, 12.11f, 0.63f, true);
        dij.LIZLLL();
        dij.LJIILIIL(-7.15f, 9.87f);
        dij.LJII(21.4f, 29.0f);
        C32856Cuy.LJL(dij);
        dij.LJIIL(8.06f, 4.5f);
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
