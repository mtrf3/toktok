package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D3o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33260D3o extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33260D3o() {
        this.LIZJ.LIZ(24.0f, 24.0f, 24.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -48024);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(37.1f, 16.63f);
        dij.LJIIJ(-0.2f, -0.36f, -0.59f, -0.58f, -1.0f, -0.58f);
        dij.LJIIJJI(-23.0f);
        dij.LJIIIZ(1.15f, 1.15f, false, false, -0.85f, 1.92f);
        dij.LJIIL(6.0f, 6.6f);
        dij.LJIIJ(0.32f, 0.35f, 0.82f, 0.47f, 1.26f, 0.3f);
        dij.LJIIL(8.34f, -3.17f);
        dij.LJIIJ(0.1f, -0.03f, 0.14f, -0.02f, 0.16f, -0.01f);
        dij.LJIIJ(0.03f, 0.01f, 0.08f, 0.05f, 0.12f, 0.11f);
        dij.LJIIJ(0.04f, 0.07f, 0.04f, 0.13f, 0.04f, 0.16f);
        dij.LJIIJ(0.0f, 0.02f, -0.01f, 0.07f, -0.09f, 0.13f);
        dij.LJIIL(-6.84f, 5.81f);
        dij.LJIIJ(-0.36f, 0.3f, -0.5f, 0.78f, -0.36f, 1.22f);
        dij.LJIIL(2.62f, 8.34f);
        dij.LJIIIZ(1.15f, 1.15f, false, false, 2.1f, 0.23f);
        dij.LJIIL(11.5f, -19.91f);
        dij.LJIIJ(0.2f, -0.36f, 0.2f, -0.8f, 0.0f, -1.16f);
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
