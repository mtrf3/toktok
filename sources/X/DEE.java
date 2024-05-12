package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DEE extends AbstractC39455Fe7 {
    public DEE() {
        this.LIZJ.LJIIIIZZ(13.5f, 9.0f);
        this.LIZJ.LIZJ(4.5f, 4.5f, false, false, 9.0f, 13.5f);
        C32856Cuy.kk(this.LIZJ);
        this.LIZJ.LIZJ(4.5f, 4.5f, false, false, 34.5f, 9.0f);
        C40084FoG.LJ(this.LIZJ, "p", -21.0f);
        this.LIZJ.LJIILIIL(6.6f, 7.33f);
        C32856Cuy.Re(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
