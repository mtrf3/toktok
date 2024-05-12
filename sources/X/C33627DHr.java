package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import kotlin.jvm.internal.o;

/* renamed from: X.DHr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33627DHr extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33627DHr() {
        LinearGradient linearGradient = new LinearGradient(31.91f, -6.66f, 17.44f, 0.28f, new int[]{-14625300, -14638100}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.LIZJ.LJIIIIZZ(26.45f, 4.46f);
        this.LIZJ.LJIIIZ(6.3f, 6.3f, false, false, -4.53f, 7.74f);
        this.LIZJ.LJIIL(5.26f, 19.35f);
        this.LIZJ.LJIIIZ(5.63f, 5.63f, false, true, -3.64f, 6.86f);
        this.LIZJ.LJIIIZ(5.6f, 5.6f, false, true, -7.29f, -4.67f);
        this.LIZJ.LJIIIZ(5.49f, 5.49f, false, true, 4.04f, -5.88f);
        this.LIZJ.LJIIIZ(3.1f, 3.1f, false, false, 2.2f, -3.78f);
        this.LIZJ.LJIIL(-0.25f, -0.93f);
        this.LIZJ.LJIIIZ(3.08f, 3.08f, false, false, -3.7f, -2.19f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-0.04f, 0.01f);
        this.LIZJ.LIZJ(12.6f, 12.6f, false, false, 9.61f, 37.0f);
        this.LIZJ.LJIIIZ(12.94f, 12.94f, false, false, 14.94f, 8.5f);
        this.LIZJ.LJIIIZ(12.62f, 12.62f, false, false, 9.66f, -15.6f);
        this.LIZJ.LJIIL(-4.7f, -17.24f);
        this.LIZJ.LJIIL(3.7f, -9.98f);
        this.LIZJ.LJIIL(-6.76f, 1.78f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -14625300);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(33.2f, 2.68f);
        dij.LJIIIZ(6.12f, 6.12f, false, false, -4.32f, 7.67f);
        dij.LJIIL(0.63f, 2.31f);
        dij.LIZJ(8.69f, 8.69f, false, false, 35.76f, 2.0f);
        dij.LJIIL(-2.56f, 0.68f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setShader(linearGradient);
        this.LIZ.add(LIZIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
