package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DEl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33543DEl extends AbstractC39455Fe7 {
    public C33543DEl() {
        C32856Cuy.D3(this.LIZJ);
        this.LIZJ.LJIIJJI(13.85f);
        this.LIZJ.LJIIIZ(4.9f, 4.9f, false, true, 0.05f, -2.96f);
        this.LIZJ.LJIIL(1.25f, -3.83f);
        this.LIZJ.LJIIL(-3.29f, -2.38f);
        this.LIZJ.LJIIIZ(5.12f, 5.12f, false, true, 0.26f, -8.43f);
        this.LIZJ.LIZJ(20.7f, 20.7f, false, false, 19.0f, 27.0f);
        this.LIZJ.LIZLLL();
        C32856Cuy.E4(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
