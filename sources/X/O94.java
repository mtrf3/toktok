package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O94 implements InterfaceC60814Ntq {
    public Context LJLIL;

    @Override // X.M2J
    public final void release() {
    }

    @Override // X.InterfaceC60814Ntq
    public final View LJIJ() {
        Context context = this.LJLIL;
        if (context != null) {
            return new View(context);
        }
        o.LJIJI("statusViewContext");
        throw null;
    }

    @Override // X.InterfaceC60814Ntq
    public final void LIZ(Context context) {
        this.LJLIL = context;
    }

    @Override // X.InterfaceC60814Ntq
    public final View LJIJJLI(NV7 refresher) {
        o.LJIIIZ(refresher, "refresher");
        Context context = this.LJLIL;
        if (context != null) {
            return new View(context);
        }
        o.LJIJI("statusViewContext");
        throw null;
    }
}
