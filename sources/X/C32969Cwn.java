package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cwn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32969Cwn extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;
    public final Paint LJII;
    public final DIJ LJIIIIZZ;
    public final Paint LJIIIZ;
    public final DIJ LJIIJ;

    public C32969Cwn() {
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
        C32856Cuy.Vb(dij);
        C32856Cuy.v6(dij);
        dij.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, -4.0f);
        dij.LJIJ(11.0f);
        dij.LIZLLL();
        dij.LJIILIIL(22.0f, 0.0f);
        C32856Cuy.v6(dij);
        C32856Cuy.LJLJL(dij);
        dij.LJIIJJI(18.0f);
        C32856Cuy.LLZLL(dij);
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZIZ2.setStyle(Paint.Style.FILL);
        LIZIZ2.setColor(-1);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ2);
        this.LJII = LIZ;
        DIJ dij2 = new DIJ();
        this.LJIIIIZZ = dij2;
        dij2.LJIIIIZZ(7.0f, 19.0f);
        dij2.LJIIIZ(4.0f, 4.0f, false, true, 4.0f, -4.0f);
        dij2.LJIIJJI(18.0f);
        dij2.LJIIIZ(4.0f, 4.0f, false, true, 4.0f, 4.0f);
        dij2.LJIILL(18.0f);
        dij2.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, 4.0f);
        dij2.LJI(11.0f);
        dij2.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, -4.0f);
        dij2.LJIJ(19.0f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-1);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJIIIZ = LIZ2;
        DIJ dij3 = new DIJ();
        this.LJIIJ = dij3;
        dij3.LJIIIIZZ(16.0f, 32.66f);
        dij3.LJIILL(-9.32f);
        dij3.LJIIIZ(1.0f, 1.0f, false, true, 1.55f, -0.84f);
        dij3.LJIIL(7.16f, 4.66f);
        dij3.LJIIIZ(1.0f, 1.0f, false, true, 0.0f, 1.68f);
        dij3.LJIIL(-7.16f, 4.66f);
        dij3.LJIIIZ(1.0f, 1.0f, false, true, -1.55f, -0.84f);
        dij3.LIZLLL();
        dij3.LJIIZILJ(Path.FillType.WINDING);
        LIZ2.setStyle(Paint.Style.FILL);
        LIZ2.setColor(-411877);
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
