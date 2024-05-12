package X;

import Y.AfS17S0001000_5;
import Y.IDAListenerS74S0100000_5;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.CustomPollVisibleChannel;
import com.bytedance.android.live.ToolBarShareVisibleChannel;
import com.bytedance.android.live.gift.FastGiftClickChannel;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.live.liveinteract.match.business.event.MvpDialogVisibleChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestVisibleChannel;
import com.bytedance.android.live.room.UserProfileShowingChannel;
import com.bytedance.android.live.wallet.model.ReChargeDialogOnShow;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.chatroom.api.SlideGuideApi;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.SubscribeWebOnShow;
import com.bytedance.android.livesdk.livesetting.feed.LiveLandscapeInnerFeedSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveAnimationDegradeSettings;
import com.bytedance.android.livesdk.rank.api.OnlineAudienceRankListDialogVisibilityChannel;
import com.bytedance.android.livesdk.rank.api.RankListDialogVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import defpackage.g0;
import java.util.HashSet;
import webcast.api.room.SwipingGuidanceResponse;

/* loaded from: classes6.dex */
public final class BFS implements InterfaceC28209B5h, Observer<Boolean> {
    public static volatile BFS LJLLLLLL;
    public boolean LJLIL;
    public AbstractC28221B5t LJLILLLLZI;
    public boolean LJLJI;
    public C73411SrX LJLJJI;
    public ViewGroup LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public DataChannel LJLJLJ;
    public String LJLJLLL;
    public boolean LJLL;
    public InterfaceC28252B6y LJLLI;
    public int LJLLILLLL;
    public LiveRoomFragment LJLLJ;
    public boolean LJLLL;
    public C80797VnN LJLLLL;

    public static BFS LIZIZ() {
        if (LJLLLLLL == null) {
            synchronized (BFS.class) {
                if (LJLLLLLL == null) {
                    LJLLLLLL = new BFS();
                }
            }
        }
        return LJLLLLLL;
    }

    @Override // X.InterfaceC28209B5h
    public final void LIZ() {
        if (!this.LJLIL) {
            return;
        }
        if (this.LJLLILLLL == 0) {
            LJI();
        } else {
            LJFF();
        }
    }

