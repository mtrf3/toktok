package X;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.o;

/* renamed from: X.CWi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31460CWi implements InterfaceC31469CWr {
    public final /* synthetic */ C31461CWj LIZ;
    public final /* synthetic */ InterfaceC31469CWr LIZIZ;

    @Override // X.InterfaceC31469CWr
    public final void invalidate() {
        int i;
        C31461CWj c31461CWj = this.LIZ;
        C31463CWl c31463CWl = c31461CWj.LJJLIIIJLJLI;
        if (c31463CWl != null) {
            i = c31463CWl.LIZIZ;
        } else {
            i = -1;
        }
        c31461CWj.LIZIZ = i;
        if (c31463CWl != null) {
            c31463CWl.LJJL = 0;
            Object value = c31463CWl.LJJLIIIJJI.getValue();
            o.LJIIIIZZ(value, "<get-showAnimator>(...)");
            ((ValueAnimator) value).start();
        }
        InterfaceC31469CWr interfaceC31469CWr = this.LIZIZ;
        if (interfaceC31469CWr != null) {
            interfaceC31469CWr.invalidate();
        }
    }

    public C31460CWi(C31461CWj c31461CWj, InterfaceC31469CWr interfaceC31469CWr) {
        this.LIZ = c31461CWj;
        this.LIZIZ = interfaceC31469CWr;
    }
}
