package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DDD extends AbstractC39455Fe7 {
    public DDD() {
        this.LIZJ.LJIILIIL(24.0f, 27.76f);
        this.LIZJ.LJIIL(13.17f, -13.17f);
        C32856Cuy.pk(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(2.82f, 2.82f);
        C32856Cuy.wk(this.LIZJ);
        this.LIZJ.LJII(25.06f, 35.18f);
        C32856Cuy.LLJILJIL(this.LIZJ);
        this.LIZJ.LJII(6.59f, 18.83f);
        C32856Cuy.uk(this.LIZJ);
        this.LIZJ.LJII(9.4f, 14.6f);
        C32856Cuy.pk(this.LIZJ);
        this.LIZJ.LJII(24.0f, 27.76f);
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
