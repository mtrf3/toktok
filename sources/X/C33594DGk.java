package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DGk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33594DGk extends AbstractC39455Fe7 {
    public C33594DGk() {
        C32856Cuy.sl(this.LIZJ);
        C32856Cuy.b8(this.LIZJ);
        C32856Cuy.dn(this.LIZJ);
        C32856Cuy.b7(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
