package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D9a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33402D9a extends AbstractC39455Fe7 {
    public C33402D9a() {
        this.LIZJ.LJIILIIL(26.5f, 35.96f);
        this.LIZJ.LJIIL(11.03f, -11.02f);
        C32856Cuy.Cf(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-15.3f, 15.3f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(2.5f, 2.5f, false, true, -3.53f, 0.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(-15.3f, -15.3f);
        C32856Cuy.G8(this.LIZJ);
        C32856Cuy.u(this.LIZJ);
        C32856Cuy.rk(this.LIZJ);
        this.LIZJ.LJII(21.5f, 35.96f);
        C32856Cuy.Dh(this.LIZJ);
        this.LIZJ.LJIILL(30.96f);
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
