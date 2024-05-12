package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cwq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32972Cwq extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C32972Cwq() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.x8(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -119723);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(23.04f, 24.88f);
        dij.LJIJ(11.5f);
        C32856Cuy.ao(dij);
        dij.LJIILL(13.38f);
        dij.LJIIL(3.9f, -3.9f);
        C32856Cuy.kc(dij);
        dij.LJIIL(-5.6f, 5.6f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.42f, 0.0f);
        dij.LJIIL(-5.6f, -5.6f);
        C32856Cuy.Rf(dij);
        dij.LJIIL(3.9f, 3.9f);
        dij.LIZLLL();
        dij.LJIIIIZZ(11.0f, 32.25f);
        dij.LJIILL(-5.58f);
        C32856Cuy.Wn(dij);
        dij.LJIILL(5.58f);
        dij.LJIIJ(0.0f, 1.01f, 0.82f, 1.83f, 1.83f, 1.83f);
        dij.LJIIJJI(18.42f);
        dij.LJIIJ(1.01f, 0.0f, 1.83f, -0.82f, 1.83f, -1.83f);
        dij.LJIILL(-5.58f);
        C32856Cuy.ao(dij);
        dij.LJIILL(5.58f);
        dij.LJIIIZ(3.83f, 3.83f, false, true, -3.83f, 3.83f);
        dij.LJI(14.83f);
        dij.LIZJ(3.83f, 3.83f, false, true, 11.0f, 32.25f);
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
