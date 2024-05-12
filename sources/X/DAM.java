package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DAM extends AbstractC39455Fe7 {
    public DAM() {
        this.LIZJ.LJIIIIZZ(42.63f, 15.63f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(2.49f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        C32856Cuy.LLII(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(7.67f);
        this.LIZJ.LJIIIZ(20.18f, 20.18f, true, false, 3.9f, 21.7f);
        this.LIZJ.LJIIIZ(0.96f, 0.96f, false, false, -0.57f, -1.27f);
        this.LIZJ.LJIIL(-1.88f, -0.69f);
        this.LIZJ.LJIIIZ(1.05f, 1.05f, false, false, -1.31f, 0.59f);
        this.LIZJ.LJIIIZ(16.19f, 16.19f, true, true, -2.41f, -16.86f);
        this.LIZJ.LJIIJJI(-8.87f);
        C32856Cuy.Zj(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(13.14f);
        C32856Cuy.zm(this.LIZJ);
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
