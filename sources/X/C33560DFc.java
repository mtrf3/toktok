package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DFc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33560DFc extends AbstractC39455Fe7 {
    public C33560DFc() {
        C32856Cuy.q7(this.LIZJ);
        this.LIZJ.LJIIIZ(20.0f, 20.0f, true, false, 0.0f, 40.0f);
        this.LIZJ.LJIIIZ(20.0f, 20.0f, false, false, 0.0f, -40.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-9.9f, 7.44f);
        this.LIZJ.LIZJ(16.0f, 16.0f, false, true, 36.56f, 33.9f);
        this.LIZJ.LJII(14.08f, 11.44f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-2.81f, 2.85f);
        this.LIZJ.LJII(33.7f, 36.7f);
        this.LIZJ.LJIIIZ(16.0f, 16.0f, false, true, -22.43f, -22.43f);
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
