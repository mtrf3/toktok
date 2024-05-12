package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CxZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33017CxZ extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C33017CxZ() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.bd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -119723);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(42.0f, 24.0f);
        dij.LJIIJ(0.0f, 5.65f, -2.6f, 10.7f, -6.69f, 14.0f);
        C32856Cuy.rf(dij);
        C32856Cuy.A6(dij);
        dij.LJIIIZ(18.0f, 18.0f, true, true, 18.0f, -18.0f);
        dij.LIZLLL();
        dij.LJIILIIL(-15.0f, -8.0f);
        C32856Cuy.rh(dij);
        dij.LJIILIIL(0.0f, 16.0f);
        C32856Cuy.rh(dij);
        dij.LJIILIIL(-11.0f, -5.0f);
        C32856Cuy.hk(dij);
        dij.LJIILIIL(19.0f, -3.0f);
        C32856Cuy.rh(dij);
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
