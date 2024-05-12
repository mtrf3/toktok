package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DCX extends AbstractC39455Fe7 {
    public DCX() {
        this.LIZJ.LJIIIIZZ(34.94f, 38.78f);
        this.LIZJ.LIZJ(19.0f, 19.0f, true, false, 23.0f, 43.0f);
        this.LIZJ.LJIIJJI(17.94f);
        this.LIZJ.LJIIJ(0.59f, 0.0f, 1.06f, -0.47f, 1.06f, -1.06f);
        C32856Cuy.LJJJLL(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -0.59f, -0.47f, -1.06f, -1.06f, -1.06f);
        C32856Cuy.W(this.LIZJ);
        this.LIZJ.LJIIIIZZ(23.0f, 18.72f);
        C32856Cuy.Xb(this.LIZJ);
        this.LIZJ.LJIILIIL(3.17f, 13.72f);
        C32856Cuy.Od(this.LIZJ);
        this.LIZJ.LJIILIIL(-11.61f, -5.27f);
        C32856Cuy.Xb(this.LIZJ);
        this.LIZJ.LJIIIIZZ(34.6f, 24.0f);
        C32856Cuy.Od(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
