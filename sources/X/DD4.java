package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DD4 extends AbstractC39455Fe7 {
    public DD4() {
        this.LIZJ.LJIIIIZZ(12.0f, 13.5f);
        C32856Cuy.qo(this.LIZJ);
        C32856Cuy.k3(this.LIZJ);
        C32856Cuy.LJJJZ(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILIIL(-3.0f, 0.0f);
        this.LIZJ.LIZJ(4.5f, 4.5f, false, true, 13.5f, 9.0f);
        C32856Cuy.Hc(this.LIZJ);
        this.LIZJ.LIZJ(4.5f, 4.5f, false, true, 9.0f, 34.5f);
        C32856Cuy.LJJJZ(this.LIZJ);
        this.LIZJ.LJIILIIL(11.1f, 2.83f);
        C32856Cuy.Re(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
