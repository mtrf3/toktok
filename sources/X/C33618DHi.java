package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import kotlin.jvm.internal.o;

/* renamed from: X.DHi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33618DHi extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C33618DHi() {
        LinearGradient linearGradient = new LinearGradient(40.97f, 7.03f, 7.03f, 40.97f, new int[]{-13127966, -14772536}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZJ.LJIIIIZZ(7.03f, 40.97f);
        this.LIZJ.LIZJ(24.0f, 24.0f, true, false, 40.97f, 7.03f);
        this.LIZJ.LIZJ(24.0f, 24.0f, false, false, 7.03f, 40.97f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setShader(linearGradient);
        Paint paint = new Paint();
        this.LJFF = paint;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIILIIL(9.99f, 23.8f);
        dij.LJIIL(16.16f, -6.67f);
        dij.LJIIJ(1.6f, -0.7f, 7.0f, -2.91f, 7.0f, -2.91f);
        dij.LJIILJJIL(2.5f, -0.97f, 2.3f, 1.39f, true);
        dij.LJIIJ(-0.07f, 0.97f, -0.63f, 4.37f, -1.18f, 8.04f);
        dij.LJIIL(-1.74f, 10.9f);
        dij.LJIILJJIL(-0.14f, 1.59f, -1.32f, 1.87f, false);
        dij.LJIIJ(-1.18f, 0.27f, -3.12f, -0.97f, -3.46f, -1.25f);
        dij.LJIIJ(-0.28f, -0.21f, -5.2f, -3.33f, -7.01f, -4.86f);
        dij.LJIIJ(-0.49f, -0.41f, -1.04f, -1.25f, 0.07f, -2.22f);
        dij.LJIIJ(2.5f, -2.29f, 5.48f, -5.13f, 7.28f, -6.93f);
        dij.LJIIJ(0.84f, -0.84f, 1.67f, -2.78f, -1.8f, -0.42f);
        dij.LJIIL(-9.78f, 6.59f);
        dij.LJIILJJIL(-1.11f, 0.7f, -3.2f, 0.07f, false);
        dij.LJIIJ(-2.07f, -0.63f, -4.5f, -1.46f, -4.5f, -1.46f);
        dij.LJIILLIIL(7.14f, 24.9f, 9.99f, 23.8f, true);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.LIZ.add(paint);
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
