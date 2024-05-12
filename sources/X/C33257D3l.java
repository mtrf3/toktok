package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D3l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33257D3l extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33257D3l() {
        this.LIZJ.LIZ(24.0f, 24.0f, 24.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -16777216);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.R7(dij);
        dij.LJIIJ(0.1f, -0.04f, 0.14f, -0.03f, 0.16f, -0.02f);
        dij.LJIIJ(0.03f, 0.02f, 0.08f, 0.05f, 0.12f, 0.12f);
        dij.LJIIJ(0.04f, 0.06f, 0.05f, 0.12f, 0.04f, 0.16f);
        dij.LJIIJ(0.0f, 0.02f, -0.01f, 0.06f, -0.1f, 0.13f);
        dij.LJIIL(-6.93f, 5.9f);
        dij.LJIIJ(-0.36f, 0.3f, -0.5f, 0.78f, -0.36f, 1.23f);
        dij.LJIIL(2.66f, 8.46f);
        dij.LJIIIZ(1.17f, 1.17f, false, false, 2.12f, 0.24f);
        dij.LJIIL(11.67f, -20.21f);
        dij.LJIIJ(0.2f, -0.36f, 0.2f, -0.8f, 0.0f, -1.17f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
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
