package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DAZ extends AbstractC39455Fe7 {
    public DAZ() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(8.0f, 6.0f);
        C32856Cuy.Gl(this.LIZJ);
        this.LIZJ.LJ(7.0f, 41.5f, 7.45f, 42.0f, 8.0f, 42.0f);
        C32856Cuy.q2(this.LIZJ);
        this.LIZJ.LJ(13.0f, 6.5f, 12.55f, 6.0f, 12.0f, 6.0f);
        C32856Cuy.W6(this.LIZJ);
        this.LIZJ.LJIIIIZZ(37.19f, 8.39f);
        this.LIZJ.LJIIJ(1.67f, -1.07f, 3.81f, 0.2f, 3.81f, 2.25f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(26.72f);
        this.LIZJ.LJIIJ(0.0f, 2.06f, -2.14f, 3.32f, -3.81f, 2.25f);
        this.LIZJ.LJII(16.2f, 26.25f);
        this.LIZJ.LJIIIZ(2.7f, 2.7f, false, true, 0.0f, -4.5f);
        this.LIZJ.LJII(37.19f, 8.39f);
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
