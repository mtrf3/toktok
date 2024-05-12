package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DDI extends AbstractC39455Fe7 {
    public DDI() {
        this.LIZJ.LJIIIIZZ(29.45f, 24.0f);
        this.LIZJ.LJII(15.43f, 9.98f);
        C32856Cuy.vk(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(1.13f, -1.14f);
        C32856Cuy.pk(this.LIZJ);
        this.LIZJ.LJII(33.83f, 23.3f);
        C32856Cuy.wk(this.LIZJ);
        this.LIZJ.LJII(17.98f, 40.57f);
        C32856Cuy.mk(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-1.13f, -1.14f);
        C32856Cuy.vk(this.LIZJ);
        this.LIZJ.LJII(29.45f, 24.0f);
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
