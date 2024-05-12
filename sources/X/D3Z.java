package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D3Z extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D3Z() {
        C32856Cuy.bd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -119723);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIILIIL(15.78f, 11.28f);
        dij.LJIIL(18.38f, -2.8f);
        dij.LJIIJ(1.08f, -0.22f, 2.09f, 0.6f, 2.09f, 1.71f);
        dij.LJIILL(21.68f);
        dij.LJIIJ(0.0f, 3.07f, -3.06f, 5.25f, -6.2f, 5.06f);
        dij.LJIIIZ(3.63f, 3.63f, false, true, -3.43f, -3.74f);
        dij.LJIIJ(0.0f, -2.82f, 2.2f, -3.92f, 3.43f, -4.33f);
        dij.LJIIJ(0.07f, -0.05f, 2.7f, -0.92f, 2.7f, -1.07f);
        dij.LJIJ(14.95f);
        dij.LJIIL(-14.88f, 2.4f);
        dij.LJIJ(34.5f);
        dij.LJIIJ(0.0f, 3.06f, -3.06f, 5.25f, -6.2f, 5.06f);
        dij.LJIIIZ(3.63f, 3.63f, false, true, -3.42f, -3.75f);
        dij.LJIIJ(0.0f, -2.82f, 2.19f, -3.92f, 3.42f, -4.33f);
        dij.LJIIJ(0.08f, -0.04f, 2.7f, -0.92f, 2.7f, -1.07f);
        C32856Cuy.k9(dij);
        dij.LJIIJ(0.0f, -0.83f, 0.6f, -1.55f, 1.41f, -1.71f);
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
