package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFJ extends AbstractC39455Fe7 {
    public DFJ() {
        this.LIZJ.LJIILIIL(36.17f, 24.0f);
        this.LIZJ.LJIIL(-7.88f, -7.88f);
        C32856Cuy.We(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(9.3f, 9.3f);
        C32856Cuy.l2(this.LIZJ);
        this.LIZJ.LJII(36.17f, 24.0f);
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
