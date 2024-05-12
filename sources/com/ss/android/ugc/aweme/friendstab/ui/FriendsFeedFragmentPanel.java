package com.ss.android.ugc.aweme.friendstab.ui;

import X.AbstractC55082Lja;
import X.ActivityC45651qj;
import X.AnonymousClass114;
import X.C10K;
import X.C16880lQ;
import X.C26045AKb;
import X.C2MA;
import X.C46276IEe;
import X.C50420Jqa;
import X.C53976LGi;
import X.C54014LHu;
import X.C54029LIj;
import X.C54488La0;
import X.C54490La2;
import X.C54502LaE;
import X.C54859Lfz;
import X.C57763Mlj;
import X.C61878OQg;
import X.C79004UzY;
import X.C84193Sd;
import X.C8YC;
import X.EnumC54550Lb0;
import X.FN7;
import X.HG3;
import X.IKG;
import X.InterfaceC2302191t;
import X.InterfaceC57760Mlg;
import X.InterfaceC72642tA;
import X.LIN;
import X.LW8;
import X.LX0;
import X.LX1;
import X.LXS;
import X.LXU;
import X.LY0;
import X.M89;
import X.QD3;
import X.RBX;
import Y.ACallableS12S0000100_9;
import Y.ACallableS20S0100100_9;
import Y.ARunnableS45S0100000_9;
import Y.ARunnableS4S0201000_1;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.ext_power_list.AssemReusedContainer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPerfOptPhase2;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.playbutton.PlayButtonComponentTemp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class FriendsFeedFragmentPanel extends FullFeedFragmentPanel {
    public boolean LLIILZL;
    public boolean LLIIZ;
    public C57763Mlj LLIL;
    public boolean LLILII;
    public SocialFriendsFeedFragment LLILIL;
    public LY0 LLILL;

    public final void LJLILLLLZI() {
        this.LLIIZ = false;
        C57763Mlj c57763Mlj = this.LLIL;
        if (c57763Mlj != null) {
            InterfaceC57760Mlg interfaceC57760Mlg = c57763Mlj.LJLIL;
            if (interfaceC57760Mlg != null) {
                interfaceC57760Mlg.k0();
            }
            FriendsEmptyPageRootVM friendsEmptyPageRootVM = c57763Mlj.LJLJJL;
            if (friendsEmptyPageRootVM != null) {
                friendsEmptyPageRootVM.LJLJJI.LIZLLL();
                FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM = friendsEmptyPageRootVM.LJLILLLLZI;
                if (friendsEmptyPageMainSectionVM != null) {
                    friendsEmptyPageMainSectionVM.LJLJL.postValue(new C54490La2(false, null));
                }
                ILoadMoreAbility iLoadMoreAbility = this.loadMoreAbility;
                if (iLoadMoreAbility != null) {
                    iLoadMoreAbility.removeView(this.LLIL);
                    this.loadMoreAbility.qW(false);
                }
                this.LLIL = null;
                return;
            }
            o.LJIJI("emptyPageRootVM");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    @QD3
    public void onVideoPlayerEvent(C46276IEe status) {
        o.LJIIIZ(status, "status");
    }

    public FriendsFeedFragmentPanel() {
        super("homepage_friends", 31);
        this.LLILII = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC223218pR
    public final void Ne() {
        IBottomTabLayoutAbility LJIIIIZZ;
        super.Ne();
        hideStatusView();
        this.LLIIZ = true;
        if (getUserVisibleHint()) {
            Activity activity = this.activity;
            o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C84193Sd.LIZ((ActivityC45651qj) activity).tv0(false);
        }
        AbstractC55082Lja abstractC55082Lja = this.mAdapter;
        if (abstractC55082Lja != null && abstractC55082Lja.getCount() > 0) {
            if (getUserVisibleHint()) {
                stopPlayer();
            }
            this.mAdapter.setData(C61878OQg.INSTANCE);
            this.mAdapter.LJLLL = false;
            PlayButtonComponentTemp playButtonComponentTemp = this.playButtonComponentTemp;
            if (playButtonComponentTemp != null) {
                playButtonComponentTemp.es0();
            }
        }
        if (this.LLIL == null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            C57763Mlj c57763Mlj = new C57763Mlj(context);
            this.LLIL = c57763Mlj;
            Fragment fragment = getFragment();
            o.LJIIIIZZ(fragment, "fragment");
            c57763Mlj.LIZ(fragment, EnumC54550Lb0.EMPTY_STATE);
            this.loadMoreAbility.LJZI(this.LLIL);
            this.loadMoreAbility.qW(true);
            stopPlayer();
            if (!LX1.LJIILIIL) {
                LX1.LJIILIIL = true;
                C10K.LIZJ(new ACallableS12S0000100_9(SystemClock.elapsedRealtime(), 1));
            }
        }
        if (C54029LIj.LIZIZ.LJJI()) {
            Activity activity2 = this.activity;
            o.LJIIIIZZ(activity2, "activity");
            C26045AKb c26045AKb = new C26045AKb(activity2);
            c26045AKb.LJIIIIZZ(R.string.gob);
            c26045AKb.LJIIJ();
        }
        Activity activity3 = this.activity;
        if ((activity3 instanceof ActivityC45651qj) && (LJIIIIZZ = C53976LGi.LJIIIIZZ((ActivityC45651qj) activity3)) != null) {
            LJIIIIZZ.iC();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51687KQh, X.AbstractC51688KQi, X.KRB
    public final void onDestroyView() {
        super.onDestroyView();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void onPageSelected() {
        super.onPageSelected();
        CommentService LJJL = CommentServiceImpl.LJJL();
        o.LJIIIIZZ(LJJL, "get().getService(\n      …ce::class.java,\n        )");
        Context context = getContext();
        Aweme currentAweme = getCurrentAweme();
        M89 param = getParam();
        o.LJIIIIZZ(param, "getParam()");
        LJJL.LJJIJLIJ(context, currentAweme, param, C54488La0.LJLIL);
        if (getCurrentAweme() != null) {
            Aweme currentAweme2 = getCurrentAweme();
            o.LJI(currentAweme2);
            if (currentAweme2.getAwemeType() == 150) {
                LJLIL(getCurrentAweme());
            }
        }
    }

    public static void LJLIL(Aweme aweme) {
        if (aweme == null) {
            return;
        }
        LW8 lw8 = LW8.LIZIZ;
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        long currentTimeMillis = System.currentTimeMillis();
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        lw8.LIZ.LIZIZ(new C54859Lfz(aid, currentTimeMillis, 31, false, curUserId, 0, System.currentTimeMillis()));
        String aid2 = aweme.getAid();
        o.LJIIIIZZ(aid2, "aweme.aid");
        long currentTimeMillis2 = System.currentTimeMillis();
        String curUserId2 = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId2, "userService().curUserId");
        lw8.LIZ.LJII(new C54859Lfz(aid2, currentTimeMillis2, 31, true, curUserId2, 2, System.currentTimeMillis()));
        String aid3 = aweme.getAid();
        o.LJIIIIZZ(aid3, "aweme.aid");
        Set<String> set = C54014LHu.LIZ;
        if (set != null) {
            set.add(aid3);
        }
    }

    public final List<Aweme> LJLIIL(String str) {
        ArrayList arrayList = new ArrayList();
        AbstractC55082Lja abstractC55082Lja = this.mAdapter;
        if (abstractC55082Lja != null && !C79004UzY.LJJIFFI(abstractC55082Lja.LJJIL())) {
            List<Aweme> LJJIL = this.mAdapter.LJJIL();
            int size = LJJIL.size();
            for (int i = 0; i < size; i++) {
                Aweme aweme = (Aweme) ListProtector.get(LJJIL, i);
                if (aweme != null && TextUtils.equals(str, aweme.getAuthorUid())) {
                    arrayList.add(aweme);
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC223218pR
    public final void cb0(Exception exc) {
        super.cb0(exc);
        if (!LX1.LJIILIIL) {
            LX1.LJIILIIL = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void invokeSelectCallback(int i) {
        if (!this.LLIIZ) {
            super.invokeSelectCallback(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC223218pR
    public final void nc(Exception e) {
        o.LJIIIZ(e, "e");
        super.nc(e);
        Activity activity = this.activity;
        if (activity != null) {
            AnonymousClass114.LIZ(activity, R.string.rjt);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCleanModeChangedEvent(IKG ikg) {
        LXS LIZ = LXU.LIZ();
        o.LJI(LIZ);
        boolean z = LIZ.LIZJ;
        int childCount = this.mViewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C2MA curViewHolderByPosition = getCurViewHolderByPosition(i);
            if (curViewHolderByPosition != null) {
                curViewHolderByPosition.b2(z);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.IDR
    public final void onRenderFirstFrame(String sourceId) {
        o.LJIIIZ(sourceId, "sourceId");
        super.onRenderFirstFrame(sourceId);
        if (!this.LLIILZL) {
            this.LLIILZL = true;
            C54502LaE.LIZLLL("homepage_friends", null, 6);
        }
        Aweme currentPlayAweme = getCurrentPlayAweme();
        if (currentPlayAweme != null && !TextUtils.isEmpty(currentPlayAweme.getAid()) && currentPlayAweme.getAwemeType() != 150) {
            LJLIL(currentPlayAweme);
        }
        if (!LX1.LJIILIIL) {
            LX1.LJIILIIL = true;
            C10K.LIZJ(new ACallableS20S0100100_9(SystemClock.elapsedRealtime(), currentPlayAweme, 2));
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void refreshFriendsFeed(LX0 lx0) {
        AssemReusedContainer assemReusedContainer;
        if (lx0 == null) {
            return;
        }
        Object curFeedViewHolder = getCurFeedViewHolder();
        if ((curFeedViewHolder instanceof VideoViewCell) && (assemReusedContainer = (AssemReusedContainer) curFeedViewHolder) != null) {
            VideoViewModel LIZ = C8YC.LIZ(assemReusedContainer);
            String str = lx0.LJLIL;
            LIZ.getClass();
            LIZ.setState(new AqS29S1000000_4(str, 41));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC223218pR
    public final void J5(List<? extends Aweme> list, boolean z) {
        IBottomTabLayoutAbility LJIIIIZZ;
        o.LJIIIZ(list, "list");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (FriendsTabPerfOptPhase2.LIZIZ()) {
            FN7.LIZJ(Boolean.FALSE);
        }
        super.J5(list, z);
        if (!this.LLILII) {
            if (!C79004UzY.LJJIFFI(list)) {
                handlePageChange((Aweme) ListProtector.get(list, 0));
            }
            this.LLILII = false;
        }
        if (getUserVisibleHint()) {
            Activity activity = this.activity;
            o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C84193Sd.LIZ((ActivityC45651qj) activity).tv0(!C79004UzY.LJJIFFI(this.mAdapter.Q8()));
        }
        SocialFriendsFeedFragment socialFriendsFeedFragment = this.LLILIL;
        if (socialFriendsFeedFragment != null && socialFriendsFeedFragment.Ol()) {
            int currentItem = this.mViewPager.getCurrentItem();
            this.mViewPager.post(new ARunnableS4S0201000_1(currentItem, this, this.mAdapter.getItem(currentItem), 2));
        }
        LY0 ly0 = this.LLILL;
        if (ly0 != null) {
            ly0.Y9();
        }
        LJLILLLLZI();
        Activity activity2 = this.activity;
        if ((activity2 instanceof ActivityC45651qj) && (LJIIIIZZ = C53976LGi.LJIIIIZZ((ActivityC45651qj) activity2)) != null) {
            LJIIIIZZ.iC();
        }
        LX1.LJIIIIZZ = SystemClock.elapsedRealtime() - elapsedRealtime;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.InterfaceC51033K1d
    public final void onItemInserted(List<Aweme> list, int i) {
        this.LLIIZ = false;
        if (this.mAdapter.getCount() == 0) {
            this.mAdapter.setData(list);
        } else {
            AbstractC55082Lja mAdapter = this.mAdapter;
            o.LJIIIIZZ(mAdapter, "mAdapter");
            mAdapter.LJJJIL(i, 1, list);
        }
        if (i >= 0 && i < this.mAdapter.getCount()) {
            this.mViewPager.setCurrentItem(i);
        }
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS45S0100000_9(this, 48));
        LIN LIZLLL = C54029LIj.LIZIZ.LIZLLL();
        if (LIZLLL != null) {
            LIZLLL.LIZ((Aweme) ListProtector.get(this.mAdapter.LJJIL(), this.mViewPager.getCurrentItem()));
        }
        LJLILLLLZI();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51687KQh, X.AbstractC51688KQi, X.KRB
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final AbstractC55082Lja createFeedPagerAdapter(final Context context, final LayoutInflater inflater, final InterfaceC72642tA<C50420Jqa> listener, final Fragment fragment, final View.OnTouchListener tapTouchListener, final BaseFeedPageParams baseFeedPageParams, final InterfaceC2302191t iHandlePlay) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(tapTouchListener, "tapTouchListener");
        o.LJIIIZ(baseFeedPageParams, "baseFeedPageParams");
        o.LJIIIZ(iHandlePlay, "iHandlePlay");
        return new FullFeedPagerAdapter(context, inflater, listener, fragment, tapTouchListener, baseFeedPageParams, iHandlePlay) { // from class: X.3DJ
            @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter, X.AbstractC55082Lja
            public final String LJJIJLIJ() {
                return "friends_tab_feed";
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter, X.AbstractC55082Lja
            public final C55136LkS LJJJ() {
                return new C55136LkS(new AqS167S0100000_1(this, 406));
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter, X.AbstractC55082Lja, androidx.viewpager.widget.PagerAdapter
            public final int LJIIL(Object any) {
                Aweme aweme;
                Aweme aweme2;
                String str;
                Aweme aweme3;
                User author;
                Aweme aweme4;
                o.LJIIIZ(any, "any");
                C2MA LJJJI = AbstractC55082Lja.LJJJI((View) any);
                String str2 = null;
                if (LJJJI != null && (aweme = LJJJI.getAweme()) != null && aweme.getUserStory() != null && LJJJI != null && (aweme2 = LJJJI.getAweme()) != null && aweme2.getIsTikTokStory()) {
                    int count = getCount();
                    int i = 0;
                    while (true) {
                        if (i >= count) {
                            break;
                        }
                        Aweme aweme5 = (Aweme) ListProtector.get(Q8(), i);
                        String aid = aweme5.getAid();
                        if (LJJJI != null && (aweme4 = LJJJI.getAweme()) != null) {
                            str = aweme4.getAid();
                        } else {
                            str = null;
                        }
                        if (o.LJ(aid, str)) {
                            UserStory userStory = aweme5.getUserStory();
                            if (userStory != null && userStory.getShouldStartFromUnViewedStoryIdx()) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("getItemPosition: author: ");
                                if (LJJJI != null && (aweme3 = LJJJI.getAweme()) != null && (author = aweme3.getAuthor()) != null) {
                                    str2 = author.getNickname();
                                }
                                C0MT.LJ(LIZ, str2, " - use new idx", LIZ);
                                return -2;
                            }
                        } else {
                            i++;
                        }
                    }
                    return super.LJIIL(any);
                }
                return super.LJIIL(any);
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter, X.AbstractC55082Lja, X.InterfaceC55062LjG
            public final void setData(List<? extends Aweme> list) {
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    arrayList.addAll(list);
                }
                if (!C3DK.LIZ) {
                    Aweme aweme = new Aweme();
                    aweme.setAid(UUID.randomUUID().toString());
                    aweme.setAwemeType(325);
                    aweme.setFriendsTabFakeAweme(true);
                    arrayList.add(aweme);
                }
                super.setData(arrayList);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, inflater, listener, fragment, tapTouchListener, baseFeedPageParams, iHandlePlay);
                o.LJIIIZ(context, "context");
                o.LJIIIZ(inflater, "inflater");
                o.LJIIIZ(listener, "listener");
                o.LJIIIZ(fragment, "fragment");
                o.LJIIIZ(tapTouchListener, "tapTouchListener");
                o.LJIIIZ(baseFeedPageParams, "baseFeedPageParams");
                o.LJIIIZ(iHandlePlay, "iHandlePlay");
            }
        };
    }
}
