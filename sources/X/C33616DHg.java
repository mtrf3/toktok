package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import kotlin.jvm.internal.o;

/* renamed from: X.DHg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33616DHg extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;
    public final Paint LJIIIIZZ;
    public final DIJ LJIIIZ;

    public C33616DHg() {
        LinearGradient linearGradient = new LinearGradient(24.5f, 40.0f, 24.5f, 5.0f, new int[]{-14634952, -10430870}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        LinearGradient linearGradient2 = new LinearGradient(24.5f, 40.0f, 24.5f, 5.0f, new int[]{-14634952, -10430870}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(7.0f, 40.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setShader(linearGradient);
        Paint paint = new Paint();
        this.LJ = paint;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIILIIL(7.0f, 40.0f);
        dij.LJIIL(9.24f, -2.41f);
        dij.LIZJ(17.41f, 17.41f, false, false, 42.0f, 22.36f);
        dij.LJIIJ(0.0f, -4.64f, -1.8f, -9.0f, -5.1f, -12.27f);
        dij.LIZJ(17.35f, 17.35f, false, false, 24.57f, 5.0f);
        dij.LJIIJ(-9.6f, 0.0f, -17.42f, 7.78f, -17.42f, 17.34f);
        dij.LJIIJ(0.0f, 3.06f, 0.8f, 6.04f, 2.32f, 8.67f);
        dij.LJII(7.0f, 40.0f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(linearGradient2);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, paint);
        this.LJI = LIZ;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(8.61f, 32.24f);
        dij2.LJII(6.0f, 42.0f);
        dij2.LJIIL(9.75f, -2.62f);
        dij2.LJIIJ(2.69f, 1.5f, 5.71f, 2.3f, 8.8f, 2.3f);
        dij2.LJIIJ(10.14f, 0.0f, 18.39f, -8.45f, 18.4f, -18.84f);
        dij2.LJIIJ(0.0f, -5.03f, -1.92f, -9.76f, -5.39f, -13.32f);
        dij2.LIZJ(18.06f, 18.06f, false, false, 24.55f, 4.0f);
        dij2.LJIIJ(-10.14f, 0.0f, -18.4f, 8.45f, -18.4f, 18.83f);
        dij2.LJIIJ(0.0f, 3.32f, 0.85f, 6.56f, 2.46f, 9.41f);
        dij2.LIZLLL();
        dij2.LJIILIIL(8.15f, 4.07f);
        dij2.LJIIL(-0.56f, -0.34f);
        dij2.LJIIL(-5.78f, 1.56f);
        dij2.LJIIL(1.54f, -5.78f);
        dij2.LJIIL(-0.36f, -0.6f);
        dij2.LJIIIZ(15.89f, 15.89f, false, true, -2.34f, -8.32f);
        dij2.LJIIJ(0.0f, -8.63f, 6.86f, -15.65f, 15.3f, -15.65f);
        dij2.LJIIJ(4.08f, 0.0f, 7.92f, 1.63f, 10.8f, 4.59f);
        dij2.LJIIIZ(15.75f, 15.75f, false, true, 4.48f, 11.07f);
        dij2.LJIIJ(0.0f, 8.63f, -6.86f, 15.65f, -15.29f, 15.65f);
        dij2.LJIIIZ(15.0f, 15.0f, false, true, -7.79f, -2.18f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-1);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJIIIIZZ = LIZ2;
        DIJ dij3 = new DIJ();
        this.LJIIIZ = dij3;
        dij3.LJIIIIZZ(19.43f, 13.95f);
        dij3.LJIIJ(0.32f, 0.01f, 0.68f, 0.03f, 1.02f, 0.79f);
        dij3.LJIIJ(0.24f, 0.52f, 0.63f, 1.49f, 0.95f, 2.26f);
        dij3.LJIIL(0.46f, 1.12f);
        dij3.LJIIJ(0.11f, 0.23f, 0.19f, 0.5f, 0.04f, 0.8f);
        dij3.LJIIL(-0.07f, 0.12f);
        dij3.LJIIJ(-0.11f, 0.24f, -0.2f, 0.4f, -0.39f, 0.63f);
        dij3.LJIIL(-0.23f, 0.28f);
        dij3.LJIIJ(-0.16f, 0.2f, -0.32f, 0.39f, -0.45f, 0.52f);
        dij3.LJIIJ(-0.23f, 0.23f, -0.47f, 0.48f, -0.2f, 0.93f);
        dij3.LJIIJ(0.26f, 0.46f, 1.18f, 1.95f, 2.53f, 3.16f);
        dij3.LJIIIZ(11.8f, 11.8f, false, false, 3.37f, 2.12f);
        dij3.LJIIL(0.3f, 0.13f);
        dij3.LJIIJ(0.46f, 0.23f, 0.73f, 0.2f, 1.0f, -0.11f);
        dij3.LJIIIZ(26.4f, 26.4f, false, false, 1.44f, -1.78f);
        dij3.LJIIJ(0.3f, -0.46f, 0.6f, -0.38f, 1.02f, -0.23f);
        dij3.LJIIJ(0.42f, 0.15f, 2.67f, 1.25f, 3.12f, 1.48f);
        dij3.LJIIL(0.26f, 0.12f);
        dij3.LJIIJ(0.31f, 0.16f, 0.53f, 0.26f, 0.62f, 0.41f);
        dij3.LJIIJ(0.11f, 0.2f, 0.11f, 1.1f, -0.27f, 2.17f);
        dij3.LJIIJ(-0.38f, 1.06f, -2.24f, 2.08f, -3.08f, 2.16f);
        dij3.LJIIL(-0.24f, 0.03f);
        dij3.LJIIJ(-0.78f, 0.09f, -1.75f, 0.2f, -5.24f, -1.17f);
        dij3.LJIIJ(-4.28f, -1.69f, -7.1f, -5.86f, -7.69f, -6.73f);
        dij3.LJIIIZ(4.82f, 4.82f, false, false, -0.1f, -0.14f);
        C32856Cuy.v9(dij3);
        dij3.LJIIJ(-0.25f, -0.33f, -1.86f, -2.48f, -1.86f, -4.7f);
        dij3.LJIIJ(0.0f, -2.1f, 1.03f, -3.2f, 1.5f, -3.7f);
        dij3.LJIIL(0.1f, -0.1f);
        dij3.LJIIJ(0.41f, -0.46f, 0.9f, -0.57f, 1.21f, -0.57f);
        dij3.LJIIJJI(0.06f);
        dij3.LJIIL(0.82f, 0.01f);
        dij3.LIZLLL();
        dij3.LJIIZILJ(Path.FillType.WINDING);
        LIZ2.setStyle(Paint.Style.FILL);
        LIZ2.setColor(-1);
        this.LIZ.add(LIZ2);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
        canvas.drawPath(this.LJII.LIZ, this.LJI);
        canvas.drawPath(this.LJIIIZ.LIZ, this.LJIIIIZZ);
    }
}
