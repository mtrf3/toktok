package X;

import Y.ARunnableS41S0100000_5;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.ui.landscapefeeds.LiveLandNoMoreFragment;
import com.bytedance.android.livesdk.livesetting.feed.LiveLandscapeInnerFeedSetting;

/* loaded from: classes6.dex */
public final class BKK extends BKL {
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ LiveRoomFragment LJLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.LJLL.LLF.post(new ARunnableS41S0100000_5(this, 169));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup viewGroup) {
        BKJ livePlayFragment;
        Fragment fragment;
        if (this.LJLJI == null) {
            FragmentManager fragmentManager = this.LJLILLLLZI;
            this.LJLJI = C1B6.LIZ(fragmentManager, fragmentManager);
        }
        String LJJIIJ = BKL.LJJIIJ(this.LJLJJL.LIZLLL(i));
        Fragment LJJJIL = this.LJLILLLLZI.LJJJIL(C012403c.LIZLLL("android:switcher:", viewGroup.getId(), ":", LJJIIJ));
        if (LJJJIL != null) {
            this.LJLJI.LJFF(LJJJIL);
            fragment = LJJJIL;
        } else {
            if (!LiveLandscapeInnerFeedSetting.INSTANCE.isEnable()) {
                livePlayFragment = new LivePlayFragment();
            } else {
                InterfaceC28220B5s interfaceC28220B5s = this.LJLJJL;
                if (interfaceC28220B5s == null || i >= interfaceC28220B5s.size()) {
                    livePlayFragment = new LivePlayFragment();
                } else if (this.LJLJJL.LJIIIIZZ(i) != null && this.LJLJJL.LJIIIIZZ(i).getId() == Long.MIN_VALUE) {
                    livePlayFragment = new LiveLandNoMoreFragment();
                } else {
                    livePlayFragment = new LivePlayFragment();
                }
            }
            livePlayFragment.Kd(this.LJLJJL.LJIIIIZZ(i), this.LJLJJL.LIZLLL(i));
            Fragment fragment2 = livePlayFragment.getFragment();
            this.LJLJI.LJIIIIZZ(viewGroup.getId(), 1, fragment2, C012403c.LIZLLL("android:switcher:", viewGroup.getId(), ":", LJJIIJ));
            fragment = fragment2;
        }
        if (fragment != this.LJLJJI) {
            fragment.setMenuVisibility(false);
            fragment.setUserVisibleHint(false);
        }
        BKJ bkj = (BKJ) fragment;
        bkj.ga(i);
        this.LJLJL.put(BKL.LJJIIJ(this.LJLJJL.LIZLLL(i)), bkj);
        bkj.W2(this.LJLJLJ);
        bkj.Mj(this.LJLL);
        if (bkj.getFragment() != null) {
            bkj.Jj().mRoomsData.enterLiveSource = this.LJLJLLL;
            bkj.Jj().mRoomsData.enterFromMerge = this.LJLL.LJLLILLLL;
            bkj.Jj().mRoomsData.enterMethod = this.LJLL.LJLLI;
            bkj.Jj().mSearchData.isFromSearch = this.LJLL.Hl();
            if (this.LJLL.LLFFF instanceof BLL) {
                bkj.Jj().mRoomsData.sceneId = "1005";
            }
        }
        return bkj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BKK(LiveRoomFragment liveRoomFragment, FragmentManager fragmentManager, AbstractC28221B5t abstractC28221B5t, String str) {
        super(fragmentManager, abstractC28221B5t);
        this.LJLL = liveRoomFragment;
        this.LJLJLLL = str;
    }
}
