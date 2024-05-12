package X;

import com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileAwemeListFragment;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import kotlin.jvm.internal.o;

/* renamed from: X.Lpc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55456Lpc extends C51031K1b<C54886LgQ> {
    @Override // X.C51031K1b, X.C8BR, X.InterfaceC223218pR
    public final void LJII() {
        K k;
        T t = this.LJLIL;
        if (t == 0 || (k = this.LJLILLLLZI) == 0) {
            return;
        }
        int i = ((AbstractC51036K1g) t).mListQueryType;
        if (i != 1) {
            if (i != 4) {
                return;
            }
            ((InterfaceC223218pR) k).showLoadMoreLoading();
            return;
        }
        ((InterfaceC223218pR) k).LJII();
    }

    @Override // X.C51031K1b, X.C8BR, X.C8BT
    public final void onSuccess() {
        K k;
        if (this.LJLIL == 0 || (k = this.LJLILLLLZI) == 0) {
            return;
        }
        if (k instanceof AdFakeUserProfileAwemeListFragment) {
            o.LJII(k, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileAwemeListFragment");
            ((AdFakeUserProfileAwemeListFragment) k).LJLLL = ((FeedItemList) this.LJLIL.getData()).maxCursor;
        } else if (k instanceof DetailFragmentPanel) {
            o.LJII(k, "null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel");
            ((BaseListFragmentPanel) k).getParam().setMaxCursor(((FeedItemList) this.LJLIL.getData()).maxCursor);
        }
        T t = this.LJLIL;
        if (((AbstractC51036K1g) t).mListQueryType == 1) {
            if (((AbstractC51036K1g) t).isDataEmpty()) {
                ((InterfaceC223218pR) this.LJLILLLLZI).Ne();
                return;
            } else {
                ((InterfaceC223218pR) this.LJLILLLLZI).j0(((AbstractC51036K1g) this.LJLIL).getItems(), ((AbstractC51036K1g) this.LJLIL).isHasMore());
                return;
            }
        }
        if (((AbstractC51036K1g) t).mListQueryType != 4) {
            return;
        }
        ((InterfaceC223218pR) this.LJLILLLLZI).j0(((AbstractC51036K1g) t).getItems(), ((AbstractC51036K1g) this.LJLIL).isHasMore());
    }

    @Override // X.C51031K1b, X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        K k;
        T t = this.LJLIL;
        if (t == 0 || (k = this.LJLILLLLZI) == 0) {
            return;
        }
        int i = ((AbstractC51036K1g) t).mListQueryType;
        if (i != 1) {
            if (i != 4) {
                return;
            }
            ((InterfaceC223218pR) k).nc(exc);
            return;
        }
        ((InterfaceC223218pR) k).cb0(exc);
    }
}
