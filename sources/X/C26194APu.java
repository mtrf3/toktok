package X;

import com.ss.android.ugc.profile.platform.business.navbar.business.NavBarViewerEntranceComponent;
import com.ss.android.ugc.profile.platform.business.navbar.business.data.ViewerEntranceData;

/* renamed from: X.APu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26194APu implements InterfaceC63764P0u {
    public final /* synthetic */ NavBarViewerEntranceComponent LJLIL;

    @Override // X.InterfaceC63764P0u
    public final void onAppForeground() {
    }

    @Override // X.InterfaceC63764P0u
    public final void onAppBackground() {
        int i;
        ViewerEntranceData second;
        Integer unReadCount;
        C26192APs c26192APs = this.LJLIL.entranceView;
        if (c26192APs != null) {
            c26192APs.LIZLLL();
        }
        NavBarViewerEntranceComponent navBarViewerEntranceComponent = this.LJLIL;
        if (navBarViewerEntranceComponent.pendingShowUserInfo != null) {
            return;
        }
        OSZ<String, ViewerEntranceData> osz = navBarViewerEntranceComponent.lastShowUserInfo;
        if (osz != null && (second = osz.getSecond()) != null && (unReadCount = second.getUnReadCount()) != null) {
            i = unReadCount.intValue();
        } else {
            i = 0;
        }
        if ((this.LJLIL.getViewerHistorySetting() == 2 && (this.LJLIL.getUnAuthorizedClickNum() >= 3 || this.LJLIL.hasShowInOnceAppSession)) || i <= 0) {
            return;
        }
        if (C26197APx.LIZLLL() && (this.LJLIL.getViewerHistorySetting() == 2 || i == 1)) {
            return;
        }
        NavBarViewerEntranceComponent navBarViewerEntranceComponent2 = this.LJLIL;
        navBarViewerEntranceComponent2.pendingShowUserInfo = navBarViewerEntranceComponent2.lastShowUserInfo;
        navBarViewerEntranceComponent2.lastShowUserInfo = null;
    }

    public C26194APu(NavBarViewerEntranceComponent navBarViewerEntranceComponent) {
        this.LJLIL = navBarViewerEntranceComponent;
    }
}
