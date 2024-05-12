package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DEk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33542DEk extends AbstractC39455Fe7 {
    public C33542DEk() {
        C32856Cuy.al(this.LIZJ);
        this.LIZJ.LJIILIIL(32.7f, 2.12f);
        this.LIZJ.LJIIL(-9.29f, 9.3f);
        C32856Cuy.Li(this.LIZJ);
        this.LIZJ.LJII(22.0f, 29.17f);
        C32856Cuy.H7(this.LIZJ);
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
