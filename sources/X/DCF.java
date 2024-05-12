package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DCF extends AbstractC39455Fe7 {
    public DCF() {
        this.LIZJ.LJIIIIZZ(38.7f, 19.3f);
        C32856Cuy.Gk(this.LIZJ);
        this.LIZJ.LJII(25.42f, 4.58f);
        C32856Cuy.wc(this.LIZJ);
        this.LIZJ.LJII(22.0f, 10.83f);
        C32856Cuy.Nb(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(10.83f);
        C32856Cuy.dm(this.LIZJ);
        this.LIZJ.LIZLLL();
        C32856Cuy.LJJJ(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
