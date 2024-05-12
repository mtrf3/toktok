package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Xm8, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85816Xm8 extends C85742Xkw {
    public final /* synthetic */ C85811Xm3 LJLIL;

    @Override // X.InterfaceC85737Xkr
    public final void LIZ() {
        C85714XkU c85714XkU = this.LJLIL.LJLJJLL;
        if (c85714XkU != null) {
            c85714XkU.setVisibility(8);
            View view = this.LJLIL.LJLLI;
            if (view != null) {
                view.setEnabled(true);
                return;
            } else {
                o.LJIJI("resendCodeBtn");
                throw null;
            }
        }
        o.LJIJI("timerText");
        throw null;
    }

    @Override // X.InterfaceC85737Xkr
    public final void onStart() {
        C85714XkU c85714XkU = this.LJLIL.LJLJJLL;
        if (c85714XkU != null) {
            c85714XkU.setVisibility(0);
            View view = this.LJLIL.LJLLI;
            if (view != null) {
                view.setEnabled(false);
                return;
            } else {
                o.LJIJI("resendCodeBtn");
                throw null;
            }
        }
        o.LJIJI("timerText");
        throw null;
    }

    public C85816Xm8(C85811Xm3 c85811Xm3) {
        this.LJLIL = c85811Xm3;
    }
}
