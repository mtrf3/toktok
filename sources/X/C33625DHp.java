package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import kotlin.jvm.internal.o;

/* renamed from: X.DHp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33625DHp extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33625DHp() {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 48.03f, 47.97f, new int[]{-15351559, -14625300, -15014970}, new float[]{0.0f, 0.48f, 1.0f}, Shader.TileMode.CLAMP);
        this.LIZJ.LIZ(24.0f, 24.0f, 24.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setShader(linearGradient);
        Paint paint = new Paint();
        this.LJ = paint;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(22.14f, 14.67f);
        dij.LJIIJ(0.07f, -0.27f, 0.1f, -0.4f, 0.13f, -0.45f);
        dij.LJIIIZ(0.8f, 0.8f, false, true, 1.46f, 0.0f);
        dij.LJIIJ(0.03f, 0.05f, 0.06f, 0.18f, 0.13f, 0.45f);
        dij.LJIIL(0.08f, 0.26f);
        dij.LJIIIZ(12.6f, 12.6f, false, false, 9.36f, 9.49f);
        dij.LJIIL(0.28f, 0.09f);
        dij.LJIIIZ(0.8f, 0.8f, false, true, 0.0f, 1.48f);
        dij.LJIIIZ(4.5f, 4.5f, false, true, -0.29f, 0.1f);
        dij.LJIIIZ(12.6f, 12.6f, false, false, -9.36f, 9.49f);
        dij.LJIIL(-0.07f, 0.25f);
        dij.LJIIJ(-0.07f, 0.27f, -0.1f, 0.4f, -0.13f, 0.45f);
        dij.LJIIIZ(0.8f, 0.8f, false, true, -1.46f, 0.0f);
        dij.LJIIJ(-0.03f, -0.05f, -0.06f, -0.18f, -0.13f, -0.45f);
        dij.LJIIL(-0.08f, -0.26f);
        dij.LJIIIZ(12.6f, 12.6f, false, false, -8.32f, -9.18f);
        dij.LJIIJ(-0.24f, -0.08f, -0.5f, -0.16f, -1.03f, -0.3f);
        dij.LJIIIZ(4.5f, 4.5f, false, true, -0.3f, -0.1f);
        dij.LJIIIZ(0.8f, 0.8f, false, true, 0.0f, -1.48f);
        dij.LJIIL(0.3f, -0.1f);
        dij.LJIIIZ(12.6f, 12.6f, false, false, 9.36f, -9.49f);
        C279417u.LIZIZ(dij, 0.07f, -0.25f, 32.69f, 11.4f);
        dij.LJIIL(0.04f, -0.16f);
        dij.LJIIIZ(0.3f, 0.3f, false, true, 0.54f, 0.0f);
        dij.LJIIL(0.04f, 0.16f);
        dij.LJIIL(0.03f, 0.1f);
        dij.LJIIL(0.1f, 0.37f);
        dij.LJIIIZ(4.58f, 4.58f, false, false, 3.3f, 3.08f);
        dij.LJIIL(0.1f, 0.03f);
        dij.LJIIIZ(0.3f, 0.3f, false, true, 0.0f, 0.54f);
        dij.LJIIL(-0.1f, 0.03f);
        dij.LJIIL(-0.37f, 0.11f);
        dij.LIZJ(4.58f, 4.58f, false, false, 33.34f, 19.0f);
        dij.LJIIL(-0.03f, 0.1f);
        dij.LJIIL(-0.04f, 0.16f);
        dij.LJIIIZ(0.3f, 0.3f, false, true, -0.54f, 0.0f);
        dij.LJIIL(-0.04f, -0.16f);
        dij.LJIIL(-0.03f, -0.1f);
        dij.LJIIL(-0.1f, -0.37f);
        dij.LJIIIZ(4.58f, 4.58f, false, false, -3.3f, -3.08f);
        dij.LJIIL(-0.1f, -0.03f);
        dij.LJIIIZ(0.3f, 0.3f, false, true, 0.0f, -0.54f);
        dij.LJIIL(0.1f, -0.03f);
        dij.LJIIL(0.37f, -0.11f);
        dij.LJIIIZ(4.58f, 4.58f, false, false, 3.03f, -3.34f);
        dij.LJIIL(0.03f, -0.1f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
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
