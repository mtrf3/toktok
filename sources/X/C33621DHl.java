package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import kotlin.jvm.internal.o;

/* renamed from: X.DHl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33621DHl extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33621DHl() {
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{-16737793, -6278145, -44416, -36767}, new float[]{0.0f, 0.61f, 0.93f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.setValues(new float[]{41.4047f, 0.0f, 13.31f, 0.0f, 41.4046f, 41.8f, 0.0f, 0.0f, 1.0f});
        radialGradient.setLocalMatrix(matrix);
        this.LIZJ.LJIIIIZZ(25.0f, 4.0f);
        this.LIZJ.LJ(14.3f, 4.0f, 6.0f, 11.84f, 6.0f, 22.43f);
        this.LIZJ.LJIIJ(0.0f, 5.54f, 2.27f, 10.33f, 5.97f, 13.63f);
        this.LIZJ.LJIIJ(0.3f, 0.28f, 0.5f, 0.67f, 0.5f, 1.09f);
        this.LIZJ.LJIIL(0.11f, 3.37f);
        this.LIZJ.LJIIIZ(1.52f, 1.52f, false, false, 2.13f, 1.35f);
        this.LIZJ.LJIIL(3.78f, -1.67f);
        this.LIZJ.LJIIJ(0.32f, -0.14f, 0.67f, -0.16f, 1.01f, -0.07f);
        this.LIZJ.LJIIJ(1.73f, 0.48f, 3.58f, 0.73f, 5.5f, 0.73f);
        this.LIZJ.LJIIJ(10.7f, 0.0f, 19.0f, -7.84f, 19.0f, -18.43f);
        this.LIZJ.LJIILLIIL(35.7f, 4.0f, 25.0f, 4.0f, true);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setShader(radialGradient);
        Paint paint = new Paint();
        this.LJ = paint;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIILIIL(13.6f, 27.82f);
        dij.LJIIL(5.57f, -8.85f);
        dij.LJIIIZ(2.85f, 2.85f, false, true, 4.12f, -0.77f);
        dij.LJIIL(4.44f, 3.33f);
        dij.LJIIJ(0.4f, 0.31f, 0.97f, 0.3f, 1.38f, 0.0f);
        dij.LJIIL(5.99f, -4.55f);
        dij.LJIIJ(0.8f, -0.6f, 1.84f, 0.35f, 1.3f, 1.2f);
        dij.LJIIL(-5.57f, 8.86f);
        dij.LJIIIZ(2.85f, 2.85f, false, true, -4.12f, 0.76f);
        dij.LJIIL(-4.44f, -3.33f);
        dij.LJIIJ(-0.4f, -0.3f, -0.97f, -0.3f, -1.38f, 0.0f);
        dij.LJIIL(-5.99f, 4.55f);
        dij.LJIIJ(-0.8f, 0.6f, -1.85f, -0.35f, -1.3f, -1.2f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.LIZ.add(paint);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
