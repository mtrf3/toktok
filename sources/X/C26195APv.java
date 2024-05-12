package X;

import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine.MineNavBarViewerEntranceAssem;

/* renamed from: X.APv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26195APv implements InterfaceC63764P0u {
    public final /* synthetic */ MineNavBarViewerEntranceAssem LJLIL;

    @Override // X.InterfaceC63764P0u
    public final void onAppForeground() {
    }

    @Override // X.InterfaceC63764P0u
    public final void onAppBackground() {
        C26192APs c26192APs = this.LJLIL.entranceView;
        if (c26192APs != null) {
            c26192APs.LIZLLL();
        }
        MineNavBarViewerEntranceAssem mineNavBarViewerEntranceAssem = this.LJLIL;
        if (mineNavBarViewerEntranceAssem.pendingShowUserInfo != null) {
            return;
        }
        int unReadViewerCount = mineNavBarViewerEntranceAssem.getUnReadViewerCount();
        if ((this.LJLIL.getViewerHistorySetting() == 2 && (this.LJLIL.getUnAuthorizedClickNum() >= 3 || this.LJLIL.hasShowInOnceAppSession)) || unReadViewerCount <= 0) {
            return;
        }
        if (C26197APx.LIZLLL() && (this.LJLIL.getViewerHistorySetting() == 2 || unReadViewerCount == 1)) {
            return;
        }
        MineNavBarViewerEntranceAssem mineNavBarViewerEntranceAssem2 = this.LJLIL;
        mineNavBarViewerEntranceAssem2.pendingShowUserInfo = mineNavBarViewerEntranceAssem2.lastShowUserInfo;
        mineNavBarViewerEntranceAssem2.lastShowUserInfo = null;
    }

    public C26195APv(MineNavBarViewerEntranceAssem mineNavBarViewerEntranceAssem) {
        this.LJLIL = mineNavBarViewerEntranceAssem;
    }
}
