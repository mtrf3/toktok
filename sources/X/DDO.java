package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DDO extends AbstractC39455Fe7 {
    public DDO() {
        this.LIZJ.LJIILIIL(20.24f, 24.0f);
        this.LIZJ.LJIIL(13.17f, -13.17f);
        C32856Cuy.Gk(this.LIZJ);
        this.LIZJ.LJII(30.6f, 6.6f);
        C32856Cuy.yk(this.LIZJ);
        this.LIZJ.LJII(12.82f, 22.94f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.5f, 1.5f, false, false, 0.0f, 2.12f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(16.35f, 16.35f);
        C32856Cuy.Ud(this.LIZJ);
        this.LIZJ.LJII(20.24f, 24.0f);
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
