package X;

import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;

/* renamed from: X.Lk3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55111Lk3 implements InterfaceC55112Lk4 {
    public final /* synthetic */ DetailFragmentPanel LJLIL;

    @Override // X.InterfaceC55112Lk4
    public final void LJJIJIL() {
        ILoadMoreAbility iLoadMoreAbility;
        DetailFragmentPanel detailFragmentPanel = this.LJLIL;
        if (!detailFragmentPanel.mAdapter.LJLLL && (iLoadMoreAbility = detailFragmentPanel.loadMoreAbility) != null) {
            iLoadMoreAbility.showLoadMoreEmpty();
            return;
        }
        InterfaceC55112Lk4 interfaceC55112Lk4 = detailFragmentPanel.LLIIL;
        if (interfaceC55112Lk4 != null) {
            detailFragmentPanel.LJLJI = true;
            interfaceC55112Lk4.LJJIJIL();
        }
    }

    public C55111Lk3(DetailFragmentPanel detailFragmentPanel) {
        this.LJLIL = detailFragmentPanel;
    }
}
