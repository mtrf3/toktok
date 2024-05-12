package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DC5 extends AbstractC39455Fe7 {
    public DC5() {
        this.LIZJ.LJIILIIL(24.0f, 29.45f);
        this.LIZJ.LJIIL(14.02f, -14.02f);
        C32856Cuy.rk(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(1.13f, 1.13f);
        C32856Cuy.wk(this.LIZJ);
        this.LIZJ.LJII(24.71f, 33.83f);
        C32856Cuy.mk(this.LIZJ);
        this.LIZJ.LJII(7.43f, 17.98f);
        C32856Cuy.uk(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(1.13f, -1.13f);
        C32856Cuy.pk(this.LIZJ);
        this.LIZJ.LJII(24.0f, 29.45f);
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
