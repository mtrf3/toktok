package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8N extends AbstractC39455Fe7 {
    public D8N() {
        this.LIZJ.LJIIIIZZ(7.1f, 9.1f);
        this.LIZJ.LJIIJ(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(21.62f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        C32856Cuy.Gj(this.LIZJ);
        this.LIZJ.LJIIJJI(-16.8f);
        this.LIZJ.LJII(40.2f, 37.37f);
        C32856Cuy.xk(this.LIZJ);
        this.LIZJ.LJII(38.8f, 40.2f);
        C32856Cuy.nk(this.LIZJ);
        this.LIZJ.LJII(11.09f, 13.92f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(16.8f);
        C32856Cuy.Ob(this.LIZJ);
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
