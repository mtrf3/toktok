package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cwe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32960Cwe extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C32960Cwe() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.bd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -11877110);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIILIIL(15.98f, 12.13f);
        dij.LJIIL(7.36f, -6.54f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.32f, 0.0f);
        dij.LJIIL(7.36f, 6.54f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.34f, 0.87f);
        C32856Cuy.C6(dij);
        dij.LJIILL(3.0f);
        dij.LJIIJJI(11.0f);
        C32856Cuy.fl(dij);
        dij.LJIILL(19.0f);
        C32856Cuy.Fl(dij);
        C32856Cuy.q9(dij);
        C32856Cuy.el(dij);
        C32856Cuy.LJIIL(dij);
        C32856Cuy.LJJLJ(dij);
        dij.LJIIJJI(-5.68f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.34f, -0.87f);
        dij.LIZLLL();
        dij.LJIIIIZZ(22.0f, 23.5f);
        C32856Cuy.en(dij);
        dij.LJIILIIL(14.7f, 7.2f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.3f, 0.71f);
        C32856Cuy.LLLJIL(dij);
        dij.LJIILL(-2.3f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.34f, -0.75f);
        dij.LJIIL(4.25f, -3.72f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, 2.73f, 0.1f);
        dij.LJIIL(2.33f, 2.32f);
        C32856Cuy.a4(dij);
        dij.LJIIL(7.24f, -7.24f);
        C32856Cuy.LLLILZLLLI(dij);
        dij.LJIIL(5.3f, 5.3f);
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
