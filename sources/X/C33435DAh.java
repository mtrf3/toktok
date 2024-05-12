package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DAh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33435DAh extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33435DAh() {
        this.LIZJ.LJIIIIZZ(39.5f, 22.09f);
        this.LIZJ.LJIIIZ(0.3f, 0.3f, false, true, -0.43f, -0.4f);
        this.LIZJ.LJIIJ(2.3f, -3.42f, 2.82f, -5.04f, 2.18f, -6.85f);
        this.LIZJ.LJIIJ(-1.97f, -3.54f, -10.42f, -2.25f, -19.9f, 3.01f);
        this.LIZJ.LJIIJ(-9.46f, 5.27f, -15.0f, 11.9f, -13.02f, 15.44f);
        this.LIZJ.LJIIJ(1.52f, 2.75f, 7.67f, 1.35f, 13.37f, -0.28f);
        this.LIZJ.LJIIJ(0.36f, -0.1f, 0.56f, 0.34f, 0.25f, 0.52f);
        this.LIZJ.LJIIJ(-8.3f, 4.98f, -19.77f, 7.42f, -21.62f, 4.24f);
        this.LIZJ.LJIIJ(-2.13f, -3.66f, 6.3f, -12.31f, 19.36f, -19.92f);
        this.LIZJ.LJIIJ(13.07f, -7.6f, 25.85f, -11.28f, 27.97f, -7.62f);
        this.LIZJ.LJIIJ(1.42f, 2.44f, -1.73f, 6.62f, -8.15f, 11.86f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(35.85f, 23.61f);
        dij.LJIIIZ(0.34f, 0.34f, false, true, -0.5f, 0.14f);
        dij.LJIIJ(-0.8f, -0.53f, -2.3f, -1.3f, -3.82f, -1.3f);
        dij.LJIIJ(-2.2f, 0.0f, -2.87f, 0.73f, -2.87f, 1.39f);
        dij.LJIIJ(0.0f, 0.44f, 0.0f, 1.43f, 3.92f, 1.92f);
        dij.LJIIJ(3.9f, 0.5f, 4.92f, 2.98f, 4.92f, 4.68f);
        dij.LJIIJ(0.0f, 1.71f, -1.16f, 4.96f, -6.46f, 4.96f);
        dij.LJIIJ(-4.04f, 0.0f, -5.64f, -1.17f, -6.56f, -1.88f);
        dij.LJIIIZ(0.21f, 0.21f, false, true, -0.06f, -0.26f);
        dij.LJIIL(1.1f, -2.39f);
        dij.LJIIIZ(0.21f, 0.21f, false, true, 0.3f, -0.1f);
        dij.LJIIJ(0.95f, 0.51f, 2.54f, 1.27f, 4.55f, 1.27f);
        dij.LJIIJ(2.71f, 0.0f, 3.04f, -0.82f, 3.04f, -1.21f);
        dij.LJIILJJIL(-0.15f, -1.61f, -3.98f, -2.19f, true);
        dij.LJIIJ(-4.23f, -0.63f, -4.86f, -2.93f, -4.86f, -4.2f);
        dij.LJIIJ(0.0f, -1.26f, 0.31f, -2.63f, 2.1f, -4.02f);
        dij.LJIIIZ(6.82f, 6.82f, false, true, 4.48f, -1.32f);
        dij.LJIIJ(1.37f, 0.0f, 3.9f, 0.66f, 5.67f, 1.58f);
        dij.LJIIJ(0.14f, 0.07f, 0.2f, 0.25f, 0.13f, 0.4f);
        dij.LJIIL(-1.1f, 2.53f);
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
