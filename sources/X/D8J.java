package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8J extends AbstractC39455Fe7 {
    public D8J() {
        this.LIZJ.LJIIIIZZ(6.6f, 9.1f);
        C32856Cuy.fg(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(21.62f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        C32856Cuy.Ei(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-15.6f);
        this.LIZJ.LJIIL(25.44f, 25.42f);
        C32856Cuy.w6(this.LIZJ);
        this.LIZJ.LJII(11.6f, 15.13f);
        this.LIZJ.LJIILL(15.59f);
        C32856Cuy.oh(this.LIZJ);
        DIK.LIZIZ(this.LIZJ, "p", 9.09f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
