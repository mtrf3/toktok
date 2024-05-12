package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* renamed from: X.VhM, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80424VhM extends AbstractC80431VhT {
    public final C80427VhP LIZIZ;

    public C80424VhM(C80427VhP c80427VhP) {
        this.LIZIZ = c80427VhP;
    }

    @Override // X.AbstractC80431VhT
    public final void LIZ(Matrix matrix, C80426VhO c80426VhO, int i, Canvas canvas) {
        boolean z;
        C80427VhP c80427VhP = this.LIZIZ;
        float f = c80427VhP.LJFF;
        float f2 = c80427VhP.LJI;
        C80427VhP c80427VhP2 = this.LIZIZ;
        RectF rectF = new RectF(c80427VhP2.LIZIZ, c80427VhP2.LIZJ, c80427VhP2.LIZLLL, c80427VhP2.LJ);
        c80426VhO.getClass();
        if (f2 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Path path = c80426VhO.LJI;
        int[] iArr = C80426VhO.LJIIJ;
        if (z) {
            iArr[0] = 0;
            iArr[1] = c80426VhO.LJFF;
            iArr[2] = c80426VhO.LJ;
            iArr[3] = c80426VhO.LIZLLL;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = c80426VhO.LIZLLL;
            iArr[2] = c80426VhO.LJ;
            iArr[3] = c80426VhO.LJFF;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float LIZ = C1I0.LIZ(1.0f, f4, 2.0f, f4);
        float[] fArr = C80426VhO.LJIIJJI;
        fArr[1] = f4;
        fArr[2] = LIZ;
        c80426VhO.LIZIZ.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c80426VhO.LJII);
        }
        canvas.drawArc(rectF, f, f2, true, c80426VhO.LIZIZ);
        canvas.restore();
    }
}
