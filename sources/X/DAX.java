package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DAX extends AbstractC39455Fe7 {
    public DAX() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(36.0f, 6.0f);
        C32856Cuy.Gl(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, 0.63f, 0.45f, 1.13f, 1.0f, 1.13f);
        C32856Cuy.q2(this.LIZJ);
        this.LIZJ.LJ(41.0f, 6.5f, 40.55f, 6.0f, 40.0f, 6.0f);
        C32856Cuy.V(this.LIZJ);
        this.LIZJ.LJIIIIZZ(10.81f, 8.39f);
        this.LIZJ.LJ(9.14f, 7.32f, 7.0f, 8.59f, 7.0f, 10.64f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(26.72f);
        this.LIZJ.LJIIJ(0.0f, 2.06f, 2.14f, 3.32f, 3.81f, 2.25f);
        this.LIZJ.LJII(31.8f, 26.25f);
        this.LIZJ.LJIIIZ(2.7f, 2.7f, false, false, 0.0f, -4.5f);
        this.LIZJ.LJII(10.81f, 8.39f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
