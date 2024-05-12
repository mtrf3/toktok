package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import kotlin.jvm.internal.o;

/* renamed from: X.DHv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33631DHv extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33631DHv() {
        LinearGradient linearGradient = new LinearGradient(6.3f, 4.0f, 44.19f, 38.77f, new int[]{-15351559, -14625300, -15014970}, new float[]{0.0f, 0.48f, 1.0f}, Shader.TileMode.CLAMP);
        LinearGradient linearGradient2 = new LinearGradient(6.3f, 4.0f, 44.19f, 38.77f, new int[]{-15351559, -14625300, -15014970}, new float[]{0.0f, 0.48f, 1.0f}, Shader.TileMode.CLAMP);
        C32856Cuy.u1(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setShader(linearGradient);
        Paint paint = new Paint();
        this.LJ = paint;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.ij(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(linearGradient2);
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
