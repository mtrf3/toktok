package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import kotlin.jvm.internal.o;

/* renamed from: X.DHn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33623DHn extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33623DHn() {
        LinearGradient linearGradient = new LinearGradient(24.0f, 43.85f, 24.0f, 4.86f, new int[]{-384197, -304012}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        C32856Cuy.Ld(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setShader(linearGradient);
        Paint paint = new Paint();
        this.LJ = paint;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(32.2f, 10.1f);
        dij.LJIIJ(-0.1f, 0.0f, -0.95f, 0.15f, -1.06f, 0.18f);
        dij.LJII(19.3f, 12.67f);
        dij.LJIIJ(-0.27f, 0.07f, -0.53f, 0.15f, -0.75f, 0.33f);
        dij.LJIIIZ(1.2f, 1.2f, false, false, -0.4f, 0.77f);
        dij.LJIIL(-0.02f, 0.4f);
        dij.LJIILL(14.84f);
        dij.LJIIJ(0.0f, 0.35f, -0.03f, 0.69f, -0.26f, 0.97f);
        dij.LJIIJ(-0.24f, 0.29f, -0.53f, 0.38f, -0.87f, 0.44f);
        dij.LJIIL(-0.77f, 0.16f);
        dij.LJIIJ(-0.98f, 0.2f, -1.62f, 0.33f, -2.2f, 0.56f);
        dij.LJIIIZ(3.12f, 3.12f, false, false, -2.12f, 3.31f);
        dij.LJIIIZ(3.1f, 3.1f, false, false, 2.42f, 2.71f);
        dij.LJIIJ(0.6f, 0.12f, 1.22f, 0.08f, 2.14f, -0.1f);
        dij.LJIIJ(0.5f, -0.1f, 0.95f, -0.26f, 1.39f, -0.52f);
        dij.LJIIIZ(3.48f, 3.48f, false, false, 1.67f, -2.38f);
        dij.LJIIJ(0.1f, -0.5f, 0.13f, -0.96f, 0.13f, -1.47f);
        dij.LJIJ(19.82f);
        dij.LJIIJ(0.0f, -0.69f, 0.2f, -0.87f, 0.75f, -1.0f);
        dij.LJIIL(10.32f, -2.08f);
        dij.LJIIJ(0.64f, -0.12f, 0.94f, 0.06f, 0.94f, 0.73f);
        dij.LJIILL(8.79f);
        dij.LJIIJ(0.0f, 0.35f, 0.0f, 0.7f, -0.24f, 0.99f);
        dij.LJIIJ(-0.23f, 0.28f, -0.52f, 0.37f, -0.86f, 0.44f);
        dij.LJIIL(-0.78f, 0.15f);
        dij.LJIIJ(-0.98f, 0.2f, -1.61f, 0.34f, -2.2f, 0.56f);
        dij.LJIIIZ(3.14f, 3.14f, false, false, -2.14f, 3.31f);
        dij.LJIIIZ(3.13f, 3.13f, false, false, 2.45f, 2.7f);
        dij.LJIIJ(0.6f, 0.13f, 1.22f, 0.08f, 2.14f, -0.1f);
        dij.LJIIJ(0.49f, -0.1f, 0.95f, -0.25f, 1.39f, -0.5f);
        dij.LJIIIZ(3.48f, 3.48f, false, false, 1.67f, -2.38f);
        dij.LJIIJ(0.1f, -0.5f, 0.1f, -0.97f, 0.1f, -1.47f);
        dij.LJIJ(11.14f);
        dij.LJIIJ(0.01f, -0.68f, -0.35f, -1.1f, -1.0f, -1.05f);
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
