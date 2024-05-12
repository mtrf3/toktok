package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CyP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33069CyP extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;
    public final Paint LJII;
    public final DIJ LJIIIIZZ;
    public final Paint LJIIIZ;
    public final DIJ LJIIJ;

    public C33069CyP() {
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
        dij.LJIIIIZZ(8.0f, 11.0f);
        C32856Cuy.el(dij);
        C32856Cuy.LJJI(dij);
        C32856Cuy.fl(dij);
        C32856Cuy.LJLLJ(dij);
        C32856Cuy.Fl(dij);
        C32856Cuy.LLZLL(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ2.setStyle(Paint.Style.FILL);
        LIZIZ2.setColor(-1);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ2);
        this.LJII = LIZ;
        DIJ dij2 = new DIJ();
        this.LJIIIIZZ = dij2;
        dij2.LJIILIIL(15.66f, 29.24f);
        dij2.LJIIL(-4.37f, 4.37f);
        dij2.LJIIIZ(1.0f, 1.0f, false, false, -0.29f, 0.7f);
        C32856Cuy.J9(dij2);
        dij2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        dij2.LJIIJJI(24.0f);
        dij2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        dij2.LJIILL(-4.7f);
        dij2.LJIIIZ(1.0f, 1.0f, false, false, -0.27f, -0.69f);
        dij2.LJIIL(-4.82f, -5.19f);
        dij2.LJIIIZ(2.0f, 2.0f, false, false, -2.88f, -0.05f);
        dij2.LJII(22.0f, 32.4f);
        dij2.LJIIL(-3.59f, -3.23f);
        dij2.LJIIIZ(2.0f, 2.0f, false, false, -2.75f, 0.07f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-411877);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJIIIZ = LIZ2;
        DIJ dij3 = new DIJ();
        this.LJIIJ = dij3;
        dij3.LIZ(18.5f, 18.5f, 3.5f, Path.Direction.CW);
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
