package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DBn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33467DBn extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33467DBn() {
        this.LIZJ.LJIIIIZZ(23.8f, 13.79f);
        this.LIZJ.LJIIJ(3.31f, 0.0f, 6.0f, -2.64f, 6.0f, -5.9f);
        this.LIZJ.LJIIJ(0.0f, -3.25f, -2.69f, -5.89f, -6.0f, -5.89f);
        this.LIZJ.LJIIIZ(5.94f, 5.94f, false, false, -5.98f, 5.9f);
        this.LIZJ.LJIIJ(0.0f, 3.25f, 2.68f, 5.89f, 5.99f, 5.89f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(14.93f, 20.79f);
        dij.LJIIJ(-2.7f, -0.5f, -5.53f, -1.23f, -8.86f, -2.19f);
        dij.LJIIIZ(1.46f, 1.46f, false, true, -1.0f, -1.83f);
        dij.LJIIL(0.85f, -2.82f);
        dij.LJIIIZ(1.5f, 1.5f, false, true, 1.87f, -1.0f);
        dij.LJIIJ(4.43f, 1.29f, 7.65f, 2.06f, 10.79f, 2.43f);
        dij.LJIIJ(3.13f, 0.37f, 6.98f, 0.44f, 10.02f, 0.06f);
        dij.LJIIIZ(55.53f, 55.53f, false, false, 10.45f, -2.4f);
        dij.LJIIJ(0.78f, -0.25f, 1.63f, 0.16f, 1.9f, 0.93f);
        dij.LJIIL(0.97f, 2.78f);
        dij.LJIIJ(0.27f, 0.77f, -0.15f, 1.61f, -0.94f, 1.87f);
        dij.LJIIIZ(67.34f, 67.34f, false, true, -8.76f, 2.24f);
        dij.LJIIL(0.96f, 10.41f);
        dij.LJIIL(1.33f, 11.77f);
        dij.LJIIJ(0.1f, 0.8f, -0.5f, 1.54f, -1.32f, 1.63f);
        dij.LJIIL(-2.98f, 0.32f);
        dij.LJIIIZ(1.5f, 1.5f, false, true, -1.65f, -1.3f);
        dij.LJIIL(-1.04f, -9.17f);
        dij.LJIIL(-8.11f, 0.02f);
        dij.LJIIL(-1.04f, 9.15f);
        dij.LJIIJ(-0.1f, 0.8f, -0.83f, 1.4f, -1.65f, 1.3f);
        dij.LJIIL(-2.98f, -0.33f);
        dij.LJIIIZ(1.48f, 1.48f, false, true, -1.32f, -1.62f);
        dij.LJIIL(2.51f, -22.25f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
