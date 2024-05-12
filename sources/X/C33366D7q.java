package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D7q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33366D7q extends AbstractC39455Fe7 {
    public C33366D7q() {
        this.LIZJ.LJIIIIZZ(31.12f, 4.8f);
        C32856Cuy.zk(this.LIZJ);
        this.LIZJ.LJIIL(-1.42f, 1.4f);
        C32856Cuy.Ik(this.LIZJ);
        this.LIZJ.LJII(37.67f, 17.0f);
        C32856Cuy.LJJLIIIJILLIZJL(this.LIZJ);
        this.LIZJ.LJIIJJI(37.5f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 1.41f, -3.41f);
        this.LIZJ.LJII(31.12f, 4.79f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(16.88f, 43.2f);
        C32856Cuy.Zh(this.LIZJ);
        this.LIZJ.LJII(10.33f, 31.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(43.0f);
        C32856Cuy.xa(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(5.5f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -1.41f, 3.41f);
        this.LIZJ.LJIIL(12.79f, 12.8f);
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
