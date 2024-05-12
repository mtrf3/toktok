package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import kotlin.jvm.internal.o;

/* renamed from: X.DHk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33620DHk extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C33620DHk() {
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{-7308033, -10277889}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.setValues(new float[]{-84.79804f, -47.94098f, 73.64f, 61.11104f, -66.52319f, -13.42f, 0.0f, 0.0f, 1.0f});
        radialGradient.setLocalMatrix(matrix);
        this.LIZJ.LJIIIIZZ(1.4f, 19.74f);
        this.LIZJ.LJIIIZ(6.37f, 6.37f, false, true, 3.84f, -8.19f);
        this.LIZJ.LJII(19.55f, 6.4f);
        this.LIZJ.LJIIJ(3.35f, -1.21f, 7.06f, 0.5f, 8.28f, 3.8f);
        this.LIZJ.LJIIL(6.3f, 17.07f);
        this.LIZJ.LJIIIZ(6.37f, 6.37f, false, true, -3.85f, 8.19f);
        this.LIZJ.LJII(15.97f, 40.6f);
        this.LIZJ.LJIIIZ(6.48f, 6.48f, false, true, -8.28f, -3.8f);
        this.LIZJ.LJII(1.4f, 19.73f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setShader(radialGradient);
        Paint paint = new Paint();
        this.LJ = paint;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(47.0f, 24.76f);
        dij.LJIIJ(0.04f, 8.51f, -6.9f, 15.44f, -15.5f, 15.48f);
        dij.LJIIJ(-8.6f, 0.04f, -15.6f, -6.82f, -15.64f, -15.32f);
        dij.LJIIIZ(15.48f, 15.48f, false, true, 15.5f, -15.48f);
        dij.LJIIJ(8.6f, -0.04f, 15.6f, 6.82f, 15.64f, 15.32f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-5533698);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, paint);
        this.LJI = LIZ;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(28.58f, 23.72f);
        dij2.LJII(28.0f, 25.19f);
        dij2.LJIIJ(-0.6f, 1.51f, 0.16f, 3.21f, 1.68f, 3.8f);
        dij2.LJIIIZ(2.97f, 2.97f, false, false, 3.84f, -1.67f);
        dij2.LJIIL(0.58f, -1.47f);
        dij2.LJIIL(3.63f, 1.4f);
        dij2.LJIIL(-0.58f, 1.47f);
        dij2.LJIIIZ(6.88f, 6.88f, false, true, -8.89f, 3.86f);
        dij2.LJIIIZ(6.76f, 6.76f, false, true, -3.9f, -8.79f);
        dij2.LJIIL(0.59f, -1.47f);
        dij2.LJIIL(3.63f, 1.4f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.EVEN_ODD);
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
