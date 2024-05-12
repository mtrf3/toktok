package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OAn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61469OAn implements InterfaceC60814Ntq {
    public final C223338pd LJLIL;
    public C73305Spp LJLILLLLZI;

    @Override // X.M2J
    public final void release() {
    }

    @Override // X.InterfaceC60814Ntq
    public final View LJIJ() {
        C73305Spp c73305Spp = this.LJLILLLLZI;
        if (c73305Spp != null) {
            c73305Spp.LJFF();
            C73305Spp c73305Spp2 = this.LJLILLLLZI;
            if (c73305Spp2 != null) {
                c73305Spp2.setVisibility(0);
                C73305Spp c73305Spp3 = this.LJLILLLLZI;
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

    public C61469OAn(C223338pd c223338pd) {
        this.LJLIL = c223338pd;
    }

    @Override // X.InterfaceC60814Ntq
    public final void LIZ(Context context) {
        C73305Spp c73305Spp = new C73305Spp(context, null, 6);
        c73305Spp.setLayoutVariant(1);
        c73305Spp.setTopMargin(C32151Nz.LJIIZILJ(40));
        c73305Spp.LIZIZ(new C61470OAo(this));
        this.LJLILLLLZI = c73305Spp;
    }

    @Override // X.InterfaceC60814Ntq
    public final View LJIJJLI(NV7 refresher) {
        o.LJIIIZ(refresher, "refresher");
        C73305Spp c73305Spp = this.LJLILLLLZI;
        if (c73305Spp != null) {
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJIIJ(c73306Spq, new AqS160S0100000_10(refresher, 574));
            c73305Spp.setStatus(c73306Spq);
            C73305Spp c73305Spp2 = this.LJLILLLLZI;
            if (c73305Spp2 != null) {
                c73305Spp2.setVisibility(0);
                C73305Spp c73305Spp3 = this.LJLILLLLZI;
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
