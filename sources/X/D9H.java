package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9H extends AbstractC39455Fe7 {
    public D9H() {
        this.LIZJ.LJIIIIZZ(25.84f, 37.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(8.66f);
        C32856Cuy.LLLI(this.LIZJ);
        this.LIZJ.LJIIJJI(10.34f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(25.6f);
        this.LIZJ.LJIIL(-1.72f, 1.74f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, true, -1.42f, 0.0f);
        p3.LJIIL(-0.7f, -0.7f);
        C32856Cuy.vk(this.LIZJ);
        this.LIZJ.LJIIL(4.4f, -4.4f);
        this.LIZJ.LJIIJ(0.68f, -0.76f, 1.22f, -0.77f, 2.0f, 0.08f);
        this.LIZJ.LJIIL(4.28f, 4.32f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, true, 0.0f, 1.4f);
        this.LIZJ.LJIIL(-0.7f, 0.72f);
        C32856Cuy.mk(this.LIZJ);
        this.LIZJ.LJIIL(-1.72f, -1.75f);
        DIK.LIZIZ(this.LIZJ, "p", 37.0f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
