package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import kotlin.jvm.internal.o;

/* renamed from: X.DHf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33615DHf extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C33615DHf() {
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{-8875, -8875, -43970, -3655765}, new float[]{0.0f, 0.1f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.setValues(new float[]{0.0f, 36.8711f, 14.63f, -39.643f, 0.0f, 47.08f, 0.0f, 0.0f, 1.0f});
        radialGradient.setLocalMatrix(matrix);
        RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{-13143608, -13143608, 6684927}, new float[]{0.0f, 0.13f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix2 = new Matrix();
        matrix2.preRotate(78.68f, -5.55f, 1.8f);
        matrix2.preScale(17.7206f, 73.0449f);
        radialGradient2.setLocalMatrix(matrix2);
        C32856Cuy.Wh(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setShader(radialGradient);
        Paint paint = new Paint();
        this.LJ = paint;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Wh(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(radialGradient2);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, paint);
        this.LJI = LIZ;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(24.0f, 9.23f);
        dij2.LJIIJ(-4.01f, 0.0f, -4.52f, 0.02f, -6.09f, 0.09f);
        dij2.LJIIJ(-1.57f, 0.07f, -2.65f, 0.32f, -3.58f, 0.69f);
        dij2.LJIIJ(-0.98f, 0.37f, -1.8f, 0.88f, -2.62f, 1.7f);
        dij2.LJIIIZ(7.25f, 7.25f, false, false, -1.7f, 2.62f);
        dij2.LJIIIZ(10.8f, 10.8f, false, false, -0.69f, 3.58f);
        dij2.LJIIJ(-0.07f, 1.58f, -0.09f, 2.08f, -0.09f, 6.1f);
        dij2.LJIIJ(0.0f, 4.0f, 0.02f, 4.5f, 0.09f, 6.08f);
        dij2.LJIIJ(0.07f, 1.57f, 0.32f, 2.65f, 0.69f, 3.59f);
        dij2.LJIIJ(0.37f, 0.97f, 0.88f, 1.8f, 1.7f, 2.61f);
        dij2.LJIIIZ(7.23f, 7.23f, false, false, 2.61f, 1.7f);
        dij2.LJIIJ(0.94f, 0.37f, 2.02f, 0.62f, 3.59f, 0.7f);
        dij2.LJIIJ(1.57f, 0.06f, 2.08f, 0.08f, 6.09f, 0.08f);
        dij2.LJIIJ(4.0f, 0.0f, 4.5f, -0.02f, 6.08f, -0.09f);
        dij2.LJIIJ(1.58f, -0.07f, 2.65f, -0.32f, 3.59f, -0.68f);
        dij2.LJIIJ(0.97f, -0.38f, 1.8f, -0.89f, 2.61f, -1.7f);
        dij2.LJIIIZ(7.25f, 7.25f, false, false, 1.7f, -2.62f);
        dij2.LJIIJ(0.37f, -0.94f, 0.62f, -2.02f, 0.7f, -3.59f);
        dij2.LJIIJ(0.06f, -1.57f, 0.08f, -2.08f, 0.08f, -6.09f);
        dij2.LJIILJJIL(-0.02f, -4.51f, -0.09f, -6.09f, true);
        dij2.LJIIIZ(10.95f, 10.95f, false, false, -0.68f, -3.58f);
        dij2.LJIIIZ(7.25f, 7.25f, false, false, -1.7f, -2.62f);
        dij2.LJIIIZ(7.22f, 7.22f, false, false, -2.62f, -1.7f);
        dij2.LJIIJ(-0.94f, -0.37f, -2.02f, -0.62f, -3.59f, -0.69f);
        dij2.LJIIJ(-1.57f, -0.07f, -2.07f, -0.09f, -6.09f, -0.09f);
        dij2.LIZLLL();
        dij2.LJIILIIL(-1.33f, 2.66f);
        C32856Cuy.A6(dij2);
        dij2.LJIIJ(3.94f, 0.0f, 4.4f, 0.02f, 5.97f, 0.09f);
        dij2.LJIIJ(1.44f, 0.06f, 2.22f, 0.3f, 2.74f, 0.5f);
        dij2.LJIIJ(0.69f, 0.27f, 1.18f, 0.6f, 1.7f, 1.11f);
        dij2.LJIIJ(0.51f, 0.52f, 0.83f, 1.01f, 1.1f, 1.7f);
        dij2.LJIIJ(0.2f, 0.52f, 0.44f, 1.3f, 0.5f, 2.74f);
        dij2.LJIIJ(0.08f, 1.56f, 0.1f, 2.03f, 0.1f, 5.97f);
        dij2.LJIILJJIL(-0.02f, 4.4f, -0.1f, 5.96f, true);
        dij2.LJIIIZ(8.17f, 8.17f, false, true, -0.5f, 2.75f);
        dij2.LJIIIZ(4.57f, 4.57f, false, true, -1.1f, 1.7f);
        dij2.LJIIJ(-0.52f, 0.51f, -1.01f, 0.83f, -1.7f, 1.1f);
        dij2.LJIIJ(-0.52f, 0.2f, -1.3f, 0.44f, -2.74f, 0.5f);
        dij2.LJIIJ(-1.56f, 0.08f, -2.03f, 0.1f, -5.97f, 0.1f);
        dij2.LJIILJJIL(-4.41f, -0.02f, -5.97f, -0.1f, true);
        dij2.LJIIIZ(8.19f, 8.19f, false, true, -2.74f, -0.5f);
        dij2.LJIIIZ(4.57f, 4.57f, false, true, -1.7f, -1.1f);
        dij2.LJIIJ(-0.52f, -0.52f, -0.84f, -1.01f, -1.1f, -1.7f);
        dij2.LJIIJ(-0.2f, -0.52f, -0.45f, -1.3f, -0.51f, -2.75f);
        dij2.LJIIJ(-0.07f, -1.55f, -0.09f, -2.02f, -0.09f, -5.97f);
        dij2.LJIIJ(0.0f, -3.94f, 0.02f, -4.4f, 0.09f, -5.96f);
        dij2.LJIIJ(0.06f, -1.44f, 0.3f, -2.22f, 0.5f, -2.74f);
        dij2.LJIIJ(0.27f, -0.7f, 0.6f, -1.19f, 1.11f, -1.7f);
        dij2.LJIIJ(0.52f, -0.52f, 1.01f, -0.84f, 1.7f, -1.1f);
        dij2.LJIIJ(0.52f, -0.21f, 1.3f, -0.45f, 2.74f, -0.52f);
        dij2.LJIIJ(1.36f, -0.06f, 1.9f, -0.08f, 4.64f, -0.08f);
        dij2.LIZLLL();
        dij2.LJIILIIL(9.21f, 2.46f);
        dij2.LJIIIZ(1.77f, 1.77f, true, false, 0.0f, 3.54f);
        dij2.LJIIIZ(1.77f, 1.77f, false, false, 0.0f, -3.54f);
        dij2.LIZLLL();
        dij2.LJIIIIZZ(24.0f, 16.42f);
        dij2.LJIIIZ(7.58f, 7.58f, true, false, 0.0f, 15.16f);
        dij2.LJIIIZ(7.58f, 7.58f, false, false, 0.0f, -15.16f);
        dij2.LIZLLL();
        dij2.LJIILIIL(0.0f, 2.66f);
        dij2.LJIIIZ(4.92f, 4.92f, true, true, 0.0f, 9.84f);
        dij2.LJIIIZ(4.92f, 4.92f, false, true, 0.0f, -9.84f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-1);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
        canvas.drawPath(this.LJII.LIZ, this.LJI);
    }
}
