package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: X.VhN, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80425VhN extends AbstractC80431VhT {
    public final C80428VhQ LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public final float LIZIZ() {
        C80428VhQ c80428VhQ = this.LIZIZ;
        return (float) Math.toDegrees(Math.atan((c80428VhQ.LIZJ - this.LIZLLL) / (c80428VhQ.LIZIZ - this.LIZJ)));
    }

    public C80425VhN(C80428VhQ c80428VhQ, float f, float f2) {
        this.LIZIZ = c80428VhQ;
        this.LIZJ = f;
        this.LIZLLL = f2;
    }

    @Override // X.AbstractC80431VhT
    public final void LIZ(Matrix matrix, C80426VhO c80426VhO, int i, Canvas canvas) {
        C80428VhQ c80428VhQ = this.LIZIZ;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(c80428VhQ.LIZJ - this.LIZLLL, c80428VhQ.LIZIZ - this.LIZJ), 0.0f);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preTranslate(this.LIZJ, this.LIZLLL);
        matrix2.preRotate(LIZIZ());
        c80426VhO.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = C80426VhO.LJIIIIZZ;
        iArr[0] = c80426VhO.LJFF;
        iArr[1] = c80426VhO.LJ;
        iArr[2] = c80426VhO.LIZLLL;
        Paint paint = c80426VhO.LIZJ;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, C80426VhO.LJIIIZ, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, c80426VhO.LIZJ);
        canvas.restore();
    }
}
