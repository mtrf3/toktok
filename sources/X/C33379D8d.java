package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D8d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33379D8d extends AbstractC39455Fe7 {
    public C33379D8d() {
        this.LIZJ.LJIIIIZZ(40.91f, 9.1f);
        C32856Cuy.xm(this.LIZJ);
        this.LIZJ.LJI(17.28f);
        C32856Cuy.Zj(this.LIZJ);
        C32856Cuy.Bb(this.LIZJ);
        this.LIZJ.LJII(7.8f, 37.37f);
        C32856Cuy.Jk(this.LIZJ);
        this.LIZJ.LJII(9.2f, 40.2f);
        C32856Cuy.Dk(this.LIZJ);
        this.LIZJ.LJII(36.9f, 13.92f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(16.8f);
        C32856Cuy.N8(this.LIZJ);
        DIK.LIZIZ(this.LIZJ, "p", 9.09f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
