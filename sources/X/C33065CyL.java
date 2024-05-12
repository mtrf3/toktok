package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* renamed from: X.CyL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33065CyL extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;
    public final Paint LJII;
    public final DIJ LJIIIIZZ;
    public final Paint LJIIIZ;
    public final DIJ LJIIJ;

    public C33065CyL() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.bd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -411877);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LIZIZ(new RectF(20.0f, 14.0f, 24.0f, 24.0f), 2.0f, 2.0f, Path.Direction.CW);
        LIZIZ2.setStyle(Paint.Style.FILL);
        LIZIZ2.setColor(-1);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ2);
        this.LJII = LIZ;
        DIJ dij2 = new DIJ();
        this.LJIIIIZZ = dij2;
        dij2.LIZIZ(new RectF(27.0f, 14.0f, 31.0f, 24.0f), 2.0f, 2.0f, Path.Direction.CW);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-1);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJIIIZ = LIZ2;
        DIJ dij3 = new DIJ();
        this.LJIIJ = dij3;
        dij3.LJIIIIZZ(34.0f, 10.0f);
        dij3.LJIIJJI(-7.0f);
        dij3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        C32856Cuy.LLILZLL(dij3);
        dij3.LJIIJJI(7.0f);
        dij3.LJIIIZ(4.0f, 4.0f, false, true, 4.0f, 4.0f);
        C32856Cuy.V3(dij3);
        dij3.LJIIJJI(-7.0f);
        dij3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        dij3.LJIILL(-2.0f);
        dij3.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        dij3.LJIIJJI(7.0f);
        C32856Cuy.LLZLI(dij3);
        dij3.LJIILIIL(-24.0f, 0.0f);
        C32856Cuy.oj(dij3);
        dij3.LJIIJJI(2.0f);
        dij3.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        dij3.LJIILL(2.0f);
        dij3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        dij3.LJIIJJI(-2.0f);
        dij3.LJIILL(2.0f);
        dij3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        dij3.LJIIJJI(-2.0f);
        dij3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        dij3.LJIILL(-2.0f);
        dij3.LIZLLL();
        dij3.LJIILIIL(9.0f, -3.0f);
        C32856Cuy.Do(dij3);
        C32856Cuy.R9(dij3);
        dij3.LJIILIIL(-8.0f, 15.5f);
        C32856Cuy.sh(dij3);
        dij3.LJIIJJI(2.0f);
        dij3.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        dij3.LJIILL(4.5f);
        C32856Cuy.dk(dij3);
        dij3.LJIILIIL(0.0f, 9.5f);
        dij3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        dij3.LJIILL(-4.5f);
        C32856Cuy.LLLLLLJ(dij3);
        C32856Cuy.E9(dij3);
        C32856Cuy.dk(dij3);
        dij3.LJIILIIL(2.0f, 3.0f);
        C32856Cuy.LLZL(dij3);
        C32856Cuy.mj(dij3);
        C32856Cuy.di(dij3);
        dij3.LJIILIIL(6.0f, 4.0f);
        C32856Cuy.Do(dij3);
        C32856Cuy.d1(dij3);
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
