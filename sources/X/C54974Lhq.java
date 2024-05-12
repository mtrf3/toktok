package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.RefreshPanelComponent;
import java.util.Iterator;

/* renamed from: X.Lhq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54974Lhq implements InterfaceC54978Lhu {
    public final /* synthetic */ RefreshPanelComponent LJLIL;

    public C54974Lhq(RefreshPanelComponent refreshPanelComponent) {
        this.LJLIL = refreshPanelComponent;
    }

    @Override // X.InterfaceC54978Lhu
    public final void LJ() {
        FeedFragment feedFragment;
        RefreshPanelComponent refreshPanelComponent = this.LJLIL;
        ActivityC45651qj LIZ = refreshPanelComponent.getPanelContext().LIZ();
        if (LIZ != null) {
            if (LIZ instanceof InterfaceC55058LjC) {
                if (1 == 1) {
                    Fragment fragment = refreshPanelComponent.getPanelContext().LJ;
                    if ((fragment instanceof FeedFragment) && (feedFragment = (FeedFragment) fragment) != null) {
                        feedFragment.ub(false);
                    }
                    C2U8.LIZ(new LJK(0));
                }
            } else if (LIZ instanceof InterfaceC224908sA) {
            }
        }
        Iterator<InterfaceC54978Lhu> it = this.LJLIL.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJ();
        }
    }
}
