package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import kotlin.jvm.internal.o;

/* renamed from: X.DHz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33635DHz extends AbstractC39455Fe7 {
    public C33635DHz() {
        LinearGradient linearGradient = new LinearGradient(2.9f, 7.87f, 44.94f, 46.17f, new int[]{-15351559, -14625300, -15014970}, new float[]{0.0f, 0.71f, 1.0f}, Shader.TileMode.CLAMP);
        C32856Cuy.me(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setShader(linearGradient);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
