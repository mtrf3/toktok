package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DDc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33508DDc extends AbstractC39455Fe7 {
    public C33508DDc() {
        this.LIZJ.LJIILIIL(24.0f, 28.75f);
        this.LIZJ.LJIIL(13.67f, -13.67f);
        C32856Cuy.rk(this.LIZJ);
        this.LIZJ.LJIIL(1.84f, 1.84f);
        C32856Cuy.xk(this.LIZJ);
        this.LIZJ.LJII(24.71f, 34.54f);
        C32856Cuy.mk(this.LIZJ);
        this.LIZJ.LJII(7.1f, 18.34f);
        C32856Cuy.uk(this.LIZJ);
        this.LIZJ.LJIIL(1.83f, -1.84f);
        C32856Cuy.rk(this.LIZJ);
        this.LIZJ.LJII(24.0f, 28.75f);
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
