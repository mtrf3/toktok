package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* renamed from: X.CWg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31458CWg extends AbstractC31462CWk<C31463CWl> {
    public final Context LIZIZ;
    public final Bitmap LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public InterfaceC31469CWr LJII;

    @Override // X.AbstractC31462CWk
    public final int LIZJ() {
        return 0;
    }

    @Override // X.AbstractC31462CWk
    /* renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    public C31463CWl LIZLLL() {
        boolean z;
        Context context = this.LIZIZ;
        Bitmap bitmap = this.LIZJ;
        int i = this.LJI;
        String str = this.LIZLLL;
        boolean LJIIZILJ = C15380j0.LJIIZILJ();
        if (this.LIZJ != null) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.LJFF;
        C31463CWl c31463CWl = new C31463CWl(context, bitmap, i, str, new C31647CbT(z, true, false, true, false, false, LJIIZILJ, 0, 0, i2, i2, 0, 0, 0, 0, 0, 0, this.LJ, 4192692));
        c31463CWl.LJJLI = LJ();
        return c31463CWl;
    }

    public void LJI() {
        LIZIZ().LJJL = 255;
    }

    public final void LJIIIIZZ() {
        Object value = LIZIZ().LJJLIIIJILLIZJL.getValue();
        o.LJIIIIZZ(value, "<get-animator>(...)");
        ((ValueAnimator) value).start();
    }

    public InterfaceC31469CWr LJ() {
        return this.LJII;
    }

    public void LJII(InterfaceC31469CWr interfaceC31469CWr) {
        this.LJII = interfaceC31469CWr;
    }

    public C31458CWg(Context context, Bitmap bitmap, String text, int i, int i2, int i3) {
        o.LJIIIZ(text, "text");
        this.LIZIZ = context;
        this.LIZJ = bitmap;
        this.LIZLLL = text;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = i3;
    }
}
