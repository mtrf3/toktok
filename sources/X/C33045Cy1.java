package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cy1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33045Cy1 extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;
    public final Paint LJII;
    public final DIJ LJIIIIZZ;

    public C33045Cy1() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.x8(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -9992961);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(15.69f, 32.31f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, 0.0f, -7.07f);
        dij.LJIIL(2.65f, -2.66f);
        dij.LJIIIZ(0.56f, 0.56f, false, false, 0.0f, -0.78f);
        dij.LJIIL(-0.78f, -0.79f);
        dij.LJIIIZ(0.56f, 0.56f, false, false, -0.79f, 0.0f);
        dij.LJIIL(-2.65f, 2.65f);
        dij.LJIIIZ(7.23f, 7.23f, false, false, 10.22f, 10.22f);
        dij.LJIIL(2.65f, -2.65f);
        dij.LJIIIZ(0.56f, 0.56f, false, false, 0.0f, -0.79f);
        dij.LJIIL(-0.79f, -0.78f);
        dij.LJIIIZ(0.56f, 0.56f, false, false, -0.78f, 0.0f);
        dij.LJIIL(-2.66f, 2.65f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, -7.07f, 0.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(23.25f, 17.67f);
        dij.LJIIL(2.07f, -2.06f);
        dij.LJIIIZ(4.72f, 4.72f, false, true, 6.68f, 0.0f);
        dij.LJIIL(0.4f, 0.39f);
        dij.LJIIIZ(4.72f, 4.72f, false, true, 0.0f, 6.68f);
        C32856Cuy.P3(dij);
        dij.LJIIL(0.79f, 0.79f);
        dij.LJIIJ(0.21f, 0.21f, 0.56f, 0.21f, 0.78f, 0.0f);
        dij.LJIIL(2.07f, -2.07f);
        dij.LJIIIZ(6.95f, 6.95f, false, false, 0.0f, -9.82f);
        dij.LJIIL(-0.4f, -0.4f);
        dij.LJIIIZ(6.95f, 6.95f, false, false, -9.82f, 0.0f);
        C32856Cuy.P3(dij);
        dij.LJIIL(0.79f, 0.8f);
        dij.LJIIJ(0.22f, 0.2f, 0.57f, 0.2f, 0.78f, 0.0f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ2.setStyle(Paint.Style.FILL);
        LIZIZ2.setColor(-1);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ2);
        this.LJII = LIZ;
        DIJ dij2 = new DIJ();
        this.LJIIIIZZ = dij2;
        dij2.LJIIIIZZ(19.62f, 26.8f);
        dij2.LJIIIZ(0.56f, 0.56f, false, false, 0.0f, 0.8f);
        dij2.LJIIL(0.79f, 0.78f);
        dij2.LJIIJ(0.21f, 0.22f, 0.56f, 0.22f, 0.78f, 0.0f);
        dij2.LJIIL(6.88f, -6.88f);
        dij2.LJIIIZ(0.56f, 0.56f, false, false, 0.0f, -0.78f);
        dij2.LJIIL(-0.79f, -0.79f);
        dij2.LJIIIZ(0.56f, 0.56f, false, false, -0.78f, 0.0f);
        dij2.LJIIL(-6.88f, 6.88f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-1);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJI.LIZ, this.LJFF);
        canvas.drawPath(this.LJIIIIZZ.LIZ, this.LJII);
    }
}
