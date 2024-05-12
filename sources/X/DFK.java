package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFK extends AbstractC39455Fe7 {
    public DFK() {
        C32856Cuy.Qd(this.LIZJ);
        this.LIZJ.LJIIIIZZ(25.76f, 3.04f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -3.52f, 0.0f);
        this.LIZJ.LJIIL(-4.53f, 8.3f);
        this.LIZJ.LJIIL(-9.3f, 1.75f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -1.08f, 3.34f);
        this.LIZJ.LJIIL(6.5f, 6.87f);
        this.LIZJ.LJIIL(-1.22f, 9.39f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 2.84f, 2.06f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJII(24.0f, 30.7f);
        this.LIZJ.LJIIL(8.55f, 4.06f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 2.84f, -2.06f);
        this.LIZJ.LJIIL(-1.22f, -9.39f);
        this.LIZJ.LJIIL(6.5f, -6.87f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -1.09f, -3.34f);
        this.LIZJ.LJIIL(-9.3f, -1.74f);
        this.LIZJ.LJIIL(-4.52f, -8.3f);
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
