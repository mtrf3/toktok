package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DEu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33552DEu extends AbstractC39455Fe7 {
    public C33552DEu() {
        this.LIZJ.LJIILIIL(25.41f, 9.59f);
        this.LIZJ.LJIIL(9.3f, 9.29f);
        C32856Cuy.De(this.LIZJ);
        this.LIZJ.LJII(24.0f, 13.83f);
        C32856Cuy.E2(this.LIZJ);
        this.LIZJ.LJIIIIZZ(25.41f, 24.59f);
        C32856Cuy.qc(this.LIZJ);
        this.LIZJ.LJII(24.0f, 28.83f);
        C32856Cuy.E2(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
