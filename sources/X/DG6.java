package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DG6 extends AbstractC39455Fe7 {
    public DG6() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 43.0f);
        this.LIZJ.LJIIIZ(19.0f, 19.0f, true, true, 0.0f, -38.0f);
        this.LIZJ.LJIIIZ(19.0f, 19.0f, false, true, 0.0f, 38.0f);
        this.LIZJ.LIZLLL();
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIIZZ(13.0f, 27.0f);
        C32856Cuy.hk(this.LIZJ);
        this.LIZJ.LJIILIIL(11.0f, 0.0f);
        C32856Cuy.hk(this.LIZJ);
        this.LIZJ.LJIILIIL(14.0f, -3.0f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, true, false, -6.0f, 0.0f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, 6.0f, 0.0f);
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
