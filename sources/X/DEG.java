package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DEG extends AbstractC39455Fe7 {
    public DEG() {
        this.LIZJ.LJIIIIZZ(40.37f, 24.0f);
        this.LIZJ.LJII(26.71f, 10.33f);
        C32856Cuy.rm(this.LIZJ);
        this.LIZJ.LJII(29.96f, 40.92f);
        C32856Cuy.nk(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-1.84f, -1.84f);
        C32856Cuy.uk(this.LIZJ);
        this.LIZJ.LJII(40.37f, 24.0f);
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
