package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* renamed from: X.D3c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33248D3c extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33248D3c() {
        this.LIZJ.LIZIZ(new RectF(28.0f, 28.0f, 48.0f, 48.0f), 10.0f, 10.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -119723);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(43.0f, 33.74f);
        dij.LJIIJ(0.2f, 0.12f, 0.26f, 0.38f, 0.13f, 0.57f);
        dij.LJIIL(-5.1f, 7.99f);
        dij.LJIIIZ(1.04f, 1.04f, false, true, -1.66f, 0.12f);
        dij.LJIIL(-3.36f, -3.85f);
        dij.LJIIIZ(0.42f, 0.42f, false, true, 0.04f, -0.59f);
        dij.LJIIL(0.94f, -0.82f);
        dij.LJIIIZ(0.42f, 0.42f, false, true, 0.59f, 0.04f);
        dij.LJIIL(2.45f, 2.8f);
        dij.LJIIL(4.35f, -6.8f);
        dij.LJIIJ(0.12f, -0.2f, 0.38f, -0.26f, 0.57f, -0.13f);
        dij.LJIIL(1.06f, 0.67f);
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
