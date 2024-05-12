package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import kotlin.jvm.internal.o;

/* renamed from: X.DHo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33624DHo extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33624DHo() {
        LinearGradient linearGradient = new LinearGradient(24.0f, 47.82f, 24.0f, 1.03f, new int[]{-384197, -304012}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        C32856Cuy.L5(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setShader(linearGradient);
        Paint paint = new Paint();
        this.LJ = paint;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIILIIL(33.93f, 7.33f);
        dij.LJIIL(-1.27f, 0.22f);
        dij.LJIIL(-14.27f, 2.88f);
        dij.LJIIJ(-0.38f, 0.08f, -0.67f, 0.22f, -0.89f, 0.4f);
        dij.LJIIJ(-0.27f, 0.23f, -0.42f, 0.56f, -0.48f, 0.93f);
        dij.LJIIJ(-0.01f, 0.08f, -0.03f, 0.24f, -0.03f, 0.48f);
        dij.LJIILL(17.85f);
        dij.LJIIJ(0.0f, 0.42f, -0.04f, 0.82f, -0.32f, 1.17f);
        dij.LJIILJJIL(-0.63f, 0.45f, -1.04f, 0.53f, true);
        dij.LJIIL(-0.93f, 0.19f);
        dij.LJIIJ(-1.18f, 0.24f, -1.95f, 0.4f, -2.64f, 0.67f);
        dij.LJIIIZ(3.74f, 3.74f, false, false, -2.55f, 3.99f);
        dij.LJIIIZ(3.7f, 3.7f, false, false, 2.92f, 3.25f);
        dij.LJIIJ(0.71f, 0.14f, 1.46f, 0.1f, 2.57f, -0.13f);
        dij.LJIIIZ(5.4f, 5.4f, false, false, 1.67f, -0.61f);
        dij.LJIIIZ(4.15f, 4.15f, false, false, 2.01f, -2.86f);
        dij.LJIIJ(0.13f, -0.61f, 0.16f, -1.16f, 0.16f, -1.77f);
        dij.LJIJ(19.04f);
        dij.LJIIJ(0.0f, -0.83f, 0.23f, -1.05f, 0.9f, -1.21f);
        dij.LJIIJ(0.0f, 0.0f, 11.87f, -2.4f, 12.42f, -2.5f);
        dij.LJIIJ(0.77f, -0.15f, 1.13f, 0.07f, 1.13f, 0.88f);
        dij.LJIILL(10.57f);
        dij.LJIIJ(0.0f, 0.42f, 0.0f, 0.84f, -0.28f, 1.19f);
        dij.LJIIJ(-0.28f, 0.34f, -0.64f, 0.44f, -1.04f, 0.53f);
        dij.LJIIL(-0.94f, 0.19f);
        dij.LJIIJ(-1.18f, 0.24f, -1.94f, 0.4f, -2.64f, 0.66f);
        dij.LJIIIZ(3.76f, 3.76f, false, false, -1.37f, 6.36f);
        dij.LJIIJ(0.47f, 0.43f, 1.05f, 0.74f, 1.74f, 0.88f);
        dij.LJIIJ(0.71f, 0.14f, 1.47f, 0.1f, 2.57f, -0.13f);
        dij.LJIIJ(0.59f, -0.12f, 1.14f, -0.3f, 1.67f, -0.6f);
        dij.LJIIIZ(4.15f, 4.15f, false, false, 2.01f, -2.87f);
        dij.LJIIJ(0.13f, -0.6f, 0.14f, -1.16f, 0.14f, -1.76f);
        dij.LJIJ(8.59f);
        dij.LJIIJ(-0.01f, -0.82f, -0.44f, -1.32f, -1.22f, -1.26f);
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
