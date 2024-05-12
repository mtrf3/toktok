package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D5Z extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D5Z() {
        this.LIZJ.LIZ(24.0f, 24.0f, 24.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -50314);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(19.57f, 15.18f);
        dij.LJIIJ(0.34f, 0.06f, 2.56f, 0.5f, 4.58f, 2.64f);
        dij.LJIIIZ(8.72f, 8.72f, false, true, 4.58f, -2.64f);
        dij.LJIIJ(0.53f, -0.09f, 1.2f, -0.11f, 1.55f, -0.11f);
        dij.LJIIJ(2.58f, 0.0f, 4.8f, 1.83f, 5.7f, 4.28f);
        dij.LJIIJ(3.16f, 8.55f, -10.55f, 16.68f, -11.75f, 17.37f);
        dij.LJIIIZ(0.15f, 0.15f, false, true, -0.16f, 0.0f);
        dij.LJIIJ(-1.2f, -0.69f, -14.91f, -8.82f, -11.75f, -17.37f);
        dij.LJIIJ(0.9f, -2.45f, 3.12f, -4.28f, 5.7f, -4.28f);
        dij.LJIIJ(0.34f, 0.0f, 1.02f, 0.02f, 1.55f, 0.11f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-1);
        this.LIZ.add(LIZIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
