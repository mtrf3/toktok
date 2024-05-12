package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DFw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33580DFw extends AbstractC39455Fe7 {
    public C33580DFw() {
        C32856Cuy.Rn(this.LIZJ);
        this.LIZJ.LJIIIIZZ(24.0f, 16.5f);
        this.LIZJ.LJIIIZ(7.5f, 7.5f, true, false, 0.0f, 15.0f);
        this.LIZJ.LJIIIZ(7.5f, 7.5f, false, false, 0.0f, -15.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(13.5f, 24.0f);
        C32856Cuy.Ye(this.LIZJ);
        C32856Cuy.X8(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
