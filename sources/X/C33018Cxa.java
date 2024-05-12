package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cxa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33018Cxa extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33018Cxa() {
        C32856Cuy.bd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -411877);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(42.08f, 11.64f);
        dij.LJIIJ(0.94f, -0.31f, 0.94f, -1.63f, 0.0f, -1.94f);
        dij.LJIIJ(-1.78f, -0.6f, -3.18f, -2.0f, -3.77f, -3.78f);
        dij.LJIIIZ(1.02f, 1.02f, false, false, -1.94f, 0.0f);
        dij.LJIIJ(-0.6f, 1.78f, -2.0f, 3.18f, -3.78f, 3.78f);
        dij.LJIIIZ(1.02f, 1.02f, false, false, 0.0f, 1.94f);
        dij.LJIIJ(1.78f, 0.6f, 3.18f, 2.0f, 3.78f, 3.77f);
        dij.LJIIJ(0.3f, 0.94f, 1.63f, 0.94f, 1.94f, 0.0f);
        dij.LJIIJ(0.6f, -1.78f, 2.0f, -3.18f, 3.77f, -3.77f);
        dij.LIZLLL();
        dij.LJIIIIZZ(16.5f, 9.84f);
        C32856Cuy.O4(dij);
        dij.LJIILL(28.33f);
        C32856Cuy.P4(dij);
        dij.LJIJ(9.83f);
        dij.LIZLLL();
        dij.LJIIIIZZ(7.34f, 19.0f);
        C32856Cuy.O4(dij);
        C32856Cuy.LJLIIIL(dij);
        C32856Cuy.P4(dij);
        dij.LJIJ(19.0f);
        dij.LIZLLL();
        dij.LJIILIIL(20.83f, -2.5f);
        dij.LJIIIZ(2.5f, 2.5f, false, false, -2.5f, 2.5f);
        dij.LJIILL(13.33f);
        dij.LJIIIZ(2.5f, 2.5f, false, false, 5.0f, 0.0f);
        C32856Cuy.q9(dij);
        C32856Cuy.hg(dij);
        dij.LIZLLL();
        dij.LJIILIIL(6.67f, 7.5f);
        C32856Cuy.O4(dij);
        dij.LJIILL(3.33f);
        C32856Cuy.P4(dij);
        C32856Cuy.w9(dij);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
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
