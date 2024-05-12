package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DHY extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;
    public final Paint LJII;
    public final DIJ LJIIIIZZ;

    public DHY() {
        LinearGradient linearGradient = new LinearGradient(-13.49f, 24.0f, 26.51f, 58.98f, new int[]{-59548, -1231723}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZJ.LIZ(24.0f, 24.0f, 24.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -1);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LIZ(24.0f, 24.0f, 20.0f, Path.Direction.CW);
        LIZIZ2.setStyle(Paint.Style.FILL);
        LIZIZ2.setShader(linearGradient);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ2);
        this.LJII = LIZ;
        DIJ dij2 = new DIJ();
        this.LJIIIIZZ = dij2;
        dij2.LJIIIIZZ(22.68f, 14.0f);
        C32856Cuy.LLD(dij2);
        dij2.LJIILL(7.98f);
        dij2.LJIIJJI(-7.98f);
        C32856Cuy.LLD(dij2);
        dij2.LJIILL(2.64f);
        dij2.LJIIJ(0.0f, 0.2f, 0.15f, 0.35f, 0.35f, 0.35f);
        C32856Cuy.Gb(dij2);
        dij2.LJIILL(7.98f);
        C32856Cuy.gh(dij2);
        dij2.LJIIJJI(2.64f);
        C32856Cuy.e6(dij2);
        dij2.LJIILL(-7.98f);
        C32856Cuy.Gb(dij2);
        C32856Cuy.e6(dij2);
        dij2.LJIILL(-2.64f);
        C32856Cuy.Y4(dij2);
        dij2.LJIIJJI(-7.98f);
        dij2.LJIILL(-7.98f);
        C32856Cuy.Y4(dij2);
        dij2.LJIIJJI(-2.64f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-1);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJI.LIZ, this.LJFF);
        canvas.drawPath(this.LJIIIIZZ.LIZ, this.LJII);
    }
}
