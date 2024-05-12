package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DEU extends AbstractC39455Fe7 {
    public DEU() {
        this.LIZJ.LJIIIIZZ(23.0f, 21.12f);
        this.LIZJ.LJII(4.24f, 10.3f);
        this.LIZJ.LIZJ(2.16f, 2.16f, false, false, 1.0f, 12.16f);
        this.LIZJ.LJIILL(23.68f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.0f, 1.66f, 1.8f, 2.7f, 3.24f, 1.87f);
        this.LIZJ.LJII(23.0f, 26.88f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(8.96f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(0.0f, 1.66f, 1.8f, 2.7f, 3.24f, 1.87f);
        this.LIZJ.LJIIL(20.5f, -11.84f);
        this.LIZJ.LJIIIZ(2.16f, 2.16f, false, false, 0.0f, -3.74f);
        this.LIZJ.LJII(26.24f, 10.3f);
        this.LIZJ.LIZJ(2.16f, 2.16f, false, false, 23.0f, 12.16f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(8.96f);
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
