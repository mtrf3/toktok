package com.ss.android.ugc.aweme.notification;

import X.AX5;
import X.AX6;
import X.AbstractC029409q;
import X.AbstractC030109x;
import X.AbstractC225698tR;
import X.ActivityC45651qj;
import X.C03040Aa;
import X.C0AY;
import X.C0AZ;
import X.C10A;
import X.C113554cx;
import X.C12460eI;
import X.C141335gf;
import X.C16880lQ;
import X.C169696lJ;
import X.C16970lZ;
import X.C18000nE;
import X.C188727au;
import X.C221018lt;
import X.C221108m2;
import X.C223318pb;
import X.C244389iU;
import X.C25620zW;
import X.C27740Aue;
import X.C28871Bj;
import X.C29S;
import X.C3C5;
import X.C3U3;
import X.C45804HyK;
import X.C47261Igj;
import X.C52924Kps;
import X.C53355Kwp;
import X.C53752L7s;
import X.C53765L8f;
import X.C54058LJm;
import X.C54072LKa;
import X.C54081LKj;
import X.C54082LKk;
import X.C54154LNe;
import X.C56678MMg;
import X.C56681MMj;
import X.C56702MNe;
import X.C56733MOj;
import X.C56736MOm;
import X.C56746MOw;
import X.C56757MPh;
import X.C56759MPj;
import X.C56761MPl;
import X.C56765MPp;
import X.C56766MPq;
import X.C56770MPu;
import X.C56775MPz;
import X.C56805MRd;
import X.C5H3;
import X.C62685Oiv;
import X.C62822Ol8;
import X.C67552kx;
import X.C68925R3h;
import X.C76800UCe;
import X.C78897Uxp;
import X.C79045V0n;
import X.C8DP;
import X.C8WY;
import X.C90903hW;
import X.C9NE;
import X.EnumC56806MRe;
import X.FMX;
import X.HandlerC56918MVm;
import X.INB;
import X.InterfaceC178086yq;
import X.InterfaceC27853AwT;
import X.InterfaceC34471Wx;
import X.InterfaceC56322M8o;
import X.JBR;
import X.JBS;
import X.LFQ;
import X.LK2;
import X.LKC;
import X.LKH;
import X.LLQ;
import X.LLY;
import X.LNZ;
import X.LQ3;
import X.M9M;
import X.ML4;
import X.ML9;
import X.MLW;
import X.MLZ;
import X.MNH;
import X.MP2;
import X.MQH;
import X.MQK;
import X.MQN;
import X.MR7;
import X.MR8;
import X.MS5;
import X.OSZ;
import X.QD3;
import X.V1B;
import X.X1D;
import Y.AObserverS77S0100000_9;
import Y.ARunnableS28S0200000_9;
import Y.IDrS48S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.router.fragment.FindNavigationContainerResult;
import com.bytedance.router.fragment.NavigationUtils;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.arch.widgets.base.ChangeLiveData;
import com.ss.android.ugc.aweme.benchmark.BenchmarkServiceImpl;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notification.perf.ActivitiesPerfCacheManager;
import com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager;
import com.ss.android.ugc.aweme.notification.utils.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.notification.vm.NotificationVM;
import com.ss.android.ugc.aweme.notification.widget.WidgetFragment;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS98S0300000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class NotificationFragment extends WidgetFragment implements LKC, InterfaceC34471Wx, InterfaceC27853AwT, InterfaceC56322M8o, LK2, JBS, LKH, LLY, InterfaceC178086yq {
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLL;
    public boolean LJLLLLLL;
    public View LJLZ;
    public boolean LJZ;
    public AbstractC030109x LJZI;
    public ARunnableS28S0200000_9 LJZL;
    public long LL;
    public int LLD;
    public final IDrS48S0100000_9 LLFFF;
    public final C56770MPu LLFII;
    public final AObserverS77S0100000_9 LLFZ;
    public final AObserverS77S0100000_9 LLI;
    public final AObserverS77S0100000_9 LLIFFJFJJ;
    public final AObserverS77S0100000_9 LLII;
    public final AObserverS77S0100000_9 LLIIII;
    public final AObserverS77S0100000_9 LLIIIILZ;
    public final String LLIIIJ;
    public final Map<Integer, View> LLIIIL = new LinkedHashMap();
    public final C5H3 LJLJI = V1B.LJZI(new AqS159S0100000_9(this, 352));
    public final C5H3 LJLJJI = V1B.LJZI(new AqS159S0100000_9(this, 351));
    public final C5H3 LJLJJL = V1B.LJZI(MR8.LJLIL);
    public final C5H3 LJLJJLL = V1B.LJZI(MR7.LJLIL);
    public final C5H3 LJLJL = V1B.LJZI(new AqS159S0100000_9(this, 355));
    public final C5H3 LJLJLJ = V1B.LJZI(MQN.LJLIL);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 353));
    public boolean LJLLJ = true;
    public boolean LJLLLL = true;
    public final C54072LKa LLF = new C54072LKa();
    public final C62822Ol8 LLFF = C221108m2.LIZIZ(new AqS159S0100000_9(this, 354));

    @Override // X.LLY
    public final void Vj() {
    }

    @Override // com.ss.android.ugc.aweme.notification.widget.WidgetFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIIL).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC34471Wx, X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b8003";
    }

    @Override // X.InterfaceC27853AwT
    public final String getPageName() {
        return "activity_page";
    }

    @Override // X.InterfaceC56322M8o
    public final boolean needConflictWithParent() {
        return true;
    }

    @Override // X.JBS
    public final /* synthetic */ void onActivityResult_Activity(int i, int i2, Intent intent) {
        JBR.LIZ(this, i, i2, intent);
    }

    @Override // X.JBS
    public final /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // X.JBS
    public final /* synthetic */ void onNewIntent(Intent intent) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.notification.widget.WidgetFragment
    public final List<C56766MPq> wl() {
        return C47261Igj.LJJIJIIJI(Jl(), this.LJLJJLL.getValue(), new LQ3(), new MLZ(), new C56761MPl(), new C56746MOw(), new C56765MPp());
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    @Override // X.LLY
    public final void x9(AbstractC225698tR tabStyle, boolean z) {
        o.LJIIIZ(tabStyle, "tabStyle");
    }

    @Override // X.InterfaceC34471Wx
    public final String xi() {
        return "MainTabPage";
    }

    public NotificationFragment() {
        ML4.LIZLLL(ML9.LJLIL);
        if (C56805MRd.LIZJ()) {
            EnumC56806MRe.LJLJJLL.LIZLLL();
        }
        HandlerC56918MVm LIZ = NoticeVideoManager.LIZ();
        if (LIZ != null) {
            MS5.LJI(new AqS159S0100000_9(LIZ, 404));
        }
        C68925R3h.LIZIZ("new_activities");
        this.LLFFF = new IDrS48S0100000_9(this, 1);
        this.LLFII = new C56770MPu(this);
        this.LLFZ = new AObserverS77S0100000_9(this, 31);
        this.LLI = new AObserverS77S0100000_9(this, 30);
        this.LLIFFJFJJ = new AObserverS77S0100000_9(this, 26);
        this.LLII = new AObserverS77S0100000_9(this, 29);
        this.LLIIII = new AObserverS77S0100000_9(this, 28);
        this.LLIIIILZ = new AObserverS77S0100000_9(this, 27);
        this.LLIIIJ = "inbox";
    }

    public final C28871Bj Hl() {
        C28871Bj c28871Bj = (C28871Bj) ((Map) this.LJLJLJ.getValue()).get(Integer.valueOf(Kl().az()));
        if (c28871Bj == null) {
            C0AY c0ay = new C0AY();
            c0ay.LIZ = true;
            c0ay.LIZIZ = C0AZ.NO_STABLE_IDS;
            c28871Bj = new C28871Bj(new C03040Aa(c0ay.LIZ, c0ay.LIZIZ), (AbstractC029409q<? extends RecyclerView.ViewHolder>[]) new AbstractC029409q[0]);
            C56759MPj c56759MPj = new C56759MPj(this);
            c28871Bj.LJLIL.LIZ(0, c56759MPj);
            C56766MPq c56766MPq = vl().get(C56765MPp.class);
            if (!(c56766MPq instanceof C56765MPp)) {
                c56766MPq = null;
            }
            C56765MPp c56765MPp = (C56765MPp) c56766MPq;
            if (c56765MPp != null) {
                c56759MPj.LJLILLLLZI = c56765MPp;
                ((Map) this.LJLJLJ.getValue()).put(Integer.valueOf(Kl().az()), c28871Bj);
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Cannot find widget: ");
                LIZ.append(C16880lQ.LJLLJ(C56765MPp.class));
                throw new IllegalStateException(X1D.LIZIZ(LIZ));
            }
        }
        return c28871Bj;
    }

    public final C223318pb Il() {
        return (C223318pb) this.LJLJI.getValue();
    }

    public final MQH Jl() {
        return (MQH) this.LJLJJL.getValue();
    }

    public final NotificationVM Kl() {
        return (NotificationVM) this.LJLJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, X.InterfaceC45040Hm0
    public final Analysis getAnalysis() {
        Analysis analysis = new Analysis();
        analysis.setLabelName("message");
        o.LJIIIIZZ(analysis, "Analysis().setLabelName(NoticeMob.Label.MESSAGE)");
        return analysis;
    }

    @Override // com.ss.android.ugc.aweme.notification.widget.WidgetFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        ML4.LJ(C8WY.ON_RESUME, new AqS159S0100000_9(this, 349));
    }

    @Override // com.ss.android.ugc.aweme.notification.widget.WidgetFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        ML4.LJ(C8WY.ON_START, new AqS159S0100000_9(this, 350));
    }

    public final RecyclerView w6() {
        return (RecyclerView) this.LJLJJI.getValue();
    }

    @Override // X.LKH
    public final boolean LJIIJ() {
        if (C53355Kwp.LIZ() && NavigationUtils.findNavigationContainer(this) != null) {
            FMX.LJIIL("enter_homepage_message_navi", C113554cx.LJJLIIIIJ(new OSZ("enter_from", "notification_page"), new OSZ("enter_method", C54154LNe.LIZIZ(requireActivity())), new OSZ("from_inbox_page", "activity_page")));
        }
        return true;
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return C18000nE.LIZ(this);
    }

    public final void Ml() {
        ActivityC45651qj LJJIFFI;
        LLQ Xm0;
        Context context = getContext();
        if (context == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null) {
            return;
        }
        if (!INB.LIZIZ() && ((Xm0 = LNZ.LIZIZ.getHomeTabViewModel(LJJIFFI).Xm0()) == null || Xm0.LJIILLIIL())) {
            this.LLF.getClass();
            if (C53765L8f.LJIIL("NOTIFICATION")) {
                View _$_findCachedViewById = _$_findCachedViewById(R.id.aoj);
                if (_$_findCachedViewById == null) {
                    return;
                }
                _$_findCachedViewById.setVisibility(0);
                return;
            }
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.aoj);
        if (_$_findCachedViewById2 == null) {
            return;
        }
        _$_findCachedViewById2.setVisibility(8);
    }

    public final void Ol() {
        Integer LJI;
        C56736MOm c56736MOm;
        if (_$_findCachedViewById(R.id.n2g) == null || w6() == null || this.LJLJJLL.getValue() == null) {
            return;
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.n2g);
        int i = 0;
        if (!w6().canScrollVertically(-1) && ((c56736MOm = ((C56733MOj) this.LJLJJLL.getValue()).LJLJI) == null || !c56736MOm.isShowing())) {
            i = 4;
        }
        _$_findCachedViewById.setVisibility(i);
        Context context = getContext();
        if (context == null || (LJI = C79045V0n.LJI(R.attr.dv, context)) == null) {
            return;
        }
        _$_findCachedViewById(R.id.n2g).setBackgroundColor(LJI.intValue());
    }

    @Override // X.InterfaceC55643Lsd
    public final C54082LKk getPopupContext() {
        Context context = getContext();
        if (context != null) {
            return C54081LKj.LIZ(context, this);
        }
        return null;
    }

    @Override // X.InterfaceC55643Lsd
    public final boolean isSceneActive() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED);
    }

    @Override // X.JBS
    public final void onBackPressed_Activity() {
        JBR.LIZIZ(this);
        FMX.LJIIL("enter_homepage_message_navi", C113554cx.LJJLIIIIJ(new OSZ("enter_from", "notification_page"), new OSZ("enter_method", C54154LNe.LIZIZ(requireActivity())), new OSZ("from_inbox_page", "activity_page")));
    }

    @Override // com.ss.android.ugc.aweme.notification.widget.WidgetFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ActivitiesPerfCacheManager.JanusData janusData;
        NoticeCombineDatas data;
        ActivitiesPerfCacheManager.NoticeData noticeData;
        List<NoticeItems> notices;
        super.onDestroy();
        if (INB.LIZIZ()) {
            NoticeVideoManager.LJ();
        }
        C56805MRd.LIZIZ.set(0);
        C68925R3h.LIZJ("new_activities");
        EventBus.LIZJ().LJIJ(this);
        LFQ.LIZJ(this);
        if ((C53752L7s.LIZIZ() & 4) == 4) {
            Iterator<Integer> it = C53752L7s.LIZIZ.keySet().iterator();
            while (it.hasNext()) {
                C16970lZ.LJII(it.next().intValue());
            }
        }
        C56681MMj LIZ = ActivitiesPerfCacheManager.LIZ();
        if (LIZ != null) {
            synchronized (LIZ) {
                if (LIZ.LJ && (noticeData = LIZ.LIZLLL) != null && (notices = noticeData.resp.getNotices()) != null) {
                    Iterator<NoticeItems> it2 = notices.iterator();
                    while (it2.hasNext()) {
                        C56681MMj.LIZIZ(it2.next());
                    }
                }
                if (LIZ.LJFF && (janusData = LIZ.LIZJ) != null && (data = janusData.resp.getData()) != null) {
                    List<NoticeItems> reportNotice = data.getReportNotice();
                    if (reportNotice != null) {
                        Iterator<NoticeItems> it3 = reportNotice.iterator();
                        while (it3.hasNext()) {
                            C56681MMj.LIZIZ(it3.next());
                        }
                    }
                    List<NoticeItems> shopNotice = data.getShopNotice();
                    if (shopNotice != null) {
                        Iterator<NoticeItems> it4 = shopNotice.iterator();
                        while (it4.hasNext()) {
                            C56681MMj.LIZIZ(it4.next());
                        }
                    }
                }
            }
        }
        if (C52924Kps.LIZ()) {
            Ll("onDestroy");
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.widget.WidgetFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        super.onDestroyView();
        if (C56775MPz.LIZIZ()) {
            C56678MMg.LJII().storeLong("last_visit_activity_subpage", Calendar.getInstance().getTimeInMillis() / 1000);
        }
        if (M9M.LIZIZ != -1) {
            C188727au LJ = C169696lJ.LJ(System.currentTimeMillis() - M9M.LIZIZ, "duration");
            if (INB.LIZIZ()) {
                str = "new_activities";
            } else {
                str = "inbox_first_page";
            }
            LJ.LJIIIZ("position", str);
            FMX.LJIIL("page_stay_time", LJ.LIZ);
        }
        M9M.LIZIZ = -1L;
        MNH.LIZ.LIZIZ();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.notification.widget.WidgetFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        AX5.LIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.notification.widget.WidgetFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (this.LJLLLL && this.LJLLLLLL) {
            BenchmarkServiceImpl.createIBenchmarkServicebyMonsterPlugin(false).stopBenchmark();
            this.LJLLLLLL = false;
        }
    }

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return this.LLIIIJ;
    }

    @Override // com.ss.android.ugc.aweme.notification.widget.WidgetFragment, X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        FindNavigationContainerResult findNavigationContainer;
        FragmentManager fragmentManager;
        if (C53355Kwp.LIZIZ() && (findNavigationContainer = NavigationUtils.findNavigationContainer(this)) != null && (fragmentManager = findNavigationContainer.getFragmentManager()) != null && fragmentManager.LJJJJIZL() > 0) {
            return;
        }
        if (isViewValid()) {
            super.LLLLILI(bundle);
            ((AnalysisStayTimeFragmentComponent) this.LJLJLLL.getValue()).LIZIZ(true);
        }
        if (this.LJLLLL && this.LJLLLLLL) {
            BenchmarkServiceImpl.createIBenchmarkServicebyMonsterPlugin(false).stopBenchmark();
            this.LJLLLLLL = false;
        }
        this.LJLLLL = false;
        C54072LKa c54072LKa = this.LLF;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c54072LKa.getClass();
        if (mo49getActivity == null || C53765L8f.LJIIL("NOTIFICATION")) {
            return;
        }
        C27740Aue.LJIIIIZZ(mo49getActivity);
        C244389iU.LIZ(mo49getActivity);
    }

    @Override // com.ss.android.ugc.aweme.notification.widget.WidgetFragment, X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        FindNavigationContainerResult findNavigationContainer;
        FragmentManager fragmentManager;
        o.LJIIIZ(args, "args");
        if (C53355Kwp.LIZIZ() && (findNavigationContainer = NavigationUtils.findNavigationContainer(this)) != null && (fragmentManager = findNavigationContainer.getFragmentManager()) != null && fragmentManager.LJJJJIZL() > 0) {
            return;
        }
        if (isViewValid()) {
            super.LLLLLLZ(args);
            Kl().jv0(MLW.REFRESH);
            HandlerC56918MVm LIZ = NoticeVideoManager.LIZ();
            if (LIZ != null) {
                MS5.LJI(new AqS159S0100000_9(LIZ, 404));
            }
            ((AnalysisStayTimeFragmentComponent) this.LJLJLLL.getValue()).LIZIZ(false);
        }
        this.LJLLLL = true;
        if (!this.LJLLLLLL) {
            BenchmarkServiceImpl.createIBenchmarkServicebyMonsterPlugin(false).startBenchmark(3);
            this.LJLLLLLL = true;
        }
        C12460eI.LJIIIIZZ(this, null);
        C54072LKa c54072LKa = this.LLF;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c54072LKa.getClass();
        if (mo49getActivity == null || C53765L8f.LJIIL("NOTIFICATION")) {
            return;
        }
        C27740Aue.LJIIIIZZ(mo49getActivity);
        C27740Aue.LJII(mo49getActivity);
    }

    public final void Ll(String str) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("reason: ", str, ", remove unfoldNoticeRunnable, duration: ");
        LIZIZ.append(System.currentTimeMillis() - this.LL);
        C221018lt.LJFF("NotificationFragment", X1D.LIZIZ(LIZIZ));
        w6().removeCallbacks((Runnable) this.LLFF.getValue());
    }

    @Override // com.ss.android.ugc.aweme.notification.widget.WidgetFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!this.LJZ) {
            this.LJZ = true;
        }
        C78897Uxp.LJII(this, MQK.LJLIL);
        LFQ.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.notification.widget.WidgetFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        int i;
        int i2;
        o.LJIIIZ(activity, "activity");
        Bundle arguments = getArguments();
        if (arguments != null && (i2 = arguments.getInt("group", -1)) != -1) {
            C56702MNe.LIZ = i2;
        }
        super.onAttach(activity);
        if (!this.LJLLL) {
            this.LJLLL = true;
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                int i3 = arguments2.getInt("key_launch_mode");
                long j = arguments2.getLong("key_launch_time");
                if (i3 > 0 && j > 0) {
                    AX6.LIZJ(i3, j);
                }
            }
        }
        Bundle arguments3 = getArguments();
        C56733MOj c56733MOj = (C56733MOj) this.LJLJJLL.getValue();
        int i4 = LiveLayoutPreloadThreadPriority.DEFAULT;
        if (arguments3 != null) {
            i = arguments3.getInt("filter_type", LiveLayoutPreloadThreadPriority.DEFAULT);
        } else {
            i = LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        c56733MOj.LJLJJL = i;
        NotificationVM Kl = Kl();
        if (arguments3 != null) {
            i4 = arguments3.getInt("collapsed_list_type", LiveLayoutPreloadThreadPriority.DEFAULT);
        }
        Kl.LJLJJLL = i4;
    }

    @Override // com.ss.android.ugc.aweme.notification.widget.WidgetFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ML4.LJ(C8WY.ON_CREATE, new AqS156S0200000_9(this, bundle, 21));
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onNoRepostToastEvent(C67552kx event) {
        o.LJIIIZ(event, "event");
        C62685Oiv.LIZIZ.LJ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onRefreshMessageButton(C3U3 event) {
        o.LJIIIZ(event, "event");
        Hl().notifyDataSetChanged();
    }

    @QD3
    public final void onResumeRefreshEvent$awemenotice_release(C54058LJm event) {
        o.LJIIIZ(event, "event");
        if (isViewValid()) {
            this.LJLLI = true;
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSwitchBusinessAccountSuccessEvent(C9NE event) {
        o.LJIIIZ(event, "event");
        AX6.LIZ(this);
    }

    @Override // X.LK2
    public final void v0(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", enterFrom);
        linkedHashMap.put("to_page", "activity_page");
        FMX.LJIIL("enter_activity_page", linkedHashMap);
        if (C53355Kwp.LIZ() && NavigationUtils.findNavigationContainer(this) != null) {
            FMX.LJIIL("enter_homepage_message_navi", C113554cx.LJJLIIIIJ(new OSZ("enter_from", "notification_page"), new OSZ("enter_method", "click_button_icon"), new OSZ("from_inbox_page", "activity_page")));
        }
    }

    public static final /* synthetic */ void xl(NotificationFragment notificationFragment, Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // X.InterfaceC178086yq
    public final void Ha(RecyclerView.ViewHolder viewHolder, boolean z) {
        int i;
        if (viewHolder == null || w6() == null) {
            return;
        }
        if (z) {
            Rect LIZIZ = C8DP.LIZIZ(viewHolder);
            if (LIZIZ != null) {
                int[] iArr = new int[2];
                w6().getLocationOnScreen(iArr);
                i = LIZIZ.top - iArr[1];
                int computeVerticalScrollRange = (w6().computeVerticalScrollRange() - w6().computeVerticalScrollOffset()) - w6().getHeight();
                if (computeVerticalScrollRange <= 0) {
                    computeVerticalScrollRange = 0;
                }
                if (i > computeVerticalScrollRange) {
                    w6().animate().translationY(computeVerticalScrollRange - i).setDuration(300L).start();
                    i = computeVerticalScrollRange;
                }
            } else {
                i = 0;
            }
            this.LLD = i;
        } else {
            w6().animate().translationY(0.0f).setDuration(300L).start();
            i = -this.LLD;
            this.LLD = 0;
        }
        w6().LJLIIIL(0, i);
    }

    public final void Nl(int i, boolean z) {
        MP2 mp2;
        ChangeLiveData<Boolean> LJIILJJIL;
        LiveData liveData;
        MP2 mp22;
        ChangeLiveData<Boolean> LJIILJJIL2;
        LiveData liveData2;
        C56757MPh iv0 = Kl().iv0(i);
        if (!z) {
            iv0.LJI().removeObserver(this.LLIFFJFJJ);
            iv0.LJIIIIZZ().removeObserver(this.LLII);
            iv0.LJII().removeObserver(this.LLIIII);
            iv0.LIZLLL().removeObserver(this.LLIIIILZ);
            boolean z2 = iv0 instanceof MP2;
            if (z2) {
                MP2 mp23 = (MP2) iv0;
                if (mp23 != null && (liveData2 = (LiveData) mp23.LJIIIZ.getValue()) != null) {
                    liveData2.removeObserver(this.LLFZ);
                }
                if (z2 && (mp22 = (MP2) iv0) != null && (LJIILJJIL2 = mp22.LJIILJJIL()) != null) {
                    LJIILJJIL2.removeObserver(this.LLI);
                    return;
                }
                return;
            }
            return;
        }
        iv0.LJI().observe(this, this.LLIFFJFJJ);
        iv0.LJIIIIZZ().observe(this, this.LLII);
        iv0.LJII().observe(this, this.LLIIII);
        iv0.LIZLLL().observe(this, this.LLIIIILZ);
        boolean z3 = iv0 instanceof MP2;
        if (!z3) {
            return;
        }
        MP2 mp24 = (MP2) iv0;
        if (mp24 != null && (liveData = (LiveData) mp24.LJIIIZ.getValue()) != null) {
            liveData.observe(this, this.LLFZ);
        }
        if (!z3 || (mp2 = (MP2) iv0) == null || (LJIILJJIL = mp2.LJIILJJIL()) == null) {
            return;
        }
        LJIILJJIL.observe(this, this.LLI);
    }

    @Override // com.ss.android.ugc.aweme.notification.widget.WidgetFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        ML4.LJ(C8WY.ON_VIEW_CREATED, new AqS98S0300000_9(this, view, bundle, 7));
    }

    @Override // X.LLY
    public final void s0(AbstractC225698tR tabStyle, boolean z) {
        o.LJIIIZ(tabStyle, "tabStyle");
        Ml();
    }

    public static final /* synthetic */ void Gl(NotificationFragment notificationFragment, View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Override // com.ss.android.ugc.aweme.notification.widget.WidgetFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        Object LJ = ML4.LJ(C8WY.ON_CREATE_VIEW, new AqS98S0300000_9(this, inflater, viewGroup, 6));
        o.LJIIIIZZ(LJ, "override fun onCreateVie…ache = it\n        }\n    }");
        View view = (View) LJ;
        try {
            ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(view, this);
            C10A.LIZIZ(view, this);
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
        return view;
    }
}
