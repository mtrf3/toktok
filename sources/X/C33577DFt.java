package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DFt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33577DFt extends AbstractC39455Fe7 {
    public C33577DFt() {
        C32856Cuy.R5(this.LIZJ);
        this.LIZJ.LJIILIIL(23.75f, 6.15f);
        this.LIZJ.LJIIL(-9.0f, -5.2f);
        C32856Cuy.Rm(this.LIZJ);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, false, 0.0f, -4.33f);
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
