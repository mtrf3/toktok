package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DCH extends AbstractC39455Fe7 {
    public DCH() {
        this.LIZJ.LJIILIIL(24.0f, 19.25f);
        this.LIZJ.LJIIL(13.67f, 13.67f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.41f, 0.0f);
        p.LJIIL(1.84f, -1.84f);
        C32856Cuy.Hk(this.LIZJ);
        this.LIZJ.LJII(24.71f, 13.46f);
        C32856Cuy.yk(this.LIZJ);
        this.LIZJ.LJII(7.1f, 29.66f);
        C32856Cuy.Ik(this.LIZJ);
        this.LIZJ.LJIIL(1.83f, 1.84f);
        C32856Cuy.Ek(this.LIZJ);
        this.LIZJ.LJII(24.0f, 19.25f);
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
