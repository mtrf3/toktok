package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CyR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33071CyR extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;
    public final Paint LJII;
    public final DIJ LJIIIIZZ;
    public final Paint LJIIIZ;
    public final DIJ LJIIJ;
    public final Paint LJIIJJI;
    public final DIJ LJIIL;

    public C33071CyR() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZJ.LIZ(24.0f, 24.0f, 24.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -1);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(24.0f, 47.0f);
        dij.LJIIIZ(23.0f, 23.0f, true, false, 0.0f, -46.0f);
        dij.LJIIIZ(23.0f, 23.0f, false, false, 0.0f, 46.0f);
        dij.LIZLLL();
        dij.LJIILIIL(0.0f, 1.0f);
        C32856Cuy.Pj(dij);
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZIZ2.setStyle(Paint.Style.FILL);
        LIZIZ2.setColor(-16777216);
        LIZIZ2.setAlpha(25);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ2);
        this.LJII = LIZ;
        DIJ dij2 = new DIJ();
        this.LJIIIIZZ = dij2;
        dij2.LJIIIIZZ(18.36f, 29.64f);
        dij2.LJIIJ(-4.9f, 0.0f, -8.86f, -4.18f, -8.86f, -9.32f);
        dij2.LJIIJ(0.0f, -5.14f, 3.96f, -9.32f, 8.86f, -9.32f);
        dij2.LJIIJJI(9.21f);
        dij2.LJIIJ(4.9f, 0.0f, 8.86f, 4.18f, 8.86f, 9.32f);
        dij2.LJIIJ(0.0f, 5.14f, -3.96f, 9.32f, -8.86f, 9.32f);
        dij2.LJIIJJI(-9.21f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-7951873);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJIIIZ = LIZ2;
        DIJ dij3 = new DIJ();
        this.LJIIJ = dij3;
        dij3.LJIIIIZZ(24.33f, 33.41f);
        dij3.LJIILL(5.68f);
        dij3.LJIIJ(0.0f, 0.5f, -0.4f, 0.91f, -0.88f, 0.91f);
        dij3.LJIIIZ(0.86f, 0.86f, false, true, -0.61f, -0.27f);
        dij3.LJIIL(-8.64f, -8.9f);
        dij3.LJIIIZ(9.37f, 9.37f, false, true, -2.63f, -6.54f);
        dij3.LJIIJ(0.0f, -5.05f, 3.96f, -9.15f, 8.86f, -9.15f);
        dij3.LJIIJJI(9.21f);
        dij3.LJIIJ(4.9f, 0.0f, 8.86f, 4.1f, 8.86f, 9.15f);
        dij3.LJIIJ(0.0f, 5.04f, -3.96f, 9.14f, -8.86f, 9.14f);
        dij3.LJIIJJI(-5.31f);
        dij3.LJIILL(-0.02f);
        dij3.LIZLLL();
        dij3.LJIIZILJ(Path.FillType.WINDING);
        LIZ2.setStyle(Paint.Style.FILL);
        LIZ2.setColor(-11039489);
        Paint LIZ3 = C42193GhB.LIZ(this.LIZ, LIZ2);
        this.LJIIJJI = LIZ3;
        DIJ dij4 = new DIJ();
        this.LJIIL = dij4;
        dij4.LJIIIIZZ(18.31f, 29.64f);
        dij4.LJIIJJI(9.24f);
        dij4.LJIIJ(4.9f, 0.0f, 8.88f, -4.27f, 8.88f, -9.53f);
        dij4.LJIIJ(0.0f, -0.63f, -0.06f, -1.23f, -0.16f, -1.83f);
        dij4.LJIIIZ(8.56f, 8.56f, false, false, -6.58f, -3.14f);
        dij4.LJIIJJI(-9.24f);
        dij4.LJIIJ(-4.9f, 0.0f, -8.88f, 4.28f, -8.88f, 9.54f);
        dij4.LJIIJ(0.0f, 0.62f, 0.06f, 1.23f, 0.16f, 1.8f);
        dij4.LJIIIZ(8.58f, 8.58f, false, false, 6.58f, 3.16f);
        dij4.LIZLLL();
        dij4.LJIIZILJ(Path.FillType.WINDING);
        LIZ3.setStyle(Paint.Style.FILL);
        LIZ3.setColor(-16754740);
        this.LIZ.add(LIZ3);
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
        canvas.drawPath(this.LJIIL.LIZ, this.LJIIJJI);
    }
}
