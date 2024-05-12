package Y;

import X.ActivityC45651qj;
import X.C10K;
import X.C174416sv;
import X.C1JD;
import X.C213748aA;
import X.C221018lt;
import X.C223318pb;
import X.C2U8;
import X.C40328FsC;
import X.C45804HyK;
import X.C52716KmW;
import X.C53352Kwm;
import X.C54029LIj;
import X.C54030LIk;
import X.C54140LMq;
import X.C54204LPc;
import X.C54258LRe;
import X.C54838Lfe;
import X.C55230Lly;
import X.C56639MKt;
import X.C56641MKv;
import X.C56644MKy;
import X.C56645MKz;
import X.C56768MPs;
import X.C73305Spp;
import X.C73306Spq;
import X.C79081V1x;
import X.C88913eJ;
import X.EnumC56637MKr;
import X.EnumC94693nd;
import X.InterfaceC208778Hh;
import X.InterfaceC36571c5;
import X.InterfaceC54080LKi;
import X.InterfaceC54197LOv;
import X.InterfaceC55643Lsd;
import X.InterfaceC59608NaO;
import X.LHH;
import X.LI7;
import X.LJF;
import X.LKQ;
import X.LKR;
import X.LND;
import X.LNH;
import X.LPQ;
import X.LRD;
import X.ML0;
import X.MQ0;
import X.ORZ;
import X.OSZ;
import X.X1D;
import X.YG5;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hox.Hox;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageBusinessAssem;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.feed.ui.FollowTabViewLifecycleObserver;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideViewModel;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import com.ss.android.ugc.aweme.inbox.InboxFragmentVM;
import com.ss.android.ugc.aweme.inbox.NotificationContainer;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.ss.android.ugc.aweme.inbox.widget.multi.NoticeAndDMCombineWidget;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS76S1100000_9;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class AObserverS73S0200000_9 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            case 5:
                onChanged$5(this, obj);
                return;
            case 6:
                onChanged$6(this, obj);
                return;
            case 7:
                onChanged$7(this, obj);
                return;
            case 8:
                onChanged$8(this, obj);
                return;
            case 9:
                onChanged$9(this, obj);
                return;
            case 10:
                onChanged$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onChanged$11(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS73S0200000_9 aObserverS73S0200000_9, Object obj) {
        InterfaceC54197LOv interfaceC54197LOv;
        Integer num = (Integer) obj;
        if (num == null || o.LJ(((ScrollSwitchStateManager) aObserverS73S0200000_9.l0).mv0(num.intValue()), "page_feed") || (interfaceC54197LOv = ((FollowTabViewLifecycleObserver) aObserverS73S0200000_9.l1).LJZI) == null) {
            return;
        }
        interfaceC54197LOv.LIZIZ();
    }

    public static final void onChanged$1(AObserverS73S0200000_9 aObserverS73S0200000_9, Object obj) {
        boolean z;
        MutableLiveData<Boolean> LJIILJJIL;
        MutableLiveData<Boolean> LJIILJJIL2;
        Long l;
        C223318pb Ql;
        if (InboxAdapterWidget.LJLJJL.contains(obj)) {
            InboxFragmentVM Kl = ((InboxFragment) aObserverS73S0200000_9.l0).Kl();
            EnumC56637MKr state = EnumC56637MKr.NORMAL;
            Kl.getClass();
            o.LJIIIZ(state, "state");
            Kl.LJLIL.setValue(state);
            if (C53352Kwm.LIZ() && (((InboxAdapterWidget) aObserverS73S0200000_9.l1) instanceof NoticeAndDMCombineWidget) && (Ql = ((InboxFragment) aObserverS73S0200000_9.l0).Ql()) != null) {
                Ql.post(new ARunnableS45S0100000_9((InboxFragment) aObserverS73S0200000_9.l0, 62));
            }
            InboxFragment inboxFragment = (InboxFragment) aObserverS73S0200000_9.l0;
            InboxAdapterWidget inboxAdapterWidget = (InboxAdapterWidget) aObserverS73S0200000_9.l1;
            if (o.LJ(inboxAdapterWidget, inboxFragment.Ol())) {
                C56641MKv.LIZ(C56645MKz.LJLIL);
            } else if (o.LJ(inboxAdapterWidget, inboxFragment.Rl())) {
                C56641MKv.LIZ(C56644MKy.LJLIL);
            } else if (o.LJ(inboxAdapterWidget, inboxFragment.Pl())) {
                C56641MKv.LIZ(ML0.LJLIL);
            }
        }
        InboxFragment inboxFragment2 = (InboxFragment) aObserverS73S0200000_9.l0;
        inboxFragment2.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onWidgetListStateChange: ");
        LIZ.append(inboxFragment2.Tl());
        C221018lt.LJFF("InboxFragment", X1D.LIZIZ(LIZ));
        List<InboxAdapterWidget> Tl = inboxFragment2.Tl();
        if (!(Tl instanceof Collection) || !Tl.isEmpty()) {
            Iterator<InboxAdapterWidget> it = Tl.iterator();
            while (it.hasNext()) {
                if (!ORZ.LJLJJI(it.next().LJIILIIL().getValue(), InboxAdapterWidget.LJLJJL)) {
                    break;
                }
            }
        }
        C221018lt.LJFF("InboxFragment", "all widget load end!");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onAllReady: ");
        C56639MKt c56639MKt = C56641MKv.LIZ;
        if (c56639MKt != null) {
            l = Long.valueOf(c56639MKt.LIZ);
        } else {
            l = null;
        }
        LIZ2.append(l);
        X1D.LIZIZ(LIZ2);
        C56639MKt c56639MKt2 = C56641MKv.LIZ;
        if (c56639MKt2 != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            c56639MKt2.LJIIJJI = uptimeMillis;
            long j = c56639MKt2.LIZ;
            long j2 = c56639MKt2.LIZIZ;
            C213748aA lifecycleTracker = c56639MKt2.LIZJ;
            long j3 = c56639MKt2.LIZLLL;
            long j4 = c56639MKt2.LJ;
            long j5 = c56639MKt2.LJFF;
            long j6 = c56639MKt2.LJI;
            long j7 = c56639MKt2.LJII;
            long j8 = c56639MKt2.LJIIIIZZ;
            long j9 = c56639MKt2.LJIIIZ;
            long j10 = c56639MKt2.LJIIJ;
            o.LJIIIZ(lifecycleTracker, "lifecycleTracker");
            C10K.LIZJ(new ACallableS112S0100000_9(new C56639MKt(j, j2, lifecycleTracker, j3, j4, j5, j6, j7, j8, j9, j10, uptimeMillis), 35));
        }
        C56641MKv.LIZ = null;
        if (inboxFragment2.LJLJJLL) {
            C79081V1x.LJJJIL(new AqS175S0100000_9(inboxFragment2, 470));
            inboxFragment2.LJLJJLL = false;
            InboxFragmentVM Kl2 = inboxFragment2.Kl();
            EnumC56637MKr state2 = EnumC56637MKr.ALL_ENDED;
            Kl2.getClass();
            o.LJIIIZ(state2, "state");
            Kl2.LJLIL.setValue(state2);
        }
        if (!inboxFragment2.LLII && ((RecyclerView) inboxFragment2._$_findCachedViewById(R.id.ekg)).getItemAnimator() == null && ((Boolean) C52716KmW.LIZJ.getValue()).booleanValue()) {
            C221018lt.LJFF("InboxFragment", "start add item animator");
            inboxFragment2.LLII = true;
            inboxFragment2._$_findCachedViewById(R.id.ekg).postDelayed(new ARunnableS45S0100000_9(inboxFragment2.LLIIII, 166), 1500L);
        }
        EnumC94693nd value = inboxFragment2.Pl().LJIILIIL().getValue();
        if (value != null && (value == EnumC94693nd.EMPTY || value == EnumC94693nd.FAIL)) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("recommendUserWidget is empty: ");
        LIZ3.append(z);
        C221018lt.LJFF("InboxFragment", X1D.LIZIZ(LIZ3));
        if (!((Boolean) inboxFragment2.LJLL.getValue()).booleanValue()) {
            InboxAdapterWidget Rl = inboxFragment2.Rl();
            if (Rl != null && (LJIILJJIL2 = Rl.LJIILJJIL()) != null) {
                Boolean value2 = LJIILJJIL2.getValue();
                if (value2 == null) {
                    value2 = Boolean.FALSE;
                }
                o.LJIIIIZZ(value2, "expandedLiveData.value ?: false");
                if (!value2.booleanValue() && z) {
                    LJIILJJIL2.postValue(Boolean.TRUE);
                }
            }
        } else {
            InboxAdapterWidget Rl2 = inboxFragment2.Rl();
            if (Rl2 != null && (LJIILJJIL = Rl2.LJIILJJIL()) != null) {
                LJIILJJIL.postValue(Boolean.TRUE);
            }
        }
        inboxFragment2.Pl().LJLILLLLZI.postValue(Boolean.TRUE);
    }

    public static final void onChanged$10(AObserverS73S0200000_9 aObserverS73S0200000_9, Object obj) {
        InterfaceC208778Hh interfaceC208778Hh = (InterfaceC208778Hh) obj;
        LNH.LIZIZ((ActivityC45651qj) aObserverS73S0200000_9.l0);
        C54204LPc c54204LPc = (C54204LPc) aObserverS73S0200000_9.l1;
        if (c54204LPc != null) {
            c54204LPc.LLLFF = interfaceC208778Hh;
        }
    }

    public static final void onChanged$11(AObserverS73S0200000_9 aObserverS73S0200000_9, Object obj) {
        String aid;
        Integer num = (Integer) obj;
        ScrollSwitchStateManager scrollSwitchStateManager = (ScrollSwitchStateManager) aObserverS73S0200000_9.l0;
        o.LJI(num);
        if (o.LJ("page_profile", scrollSwitchStateManager.mv0(num.intValue()))) {
            HomePageDataViewModel homePageDataViewModel = (HomePageDataViewModel) aObserverS73S0200000_9.l1;
            String str = homePageDataViewModel.LJLJJI;
            Aweme aweme = homePageDataViewModel.LJLJJL;
            String str2 = "";
            if (aweme == null) {
                aid = "";
            } else {
                aid = aweme.getAid();
            }
            LPQ.LIZIZ = str;
            if (aid != null) {
                str2 = aid;
            }
            LPQ.LIZJ = str2;
            LPQ.LIZ = SystemClock.uptimeMillis();
        }
    }

    public static final void onChanged$2(AObserverS73S0200000_9 aObserverS73S0200000_9, Object obj) {
        ActivityC45651qj onChanged = (ActivityC45651qj) aObserverS73S0200000_9.l0;
        o.LJIIIIZZ(onChanged, "onChanged");
        Activity LJIJJ = C45804HyK.LJIJJ(onChanged);
        if (LJIJJ == null || !o.LJ(obj, "NOTIFICATION") || !LKR.LIZIZ((ActivityC45651qj) LJIJJ, "NOTIFICATION")) {
            return;
        }
        ((NotificationContainer) aObserverS73S0200000_9.l1).wl();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0111, code lost:
    
        if (r6 == 1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$3(Y.AObserverS73S0200000_9 r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS73S0200000_9.onChanged$3(Y.AObserverS73S0200000_9, java.lang.Object):void");
    }

    public static final void onChanged$4(AObserverS73S0200000_9 aObserverS73S0200000_9, Object obj) {
        if (obj == MQ0.ERROR) {
            View view = ((C56768MPs) aObserverS73S0200000_9.l0).itemView;
            o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.status.TuxStatusView");
            C73306Spq c73306Spq = new C73306Spq();
            c73306Spq.LJI = C88913eJ.LIZ((View) aObserverS73S0200000_9.l1, R.string.pj8, "itemView.context.getStri…string.pull_up_load_more)");
            ((C73305Spp) view).setStatus(c73306Spq);
            View view2 = ((C56768MPs) aObserverS73S0200000_9.l0).itemView;
            o.LJII(view2, "null cannot be cast to non-null type com.bytedance.tux.status.TuxStatusView");
            view2.findViewById(R.id.lv5).setVisibility(8);
        }
    }

    public static final void onChanged$5(AObserverS73S0200000_9 aObserverS73S0200000_9, Object obj) {
        LHH lhh = (LHH) aObserverS73S0200000_9.l0;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aObserverS73S0200000_9.l1;
        lhh.getClass();
        Fragment Ja = Hox.LJLLI.LIZ(activityC45651qj).Ja("FRIENDS_FEED");
        if (!(Ja instanceof FeedFragment) || Ja == null) {
            C54029LIj.LIZIZ.LJJIJLIJ(LI7.NON_PERSONALIZED_FEED_CHANGE.getScene(), "");
        }
    }

    public static final void onChanged$6(AObserverS73S0200000_9 aObserverS73S0200000_9, Object obj) {
        boolean z;
        Boolean isVisible = (Boolean) obj;
        if (((LND) aObserverS73S0200000_9.l0).LJLILLLLZI.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (o.LJ(Boolean.valueOf(z), isVisible)) {
            return;
        }
        o.LJIIIIZZ(isVisible, "isVisible");
        if (isVisible.booleanValue()) {
            C54140LMq c54140LMq = ((LND) aObserverS73S0200000_9.l0).LJLJJL;
            if (c54140LMq != null) {
                c54140LMq.LJLJJI = false;
                c54140LMq.LJLIL.setVisibility(8);
                PopupManager.LIZJ(C54140LMq.class);
            }
            LND lnd = (LND) aObserverS73S0200000_9.l0;
            String str = ((SlideGuideViewModel) aObserverS73S0200000_9.l1).LJLL;
            lnd.getClass();
            InterfaceC36571c5 interfaceC36571c5 = lnd.LJLIL;
            o.LJII(interfaceC36571c5, "null cannot be cast to non-null type com.bytedance.poplayer.scene.PopupScene");
            C54140LMq c54140LMq2 = new C54140LMq((InterfaceC55643Lsd) interfaceC36571c5, lnd.LJLILLLLZI, new AqS76S1100000_9(lnd, str, 3));
            PopupManager.LJIIL(c54140LMq2);
            lnd.LJLJJL = c54140LMq2;
            return;
        }
        C54140LMq c54140LMq3 = ((LND) aObserverS73S0200000_9.l0).LJLJJL;
        if (c54140LMq3 != null) {
            if (((SlideGuideViewModel) aObserverS73S0200000_9.l1).LJLJLLL) {
                c54140LMq3.LJLIL.setVisibility(8);
                c54140LMq3.getStateWrapper().LIZ();
            } else {
                C54140LMq.LJIIIIZZ(c54140LMq3.LJLIL, false, new AqS159S0100000_9(c54140LMq3, 919));
            }
        }
        ((SlideGuideViewModel) aObserverS73S0200000_9.l1).LJLJLLL = false;
    }

    public static final void onChanged$7(AObserverS73S0200000_9 aObserverS73S0200000_9, Object obj) {
        List<Pair<Aweme, Integer>> list;
        ProfilePageFragment profilePageFragment = (ProfilePageFragment) aObserverS73S0200000_9.l0;
        ScrollSwitchStateManager scrollSwitchStateManager = (ScrollSwitchStateManager) aObserverS73S0200000_9.l1;
        Integer num = (Integer) obj;
        LKQ lkq = profilePageFragment.LLII;
        if (lkq != null) {
            lkq.LIZ(scrollSwitchStateManager, num.intValue(), profilePageFragment.mo49getActivity());
        }
        if (profilePageFragment.mo49getActivity() != null && num != null && num.intValue() != 0 && (list = profilePageFragment.LL) != null && !list.isEmpty()) {
            LKQ lkq2 = profilePageFragment.LLII;
            if (lkq2 != null && lkq2.LIZIZ(profilePageFragment.mo49getActivity())) {
                return;
            }
            List<Pair<Aweme, Integer>> list2 = profilePageFragment.LL;
            profilePageFragment.pm(0, list2);
            profilePageFragment.LL = list2;
            AObserverS73S0200000_9 observer = profilePageFragment.LJZI;
            scrollSwitchStateManager.getClass();
            o.LJIIIZ(observer, "observer");
            scrollSwitchStateManager.LJLJLLL.removeObserver(observer);
            AppLogNewUtils.onEventV3("lazy_do_aweme_changed", new JSONObject());
            if (profilePageFragment.mo49getActivity() == null) {
                return;
            }
            Hox.kv0(profilePageFragment.mo49getActivity()).Av0("profile_fake_child");
        }
    }

    public static final void onChanged$8(AObserverS73S0200000_9 aObserverS73S0200000_9, Object obj) {
        Aweme aweme;
        ProfilePageFragment profilePageFragment = (ProfilePageFragment) aObserverS73S0200000_9.l0;
        ScrollSwitchStateManager scrollSwitchStateManager = (ScrollSwitchStateManager) aObserverS73S0200000_9.l1;
        Integer num = (Integer) obj;
        LKQ lkq = profilePageFragment.LLII;
        if (lkq != null) {
            lkq.LIZ(scrollSwitchStateManager, num.intValue(), profilePageFragment.mo49getActivity());
        }
        if (num.intValue() == 1) {
            C54030LIk.LIZIZ = LJF.SLIDE.getValue();
        }
        if (profilePageFragment.LLFZ) {
            if (profilePageFragment.LLII != null) {
                if (num.intValue() == 1 && TextUtils.equals("page_profile", scrollSwitchStateManager.hv0())) {
                    return;
                }
                if ((num.intValue() == 0 || num.intValue() == 2) && TextUtils.equals("page_feed", scrollSwitchStateManager.hv0())) {
                    return;
                }
            }
            LKQ lkq2 = profilePageFragment.LLII;
            if (lkq2 != null && lkq2.LIZIZ(profilePageFragment.mo49getActivity())) {
                return;
            }
            profilePageFragment.LLFZ = false;
            List<Pair<Aweme, Integer>> list = profilePageFragment.LL;
            profilePageFragment.pm(0, list);
            profilePageFragment.LL = list;
            if (profilePageFragment.mo49getActivity() != null) {
                Hox.kv0(profilePageFragment.mo49getActivity()).Av0("profile_fake_child");
            }
        }
        if (num.intValue() == 1) {
            profilePageFragment.LLD = "scroll_to_slide";
            Aweme aweme2 = profilePageFragment.LJLLI;
            if (aweme2 != null && ProfilePageFragment.Pl(aweme2) && C54838Lfe.LJJI(profilePageFragment.LJLLI) && !(profilePageFragment.LJLJJI instanceof InterfaceC59608NaO)) {
                if (profilePageFragment.LJLJI == null) {
                    profilePageFragment.LJLJI = profilePageFragment.Jl();
                }
                profilePageFragment.Xl((Fragment) profilePageFragment.LJLJI, "page_my_fragment");
            }
        }
        Context context = profilePageFragment.getContext();
        if (num.intValue() == 0 && TextUtils.equals("page_feed", scrollSwitchStateManager.hv0()) && context != null && (aweme = profilePageFragment.LJLLI) != null && aweme.isAd() && profilePageFragment.LJLLI.getAwemeRawAd().getGetAdStatus() == 1) {
            YG5 yg5 = YG5.LIZIZ;
            if (yg5.shouldShowAdBrowser(profilePageFragment.LJLLI)) {
                yg5.onProfileWebPageHide(profilePageFragment.getContext(), profilePageFragment.LJLLI, profilePageFragment.LLD);
            }
        }
        if (num.intValue() != 0 || !TextUtils.equals("page_feed", scrollSwitchStateManager.hv0())) {
            return;
        }
        C2U8.LIZ(new C174416sv(0));
    }

    public static final void onChanged$9(AObserverS73S0200000_9 aObserverS73S0200000_9, Object obj) {
        ActivityC45651qj LJJIFFI;
        Configuration configuration;
        OSZ osz = (OSZ) obj;
        Context context = null;
        MainBusinessAbility LJIL = C1JD.LJIL(C55230Lly.LIZLLL((ActivityC45651qj) aObserverS73S0200000_9.l0, null));
        if (LJIL != null) {
            LJIL.n30();
        }
        MainPageBusinessAssem mainPageBusinessAssem = (MainPageBusinessAssem) aObserverS73S0200000_9.l1;
        String str = (String) osz.getFirst();
        Context context2 = mainPageBusinessAssem.getContext();
        if (context2 != null && (LJJIFFI = C45804HyK.LJJIFFI(context2)) != null) {
            C54258LRe LIZ = LRD.LIZ(LJJIFFI);
            if (LIZ.LJ() || LIZ.LIZJ()) {
                return;
            }
            mainPageBusinessAssem.E3().getClass();
            C2U8.LIZ(new IEvent(str) { // from class: X.2Nc
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C2U8.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C2U8.LIZIZ(this);
                    return this;
                }

                {
                    o.LJIIIZ(str, "type");
                }
            });
            if (!TextUtils.equals(mainPageBusinessAssem.E3().nv0(), str)) {
                HomePageUIFrameServiceImpl.LIZ().removeNoticeView();
            }
            IMSAdaptionService LJIIL = MSAdaptionService.LJIIL();
            Fragment mv0 = mainPageBusinessAssem.E3().mv0();
            if (mv0 != null) {
                context = mv0.getContext();
            }
            if (LJIIL.LJI(context)) {
                Resources resources = LJJIFFI.getResources();
                if (resources != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2) {
                    SmartRoute buildRoute = SmartRouter.buildRoute(LJJIFFI, "//duo");
                    buildRoute.withParam("duo_type", "duo_bottom_click");
                    buildRoute.withParam("duo_clicked_tab_name", str);
                    buildRoute.open();
                    return;
                }
                if (TextUtils.equals(str, "PUBLISH")) {
                    C40328FsC.LIZLLL(LJJIFFI, R.string.f1i);
                    return;
                }
            }
        }
        if (((Boolean) osz.getSecond()).booleanValue()) {
            InterfaceC54080LKi H70 = ((MainPageBusinessAssem) aObserverS73S0200000_9.l1).x3().getHomeTabViewModel((ActivityC45651qj) aObserverS73S0200000_9.l0).H70((String) osz.getFirst());
            if (H70 != null) {
                H70.LIZLLL();
                return;
            }
            return;
        }
        InterfaceC54080LKi H702 = ((MainPageBusinessAssem) aObserverS73S0200000_9.l1).x3().getHomeTabViewModel((ActivityC45651qj) aObserverS73S0200000_9.l0).H70((String) osz.getFirst());
        if (H702 == null) {
            return;
        }
        H702.LIZIZ();
    }

    public AObserverS73S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
