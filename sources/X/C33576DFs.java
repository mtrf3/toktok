package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DFs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33576DFs extends AbstractC39455Fe7 {
    public C33576DFs() {
        this.LIZJ.LJIIIIZZ(34.7f, 20.7f);
        C32856Cuy.n3(this.LIZJ);
        C32856Cuy.Li(this.LIZJ);
        this.LIZJ.LJII(24.0f, 27.17f);
        C32856Cuy.LJJJJ(this.LIZJ);
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
