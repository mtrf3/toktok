package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* renamed from: X.CWh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31459CWh extends C31458CWg {
    public C31463CWl LJIIIIZZ;
    public C31463CWl LJIIIZ;
    public InterfaceC31469CWr LJIIJ;

    @Override // X.C31458CWg
    /* renamed from: LJIIJ, reason: merged with bridge method [inline-methods] */
    public final C31461CWj LIZLLL() {
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
        C31461CWj c31461CWj = new C31461CWj(context, bitmap, i, str, new C31647CbT(z, true, false, true, false, false, LJIIZILJ, 0, 0, i2, i2, 0, 0, 0, 0, 0, 0, this.LJ, 4192692));
        C31463CWl c31463CWl = this.LJIIIIZZ;
        C31463CWl c31463CWl2 = null;
        if (c31463CWl != null) {
            c31463CWl.LJJLI = this.LJIIJ;
        } else {
            c31463CWl = null;
        }
        c31461CWj.LJJLIIIJL = c31463CWl;
        C31463CWl c31463CWl3 = this.LJIIIZ;
        if (c31463CWl3 != null) {
            c31463CWl3.LJJLI = this.LJIIJ;
            c31463CWl2 = c31463CWl3;
        }
        c31461CWj.LJJLIIIJLJLI = c31463CWl2;
        return c31461CWj;
    }

    @Override // X.C31458CWg
    public final void LJI() {
        LIZIZ().LIZIZ = -1;
        C31463CWl c31463CWl = this.LJIIIIZZ;
        if (c31463CWl != null) {
            c31463CWl.LJJL = 255;
        }
        C31463CWl c31463CWl2 = this.LJIIIZ;
        if (c31463CWl2 == null) {
            return;
        }
        c31463CWl2.LJJL = 0;
    }

    @Override // X.C31458CWg
    public final InterfaceC31469CWr LJ() {
        return this.LJIIJ;
    }

    public C31459CWh(Context context) {
        super(context, null, "", 0, 0, 0);
    }

    @Override // X.C31458CWg
    public final void LJII(InterfaceC31469CWr interfaceC31469CWr) {
        this.LJIIJ = interfaceC31469CWr;
        C31463CWl c31463CWl = this.LJIIIIZZ;
        if (c31463CWl != null) {
            c31463CWl.LJJLI = interfaceC31469CWr;
        }
        C31463CWl c31463CWl2 = this.LJIIIZ;
        if (c31463CWl2 == null) {
            return;
        }
        c31463CWl2.LJJLI = interfaceC31469CWr;
    }

    public final void LJIIIZ(InterfaceC31469CWr interfaceC31469CWr) {
        C31461CWj c31461CWj = (C31461CWj) LIZIZ();
        C31463CWl c31463CWl = c31461CWj.LJJLIIIJL;
        if (c31463CWl != null) {
            Object value = c31463CWl.LJJLIIIJJIZ.getValue();
            o.LJIIIIZZ(value, "<get-hideAnimator>(...)");
            ((ValueAnimator) value).start();
        }
        C31463CWl c31463CWl2 = c31461CWj.LJJLIIIJL;
        if (c31463CWl2 == null) {
            return;
        }
        c31463CWl2.LJJLIIIIJ = new C31460CWi(c31461CWj, interfaceC31469CWr);
    }
}
