package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CyO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33068CyO extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;
    public final Paint LJIIIIZZ;
    public final DIJ LJIIIZ;

    public C33068CyO() {
        this.LIZJ.LIZ(24.0f, 24.0f, 24.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -119723);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(17.0f, 11.0f);
        C32856Cuy.ym(dij);
        dij.LJIILL(7.63f);
        dij.LJIIJ(0.0f, 0.22f, 0.14f, 0.41f, 0.36f, 0.48f);
        dij.LJIIL(1.0f, 0.3f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, 0.64f, -0.48f);
        dij.LJIJ(13.0f);
        dij.LJIIJJI(14.0f);
        dij.LJIILL(7.93f);
        dij.LJIIJ(0.0f, 0.33f, 0.32f, 0.57f, 0.64f, 0.48f);
        dij.LJIIL(1.0f, -0.3f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, 0.36f, -0.48f);
        dij.LJIJ(13.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, -2.0f);
        dij.LJI(17.0f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-1);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ);
        this.LJI = LIZ;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(19.5f, 15.0f);
        C32856Cuy.LLFFF(dij2);
        dij2.LJIIJJI(7.0f);
        dij2.LJIIIZ(0.5f, 0.5f, false, false, 0.5f, -0.5f);
        dij2.LJIILL(-1.0f);
        dij2.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, -0.5f);
        C32856Cuy.X(dij2);
        dij2.LJIIIIZZ(19.0f, 19.5f);
        C32856Cuy.J1(dij2);
        C32856Cuy.C0(dij2);
        C32856Cuy.N5(dij2);
        C32856Cuy.LJFF(dij2);
        C32856Cuy.wa(dij2);
        dij2.LJIIZILJ(Path.FillType.WINDING);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-1);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJIIIIZZ = LIZ2;
        DIJ dij3 = new DIJ();
        this.LJIIIZ = dij3;
        dij3.LJIIIIZZ(12.34f, 21.48f);
        dij3.LJII(24.0f, 25.63f);
        dij3.LJIIL(11.66f, -4.15f);
        dij3.LJIIIZ(1.0f, 1.0f, false, true, 1.34f, 0.94f);
        C32856Cuy.H9(dij3);
        C32856Cuy.hi(dij3);
        dij3.LJIJ(22.42f);
        dij3.LJIIIZ(1.0f, 1.0f, false, true, 1.34f, -0.94f);
        dij3.LIZLLL();
        dij3.LJIILIIL(0.66f, 2.36f);
        dij3.LJIIL(11.0f, 3.91f);
        dij3.LJIIL(11.0f, -3.91f);
        dij3.LJIJ(34.0f);
        dij3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        dij3.LJI(14.0f);
        dij3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        dij3.LJIJ(23.84f);
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
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
        canvas.drawPath(this.LJII.LIZ, this.LJI);
        canvas.drawPath(this.LJIIIZ.LIZ, this.LJIIIIZZ);
    }
}
