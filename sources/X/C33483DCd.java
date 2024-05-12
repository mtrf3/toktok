package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33483DCd extends AbstractC39455Fe7 {
    public C33483DCd() {
        this.LIZJ.LJIIIIZZ(31.9f, 34.95f);
        this.LIZJ.LJIIIZ(17.0f, 17.0f, true, true, 3.04f, -3.04f);
        this.LIZJ.LJIIL(8.87f, 8.86f);
        C32856Cuy.wk(this.LIZJ);
        this.LIZJ.LJII(42.2f, 43.8f);
        C32856Cuy.mk(this.LIZJ);
        this.LIZJ.LJIIL(-8.87f, -8.86f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(2.6f, -13.45f);
        C32856Cuy.LLIL(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
