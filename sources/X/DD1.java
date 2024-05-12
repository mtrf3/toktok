package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DD1 extends AbstractC39455Fe7 {
    public DD1() {
        this.LIZJ.LJIIIIZZ(28.74f, 24.0f);
        this.LIZJ.LJII(15.08f, 10.33f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, 0.0f, -1.41f);
        p.LJIIL(1.84f, -1.84f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.41f, 0.0f);
        this.LIZJ.LJII(34.54f, 23.3f);
        C32856Cuy.wk(this.LIZJ);
        this.LIZJ.LJIIL(-16.2f, 16.21f);
        C32856Cuy.mk(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-1.84f, -1.84f);
        C32856Cuy.vk(this.LIZJ);
        this.LIZJ.LJII(28.74f, 24.0f);
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
