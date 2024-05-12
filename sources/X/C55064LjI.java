package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponent;

/* renamed from: X.LjI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55064LjI implements InterfaceC55110Lk2 {
    public final /* synthetic */ LoadMorePanelComponent LIZ;

    public C55064LjI(LoadMorePanelComponent loadMorePanelComponent) {
        this.LIZ = loadMorePanelComponent;
    }

    @Override // X.InterfaceC55110Lk2
    public final void LIZ() {
        ActivityC45651qj mo49getActivity;
        Fragment fragment = this.LIZ.getPanelContext().LJ;
        if (fragment != null && (mo49getActivity = fragment.mo49getActivity()) != null) {
            mo49getActivity.finish();
        }
    }
}
