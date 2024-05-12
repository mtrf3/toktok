package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DC3 extends AbstractC39455Fe7 {
    public DC3() {
        this.LIZJ.LJIIIIZZ(36.94f, 17.94f);
        C32856Cuy.zk(this.LIZJ);
        this.LIZJ.LJIIL(-9.03f, 9.02f);
        C32856Cuy.m2(this.LIZJ);
        this.LIZJ.LJIILL(21.96f);
        this.LIZJ.LJIIL(-9.03f, -9.02f);
        C32856Cuy.r9(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(13.3f, 13.3f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(2.5f, 2.5f, false, false, 3.53f, 0.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(13.3f, -13.3f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.4f);
        p4.LJIIL(-2.13f, -2.13f);
        this.LIZJ.LIZLLL();
        C32856Cuy.gb(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
