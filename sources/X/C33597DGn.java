package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DGn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33597DGn extends AbstractC39455Fe7 {
    public C33597DGn() {
        C32856Cuy.qa(this.LIZJ);
        this.LIZJ.LJIIL(16.14f, 16.14f);
        C32856Cuy.LLLLZ(this.LIZJ);
        C32856Cuy.K2(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
