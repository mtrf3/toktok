package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DDh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33513DDh extends AbstractC39455Fe7 {
    public C33513DDh() {
        C32856Cuy.hf(this.LIZJ);
        this.LIZJ.LIZJ(53.37f, 53.37f, false, false, 3.53f, 24.0f);
        C32856Cuy.fd(this.LIZJ);
        this.LIZJ.LJIIIZ(53.4f, 53.4f, false, false, 2.9f, 2.78f);
        this.LIZJ.LJIIIZ(8.18f, 8.18f, false, false, 2.77f, 1.66f);
        this.LIZJ.LJIIIZ(8.0f, 8.0f, false, false, 4.94f, 0.0f);
        this.LIZJ.LJIIIZ(8.18f, 8.18f, false, false, 2.77f, -1.66f);
        this.LIZJ.LJIIIZ(53.4f, 53.4f, false, false, 2.9f, -2.78f);
        C32856Cuy.LLIIIZ(this.LIZJ);
        this.LIZJ.LJIIIZ(5.07f, 5.07f, false, false, -0.5f, -1.94f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(32.0f, 20.0f);
        C32856Cuy.ti(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
