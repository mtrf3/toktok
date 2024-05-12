package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DBX extends AbstractC39455Fe7 {
    public DBX() {
        C32856Cuy.j2(this.LIZJ);
        this.LIZJ.LJIILIIL(19.0f, -11.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(12.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        C32856Cuy.ol(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(13.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-4.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(3.0f, 24.0f);
        C32856Cuy.P2(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
