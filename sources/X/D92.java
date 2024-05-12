package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D92 extends AbstractC39455Fe7 {
    public D92() {
        C32856Cuy.cc(this.LIZJ);
        this.LIZJ.LJIILIIL(8.06f, -5.54f);
        C32856Cuy.yk(this.LIZJ);
        this.LIZJ.LJIIL(-1.18f, 1.18f);
        C32856Cuy.Jk(this.LIZJ);
        this.LIZJ.LJII(32.41f, 35.0f);
        C32856Cuy.Fd(this.LIZJ);
        this.LIZJ.LJIIL(1.18f, 1.18f);
        C32856Cuy.Ek(this.LIZJ);
        this.LIZJ.LJII(35.0f, 37.6f);
        this.LIZJ.LJIIL(2.95f, 2.94f);
        C32856Cuy.Ek(this.LIZJ);
        this.LIZJ.LJIIL(1.18f, -1.18f);
        C32856Cuy.Hk(this.LIZJ);
        this.LIZJ.LJII(37.6f, 35.0f);
        this.LIZJ.LJIIL(2.94f, -2.94f);
        C32856Cuy.Gk(this.LIZJ);
        this.LIZJ.LJIIL(-1.18f, -1.18f);
        C32856Cuy.zk(this.LIZJ);
        this.LIZJ.LJII(35.0f, 32.41f);
        this.LIZJ.LJIIL(-2.94f, -2.95f);
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
