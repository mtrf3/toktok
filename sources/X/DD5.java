package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DD5 extends AbstractC39455Fe7 {
    public DD5() {
        this.LIZJ.LJIIIIZZ(39.88f, 24.0f);
        this.LIZJ.LJII(26.7f, 10.83f);
        C32856Cuy.uf(this.LIZJ);
        this.LIZJ.LJII(47.3f, 22.94f);
        C32856Cuy.LLJIJIL(this.LIZJ);
        this.LIZJ.LJII(30.95f, 41.42f);
        C32856Cuy.nk(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-2.83f, -2.83f);
        C32856Cuy.uk(this.LIZJ);
        this.LIZJ.LJII(39.88f, 24.0f);
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
