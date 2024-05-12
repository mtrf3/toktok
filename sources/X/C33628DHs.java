package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import kotlin.jvm.internal.o;

/* renamed from: X.DHs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33628DHs extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33628DHs() {
        LinearGradient linearGradient = new LinearGradient(27.38f, 42.62f, 27.38f, 2.85f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.LIZJ.LJIIIIZZ(24.11f, 4.96f);
        this.LIZJ.LIZJ(19.04f, 19.04f, false, false, 22.0f, 42.93f);
        this.LIZJ.LJIIL(-0.31f, 2.95f);
        this.LIZJ.LIZJ(22.0f, 22.0f, false, true, 24.13f, 2.0f);
        this.LIZJ.LJIIIZ(1.48f, 1.48f, false, true, -0.02f, 2.96f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -1);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(22.0f, 42.93f);
        dij.LJIIIZ(19.04f, 19.04f, false, false, 5.87f, -37.57f);
        dij.LJIIIZ(1.48f, 1.48f, true, true, 0.6f, -2.9f);
        dij.LJIIIZ(22.0f, 22.0f, false, true, -6.78f, 43.42f);
        dij.LJIIL(0.3f, -2.95f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
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
