package X;

import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.LnP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55319LnP extends JC5 {
    public final /* synthetic */ InterfaceC2042880a LJLIL;

    @Override // X.JC4
    public final void LIZ() {
        C55329LnZ c55329LnZ = (C55329LnZ) this.LJLIL;
        Aweme currentAweme = c55329LnZ.LIZ.getCurrentAweme();
        if (C80X.LIZJ(currentAweme, c55329LnZ.LIZ.getEventType())) {
            DetailFragmentPanel detailFragmentPanel = c55329LnZ.LIZ;
            detailFragmentPanel.mDialogController.LJIJ(detailFragmentPanel.activity, currentAweme);
        }
    }

    public C55319LnP(C55329LnZ c55329LnZ) {
        this.LJLIL = c55329LnZ;
    }
}
