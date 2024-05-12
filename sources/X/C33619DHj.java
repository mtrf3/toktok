package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import kotlin.jvm.internal.o;

/* renamed from: X.DHj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33619DHj extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C33619DHj() {
        LinearGradient linearGradient = new LinearGradient(75.96f, 65.78f, 60.43f, -5.9f, new int[]{-12327262, -15151049}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.x8(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setShader(linearGradient);
        Paint paint = new Paint();
        this.LJFF = paint;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(38.0f, 23.5f);
        dij.LJIIJ(0.0f, 6.4f, -6.27f, 11.6f, -14.0f, 11.6f);
        dij.LJIIJ(-0.94f, 0.0f, -1.85f, -0.07f, -2.74f, -0.22f);
        dij.LJIIJ(-0.77f, -0.07f, -1.23f, 0.0f, -2.03f, 0.25f);
        dij.LJIIJ(-0.3f, 0.09f, -0.64f, 0.27f, -1.04f, 0.48f);
        dij.LJIIJ(-0.88f, 0.48f, -2.02f, 1.09f, -3.42f, 1.09f);
        dij.LJIIJ(-0.02f, 0.0f, 0.07f, -0.1f, 0.22f, -0.24f);
        dij.LJIIJ(0.5f, -0.5f, 1.7f, -1.68f, 1.7f, -2.63f);
        dij.LJIILL(-0.44f);
        dij.LJ(12.66f, 31.35f, 10.0f, 27.7f, 10.0f, 23.5f);
        dij.LJIIJ(0.0f, -6.41f, 6.27f, -11.61f, 14.0f, -11.61f);
        dij.LJIILJJIL(14.0f, 5.2f, 14.0f, 11.61f, true);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.LIZ.add(paint);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJI.LIZ, this.LJFF);
    }
}