    public final boolean LIZLLL() {
        boolean z = false;
        if (this.LJLJLJ == null) {
            return false;
        }
        boolean bv = ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).bv();
        Boolean bool = Boolean.TRUE;
        if (BKY.LIZIZ().LIZJ() || ((Boolean) this.LJLJLJ.kv0(UserProfileShowingChannel.class)).booleanValue() || bool.equals(this.LJLJLJ.kv0(GiftDialogVisibilityChannel.class)) || bool.equals(this.LJLJLJ.kv0(FastGiftClickChannel.class)) || bool.equals(this.LJLJLJ.kv0(KeyboardStatusChannel.class)) || bv || bool.equals(this.LJLJLJ.kv0(ReChargeDialogOnShow.class)) || bool.equals(this.LJLJLJ.kv0(SubscribeWebOnShow.class)) || bool.equals(this.LJLJLJ.kv0(RankListDialogVisibilityChannel.class)) || bool.equals(this.LJLJLJ.kv0(OnlineAudienceRankListDialogVisibilityChannel.class)) || bool.equals(this.LJLJLJ.kv0(MultiGuestVisibleChannel.class)) || bool.equals(this.LJLJLJ.kv0(CustomPollVisibleChannel.class)) || bool.equals(this.LJLJLJ.kv0(ToolBarShareVisibleChannel.class)) || bool.equals(this.LJLJLJ.kv0(MvpDialogVisibleChannel.class))) {
            z = true;
        }
        return bool.equals(Boolean.valueOf(z));
    }

    public final void LJ() {
        AbstractC28221B5t abstractC28221B5t;
        ViewGroup viewGroup;
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.F0;
        if (!c48459J0d.LIZJ().booleanValue() || BKY.LIZIZ().LIZJ() || !this.LJLJI || (abstractC28221B5t = this.LJLILLLLZI) == null || abstractC28221B5t.size() < 2 || (viewGroup = this.LJLJJL) == null || viewGroup.getContext() == null) {
            return;
        }
        ViewGroup viewGroup2 = this.LJLJJL;
        if (viewGroup2 != null && viewGroup2.getContext() != null) {
            BFU bfu = new BFU(viewGroup2.getContext(), 0);
            bfu.setAnimView(2);
            viewGroup2.addView(bfu, -1, -1);
            if (!LiveAnimationDegradeSettings.INSTANCE.disableGuide()) {
                bfu.LJLIL.addAnimatorListener(new IDAListenerS74S0100000_5(bfu, 18));
                bfu.LJLIL.playAnimation();
            }
            bfu.setAlpha(0.0f);
            bfu.animate().alpha(1.0f).setDuration(300L).start();
        }
        c48459J0d.LIZ(Boolean.FALSE);
    }

    public final void LJFF() {
        AbstractC28221B5t abstractC28221B5t;
        Context LIZLLL;
        final C29889BoD LIZIZ;
        int i;
        if (LiveLandscapeInnerFeedSetting.INSTANCE.isEnable()) {
            ViewGroup viewGroup = this.LJLJJL;
            if (viewGroup != null && g0.LJIILJJIL(viewGroup.getContext()) != null) {
                i = g0.LJIILJJIL(this.LJLJJL.getContext()).getRequestedOrientation();
            } else {
                i = 1;
            }
            if (C29306Beo.LJIIZILJ(i)) {
                LJ();
                return;
            }
        }
        if (this.LJLLJ == null || this.LJLLL || this.LJLJJLL || this.LJLL || !this.LJLJI || (abstractC28221B5t = this.LJLILLLLZI) == null || abstractC28221B5t.size() < 2 || LIZLLL()) {
            return;
        }
        final BKJ currentFragment = this.LJLLJ.getCurrentFragment();
        final BKJ xl = this.LJLLJ.xl();
        if (currentFragment == null || xl == null || currentFragment.dd() != 0 || !(currentFragment instanceof LivePlayFragment) || !(xl instanceof LivePlayFragment) || (LIZLLL = C15380j0.LIZLLL()) == null || (LIZIZ = C29889BoD.LIZIZ(LIZLLL)) == null) {
            return;
        }
        this.LJLLL = true;
        long LJI = LIZIZ.LJI("live.mt.slide_up_guide.last_show", -1L);
        final long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        if (LJI == -1) {
            this.LJLJJLL = B8U.LJIIJJI((LivePlayFragment) currentFragment, (LivePlayFragment) xl, LIZIZ, currentUserId, this.LJLJJL, this.LJLLLL);
            LIZIZ.LJIIIIZZ(0, B8U.LJIIIIZZ(currentUserId));
            return;
        }
        int LJFF = LIZIZ.LJFF(B8U.LJIIIIZZ(currentUserId), -1);
        if (LJFF == 1) {
            if (this.LJLLILLLL < 2) {
                return;
            }
            this.LJLJJLL = B8U.LJIIL((LivePlayFragment) currentFragment, (LivePlayFragment) xl, LIZIZ, currentUserId, this.LJLJJL, this.LJLLLL);
        } else {
            if (LJFF == 0) {
                this.LJLJJLL = B8U.LJIIJJI((LivePlayFragment) currentFragment, (LivePlayFragment) xl, LIZIZ, currentUserId, this.LJLJJL, this.LJLLLL);
                return;
            }
            if (LJFF != -1) {
                return;
            }
            int i2 = this.LJLLILLLL;
            if (i2 != 2 && i2 != 3 && i2 != 4) {
                return;
            }
            ((SlideGuideApi) Q7L.LIZIZ(SlideGuideApi.class)).getUserTypeForSlideGuide().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.BFT
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    AbstractC28221B5t abstractC28221B5t2;
                    LiveRoomFragment liveRoomFragment;
                    BFS bfs = BFS.this;
                    C29889BoD c29889BoD = LIZIZ;
                    BKJ bkj = currentFragment;
                    BKJ bkj2 = xl;
                    long j = currentUserId;
                    bfs.getClass();
                    if (((SwipingGuidanceResponse) obj).data.isTargetOldAudience) {
                        if (c29889BoD == null || bfs.LJLL || (abstractC28221B5t2 = bfs.LJLILLLLZI) == null || abstractC28221B5t2.size() < 2 || (liveRoomFragment = bfs.LJLLJ) == null || liveRoomFragment.getCurrentFragment() != bkj || bfs.LJLLJ.xl() != bkj2 || bfs.LIZLLL()) {
                            bfs.LJLLL = false;
                            return;
                        } else {
                            bfs.LJLJJLL = B8U.LJIIL((LivePlayFragment) bkj, (LivePlayFragment) bkj2, c29889BoD, j, bfs.LJLJJL, bfs.LJLLLL);
                            c29889BoD.LJIIIIZZ(1, B8U.LJIIIIZZ(j));
                            return;
                        }
                    }
                    c29889BoD.LJIIIIZZ(2, B8U.LJIIIIZZ(j));
                }
            }, new AfS17S0001000_5(0, 20));
        }
    }

    public final void LJII() {
        if (!this.LJLIL) {
            return;
        }
        this.LJLLJ = null;
        this.LJLLL = false;
        this.LJLLLL = null;
        this.LJLLILLLL = 0;
        this.LJLIL = false;
        this.LJLJLJ = null;
        this.LJLJJL = null;
        B8U.LJIILIIL();
        B8U.LIZ();
        this.LJLLI = null;
        BKY.LIZIZ().LIZLLL.removeObserver(this);
        this.LJLJI = false;
        this.LJLL = false;
        this.LJLJJLL = false;
        this.LJLJL = false;
        AbstractC28221B5t abstractC28221B5t = this.LJLILLLLZI;
        if (abstractC28221B5t != null) {
            ((HashSet) abstractC28221B5t.LJLIL).remove(this);
            this.LJLILLLLZI = null;
        }
        C73411SrX c73411SrX = this.LJLJJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
            this.LJLJJI = null;
        }
    }

    public final void LJIIIIZZ() {
        Context LIZLLL;
        C29889BoD LIZIZ;
        if (!this.LJLIL || (LIZLLL = C15380j0.LIZLLL()) == null || (LIZIZ = C29889BoD.LIZIZ(LIZLLL)) == null) {
            return;
        }
        LIZIZ.LJIIIIZZ(Boolean.FALSE, LIZJ());
    }

    public final String LIZJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("live.mt.slide_up_guide.need_show.");
        LIZ.append(this.LJLJLLL);
        return X1D.LIZIZ(LIZ);
    }

    public final void LJI() {
        C29889BoD LIZIZ;
        AbstractC28221B5t abstractC28221B5t;
        InterfaceC28252B6y interfaceC28252B6y;
        int i;
        Context LIZLLL = C15380j0.LIZLLL();
        if (LiveLandscapeInnerFeedSetting.INSTANCE.isEnable()) {
            ViewGroup viewGroup = this.LJLJJL;
            if (viewGroup != null && g0.LJIILJJIL(viewGroup.getContext()) != null) {
                i = g0.LJIILJJIL(this.LJLJJL.getContext()).getRequestedOrientation();
            } else {
                i = 1;
            }
            if (C29306Beo.LJIIZILJ(i)) {
                LJ();
                return;
            }
        }
        if (LIZLLL == null || (LIZIZ = C29889BoD.LIZIZ(LIZLLL)) == null || this.LJLL || BKY.LIZIZ().LIZJ() || !this.LJLJI || (abstractC28221B5t = this.LJLILLLLZI) == null || abstractC28221B5t.size() < 2 || (interfaceC28252B6y = this.LJLLI) == null || !interfaceC28252B6y.LIZIZ(this.LJLJJL, LIZIZ)) {
            return;
        }
        this.LJLJJLL = true;
        LJIIIIZZ();
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        Boolean bool2 = bool;
        if (!this.LJLIL || bool2 == null || !bool2.booleanValue()) {
            return;
        }
        if (this.LJLLILLLL == 0) {
            LJI();
        } else {
            LJFF();
        }
    }
}
