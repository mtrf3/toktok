package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* renamed from: X.D2p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33235D2p extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C33235D2p() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZJ.LIZIZ(new RectF(0.0f, 0.0f, 48.0f, 48.0f), 6.0f, 6.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -16777216);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(22.46f, 14.08f);
        dij.LJIIIZ(5.56f, 5.56f, false, true, 1.86f, 2.97f);
        dij.LJIIL(5.83f, 17.6f);
        dij.LJI(25.1f);
        dij.LJII(19.84f, 18.4f);
        dij.LJIIIZ(0.96f, 0.96f, false, false, -0.27f, -0.47f);
        dij.LJIIIZ(0.57f, 0.57f, false, false, -0.38f, -0.13f);
        dij.LJIIIZ(0.52f, 0.52f, false, false, -0.37f, 0.12f);
        dij.LJIIJ(-0.1f, 0.1f, -0.19f, 0.24f, -0.26f, 0.48f);
        dij.LJIIL(-5.25f, 16.26f);
        dij.LJI(8.25f);
        dij.LJIIL(5.8f, -17.62f);
        dij.LJIIIZ(6.02f, 6.02f, false, true, 1.88f, -2.98f);
        dij.LJIIJ(0.84f, -0.66f, 1.91f, -0.97f, 3.26f, -0.97f);
        dij.LJIIJ(1.31f, 0.0f, 2.4f, 0.32f, 3.27f, 0.99f);
        dij.LIZLLL();
        dij.LJIIIIZZ(37.73f, 13.51f);
        dij.LJIIJJI(-4.77f);
        dij.LJIILL(21.15f);
        dij.LJIIJJI(4.77f);
        dij.LJIJ(13.5f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZIZ2.setStyle(Paint.Style.FILL);
        LIZIZ2.setColor(-14625300);
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
