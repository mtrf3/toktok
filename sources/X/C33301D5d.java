package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D5d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33301D5d extends AbstractC39455Fe7 {
    public C33301D5d() {
        this.LIZJ.LJIIIIZZ(23.0f, 9.0f);
        this.LIZJ.LJ(15.27f, 9.0f, 9.0f, 14.27f, 9.0f, 22.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(11.5f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        C32856Cuy.U3(this.LIZJ);
        C32856Cuy.u9(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -9.94f, 8.06f, -17.0f, 18.0f, -17.0f);
        C32856Cuy.o3(this.LIZJ);
        C32856Cuy.Ob(this.LIZJ);
        C32856Cuy.Om(this.LIZJ);
        this.LIZJ.LIZLLL();
        C32856Cuy.Zc(this.LIZJ);
        this.LIZJ.LJIILIIL(22.0f, -2.0f);
        C32856Cuy.LLLZLL(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
