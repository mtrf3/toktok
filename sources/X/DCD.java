package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DCD extends AbstractC39455Fe7 {
    public DCD() {
        this.LIZJ.LJIIIIZZ(39.0f, 14.0f);
        this.LIZJ.LJIIIZ(10.0f, 10.0f, true, false, -10.0f, 0.0f);
        this.LIZJ.LJIIIZ(10.0f, 10.0f, false, false, 20.0f, 0.0f);
        this.LIZJ.LIZLLL();
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILIIL(-16.0f, 0.0f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, true, true, 12.02f, 0.01f);
        this.LIZJ.LIZJ(6.0f, 6.0f, false, true, 23.0f, 14.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(46.0f, 44.0f);
        this.LIZJ.LJIIJ(-0.33f, -10.01f, -6.7f, -17.0f, -17.0f, -17.0f);
        this.LIZJ.LJIIJ(-10.28f, 0.0f, -16.65f, 6.99f, -16.98f, 17.0f);
        this.LIZJ.LJIIJ(-0.02f, 0.55f, 0.43f, 1.0f, 0.98f, 1.0f);
        C32856Cuy.z0(this.LIZJ);
        this.LIZJ.LJIIJ(0.56f, 0.0f, 1.0f, -0.45f, 1.02f, -1.0f);
        this.LIZJ.LJIIJ(0.3f, -7.84f, 4.9f, -13.0f, 12.99f, -13.0f);
        this.LIZJ.LJIILLIIL(41.7f, 36.16f, 42.0f, 44.0f, true);
        this.LIZJ.LJIIJ(0.02f, 0.55f, 0.46f, 1.0f, 1.0f, 1.0f);
        C32856Cuy.z0(this.LIZJ);
        this.LIZJ.LJIIIZ(0.98f, 0.98f, false, false, 1.0f, -1.0f);
        this.LIZJ.LIZLLL();
        C32856Cuy.kj(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
