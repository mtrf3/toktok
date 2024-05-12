package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Nze, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61174Nze implements InterfaceC60814Ntq {
    public C73305Spp LJLIL;

    @Override // X.M2J
    public final void release() {
    }

    @Override // X.InterfaceC60814Ntq
    public final View LJIJ() {
        C73305Spp c73305Spp = this.LJLIL;
        if (c73305Spp != null) {
            c73305Spp.LJFF();
            C73305Spp c73305Spp2 = this.LJLIL;
            if (c73305Spp2 != null) {
                c73305Spp2.setVisibility(0);
                C73305Spp c73305Spp3 = this.LJLIL;
                if (c73305Spp3 != null) {
                    return c73305Spp3;
                }
                o.LJIJI("statusView");
                throw null;
            }
            o.LJIJI("statusView");
            throw null;
        }
        o.LJIJI("statusView");
        throw null;
    }

    @Override // X.InterfaceC60814Ntq
    public final void LIZ(Context context) {
        C73305Spp c73305Spp = new C73305Spp(context, null, 6);
        c73305Spp.setLayoutVariant(0);
        this.LJLIL = c73305Spp;
    }

    @Override // X.InterfaceC60814Ntq
    public final View LJIJJLI(NV7 refresher) {
        o.LJIIIZ(refresher, "refresher");
        C73305Spp c73305Spp = this.LJLIL;
        if (c73305Spp != null) {
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJIIJ(c73306Spq, new AqS160S0100000_10(refresher, 438));
            c73305Spp.setStatus(c73306Spq);
            C73305Spp c73305Spp2 = this.LJLIL;
            if (c73305Spp2 != null) {
                c73305Spp2.setVisibility(0);
                C73305Spp c73305Spp3 = this.LJLIL;
                if (c73305Spp3 != null) {
                    return c73305Spp3;
                }
                o.LJIJI("statusView");
                throw null;
            }
            o.LJIJI("statusView");
            throw null;
        }
        o.LJIJI("statusView");
        throw null;
    }
}
