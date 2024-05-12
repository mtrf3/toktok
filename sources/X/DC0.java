package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DC0 extends AbstractC39455Fe7 {
    public DC0() {
        this.LIZJ.LJIIIIZZ(16.73f, 24.0f);
        this.LIZJ.LJII(2.7f, 9.98f);
        C32856Cuy.vk(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(1.13f, -1.13f);
        C32856Cuy.rk(this.LIZJ);
        this.LIZJ.LJII(21.11f, 23.3f);
        C32856Cuy.xk(this.LIZJ);
        this.LIZJ.LJII(5.25f, 40.57f);
        C32856Cuy.nk(this.LIZJ);
        this.LIZJ.LJII(2.7f, 39.44f);
        C32856Cuy.uk(this.LIZJ);
        this.LIZJ.LJII(16.73f, 24.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(24.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
