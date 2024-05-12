package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Xm9, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85817Xm9 extends C85742Xkw {
    public final /* synthetic */ C85810Xm2 LJLIL;

    @Override // X.InterfaceC85737Xkr
    public final void LIZ() {
        C85714XkU c85714XkU = this.LJLIL.LJLJJLL;
        if (c85714XkU != null) {
            c85714XkU.setVisibility(8);
            View view = this.LJLIL.LJLL;
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
            View view = this.LJLIL.LJLL;
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

    public C85817Xm9(C85810Xm2 c85810Xm2) {
        this.LJLIL = c85810Xm2;
    }
}
