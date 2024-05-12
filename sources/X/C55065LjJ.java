package X;

import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;

/* renamed from: X.LjJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55065LjJ implements InterfaceC55110Lk2 {
    public final /* synthetic */ LoadMorePanelComponentTempHelper LIZ;

    public C55065LjJ(LoadMorePanelComponentTempHelper loadMorePanelComponentTempHelper) {
        this.LIZ = loadMorePanelComponentTempHelper;
    }

    @Override // X.InterfaceC55110Lk2
    public final void LIZ() {
        ActivityC45651qj mo49getActivity = this.LIZ.LJLIL.mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
    }
}
