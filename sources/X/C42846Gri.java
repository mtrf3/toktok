package X;

import com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Gri, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42846Gri implements InterfaceC42845Grh {
    public final /* synthetic */ C42847Grj LIZ;

    public C42846Gri(C42847Grj c42847Grj) {
        this.LIZ = c42847Grj;
    }

    @Override // X.InterfaceC42845Grh
    public final void LJIIJJI() {
        OrganizationListViewModel organizationListViewModel = this.LIZ.LJLJJL;
        if (organizationListViewModel != null) {
            if (organizationListViewModel.LJLJJI == 1) {
                C42843Grf value = organizationListViewModel.LJLIL.getValue();
                if (value != null && value.LIZIZ) {
                    organizationListViewModel.hv0(true);
                    return;
                } else {
                    organizationListViewModel.gv0(true);
                    return;
                }
            }
            return;
        }
        o.LJIJI("organizationListViewModel");
        throw null;
    }
}
