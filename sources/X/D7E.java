package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D7E extends AbstractC39455Fe7 {
    public D7E() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(35.0f, 8.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(13.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        this.LIZJ.LJIILL(28.6f);
        this.LIZJ.LJIIL(8.85f, -7.2f);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, false, true, 6.3f, 0.0f);
        this.LIZJ.LJII(36.0f, 37.6f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(9.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p3.LIZLLL();
        C32856Cuy.LLLJL(this.LIZJ);
        C32856Cuy.ki(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(32.8f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -3.26f, 1.55f);
        this.LIZJ.LJIIL(-12.1f, -9.84f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.27f, 0.0f);
        this.LIZJ.LJIIL(-12.1f, 9.84f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, true, 8.0f, 41.8f);
        C32856Cuy.g(this.LIZJ);
        C32856Cuy.dd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
