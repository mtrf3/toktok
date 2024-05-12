package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import kotlin.jvm.internal.o;

/* renamed from: X.DHy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33634DHy extends AbstractC39455Fe7 {
    public C33634DHy() {
        LinearGradient linearGradient = new LinearGradient(2.5f, 5.3f, 39.57f, 47.86f, new int[]{-15351559, -14625300, -15014970}, new float[]{0.0f, 0.48f, 1.0f}, Shader.TileMode.CLAMP);
        C32856Cuy.Va(this.LIZJ);
        this.LIZJ.LJIIJ(0.69f, 0.0f, 1.0f, 1.08f, 1.4f, 2.45f);
        this.LIZJ.LJIIJ(0.42f, 1.48f, 0.95f, 3.3f, 2.15f, 4.5f);
        this.LIZJ.LJIIJ(1.2f, 1.2f, 3.02f, 1.73f, 4.5f, 2.15f);
        this.LIZJ.LJIIJ(1.37f, 0.4f, 2.45f, 0.71f, 2.45f, 1.4f);
        this.LIZJ.LJIILJJIL(-1.08f, 1.0f, -2.45f, 1.4f, true);
        this.LIZJ.LJIIJ(-1.48f, 0.42f, -3.3f, 0.95f, -4.5f, 2.15f);
        this.LIZJ.LJIIJ(-1.2f, 1.2f, -1.73f, 3.02f, -2.15f, 4.5f);
        this.LIZJ.LJIIJ(-0.4f, 1.37f, -0.71f, 2.45f, -1.4f, 2.45f);
        this.LIZJ.LJIILJJIL(-1.0f, -1.08f, -1.4f, -2.45f, true);
        this.LIZJ.LJIIJ(-0.42f, -1.48f, -0.95f, -3.3f, -2.15f, -4.5f);
        this.LIZJ.LJIIJ(-1.2f, -1.2f, -3.02f, -1.73f, -4.5f, -2.15f);
        this.LIZJ.LJIIJ(-1.37f, -0.4f, -2.45f, -0.71f, -2.45f, -1.4f);
        this.LIZJ.LJIILJJIL(1.08f, -1.0f, 2.45f, -1.4f, true);
        this.LIZJ.LJIIJ(1.48f, -0.42f, 3.3f, -0.95f, 4.5f, -2.15f);
        this.LIZJ.LJIIJ(1.2f, -1.2f, 1.73f, -3.02f, 2.15f, -4.5f);
        this.LIZJ.LJIIJ(0.4f, -1.37f, 0.71f, -2.45f, 1.4f, -2.45f);
        this.LIZJ.LIZLLL();
        C32856Cuy.Km(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
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
