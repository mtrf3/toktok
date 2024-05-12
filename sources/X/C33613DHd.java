package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import kotlin.jvm.internal.o;

/* renamed from: X.DHd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33613DHd extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;
    public final Paint LJII;
    public final DIJ LJIIIIZZ;

    public C33613DHd() {
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{-8875, -8875, -43970, -3655765}, new float[]{0.0f, 0.1f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.setValues(new float[]{0.0f, 44.2453f, 12.75f, -47.5715f, 0.0f, 51.7f, 0.0f, 0.0f, 1.0f});
        radialGradient.setLocalMatrix(matrix);
        RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{-13143608, -13143608, 6684927}, new float[]{0.0f, 0.13f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix2 = new Matrix();
        matrix2.preRotate(78.68f, -6.13f, -3.18f);
        matrix2.preScale(21.2647f, 87.6539f);
        radialGradient2.setLocalMatrix(matrix2);
        new Paint();
        DIJ dij = new DIJ();
        this.LJ = dij;
        C32856Cuy.L5(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.x8(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setShader(radialGradient);
        Paint paint = new Paint();
        this.LJFF = paint;
        DIJ dij2 = new DIJ();
        this.LJI = dij2;
        C32856Cuy.x8(dij2);
        dij2.LJIIZILJ(Path.FillType.EVEN_ODD);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(radialGradient2);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, paint);
        this.LJII = LIZ;
        DIJ dij3 = new DIJ();
        this.LJIIIIZZ = dij3;
        dij3.LJIIIIZZ(24.0f, 10.8f);
        dij3.LJIIIZ(1.2f, 1.2f, true, false, 0.0f, 2.4f);
        dij3.LJIIJ(5.95f, 0.0f, 10.8f, 4.9f, 10.8f, 10.99f);
        dij3.LJIIJ(0.0f, 3.97f, -2.07f, 7.45f, -5.18f, 9.38f);
        dij3.LJIIIZ(1.2f, 1.2f, false, false, 1.27f, 2.04f);
        dij3.LJIIJ(3.79f, -2.36f, 6.31f, -6.6f, 6.31f, -11.42f);
        dij3.LIZJ(13.3f, 13.3f, false, false, 24.0f, 10.8f);
        dij3.LIZLLL();
        dij3.LJIILIIL(-6.88f, 4.92f);
        dij3.LJIIIZ(1.2f, 1.2f, false, false, -1.55f, -1.83f);
        dij3.LJIIIZ(13.34f, 13.34f, false, false, -1.84f, 1.89f);
        dij3.LJIIIZ(1.2f, 1.2f, false, false, 1.88f, 1.5f);
        dij3.LJIIIZ(10.98f, 10.98f, false, true, 1.5f, -1.56f);
        dij3.LIZLLL();
        dij3.LJIILIIL(-3.32f, 4.83f);
        dij3.LJIIIZ(1.2f, 1.2f, false, false, -2.27f, -0.78f);
        dij3.LJIIIZ(13.48f, 13.48f, false, false, -0.73f, 4.42f);
        dij3.LJIIIZ(1.2f, 1.2f, true, false, 2.4f, 0.0f);
        dij3.LJIIIZ(11.32f, 11.32f, false, true, 0.6f, -3.64f);
        dij3.LIZLLL();
        dij3.LJIILIIL(0.03f, 7.26f);
        dij3.LJIIIZ(1.2f, 1.2f, true, false, -2.25f, 0.85f);
        dij3.LJIIIZ(12.63f, 12.63f, false, false, 3.12f, 4.68f);
        dij3.LJIIIZ(1.2f, 1.2f, false, false, 1.66f, -1.74f);
        dij3.LJIIJ(-1.13f, -1.07f, -2.0f, -2.36f, -2.53f, -3.79f);
        dij3.LIZLLL();
        dij3.LJIILIIL(6.3f, 6.34f);
        dij3.LJIIIZ(1.2f, 1.2f, true, false, -0.74f, 2.29f);
        dij3.LJIIIZ(15.9f, 15.9f, false, false, 6.87f, 0.64f);
        dij3.LJIIIZ(1.2f, 1.2f, true, false, -0.29f, -2.38f);
        dij3.LJIIIZ(14.0f, 14.0f, false, true, -5.83f, -0.55f);
        dij3.LIZLLL();
        dij3.LJIILIIL(2.81f, -14.03f);
        dij3.LJIIIZ(1.06f, 1.06f, false, true, 2.12f, 0.0f);
        dij3.LJIILL(2.82f);
        C32856Cuy.Eb(dij3);
        dij3.LJIIIZ(1.06f, 1.06f, true, true, 0.0f, 2.12f);
        dij3.LJIIJJI(-2.82f);
        dij3.LJIILL(2.82f);
        dij3.LJIIIZ(1.06f, 1.06f, false, true, -2.12f, 0.0f);
        dij3.LJIILL(-2.82f);
        dij3.LJIIJJI(-2.82f);
        dij3.LJIIIZ(1.06f, 1.06f, false, true, 0.0f, -2.12f);
        C32856Cuy.Eb(dij3);
        dij3.LJIILL(-2.82f);
        dij3.LIZLLL();
        dij3.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-1);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJI.LIZ, this.LJFF);
        canvas.drawPath(this.LJIIIIZZ.LIZ, this.LJII);
    }
}
