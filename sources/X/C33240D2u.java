package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* renamed from: X.D2u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33240D2u extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C33240D2u() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZJ.LIZIZ(new RectF(0.0f, 0.0f, 48.0f, 48.0f), 4.0f, 4.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -15461356);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(38.72f, 35.94f);
        dij.LJIIJ(0.0f, -1.1f, -0.57f, -2.1f, -1.53f, -2.68f);
        dij.LJIIL(-3.0f, -1.8f);
        dij.LJIIL(2.37f, -1.43f);
        dij.LJIIIZ(7.0f, 7.0f, false, false, 0.0f, -12.06f);
        dij.LJII(19.76f, 7.86f);
        dij.LJIIIZ(7.22f, 7.22f, false, false, -7.28f, -0.14f);
        dij.LJIIIZ(6.97f, 6.97f, false, false, -3.68f, 6.17f);
        dij.LJIILL(7.76f);
        dij.LJIIIZ(0.36f, 0.36f, false, false, 0.6f, 0.24f);
        dij.LJIIIZ(8.99f, 8.99f, false, true, 5.49f, -2.6f);
        dij.LJIIIZ(0.35f, 0.35f, false, false, 0.31f, -0.35f);
        dij.LJIILL(-4.18f);
        dij.LJIIJ(0.0f, -0.46f, 0.25f, -0.88f, 0.66f, -1.1f);
        dij.LJIIJ(0.42f, -0.23f, 0.9f, -0.22f, 1.31f, 0.02f);
        dij.LJIIL(15.35f, 9.24f);
        dij.LJIIIZ(1.26f, 1.26f, false, true, 0.0f, 2.16f);
        dij.LJIIL(-4.46f, 2.69f);
        dij.LJIIL(-0.04f, -0.02f);
        dij.LJIIL(-8.26f, -4.97f);
        dij.LJIIIZ(7.26f, 7.26f, false, false, -7.28f, -0.14f);
        dij.LJIIIZ(6.97f, 6.97f, false, false, -3.68f, 6.17f);
        dij.LJIILL(5.3f);
        dij.LJIIJ(0.0f, 2.6f, 1.38f, 4.9f, 3.68f, 6.17f);
        dij.LJIIIZ(7.28f, 7.28f, false, false, 7.28f, -0.14f);
        dij.LJIIL(8.3f, -4.99f);
        dij.LJIIL(0.03f, 0.02f);
        dij.LJIIL(5.75f, 3.47f);
        dij.LJIIJ(1.03f, 0.62f, 2.32f, 0.62f, 3.36f, 0.0f);
        dij.LJIIIZ(3.12f, 3.12f, false, false, 1.52f, -2.7f);
        dij.LIZLLL();
        dij.LJIILIIL(-21.55f, -1.62f);
        dij.LJIIIZ(1.3f, 1.3f, false, true, -1.3f, 0.02f);
        dij.LJIIIZ(1.25f, 1.25f, false, true, -0.66f, -1.1f);
        dij.LJIILL(-3.55f);
        dij.LJIIJ(0.0f, -0.47f, 0.24f, -0.88f, 0.66f, -1.11f);
        dij.LJIIJ(0.4f, -0.22f, 0.9f, -0.21f, 1.3f, 0.03f);
        dij.LJIIL(4.75f, 2.85f);
        dij.LJIIL(-4.75f, 2.86f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ2.setStyle(Paint.Style.FILL);
        LIZIZ2.setColor(-65444);
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
