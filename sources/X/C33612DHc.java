package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import kotlin.jvm.internal.o;

/* renamed from: X.DHc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33612DHc extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;
    public final Paint LJII;
    public final DIJ LJIIIIZZ;
    public final Paint LJIIIZ;
    public final DIJ LJIIJ;

    public C33612DHc() {
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
        dij3.LJIILIIL(20.47f, 21.23f);
        dij3.LJIIL(-3.38f, 4.99f);
        dij3.LJIIJ(-0.33f, 0.48f, 0.3f, 1.01f, 0.79f, 0.67f);
        dij3.LJIIL(3.63f, -2.56f);
        dij3.LJIIIZ(0.73f, 0.73f, false, true, 0.83f, 0.0f);
        dij3.LJIIL(2.7f, 1.87f);
        dij3.LJIIJ(0.8f, 0.56f, 1.95f, 0.37f, 2.49f, -0.43f);
        dij3.LJIIL(3.38f, -4.98f);
        dij3.LJIIJ(0.32f, -0.48f, -0.3f, -1.02f, -0.8f, -0.68f);
        dij3.LJIIL(-3.62f, 2.56f);
        dij3.LJIIIZ(0.73f, 0.73f, false, true, -0.83f, 0.0f);
        dij3.LJIIL(-2.7f, -1.87f);
        dij3.LJIIIZ(1.8f, 1.8f, false, false, -2.5f, 0.43f);
        dij3.LIZLLL();
        dij3.LJIIZILJ(Path.FillType.WINDING);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-1);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJIIIZ = LIZ2;
        DIJ dij4 = new DIJ();
        this.LJIIJ = dij4;
        dij4.LJIILIIL(19.54f, 35.77f);
        dij4.LJIIL(-2.58f, 1.14f);
        dij4.LJIIJ(-0.68f, 0.3f, -1.44f, -0.18f, -1.46f, -0.92f);
        dij4.LJIIL(-0.07f, -2.31f);
        dij4.LJIIJ(0.0f, -0.29f, -0.14f, -0.56f, -0.35f, -0.74f);
        dij4.LIZJ(12.34f, 12.34f, false, true, 11.0f, 23.6f);
        dij4.LJ(11.0f, 16.36f, 16.68f, 11.0f, 24.0f, 11.0f);
        dij4.LJIILJJIL(13.0f, 5.37f, 13.0f, 12.61f, true);
        dij4.LJIIJ(0.0f, 7.25f, -5.68f, 12.61f, -13.0f, 12.61f);
        dij4.LJIIJ(-1.32f, 0.0f, -2.58f, -0.17f, -3.76f, -0.5f);
        dij4.LJIIIZ(1.04f, 1.04f, false, false, -0.7f, 0.05f);
        dij4.LIZLLL();
        dij4.LJIILIIL(-2.08f, -1.26f);
        dij4.LJIIL(-0.03f, -0.89f);
        dij4.LJIIIZ(3.03f, 3.03f, false, false, -1.02f, -2.17f);
        dij4.LIZJ(10.34f, 10.34f, false, true, 13.0f, 23.6f);
        dij4.LJ(13.0f, 17.54f, 17.7f, 13.0f, 24.0f, 13.0f);
        dij4.LJIIJ(6.29f, 0.0f, 11.0f, 4.54f, 11.0f, 10.61f);
        dij4.LJIIJ(0.0f, 6.07f, -4.7f, 10.61f, -11.0f, 10.61f);
        dij4.LJIIJ(-1.14f, 0.0f, -2.22f, -0.15f, -3.23f, -0.43f);
        C32856Cuy.ob(dij4);
        dij4.LJIIIZ(3.04f, 3.04f, false, false, -2.02f, 0.16f);
        I9A.LIZIZ(dij4, -1.27f, 0.56f, -1.05f, -3.06f);
        dij4.LJIIL(-1.33f, 1.49f);
        dij4.LJIIL(1.33f, -1.5f);
        dij4.LIZLLL();
        dij4.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZ2.setStyle(Paint.Style.FILL);
        LIZ2.setColor(-1);
        this.LIZ.add(LIZ2);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJI.LIZ, this.LJFF);
        canvas.drawPath(this.LJIIIIZZ.LIZ, this.LJII);
        canvas.drawPath(this.LJIIJ.LIZ, this.LJIIIZ);
    }
}
