package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DG9 extends AbstractC39455Fe7 {
    public DG9() {
        this.LIZJ.LJIIIIZZ(21.7f, 13.3f);
        C32856Cuy.lk(this.LIZJ);
        this.LIZJ.LJII(28.17f, 24.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-7.88f, -7.88f);
        C32856Cuy.Xh(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
