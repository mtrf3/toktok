package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DBH extends AbstractC39455Fe7 {
    public DBH() {
        this.LIZJ.LJIILIIL(8.56f, 26.32f);
        this.LIZJ.LJIIL(5.77f, -6.21f);
        this.LIZJ.LJII(28.1f, 33.88f);
        this.LIZJ.LJIIL(-11.79f, 12.7f);
        C32856Cuy.tl(this.LIZJ);
        this.LIZJ.LJIIIIZZ(19.44f, 14.6f);
        this.LIZJ.LJIIL(-8.32f, -8.3f);
        C32856Cuy.zk(this.LIZJ);
        this.LIZJ.LJII(8.29f, 7.7f);
        C32856Cuy.Ik(this.LIZJ);
        this.LIZJ.LJIIL(31.59f, 31.59f);
        C32856Cuy.LJZI(this.LIZJ);
        this.LIZJ.LJIIL(-9.5f, -9.5f);
        this.LIZJ.LJIIL(6.23f, -6.7f);
        C32856Cuy.Qa(this.LIZJ);
        this.LIZJ.LJII(19.44f, 14.61f);
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
