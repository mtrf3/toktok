package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DE1 extends AbstractC39455Fe7 {
    public DE1() {
        this.LIZJ.LJIIIIZZ(42.0f, 23.25f);
        this.LIZJ.LJIIJ(0.0f, 9.53f, -8.06f, 17.25f, -18.0f, 17.25f);
        this.LIZJ.LJIIJ(-2.55f, 0.0f, -4.98f, -0.51f, -7.18f, -1.43f);
        this.LIZJ.LJIIIZ(46.95f, 46.95f, false, true, -6.26f, 2.78f);
        this.LIZJ.LJIIJ(-1.14f, 0.41f, -2.18f, -0.9f, -1.68f, -2.0f);
        this.LIZJ.LJIIIZ(18.45f, 18.45f, false, false, 1.55f, -5.27f);
        this.LIZJ.LJ(7.67f, 31.55f, 6.0f, 27.58f, 6.0f, 23.25f);
        this.LIZJ.LJ(6.0f, 13.72f, 14.06f, 6.0f, 24.0f, 6.0f);
        this.LIZJ.LJIILJJIL(18.0f, 7.72f, 18.0f, 17.25f, true);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-18.0f, 3.0f);
        this.LIZJ.LIZJ(2.63f, 2.63f, true, false, 24.0f, 21.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(2.63f, 2.63f, false, false, 0.0f, 5.26f);
        p.LIZLLL();
        this.LIZJ.LJIILIIL(11.63f, -2.63f);
        this.LIZJ.LJIIIZ(2.63f, 2.63f, true, false, -5.26f, 0.0f);
        this.LIZJ.LJIIIZ(2.63f, 2.63f, false, false, 5.26f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(15.0f, 26.25f);
        this.LIZJ.LIZJ(2.63f, 2.63f, true, false, 15.0f, 21.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(2.63f, 2.63f, false, false, 0.0f, 5.26f);
        p2.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
