package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DCI extends AbstractC39455Fe7 {
    public DCI() {
        C32856Cuy.Gc(this.LIZJ);
        this.LIZJ.LJIIIIZZ(14.0f, 24.5f);
        C32856Cuy.Z4(this.LIZJ);
        C32856Cuy.LJIJ(this.LIZJ);
        C32856Cuy.Dc(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-19.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, 0.5f);
        p2.LJIILL(1.0f);
        p2.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
