package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D5h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33305D5h extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33305D5h() {
        this.LIZJ.LJIIIIZZ(30.5f, 11.87f);
        this.LIZJ.LJIIIZ(6.5f, 6.5f, true, true, -13.0f, 0.0f);
        this.LIZJ.LJIIJ(0.0f, -2.6f, 1.22f, -4.06f, 2.64f, -5.48f);
        this.LIZJ.LJIIJ(1.33f, -1.33f, 2.16f, -2.55f, 2.23f, -4.42f);
        this.LIZJ.LJIIJ(0.0f, -0.13f, 0.12f, -0.22f, 0.24f, -0.16f);
        this.LIZJ.LJIIJ(0.35f, 0.17f, 1.08f, 0.66f, 2.0f, 1.94f);
        this.LIZJ.LJIIJ(0.8f, 1.1f, 1.0f, 1.92f, 1.13f, 2.43f);
        this.LIZJ.LJIIJ(0.08f, 0.33f, 0.13f, 0.54f, 0.3f, 0.62f);
        this.LIZJ.LJIIJ(0.3f, 0.15f, 0.73f, -1.12f, 0.92f, -1.73f);
        this.LIZJ.LJIIIZ(0.2f, 0.2f, false, true, 0.33f, -0.1f);
        this.LIZJ.LJIIIZ(9.14f, 9.14f, false, true, 3.21f, 6.9f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(33.0f, 17.5f);
        dij.LJIIJ(0.0f, 1.38f, -4.03f, 2.5f, -9.0f, 2.5f);
        dij.LJIILJJIL(-9.0f, -1.12f, -9.0f, -2.5f, true);
        dij.LJIIJ(0.0f, -0.32f, 0.22f, -0.63f, 0.62f, -0.91f);
        dij.LJIIJ(-2.62f, 0.42f, -4.36f, 1.05f, -4.6f, 1.75f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, -0.02f, 0.16f);
        C32856Cuy.N9(dij);
        dij.LJIIJ(0.0f, 0.43f, 0.27f, 0.79f, 0.64f, 0.93f);
        dij.LJ(13.34f, 43.13f, 18.24f, 44.0f, 24.0f, 44.0f);
        dij.LJIIJ(5.77f, 0.0f, 10.66f, -0.87f, 12.36f, -2.07f);
        dij.LIZJ(1.0f, 1.0f, false, false, 37.0f, 41.0f);
        dij.LJIJ(18.5f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, -0.03f, -0.17f);
        dij.LJIIJ(-0.24f, -0.7f, -1.97f, -1.32f, -4.59f, -1.74f);
        dij.LJIIJ(0.4f, 0.28f, 0.62f, 0.59f, 0.62f, 0.91f);
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
