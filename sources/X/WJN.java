package X;

import android.app.Activity;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WJN implements InterfaceC61107NyZ {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ WIM LIZIZ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... results) {
        o.LJIIIZ(results, "results");
        C164906da c164906da = results[0];
        if (c164906da.LIZIZ == EnumC61598OFm.DENIED_PERMANENT && this.LIZ) {
            Activity LLIFFJFJJ = this.LIZIZ.LLIFFJFJJ();
            o.LJII(LLIFFJFJJ, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            HVR.LJIIJJI((ActivityC45651qj) LLIFFJFJJ);
        } else if (c164906da.LIZ()) {
            this.LIZIZ.LLJ();
        }
    }

    public WJN(boolean z, WIM wim) {
        this.LIZ = z;
        this.LIZIZ = wim;
    }
}
