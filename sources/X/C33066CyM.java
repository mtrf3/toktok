package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* renamed from: X.CyM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33066CyM extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;
    public final Paint LJII;
    public final DIJ LJIIIIZZ;
    public final Paint LJIIIZ;
    public final DIJ LJIIJ;

    public C33066CyM() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.bd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -32712);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LIZIZ(new RectF(9.0f, 14.0f, 34.0f, 39.0f), 3.96f, 3.96f, Path.Direction.CW);
        LIZIZ2.setStyle(Paint.Style.FILL);
        LIZIZ2.setColor(-1);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ2);
        this.LJII = LIZ;
        DIJ dij2 = new DIJ();
        this.LJIIIIZZ = dij2;
        dij2.LJIIIIZZ(21.5f, 19.0f);
        dij2.LJIIIZ(3.5f, 3.5f, false, false, -3.5f, 3.5f);
        C32856Cuy.w9(dij2);
        dij2.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, 2.0f);
        dij2.LJIILL(5.0f);
        C32856Cuy.LLZ(dij2);
        C32856Cuy.F0(dij2);
        C32856Cuy.zm(dij2);
        dij2.LJIILL(-5.0f);
        dij2.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, -2.0f);
        C32856Cuy.LJJJJZI(dij2);
        dij2.LJIIIZ(3.5f, 3.5f, false, false, -3.5f, -3.5f);
        dij2.LIZLLL();
        dij2.LJIILIIL(1.5f, 5.0f);
        C32856Cuy.LJJJJZI(dij2);
        dij2.LJIIIZ(1.5f, 1.5f, false, false, -3.0f, 0.0f);
        C32856Cuy.w9(dij2);
        dij2.LJIIJJI(3.0f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-32712);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJIIIZ = LIZ2;
        DIJ dij3 = new DIJ();
        this.LJIIJ = dij3;
        dij3.LJIIIIZZ(32.5f, 11.0f);
        dij3.LJI(16.0f);
        dij3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        C32856Cuy.n(dij3);
        dij3.LJIIJJI(16.5f);
        dij3.LJIIIZ(7.5f, 7.5f, false, true, 7.5f, 7.5f);
        C32856Cuy.F9(dij3);
        C32856Cuy.Jc(dij3);
        dij3.LJIJ(15.5f);
        C32856Cuy.c9(dij3);
        dij3.LIZLLL();
        dij3.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZ2.setStyle(Paint.Style.FILL);
        LIZ2.setColor(-1);
        this.LIZ.add(LIZ2);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJI.LIZ, this.LJFF);
        canvas.drawPath(this.LJIIIIZZ.LIZ, this.LJII);
        canvas.drawPath(this.LJIIJ.LIZ, this.LJIIIZ);
    }
}
