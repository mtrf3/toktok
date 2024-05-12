package X;

import com.ss.android.ugc.aweme.search.cointask.core.viewmodel.SearchCoinTaskManager;

/* renamed from: X.Jys, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50934Jys implements InterfaceC63764P0u {
    public final /* synthetic */ SearchCoinTaskManager LJLIL;

    @Override // X.InterfaceC63764P0u
    public final void onAppForeground() {
    }

    @Override // X.InterfaceC63764P0u
    public final void onAppBackground() {
        this.LJLIL.cancelTimer(EnumC50927Jyl.ON_BACKGROUND);
    }

    public C50934Jys(SearchCoinTaskManager searchCoinTaskManager) {
        this.LJLIL = searchCoinTaskManager;
    }
}
