package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D1z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33219D1z extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;
    public final Paint LJII;
    public final DIJ LJIIIIZZ;
    public final Paint LJIIIZ;
    public final DIJ LJIIJ;

    public C33219D1z() {
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
        dij.LJIILIIL(17.69f, 13.63f);
        dij.LJIIL(-0.76f, -5.65f);
        dij.LJIIIZ(1.64f, 1.64f, true, false, -3.04f, 1.05f);
        dij.LJIIL(2.87f, 4.92f);
        dij.LJIIJ(0.28f, 0.47f, 1.0f, 0.22f, 0.93f, -0.32f);
        dij.LIZLLL();
        dij.LJIIIIZZ(14.92f, 16.14f);
        dij.LJIIL(-4.72f, -3.2f);
        dij.LJIIIZ(1.64f, 1.64f, true, false, -1.24f, 2.97f);
        dij.LJIIL(5.59f, 1.13f);
        dij.LJIIJ(0.53f, 0.1f, 0.83f, -0.6f, 0.37f, -0.9f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ2.setStyle(Paint.Style.FILL);
        LIZIZ2.setColor(-1);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ2);
        this.LJII = LIZ;
        DIJ dij2 = new DIJ();
        this.LJIIIIZZ = dij2;
        dij2.LJIIIIZZ(37.35f, 11.92f);
        dij2.LJIIIZ(1.0f, 1.0f, false, false, -1.27f, -1.27f);
        dij2.LJIIL(-7.37f, 2.5f);
        dij2.LJIIIZ(1.0f, 1.0f, false, true, -0.91f, -0.15f);
        dij2.LJIIL(-6.24f, -4.65f);
        dij2.LJIIIZ(1.0f, 1.0f, false, false, -1.6f, 0.82f);
        dij2.LJIIL(0.1f, 7.77f);
        dij2.LJIIIZ(1.0f, 1.0f, false, true, -0.42f, 0.83f);
        dij2.LJIIL(-6.35f, 4.5f);
        dij2.LJIIIZ(1.0f, 1.0f, false, false, 0.28f, 1.77f);
        dij2.LJIIL(5.77f, 1.79f);
        dij2.LJIIL(-9.63f, 9.63f);
        C32856Cuy.kd(dij2);
        dij2.LJIIL(9.63f, -9.63f);
        dij2.LJIIL(1.8f, 5.77f);
        dij2.LJIIIZ(1.0f, 1.0f, false, false, 1.77f, 0.28f);
        dij2.LJIIL(4.49f, -6.35f);
        dij2.LJIIIZ(1.0f, 1.0f, false, true, 0.83f, -0.42f);
        dij2.LJIIL(7.77f, 0.1f);
        dij2.LJIIIZ(1.0f, 1.0f, false, false, 0.82f, -1.6f);
        dij2.LJII(35.0f, 20.2f);
        dij2.LJIIIZ(1.0f, 1.0f, false, true, -0.15f, -0.91f);
        dij2.LJIIL(2.5f, -7.37f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-1);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJIIIZ = LIZ2;
        DIJ dij3 = new DIJ();
        this.LJIIJ = dij3;
        dij3.LJIILIIL(38.08f, 34.22f);
        dij3.LJIIL(-4.83f, -3.02f);
        dij3.LJIIJ(-0.47f, -0.3f, -0.2f, -1.01f, 0.34f, -0.92f);
        dij3.LJIIL(5.63f, 0.93f);
        dij3.LJIIIZ(1.64f, 1.64f, true, true, -1.14f, 3.0f);
        dij3.LIZLLL();
        dij3.LJIIIIZZ(31.05f, 39.34f);
        dij3.LJIIL(-0.8f, -5.64f);
        dij3.LJIIJ(-0.09f, -0.54f, 0.64f, -0.8f, 0.92f, -0.33f);
        dij3.LJIIL(2.91f, 4.9f);
        dij3.LJIIIZ(1.64f, 1.64f, true, true, -3.03f, 1.07f);
        dij3.LIZLLL();
        dij3.LJIIZILJ(Path.FillType.WINDING);
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
