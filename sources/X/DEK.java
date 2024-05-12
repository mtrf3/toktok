package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DEK extends AbstractC39455Fe7 {
    public DEK() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(19.0f, 14.0f);
        C32856Cuy.tf(this.LIZJ);
        this.LIZJ.LJIIIIZZ(12.0f, 41.44f);
        this.LIZJ.LJ(12.0f, 34.92f, 18.06f, 27.0f, 29.0f, 27.0f);
        this.LIZJ.LJIIJ(10.94f, 0.0f, 17.0f, 7.92f, 17.0f, 14.44f);
        this.LIZJ.LJ(46.0f, 45.0f, 44.0f, 45.0f, 37.0f, 45.0f);
        C32856Cuy.x6(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(-7.0f, 0.0f, -9.0f, 0.0f, -9.0f, -3.56f);
        p2.LIZLLL();
        C32856Cuy.kj(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
