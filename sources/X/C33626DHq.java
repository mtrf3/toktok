package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import kotlin.jvm.internal.o;

/* renamed from: X.DHq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33626DHq extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33626DHq() {
        LinearGradient linearGradient = new LinearGradient(-17.5f, -40.5f, 24.0f, 48.0f, new int[]{-3342098, -65188}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.LIZJ.LIZ(24.0f, 24.0f, 24.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setShader(linearGradient);
        Paint paint = new Paint();
        this.LJ = paint;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(36.51f, 15.58f);
        dij.LJIIJ(-0.2f, -0.36f, -0.6f, -0.58f, -1.01f, -0.58f);
        dij.LJI(12.17f);
        dij.LJIIIZ(1.17f, 1.17f, false, false, -0.87f, 1.95f);
        dij.LJIIL(6.1f, 6.7f);
        dij.LJIIJ(0.32f, 0.35f, 0.82f, 0.47f, 1.27f, 0.3f);
        dij.LJIIL(8.46f, -3.21f);
        dij.LJIIJ(0.1f, -0.04f, 0.14f, -0.03f, 0.16f, -0.02f);
        dij.LJIIJ(0.04f, 0.02f, 0.08f, 0.05f, 0.12f, 0.12f);
        dij.LJIIJ(0.04f, 0.06f, 0.05f, 0.12f, 0.04f, 0.16f);
        dij.LJIIJ(0.0f, 0.02f, 0.0f, 0.06f, -0.09f, 0.13f);
        C32856Cuy.LLLZIIL(dij);
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
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
