package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DFl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33569DFl extends AbstractC39455Fe7 {
    public C33569DFl() {
        C32856Cuy.q4(this.LIZJ);
        this.LIZJ.LJIILIIL(-1.98f, 5.3f);
        this.LIZJ.LJII(10.7f, 22.94f);
        this.LIZJ.LJIIL(11.48f, 1.06f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, true, 24.0f, 25.8f);
        this.LIZJ.LJIIL(1.06f, 11.49f);
        this.LIZJ.LJIIL(11.93f, -26.28f);
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
