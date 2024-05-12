package com.ss.android.ugc.aweme.inbox;

import X.ActivityC45651qj;
import X.C10A;
import X.C10K;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C221018lt;
import X.C221108m2;
import X.C223318pb;
import X.C26045AKb;
import X.C28871Bj;
import X.C29606Bje;
import X.C29S;
import X.C2NU;
import X.C2U8;
import X.C3C5;
import X.C40443Fu3;
import X.C46604IQu;
import X.C51031K1b;
import X.C52456KiK;
import X.C52487Kip;
import X.C52924Kps;
import X.C53104Ksm;
import X.C53551Kzz;
import X.C54251LQx;
import X.C54362LVe;
import X.C56630MKk;
import X.C56649MLd;
import X.C56678MMg;
import X.C56706MNi;
import X.C56708MNk;
import X.C56709MNl;
import X.C56715MNr;
import X.C56762MPm;
import X.C56775MPz;
import X.C56798MQw;
import X.C5H3;
import X.C62822Ol8;
import X.C68925R3h;
import X.C73305Spp;
import X.C73306Spq;
import X.C73379Sr1;
import X.C76800UCe;
import X.C77266UUc;
import X.C78897Uxp;
import X.C79045V0n;
import X.C80896Voy;
import X.C8BS;
import X.C90903hW;
import X.CallableC46595IQl;
import X.E1X;
import X.EnumC56764MPo;
import X.EnumC56772MPw;
import X.FMX;
import X.HH1;
import X.InterfaceC191547fS;
import X.InterfaceC223218pR;
import X.InterfaceC74170T9a;
import X.L03;
import X.LVG;
import X.MGN;
import X.MNH;
import X.MQ1;
import X.MQ8;
import X.MQ9;
import X.MQJ;
import X.MQV;
import X.ORZ;
import X.OSZ;
import X.V1B;
import X.X1D;
import Y.AObserverS77S0100000_9;
import Y.ARunnableS45S0100000_9;
import Y.AgS126S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.inbox.vm.InboxFollowerVM;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxFollowerAdapter;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse;
import com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager;
import com.ss.android.ugc.aweme.notification.utils.FollowSortDataCache;
import com.ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM;
import com.ss.android.ugc.aweme.relation.recuser.inbox.AbsUserCardInboxWidget;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InboxFollowerFragment extends AmeBaseFragment implements InterfaceC223218pR<FollowPageData>, InterfaceC74170T9a, InterfaceC191547fS {
    public EnumC56772MPw LJLJJL;
    public boolean LJLJJLL;
    public List<FollowPageData> LJLJL;
    public boolean LJLJLJ;
    public Exception LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public FixedLinearlayoutManager LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C5H3 LJLLLL;
    public final C5H3 LJLLLLLL;
    public final Handler LJLZ;
    public boolean LJZ;
    public int LJZI;
    public final Map<Integer, View> LJZL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(MQV.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C56798MQw.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 262));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 263));

    @Override // X.InterfaceC223218pR
    public final void Iw() {
    }

    @Override // X.InterfaceC223218pR
    public final void LJII() {
    }

    @Override // X.InterfaceC223218pR
    public final void Qw(Exception exc) {
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJZL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC223218pR
    public final void jh(List<FollowPageData> list, boolean z) {
    }

    public InboxFollowerFragment() {
        EnumC56772MPw enumC56772MPw;
        if (((Boolean) C52456KiK.LIZ.getValue()).booleanValue()) {
            enumC56772MPw = EnumC56772MPw.LOADING;
        } else {
            enumC56772MPw = EnumC56772MPw.UNKNOWN;
        }
        this.LJLJJL = enumC56772MPw;
        this.LJLLI = true;
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 265));
        this.LJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 261));
        this.LJLLLL = V1B.LJZI(new AqS154S0100000_4(this, 372));
        this.LJLLLLLL = V1B.LJZI(new AqS159S0100000_9(this, 260));
        this.LJLZ = new Handler(C16880lQ.LLJJJJ());
        this.LJZ = true;
        this.LJZI = LiveLayoutPreloadThreadPriority.DEFAULT;
        C10K.LIZJ(CallableC46595IQl.LJLIL);
        if (C56762MPm.LIZIZ()) {
            EnumC56764MPo.LJLJJLL.LIZJ();
        }
        FollowerPreCacheManager.LIZJ = C53104Ksm.LIZ();
    }

    public final C51031K1b<C56708MNk> Al() {
        return (C51031K1b) this.LJLIL.getValue();
    }

    public final AbsUserCardInboxWidget Dl() {
        return (AbsUserCardInboxWidget) this.LJLJJI.getValue();
    }

    public final C28871Bj wl() {
        return (C28871Bj) this.LJLLL.getValue();
    }

    public final InboxFollowerAdapter xl() {
        return (InboxFollowerAdapter) this.LJLJI.getValue();
    }

    public final void Gl() {
        ((C73305Spp) _$_findCachedViewById(R.id.g7z)).setVisibility(8);
        if (this.LJLJLLL != null) {
            if (xl().getItemCount() == 0) {
                ((C73305Spp) _$_findCachedViewById(R.id.keh)).setVisibility(0);
                MGN mgn = MGN.LJLILLLLZI;
                if (mgn.isStandardUIEnable()) {
                    C73305Spp statusView = (C73305Spp) _$_findCachedViewById(R.id.keh);
                    o.LJIIIIZZ(statusView, "statusView");
                    mgn.setStatusView(statusView, "inbox_follower_list", new MQ9(this), this.LJLJLLL);
                    ActivityC45651qj mo49getActivity = mo49getActivity();
                    o.LJI(mo49getActivity);
                    mgn.triggerNetworkTips(mo49getActivity, "inbox_follower_list", this.LJLJLLL, (C73305Spp) _$_findCachedViewById(R.id.keh));
                } else {
                    ((C73305Spp) _$_findCachedViewById(R.id.keh)).setStatus((C73306Spq) this.LJLLLLLL.getValue());
                }
                C56762MPm.LIZ();
                return;
            }
            return;
        }
        ((C73305Spp) _$_findCachedViewById(R.id.keh)).setVisibility(8);
        List<FollowPageData> list = this.LJLJL;
        if ((list == null || list.isEmpty()) && this.LJLJJL == EnumC56772MPw.EMPTY) {
            xl().showEmpty();
            C56762MPm.LIZ();
            return;
        }
        List<FollowPageData> list2 = this.LJLJL;
        if (list2 == null || list2.isEmpty()) {
            Jl(false);
            xl().showEmpty();
            C56762MPm.LIZ();
        } else {
            if (!xl().setData(this.LJLJL, this.LJLJLJ, this.LJLJJL)) {
                return;
            }
            Jl(false);
        }
    }

    @Override // X.InterfaceC74170T9a
    public final void LJ() {
        boolean z;
        boolean z2;
        int i;
        C56709MNl LIZIZ;
        FollowerPreCacheManager.FollowNoticeData LIZIZ2;
        FollowPageResponse followPageResponse;
        List<FollowPageData> data;
        View _$_findCachedViewById;
        if (C52924Kps.LIZ()) {
            Hl("refresh");
            if (Il("post runnable") && (_$_findCachedViewById = _$_findCachedViewById(R.id.dl2)) != null) {
                _$_findCachedViewById.postDelayed((Runnable) this.LJLLILLLL.getValue(), C52487Kip.LIZ);
            }
        }
        if (FollowerPreCacheManager.LIZJ && FollowerPreCacheManager.LIZIZ() != null && (LIZIZ = FollowerPreCacheManager.LIZIZ()) != null && (LIZIZ2 = LIZIZ.LIZIZ()) != null && (followPageResponse = LIZIZ2.resp) != null && (data = followPageResponse.getData()) != null && (!data.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        mo49getActivity();
        try {
            z2 = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z2 = false;
        }
        FollowerPreCacheManager.LIZJ = false;
        if (z || z2) {
            if (wl().getItemCount() <= 0) {
                ((C73305Spp) _$_findCachedViewById(R.id.g7z)).LJFF();
                ((C73305Spp) _$_findCachedViewById(R.id.g7z)).setVisibility(0);
                ((C73305Spp) _$_findCachedViewById(R.id.keh)).setVisibility(8);
            }
            this.LJLJL = null;
            this.LJLJLJ = false;
            this.LJLJLLL = null;
            this.LJLJJLL = false;
            this.LJLL = false;
            C56706MNi c56706MNi = C56706MNi.LJI;
            boolean z3 = this.LJLLI;
            c56706MNi.LIZLLL();
            if (c56706MNi.LJFF()) {
                C56706MNi.LJII = z3;
                C56706MNi.LJIIIIZZ = false;
            }
            Al().LJIILL(1, new C56715MNr(z, z2, this.LJLLI));
            this.LJLLI = false;
            if (!this.LJZ) {
                Dl().LJ();
            }
            this.LJZ = false;
            int i2 = this.LJZI;
            if (i2 != Integer.MIN_VALUE) {
                C54362LVe.LIZLLL(i2);
            } else {
                if (C46604IQu.LIZLLL() || C56630MKk.LIZ()) {
                    i = 534;
                } else {
                    i = 7;
                }
                C54362LVe.LIZ(LVG.Normal, i);
            }
            C2U8.LIZ(new C54251LQx(6, C54362LVe.LJIILJJIL(6)));
            ((BaseNotificationVM) ViewModelProviders.of(this).get(InboxFollowerVM.class)).cJ().clear();
            return;
        }
        MGN mgn = MGN.LJLILLLLZI;
        if (mgn.isStandardUIEnable()) {
            if (wl().getItemCount() <= 0) {
                ((C73305Spp) _$_findCachedViewById(R.id.keh)).setVisibility(0);
                ((C73305Spp) _$_findCachedViewById(R.id.g7z)).setVisibility(8);
                C73305Spp statusView = (C73305Spp) _$_findCachedViewById(R.id.keh);
                o.LJIIIIZZ(statusView, "statusView");
                mgn.setStatusView(statusView, "inbox_follower_list", new MQ8(this), (Exception) null);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                o.LJI(mo49getActivity);
                mgn.triggerNetworkTips(mo49getActivity, "inbox_follower_list", (Exception) null, (C73305Spp) _$_findCachedViewById(R.id.keh));
            } else {
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                o.LJI(mo49getActivity2);
                mgn.triggerNetworkTips(mo49getActivity2, "inbox_follower_list", (Exception) null, (C73305Spp) _$_findCachedViewById(R.id.keh));
            }
            ((C80896Voy) _$_findCachedViewById(R.id.dl3)).setRefreshing(false);
            return;
        }
        if (wl().getItemCount() <= 0) {
            C10K.LJII(100L).LJ(new AgS126S0100000_9(this, 2), C10K.LJIIIIZZ, null);
        }
        ((C80896Voy) _$_findCachedViewById(R.id.dl3)).setRefreshing(false);
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIIZZ(R.string.img);
        c26045AKb.LJIIJ();
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        if (Al().LJJIFFI()) {
            return;
        }
        this.LJLL = true;
        this.LJLZ.post(new ARunnableS45S0100000_9(this, 167));
        C56706MNi c56706MNi = C56706MNi.LJI;
        boolean z = this.LJLLI;
        boolean z2 = this.LJLL;
        c56706MNi.LIZLLL();
        if (c56706MNi.LJFF()) {
            C56706MNi.LJII = z;
            C56706MNi.LJIIIIZZ = z2;
        }
        Al().LJIILL(4);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        FollowerPreCacheManager.FollowNoticeData LIZIZ;
        super.onDestroy();
        this.LJLZ.removeCallbacksAndMessages(null);
        if (C52924Kps.LIZ()) {
            Hl("onDestroy");
        }
        C56762MPm.LIZLLL.set(0);
        for (EnumC56764MPo enumC56764MPo : EnumC56764MPo.values()) {
            synchronized (enumC56764MPo) {
                enumC56764MPo.LJLJI.LIZ = 0L;
                enumC56764MPo.LJLJI.LIZIZ = 0L;
                enumC56764MPo.LJLJJI.LIZ = -1;
            }
        }
        C56762MPm.LIZIZ.set(false);
        C56762MPm.LIZJ.set(false);
        C56709MNl LIZIZ2 = FollowerPreCacheManager.LIZIZ();
        if (LIZIZ2 == null || (LIZIZ = LIZIZ2.LIZIZ()) == null) {
            return;
        }
        LIZIZ.timestamp = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Object LIZ;
        super.onDestroyView();
        Al().LJJII();
        Al().LIZIZ();
        if (C56775MPz.LIZJ()) {
            C56678MMg.LJII().storeLong("last_visit_follower_subpage", Calendar.getInstance().getTimeInMillis() / 1000);
        }
        if (C53551Kzz.LIZ()) {
            try {
                Keva LIZJ = FollowSortDataCache.LIZJ();
                LinkedHashMap<String, Integer> linkedHashMap = FollowSortDataCache.LIZ;
                if (!linkedHashMap.isEmpty()) {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
                        arrayList.add(new FollowSortDataCache.NidCountEntry(entry.getKey(), entry.getValue().intValue()));
                    }
                    LIZJ.storeString("inbox_new_follower_expose", JsonParseUtils.LIZLLL(arrayList));
                }
                FollowSortDataCache.LIZ.clear();
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl != null) {
                C221018lt.LIZJ("InboxDataCache", "storeNidCountMap error", m10exceptionOrNullimpl);
            }
        }
        C68925R3h.LIZJ("new_followers");
        MNH.LIZ.LIZIZ();
        ((LinkedHashMap) this.LJZL).clear();
    }

    @Override // X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
        xl().showLoadMoreLoading();
    }

    public final void vl() {
        ((C80896Voy) _$_findCachedViewById(R.id.dl3)).setRefreshing(false);
        this.LJLJJLL = true;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("followerLoadFinish, mRecommendDataStatus: ");
        LIZ.append(this.LJLJJL);
        C221018lt.LJFF("InboxFollowerFragment", X1D.LIZIZ(LIZ));
        Gl();
    }

    @Override // X.InterfaceC223218pR
    public final void Ne() {
        vl();
    }

    public final void Hl(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("method: ");
        LIZ.append(str);
        LIZ.append(", remove unfold notice runnable");
        C221018lt.LJFF("InboxFollowerFragment", X1D.LIZIZ(LIZ));
        View _$_findCachedViewById = _$_findCachedViewById(R.id.dl2);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.removeCallbacks((Runnable) this.LJLLILLLL.getValue());
        }
    }

    public final boolean Il(String str) {
        boolean z;
        boolean z2;
        EnumC56772MPw enumC56772MPw = this.LJLJJL;
        if (enumC56772MPw != EnumC56772MPw.SOME && enumC56772MPw != EnumC56772MPw.EMPTY) {
            z = true;
        } else {
            z = false;
        }
        if (Dl().LJIIJ().getItemCount() <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("operation: ");
        LIZ.append(str);
        LIZ.append(", isStateNotEnd: ");
        LIZ.append(z);
        LIZ.append(", hasNoRecommendData: ");
        HH1.LIZIZ(LIZ, z2, LIZ, "InboxFollowerFragment");
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public final void Jl(boolean z) {
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(this, 264);
        if (z) {
            this.LJLZ.post(new ARunnableS45S0100000_9(aqS159S0100000_9, 55));
        } else {
            aqS159S0100000_9.invoke();
        }
    }

    @Override // X.InterfaceC223218pR
    public final void cb0(Exception exc) {
        if (exc == null) {
            exc = new RuntimeException("Load error");
        }
        this.LJLJLLL = exc;
        vl();
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception exc) {
        xl().showPullUpLoadMore();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C78897Uxp.LJII(this, MQJ.LJLIL);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        o.LJIIIZ(activity, "activity");
        super.onAttach(activity);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getInt("group", -1);
        }
        int i = LiveLayoutPreloadThreadPriority.DEFAULT;
        if (arguments != null) {
            i = arguments.getInt("filter_type", LiveLayoutPreloadThreadPriority.DEFAULT);
        }
        this.LJZI = i;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Dl().LJIILIIL().observe(this, new AObserverS77S0100000_9(this, 17));
        Dl().LJIIJ().setHasStableIds(false);
        Dl().LJLILLLLZI.postValue(Boolean.TRUE);
        getLifecycle().addObserver(Dl());
        FMX.LJIIL("enter_new_follower", C113554cx.LJJLIIIIJ(new OSZ("enter_from", "notification_page")));
    }

    @Override // X.InterfaceC223218pR
    public final void J5(List<FollowPageData> list, boolean z) {
        List<FollowPageData> list2;
        if (list != null) {
            list2 = ORZ.LLJILJILJ(list);
        } else {
            list2 = null;
        }
        this.LJLJL = list2;
        this.LJLJLJ = z;
        vl();
    }

    @Override // X.InterfaceC223218pR
    public final void j0(List<FollowPageData> list, boolean z) {
        List list2;
        xl().resetLoadMoreState();
        InboxFollowerAdapter xl = xl();
        if (list != null) {
            list2 = ORZ.LLJILJILJ(list);
        } else {
            list2 = null;
        }
        xl.setDataAfterLoadMore(list2);
        xl().setShowFooter(z);
        if (!z) {
            Jl(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Al().LJJ((C8BS) this.LJLILLLLZI.getValue());
        Al().LJJI(this);
        getContext();
        this.LJLLJ = new FixedLinearlayoutManager();
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.dl2);
        FixedLinearlayoutManager fixedLinearlayoutManager = this.LJLLJ;
        if (fixedLinearlayoutManager != null) {
            recyclerView.setLayoutManager(fixedLinearlayoutManager);
            ((RecyclerView) _$_findCachedViewById(R.id.dl2)).setAdapter(wl());
            C56649MLd.LIZ((RecyclerView) _$_findCachedViewById(R.id.dl2), (C223318pb) _$_findCachedViewById(R.id.dl3));
            ((RecyclerView) _$_findCachedViewById(R.id.dl2)).LJIIJJI(new C73379Sr1(getContext()));
            ((RecyclerView) _$_findCachedViewById(R.id.dl2)).LJIIJJI(new MQ1(getContext()));
            ((RecyclerView) _$_findCachedViewById(R.id.dl2)).LJII(new C29606Bje(), -1);
            ((C80896Voy) _$_findCachedViewById(R.id.dl3)).setOnRefreshListener(this);
            ((C80896Voy) _$_findCachedViewById(R.id.dl3)).setNestedScrollEnabledWhenNonTouch(false);
            xl().setShowFooter(false);
            xl().setLoadMoreListener(this);
            if (E1X.LIZ()) {
                C77266UUc.LIZIZ.getRelationService().LJFF().subscribe(this, new AObserverS77S0100000_9(this, 79));
            }
            C68925R3h.LIZIZ("new_followers");
            LJ();
            if (L03.LIZ()) {
                C40443Fu3.LIZ("inbox_follower_page").LJIIIIZZ((RecyclerView) _$_findCachedViewById(R.id.dl2));
                return;
            }
            return;
        }
        o.LJIJI("mLinearLayoutManager");
        throw null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        Integer LJI;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.rr, viewGroup, false);
        Context context = LLLLIILL.getContext();
        if (context != null && (LJI = C79045V0n.LJI(R.attr.cl, context)) != null) {
            LLLLIILL.setBackgroundColor(LJI.intValue());
        }
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}
