package X;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Nvn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60935Nvn extends AbstractC60796NtY {
    public final int LJLILLLLZI;
    public C73305Spp LJLJI;

    @Override // X.AbstractC60796NtY, X.M2J
    public final void release() {
    }

    @Override // X.InterfaceC60814Ntq
    public final View LJIJ() {
        C73305Spp c73305Spp = this.LJLJI;
        if (c73305Spp != null) {
            c73305Spp.LJFF();
            C73305Spp c73305Spp2 = this.LJLJI;
            if (c73305Spp2 != null) {
                c73305Spp2.setVisibility(0);
                C73305Spp c73305Spp3 = this.LJLJI;
                if (c73305Spp3 != null) {
                    c73305Spp3.setBackgroundColor(C04330Ez.LIZIZ(c73305Spp3.getContext(), R.color.transparent));
                    C73305Spp c73305Spp4 = this.LJLJI;
                    if (c73305Spp4 != null) {
                        c73305Spp4.setLayoutParams(new ViewGroup.LayoutParams(-1, this.LJLILLLLZI));
                        C73305Spp c73305Spp5 = this.LJLJI;
                        if (c73305Spp5 != null) {
                            return c73305Spp5;
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
            o.LJIJI("statusView");
            throw null;
        }
        o.LJIJI("statusView");
        throw null;
    }

    public C60935Nvn(int i) {
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC60814Ntq
    public final void LIZ(Context context) {
        C73305Spp c73305Spp = new C73305Spp(context, null, 6);
        c73305Spp.setLayoutVariant(0);
        this.LJLJI = c73305Spp;
    }

    @Override // X.InterfaceC60814Ntq
    public final View LJIJJLI(NV7 refresher) {
        o.LJIIIZ(refresher, "refresher");
        C73305Spp c73305Spp = this.LJLJI;
        if (c73305Spp != null) {
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJI(c73306Spq, new AqS160S0100000_10(refresher, 14));
            c73305Spp.setStatus(c73306Spq);
            C73305Spp c73305Spp2 = this.LJLJI;
            if (c73305Spp2 != null) {
                int LIZIZ = C259910h.LIZIZ(com.zhiliaoapp.musically.R.attr.cl, c73305Spp2.getContext());
                C73305Spp c73305Spp3 = this.LJLJI;
                if (c73305Spp3 != null) {
                    c73305Spp3.setBackgroundColor(LIZIZ);
                    C73305Spp c73305Spp4 = this.LJLJI;
                    if (c73305Spp4 != null) {
                        c73305Spp4.setVisibility(0);
                        C73305Spp c73305Spp5 = this.LJLJI;
                        if (c73305Spp5 != null) {
                            c73305Spp5.setBackgroundColor(LIZIZ);
                            C73305Spp c73305Spp6 = this.LJLJI;
                            if (c73305Spp6 != null) {
                                c73305Spp6.setLayoutParams(new ViewGroup.LayoutParams(-1, this.LJLILLLLZI));
                                C73305Spp c73305Spp7 = this.LJLJI;
                                if (c73305Spp7 != null) {
                                    return c73305Spp7;
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
                    o.LJIJI("statusView");
                    throw null;
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
