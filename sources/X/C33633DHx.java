package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import kotlin.jvm.internal.o;

/* renamed from: X.DHx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33633DHx extends AbstractC39455Fe7 {
    public C33633DHx() {
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{-50582, -119723}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.preRotate(54.98f, -4.82f, 21.84f);
        matrix.preScale(27.8344f, 30.3834f);
        radialGradient.setLocalMatrix(matrix);
        C32856Cuy.zi(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setShader(radialGradient);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
