package com.ss.android.ugc.aweme.notification;

import X.AX5;
import X.AX6;
import X.AbstractC225698tR;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.AnonymousClass349;
import X.C00F;
import X.C10A;
import X.C10K;
import X.C12460eI;
import X.C141335gf;
import X.C16880lQ;
import X.C18000nE;
import X.C188787b0;
import X.C1DH;
import X.C2068389v;
import X.C221108m2;
import X.C26045AKb;
import X.C29S;
import X.C2NU;
import X.C2U8;
import X.C3C5;
import X.C3K2;
import X.C3U3;
import X.C45804HyK;
import X.C47261Igj;
import X.C52752Kn6;
import X.C53405Kxd;
import X.C53753L7t;
import X.C54058LJm;
import X.C54081LKj;
import X.C54082LKk;
import X.C54251LQx;
import X.C54262LRi;
import X.C54361LVd;
import X.C54362LVe;
import X.C55832Lvg;
import X.C55833Lvh;
import X.C55834Lvi;
import X.C55879LwR;
import X.C56678MMg;
import X.C56702MNe;
import X.C56732MOi;
import X.C56734MOk;
import X.C56736MOm;
import X.C56740MOq;
import X.C56741MOr;
import X.C56742MOs;
import X.C56743MOt;
import X.C56744MOu;
import X.C56747MOx;
import X.C56754MPe;
import X.C56760MPk;
import X.C56801MQz;
import X.C56891MUl;
import X.C56892MUm;
import X.C62822Ol8;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C73318Sq2;
import X.C73969T1h;
import X.C76800UCe;
import X.C78842Uww;
import X.C78886Uxe;
import X.C78999UzT;
import X.C79004UzY;
import X.C79081V1x;
import X.C80896Voy;
import X.C86393XvR;
import X.C8WY;
import X.C90903hW;
import X.C9VE;
import X.ENR;
import X.EnumC53605L2b;
import X.EnumC57165Mc5;
import X.F3Q;
import X.FMX;
import X.G27;
import X.HG3;
import X.HandlerC56918MVm;
import X.IKM;
import X.INB;
import X.IR8;
import X.IRA;
import X.InterfaceC191547fS;
import X.InterfaceC223218pR;
import X.InterfaceC34471Wx;
import X.InterfaceC53896LDg;
import X.InterfaceC56322M8o;
import X.InterfaceC56737MOn;
import X.InterfaceC56753MPd;
import X.InterfaceC61213O0r;
import X.InterfaceC64592gB;
import X.InterfaceC74170T9a;
import X.LFQ;
import X.LK2;
import X.LKC;
import X.LLQ;
import X.LLY;
import X.LNZ;
import X.MGN;
import X.ML4;
import X.ML6;
import X.ML7;
import X.ML9;
import X.MLA;
import X.MOU;
import X.MOV;
import X.MPB;
import X.MPC;
import X.MQU;
import X.MRD;
import X.MRE;
import X.MRG;
import X.MS5;
import X.MSP;
import X.OJ4;
import X.ORZ;
import X.QD3;
import X.T16;
import X.X1D;
import Y.AfS53S0100000_1;
import Y.AfS58S0200000_9;
import Y.AfS61S0100000_9;
import Y.AgS126S0100000_9;
import Y.IDaS160S0200000_9;
import Y.IDuS320S0100000_9;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hox.Hox;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.benchmark.BenchmarkServiceImpl;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel;
import com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager;
import com.ss.android.ugc.aweme.notification.tutorial.TutorialVideoViewModel;
import com.ss.android.ugc.aweme.notification.utils.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

@InterfaceC61213O0r
/* loaded from: classes10.dex */
public final class MusNewNotificationFragment extends AmeBaseFragment implements LKC, InterfaceC53896LDg, InterfaceC74170T9a, InterfaceC191547fS, InterfaceC223218pR<MusNotice>, InterfaceC56753MPd, InterfaceC56737MOn, MSP, F3Q<User>, G27, InterfaceC56322M8o, MRG, InterfaceC34471Wx, LK2, LLY {
    public static final C62822Ol8 LLIIIJ = C221108m2.LIZIZ(C53753L7t.LJLIL);
    public C56743MOt LJLJJI;
    public AnalysisStayTimeFragmentComponent LJLJJL;
    public TutorialVideoViewModel LJLJJLL;
    public FixedLinearlayoutManager LJLJL;
    public C56736MOm LJLJLJ;
    public int LJLL;
    public boolean LJLLJ;
    public C56747MOx LJLLL;
    public boolean LJLLLL;
    public final boolean LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public final C62822Ol8 LJZI;
    public View LJZL;
    public boolean LL;
    public boolean LLD;
    public EnumC53605L2b LLF;
    public final C62822Ol8 LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public final Set<String> LLFZ;
    public final C62822Ol8 LLI;
    public C73306Spq LLIFFJFJJ;
    public C73306Spq LLII;
    public final String LLIIII;
    public final Map<Integer, View> LLIIIILZ = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C56801MQz.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C55833Lvh.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(MOV.LJLIL);
    public final List<C56732MOi> LJLJLLL = C56734MOk.LIZ();
    public int LJLLI = C56702MNe.LIZ;
    public final AtomicInteger LJLLILLLL = new AtomicInteger(2);

    @Override // X.InterfaceC56753MPd
    public final void Er0(boolean z) {
    }

    @Override // X.InterfaceC223218pR
    public final void Iw() {
    }

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    @Override // X.InterfaceC223218pR
    public final void LJII() {
    }

    @Override // X.InterfaceC223218pR
    public final void Qw(Exception exc) {
    }

    @Override // X.LLY
    public final void Vj() {
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LLIIIILZ;
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

    @Override // X.InterfaceC34471Wx, X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b9081";
    }

    @Override // X.InterfaceC27853AwT
    public final String getPageName() {
        return "activity_page";
    }

    @Override // X.InterfaceC223218pR
    public final void jh(List<MusNotice> list, boolean z) {
    }

    @Override // X.InterfaceC56753MPd
    public final void mA(List<User> list, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC56322M8o
    public final boolean needConflictWithParent() {
        return true;
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

    public MusNewNotificationFragment() {
        boolean z;
        Boolean bool;
        C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
        if (LJJIJIL == null || (bool = (Boolean) LJJIJIL.LJIIIZ(Boolean.FALSE, "live_square_inbox_refresh")) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        this.LJLLLLLL = z;
        this.LJZI = C221108m2.LIZIZ(C55832Lvg.LJLIL);
        this.LLF = EnumC53605L2b.ORIGIN_DATA;
        this.LLFF = C221108m2.LIZIZ(new AqS159S0100000_9(this, 338));
        this.LLFII = true;
        this.LLFZ = new LinkedHashSet();
        this.LLI = C221108m2.LIZIZ(C55834Lvi.LJLIL);
        IR8.LIZ();
        ML4.LIZLLL(ML9.LJLIL);
        HandlerC56918MVm LIZ = NoticeVideoManager.LIZ();
        if (LIZ != null) {
            MS5.LJI(new AqS159S0100000_9(LIZ, 404));
        }
        this.LLIIII = "inbox";
    }

    public final NotificationCombineVM Gl() {
        return (NotificationCombineVM) this.LLFF.getValue();
    }

    public final DmNoticeProxy Hl() {
        Object value = this.LJZI.getValue();
        o.LJIIIIZZ(value, "<get-dmNoticeProxy>(...)");
        return (DmNoticeProxy) value;
    }

    public final C56742MOs Jl() {
        return (C56742MOs) this.LJLIL.getValue();
    }

    public final MusNewNotificationModel Kl() {
        return (MusNewNotificationModel) this.LJLJI.getValue();
    }

    public final C54361LVd Ll() {
        return (C54361LVd) this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC223218pR
    public final void Ne() {
        C56743MOt c56743MOt = this.LJLJJI;
        if (c56743MOt != null) {
            if (c56743MOt.mShowFooter) {
                showLoadMoreEmpty();
            }
            ((C73305Spp) _$_findCachedViewById(R.id.kwc)).setVisibility(0);
            ((C73305Spp) _$_findCachedViewById(R.id.kwc)).LJFF();
            ML4.LIZLLL(new AqS175S0100000_9(new ML6(0, Kl().lastGroupApiLogId, null), (ML6<Integer>) 587));
            Ml().clear();
            this.LL = true;
            if (this.LJLLI == C56702MNe.LIZ) {
                ML4.LIZLLL(MRD.LJLIL);
                Pl(EnumC53605L2b.ORIGIN_DATA);
                return;
            } else {
                this.LLF = EnumC53605L2b.ORIGIN_DATA;
                Ol(new AnonymousClass349(null, null));
                return;
            }
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    public final void Nl() {
        ML7.LIZ(new IllegalStateException("Mus unknown error"));
        ML4.LIZLLL(MRE.LJLIL);
        Ol(new AnonymousClass349(null, null));
    }

    @Override // X.MRG
    public final void Wd() {
        C79081V1x.LJJJJ(IRA.LJLIL);
        if (this.LL) {
            Pl(EnumC53605L2b.ADAPTER_DATA);
        } else {
            LJIIJJI();
        }
        C56760MPk.LJIILIIL(Gl().iN(), null, false);
    }

    public final boolean Wl() {
        C56743MOt c56743MOt = this.LJLJJI;
        if (c56743MOt != null) {
            if (c56743MOt.getData().isEmpty()) {
                return true;
            }
            C56743MOt c56743MOt2 = this.LJLJJI;
            if (c56743MOt2 != null) {
                List<MusNotice> data = c56743MOt2.getData();
                if (data.isEmpty()) {
                    return true;
                }
                Iterator<MusNotice> it = data.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (it.next().type != 50 && (i = i + 1) < 0) {
                        C47261Igj.LJJJJIZL();
                        throw null;
                    }
                }
                if (i == 0) {
                    return true;
                }
                return false;
            }
            o.LJIJI("mAdapter");
            throw null;
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    public final void Xl() {
        if (this.LJLLILLLL.get() <= 0) {
            ((C73305Spp) _$_findCachedViewById(R.id.kwb)).setVisibility(8);
            ((C80896Voy) _$_findCachedViewById(R.id.kb6)).setRefreshing(false);
            ((C73305Spp) _$_findCachedViewById(R.id.kwc)).setVisibility(8);
            if (Wl()) {
                C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kwb);
                C73306Spq c73306Spq = this.LLIFFJFJJ;
                o.LJI(c73306Spq);
                c73305Spp.setStatus(c73306Spq);
                c73305Spp.setVisibility(0);
                c73305Spp.setFocusable(false);
                c73305Spp.setFocusableInTouchMode(false);
            }
        }
    }

    public final void Yl() {
        String str;
        if (this.LJLLILLLL.get() <= 0) {
            ((C73305Spp) _$_findCachedViewById(R.id.kwb)).setVisibility(8);
            ((C80896Voy) _$_findCachedViewById(R.id.kb6)).setRefreshing(false);
            ((C73305Spp) _$_findCachedViewById(R.id.kwc)).setVisibility(8);
            if (Wl()) {
                ((C73305Spp) _$_findCachedViewById(R.id.kwb)).setVisibility(0);
                MGN mgn = MGN.LJLILLLLZI;
                if (mgn.isStandardUIEnable()) {
                    if (INB.LIZ() == 0) {
                        str = "inbox";
                    } else {
                        str = "inbox_activity";
                    }
                    C73305Spp sv_status_view_center = (C73305Spp) _$_findCachedViewById(R.id.kwb);
                    o.LJIIIIZZ(sv_status_view_center, "sv_status_view_center");
                    mgn.setStatusView(sv_status_view_center, str, new C56754MPe(this), (Exception) null);
                    ActivityC45651qj requireActivity = requireActivity();
                    o.LJIIIIZZ(requireActivity, "requireActivity()");
                    mgn.triggerNetworkTips(requireActivity, str, (Exception) null, (C73305Spp) _$_findCachedViewById(R.id.kwb));
                } else {
                    C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kwb);
                    C73306Spq c73306Spq = this.LLII;
                    o.LJI(c73306Spq);
                    c73305Spp.setStatus(c73306Spq);
                }
                _$_findCachedViewById(R.id.j_9).getVisibility();
            }
        }
    }

    @Override // X.InterfaceC56753MPd, X.MX4
    public final void f4() {
        this.LJLLILLLL.decrementAndGet();
        C56743MOt c56743MOt = this.LJLJJI;
        if (c56743MOt != null) {
            c56743MOt.LLIFFJFJJ(new ArrayList(), 0, true);
            if (this.LJLLJ) {
                Yl();
                return;
            } else {
                Xl();
                return;
            }
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, X.InterfaceC45040Hm0
    public final Analysis getAnalysis() {
        Analysis analysis = new Analysis();
        analysis.setLabelName("message");
        o.LJIIIIZZ(analysis, "Analysis().setLabelName(NoticeMob.Label.MESSAGE)");
        return analysis;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        ML4.LJ(C8WY.ON_RESUME, new C56740MOq(this));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        ML4.LJ(C8WY.ON_START, new AqS159S0100000_9(this, 339));
    }

    public final void showLoadMoreEmpty() {
        C56743MOt c56743MOt = this.LJLJJI;
        if (c56743MOt != null) {
            c56743MOt.setShowFooter(false);
        } else {
            o.LJIJI("mAdapter");
            throw null;
        }
    }

    @Override // X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
        C56743MOt c56743MOt = this.LJLJJI;
        if (c56743MOt != null) {
            c56743MOt.showLoadMoreLoading();
        } else {
            o.LJIJI("mAdapter");
            throw null;
        }
    }

    public final Bundle Il() {
        Intent intent;
        Bundle LLJJIJI;
        if (AX6.LIZIZ() && INB.LIZIZ()) {
            LLJJIJI = getArguments();
        } else {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null && (intent = mo49getActivity.getIntent()) != null) {
                LLJJIJI = C16880lQ.LLJJIJI(intent);
            }
            return new Bundle();
        }
        if (LLJJIJI != null) {
            return LLJJIJI;
        }
        return new Bundle();
    }

    @Override // X.InterfaceC74170T9a
    public final void LJ() {
        boolean z;
        String str;
        if (!isViewValid() || this.LLD) {
            return;
        }
        if (C1DH.LJIJJLI()) {
            this.LJLLILLLL.set(0);
            ((C80896Voy) _$_findCachedViewById(R.id.kb6)).setRefreshing(false);
            Xl();
            return;
        }
        MOU.LIZIZ = Long.valueOf(System.currentTimeMillis());
        mo49getActivity();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            this.LLD = true;
            this.LJLLJ = false;
            C56743MOt c56743MOt = this.LJLJJI;
            if (c56743MOt != null) {
                if (c56743MOt.getItemCount() == 0) {
                    ((C73305Spp) _$_findCachedViewById(R.id.kwb)).setVisibility(0);
                    ((C73305Spp) _$_findCachedViewById(R.id.kwb)).LJFF();
                }
                this.LJLLILLLL.set(1);
                if (this.LJLLI == C56702MNe.LIZ && !C1DH.LJIJJLI() && e1.LIZ(31744, "inbox_has_top_msg", true, false)) {
                    TutorialVideoViewModel tutorialVideoViewModel = this.LJLJJLL;
                    if (tutorialVideoViewModel != null) {
                        C78999UzT.LJFF(AbstractC73672Svk.LJIIJ(new IDuS320S0100000_9(tutorialVideoViewModel, 7)).LJJL(T16.LIZ()).LJJJLIIL(new AfS61S0100000_9(tutorialVideoViewModel, 32), new InterfaceC64592gB() { // from class: X.9F3
                            @Override // X.InterfaceC64592gB
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            }
                        }), (C73318Sq2) tutorialVideoViewModel.LJLJI.getValue());
                    } else {
                        o.LJIJI("mTutorialVideoModel");
                        throw null;
                    }
                }
                this.LJLLLL = false;
                ML4.LIZLLL(MLA.LJLIL);
                Ll().LJIILL(1, Integer.valueOf(this.LJLLI), null, Boolean.FALSE, Integer.valueOf(((Number) this.LLI.getValue()).intValue()));
                int i = this.LJLLI;
                if (i == C56702MNe.LIZ) {
                    this.LJLL = C54362LVe.LJIILJJIL(12);
                }
                C56678MMg.LJIIJJI();
                Gl().getClass();
                MPB.LIZ(i);
                C2U8.LIZ(new C54251LQx(6, C54362LVe.LJIILJJIL(6)));
            } else {
                o.LJIJI("mAdapter");
                throw null;
            }
        } else {
            this.LJLLILLLL.set(0);
            MGN mgn = MGN.LJLILLLLZI;
            if (mgn.isStandardUIEnable()) {
                C56743MOt c56743MOt2 = this.LJLJJI;
                if (c56743MOt2 != null) {
                    if (!c56743MOt2.getData().isEmpty()) {
                        if (INB.LIZ() == 0) {
                            str = "inbox";
                        } else {
                            str = "inbox_activity";
                        }
                        ActivityC45651qj requireActivity = requireActivity();
                        o.LJIIIIZZ(requireActivity, "requireActivity()");
                        mgn.triggerNetworkTips(requireActivity, str, (Exception) null, (C73305Spp) _$_findCachedViewById(R.id.kwb));
                    }
                } else {
                    o.LJIJI("mAdapter");
                    throw null;
                }
            } else {
                C26045AKb c26045AKb = new C26045AKb(this);
                c26045AKb.LJIIIIZZ(R.string.img);
                c26045AKb.LJIIJ();
            }
            C10K.LJII(100L).LJ(new AgS126S0100000_9(this, 5), C10K.LJIIIIZZ, null);
        }
        Gl().cJ().clear();
        this.LLFZ.clear();
        Tl();
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        if (isViewValid() && !Ll().LJJIFFI() && !Gl().LJZI) {
            Gl().getClass();
            MOU.LIZIZ = Long.valueOf(System.currentTimeMillis());
            if (!this.LL) {
                Ll().LJIILL(4, Integer.valueOf(this.LJLLI), null, Boolean.FALSE, Integer.valueOf(((Number) this.LLI.getValue()).intValue()));
            }
        }
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return C18000nE.LIZ(this);
    }

    public final List<MusNotice> Ml() {
        return (List) Gl().LJZ.getValue();
    }

    public final void Ql() {
        if (C54362LVe.LJI().LIZIZ()) {
            View view = this.LJZL;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        View view2 = this.LJZL;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(0);
    }

    public final void Tl() {
        if (C53405Kxd.LIZLLL()) {
            ((ImageView) _$_findCachedViewById(R.id.fbh)).setVisibility(8);
        } else if (C54362LVe.LJIILJJIL(C56702MNe.LIZ) > 0) {
            ((ImageView) _$_findCachedViewById(R.id.fbh)).setVisibility(0);
        } else {
            ((ImageView) _$_findCachedViewById(R.id.fbh)).setVisibility(8);
        }
    }

    public final void Vl() {
        ActivityC45651qj LJJIFFI;
        LLQ Xm0;
        Context context = getContext();
        if (context == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null) {
            return;
        }
        if (INB.LIZIZ() || ((Xm0 = LNZ.LIZIZ.getHomeTabViewModel(LJJIFFI).Xm0()) != null && !Xm0.LJIILLIIL())) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.aoj);
            if (_$_findCachedViewById == null) {
                return;
            }
            _$_findCachedViewById.setVisibility(8);
            return;
        }
        _$_findCachedViewById(R.id.aoj).setVisibility(0);
    }

    public final void Zl() {
        if (_$_findCachedViewById(R.id.j_9).canScrollVertically(-1)) {
            _$_findCachedViewById(R.id.n2g).setVisibility(0);
        } else {
            _$_findCachedViewById(R.id.n2g).setVisibility(4);
        }
    }

    @Override // X.MSP
    public final void e7() {
        User curUser = HG3.LJIILL().getCurUser();
        o.LJIIIIZZ(curUser, "userService().curUser");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://user/qna/profile/");
        LIZ.append(curUser.getUid());
        SmartRoute buildRoute = SmartRouter.buildRoute(this, X1D.LIZIZ(LIZ));
        buildRoute.withParam("enter_from", "notification_page");
        buildRoute.withParam("enter_method", "click_turn_on_qna");
        buildRoute.open();
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

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (INB.LIZIZ()) {
            NoticeVideoManager.LJ();
        }
        EventBus.LIZJ().LJIJ(this);
        C55879LwR.LIZJ(0, null);
        LFQ.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Ll().LJJII();
        Ll().LIZIZ();
        Jl().LJJII();
        Jl().LIZIZ();
        Hl().LIZLLL("notification_page");
        ((LinkedHashMap) this.LLIIIILZ).clear();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Rl(false);
        AX5.LIZ = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (this.LLFII) {
            BenchmarkServiceImpl.createIBenchmarkServicebyMonsterPlugin(false).stopBenchmark();
        }
    }

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return this.LLIIII;
    }

    @Override // X.F3Q
    public final void E1(User user) {
        isViewValid();
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        String string = bundle.getString("fromStart", "");
        C188787b0 c188787b0 = Hox.LJLLI;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        String sv0 = c188787b0.LIZ(mo49getActivity).sv0("HOME");
        if (o.LJ(string, "MainPage") || bundle.getBoolean(sv0)) {
            if (!isViewValid()) {
                return;
            }
            Tl();
            Rl(false);
            AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.LJLJJL;
            if (analysisStayTimeFragmentComponent != null) {
                analysisStayTimeFragmentComponent.LIZIZ(true);
            } else {
                o.LJIJI("mStayTimeFragmentComponent");
                throw null;
            }
        }
        if (this.LLFII) {
            BenchmarkServiceImpl.createIBenchmarkServicebyMonsterPlugin(false).stopBenchmark();
        }
        this.LLFII = false;
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
        C12460eI.LJIIIIZZ(this, null);
        String string = args.getString("fromStart", "");
        C188787b0 c188787b0 = Hox.LJLLI;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        String sv0 = c188787b0.LIZ(mo49getActivity).sv0("HOME");
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        o.LJI(mo49getActivity2);
        c188787b0.LIZ(mo49getActivity2).sv0(sv0);
        if (o.LJ(string, "MainPage") || args.getBoolean(sv0)) {
            if (!isViewValid()) {
                return;
            }
            C56743MOt c56743MOt = this.LJLJJI;
            if (c56743MOt != null) {
                if (!C79004UzY.LJJIFFI(c56743MOt.getData()) && !((C80896Voy) _$_findCachedViewById(R.id.kb6)).LLIIIZ) {
                    LJ();
                }
                Tl();
                Rl(true);
                AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.LJLJJL;
                if (analysisStayTimeFragmentComponent != null) {
                    analysisStayTimeFragmentComponent.LIZIZ(false);
                    C56747MOx c56747MOx = this.LJLLL;
                    if (c56747MOx != null) {
                        c56747MOx.LIZ();
                    }
                } else {
                    o.LJIJI("mStayTimeFragmentComponent");
                    throw null;
                }
            } else {
                o.LJIJI("mAdapter");
                throw null;
            }
        }
        this.LLFII = true;
        BenchmarkServiceImpl.createIBenchmarkServicebyMonsterPlugin(false).startBenchmark(3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
    
        if (r9.LL == false) goto L113;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ol(X.AnonymousClass349 r10) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment.Ol(X.349):void");
    }

    public final void Pl(EnumC53605L2b enumC53605L2b) {
        this.LLF = enumC53605L2b;
        NotificationCombineVM Gl = Gl();
        Gl.LJZI = true;
        ArrayList arrayList = new ArrayList();
        if (arrayList.isEmpty()) {
            arrayList.add(AbstractC73672Svk.LJIIJ(MPC.LJLIL));
        }
        AnonymousClass349 anonymousClass349 = new AnonymousClass349(null, null);
        AbstractC73672Svk.LJIIIZ(arrayList).LJJL(T16.LIZ()).LJJIJL(C78886Uxe.LJLJJL).LJJJ(C73969T1h.LIZIZ()).LJJJLL(new AfS53S0100000_1(anonymousClass349, 85), new AfS58S0200000_9(anonymousClass349, Gl, 16), new IDaS160S0200000_9(anonymousClass349, Gl, 0));
    }

    public final void Rl(boolean z) {
        ValueAnimator valueAnimator;
        C56743MOt c56743MOt = this.LJLJJI;
        if (c56743MOt != null) {
            C56891MUl c56891MUl = (C56891MUl) OJ4.LJJJJJ(OJ4.LJJJJ(OJ4.LJJJJZ(ORZ.LJLIIIL(C78842Uww.LJJ(0, c56743MOt.getItemCount())), new AqS175S0100000_9(this, 147)), MQU.INSTANCE));
            if (c56891MUl == null) {
                return;
            }
            if (z) {
                C56892MUm c56892MUm = c56891MUl.LJLJI;
                if (c56892MUm != null) {
                    c56892MUm.LIZ();
                    return;
                }
                return;
            }
            C56892MUm c56892MUm2 = c56891MUl.LJLJI;
            if (c56892MUm2 == null || (valueAnimator = c56892MUm2.LJFF) == null) {
                return;
            }
            valueAnimator.cancel();
            return;
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a3, code lost:
    
        if (r6 != null) goto L75;
     */
    @Override // X.InterfaceC223218pR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cb0(java.lang.Exception r8) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment.cb0(java.lang.Exception):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e1  */
    @Override // X.InterfaceC56737MOn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6(X.C56732MOi r7) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment.m6(X.MOi):void");
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception exc) {
        C56743MOt c56743MOt = this.LJLJJI;
        if (c56743MOt != null) {
            c56743MOt.showPullUpLoadMore();
        } else {
            o.LJIJI("mAdapter");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        ML4.LJ(C8WY.ON_ACTIVITY_CREATED, new AqS156S0200000_9(this, bundle, 18));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        o.LJIIIZ(activity, "activity");
        super.onAttach(activity);
        if (this.LJZ) {
            return;
        }
        this.LJZ = true;
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        int i = arguments.getInt("key_launch_mode");
        long j = arguments.getLong("key_launch_time");
        if (i <= 0 || j <= 0) {
            return;
        }
        AX6.LIZJ(i, j);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ML4.LJ(C8WY.ON_CREATE, new AqS156S0200000_9(this, bundle, 19));
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onNoticeCountChangedEvent(C54262LRi event) {
        C56736MOm c56736MOm;
        o.LJIIIZ(event, "event");
        if (isViewValid() && (c56736MOm = this.LJLJLJ) != null) {
            c56736MOm.LIZ();
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onNotificationIndicatorEvent(C54251LQx event) {
        C56736MOm c56736MOm;
        o.LJIIIZ(event, "event");
        if (!ENR.LIZ() && isViewValid() && (c56736MOm = this.LJLJLJ) != null) {
            c56736MOm.LIZ();
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onRefreshMessageButton(C3U3 event) {
        o.LJIIIZ(event, "event");
        C56743MOt c56743MOt = this.LJLJJI;
        if (c56743MOt != null) {
            c56743MOt.notifyDataSetChanged();
        } else {
            o.LJIJI("mAdapter");
            throw null;
        }
    }

    @QD3
    public final void onResumeRefreshEvent(C54058LJm event) {
        o.LJIIIZ(event, "event");
        if (!isViewValid()) {
            return;
        }
        this.LJLLLL = true;
    }

    @QD3(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onSwitchInbox(IKM event) {
        o.LJIIIZ(event, "event");
        HandlerC56918MVm LIZ = NoticeVideoManager.LIZ();
        if (LIZ != null) {
            MS5.LJI(new AqS159S0100000_9(LIZ, 404));
        }
        if (INB.LIZJ()) {
            NotificationCombineVM Gl = Gl();
            Gl.getClass();
            EnumC57165Mc5.CONTACTS.markEnterInbox();
            Gl.LJLJLJ = false;
            ((Set) Gl.LJLJL.getValue()).clear();
            this.LLFFF = true;
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onUnder16RefreshEvent(C3K2 event) {
        o.LJIIIZ(event, "event");
        Ql();
    }

    @Override // X.LK2
    public final void v0(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", enterFrom);
        linkedHashMap.put("to_page", "activity_page");
        FMX.LJIIL("enter_activity_page", linkedHashMap);
    }

    public static final /* synthetic */ void vl(MusNewNotificationFragment musNewNotificationFragment, Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public static final /* synthetic */ void wl(MusNewNotificationFragment musNewNotificationFragment, Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // X.InterfaceC223218pR
    public final void J5(List<MusNotice> list, boolean z) {
        Integer num;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        ML4.LIZLLL(new AqS175S0100000_9(new ML6(num, Kl().lastGroupApiLogId, null), (ML6<Integer>) 587));
        if (list != null && !list.isEmpty() && C00F.LIZ(31744, 0, "i18n_following_live_skylight_type", true) == 1) {
            Iterator<MusNotice> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().type == 1001) {
                    it.remove();
                }
            }
        }
        if (!isViewValid()) {
            this.LLD = false;
            return;
        }
        C56743MOt c56743MOt = this.LJLJJI;
        if (c56743MOt != null) {
            c56743MOt.LJZL = Kl().mTotal;
            this.LL = !z;
            Ml().clear();
            if (list != null) {
                Ml().addAll(list);
            }
            if (this.LJLLI == C56702MNe.LIZ && (this.LL || ((Boolean) IR8.LIZIZ().LIZJ.getValue()).booleanValue())) {
                ML4.LIZLLL(MRD.LJLIL);
                Pl(EnumC53605L2b.ORIGIN_DATA);
                return;
            } else {
                this.LLF = EnumC53605L2b.ORIGIN_DATA;
                Ol(new AnonymousClass349(null, null));
                return;
            }
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    @Override // X.InterfaceC223218pR
    public final void j0(List<MusNotice> list, boolean z) {
        Integer num;
        if (!isViewValid()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadMoreResult, origin:");
        LIZ.append(Ml().size());
        LIZ.append(", list:");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", hasMore:");
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        if (!C79004UzY.LJJIFFI(list)) {
            int size = Ml().size();
            o.LJI(list);
            if (size < list.size() && (!((Boolean) C52752Kn6.LIZ.getValue()).booleanValue() || z)) {
                List LLJILJILJ = ORZ.LLJILJILJ(list);
                ((ArrayList) LLJILJILJ).removeAll(Ml());
                Ml().addAll(LLJILJILJ);
                C56743MOt c56743MOt = this.LJLJJI;
                if (c56743MOt != null) {
                    List<MusNotice> data = c56743MOt.getData();
                    data.addAll(LLJILJILJ);
                    C56743MOt c56743MOt2 = this.LJLJJI;
                    if (c56743MOt2 != null) {
                        c56743MOt2.setDataAfterLoadMore(data);
                        if (this.LJLLI != C56702MNe.LIZ) {
                            C56743MOt c56743MOt3 = this.LJLJJI;
                            if (c56743MOt3 != null) {
                                if (c56743MOt3.LJLLLL) {
                                    showLoadMoreEmpty();
                                    return;
                                }
                            } else {
                                o.LJIJI("mAdapter");
                                throw null;
                            }
                        }
                        C56743MOt c56743MOt4 = this.LJLJJI;
                        if (c56743MOt4 != null) {
                            c56743MOt4.setShowFooter(true);
                            C56743MOt c56743MOt5 = this.LJLJJI;
                            if (c56743MOt5 != null) {
                                c56743MOt5.resetLoadMoreState();
                                return;
                            } else {
                                o.LJIJI("mAdapter");
                                throw null;
                            }
                        }
                        o.LJIJI("mAdapter");
                        throw null;
                    }
                    o.LJIJI("mAdapter");
                    throw null;
                }
                o.LJIJI("mAdapter");
                throw null;
            }
        }
        this.LL = true;
        Pl(EnumC53605L2b.ADAPTER_DATA);
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        C56736MOm c56736MOm = this.LJLJLJ;
        if (c56736MOm != null && c56736MOm.isShowing()) {
            return;
        }
        this.LJLJLJ = null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        ML4.LJ(C8WY.ON_VIEW_CREATED, new C56744MOu(this, view, bundle));
    }

    @Override // X.LLY
    public final void s0(AbstractC225698tR tabStyle, boolean z) {
        o.LJIIIZ(tabStyle, "tabStyle");
        Vl();
    }

    @Override // X.InterfaceC56753MPd
    public final void xB(Exception exc, boolean z) {
        this.LJLLILLLL.decrementAndGet();
        if (this.LJLLJ) {
            Yl();
        } else {
            Xl();
        }
    }

    @Override // X.InterfaceC56753MPd
    public final void zg0(int i, List list) {
        this.LJLLILLLL.decrementAndGet();
        C56743MOt c56743MOt = this.LJLJJI;
        if (c56743MOt != null) {
            c56743MOt.LLIFFJFJJ(list, i, true);
            if (this.LJLLILLLL.get() == 0) {
                ((C73305Spp) _$_findCachedViewById(R.id.kwb)).setVisibility(8);
                ((C73305Spp) _$_findCachedViewById(R.id.kwc)).setVisibility(8);
                return;
            }
            return;
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    public final void Sl(int i, int i2, Integer num) {
        C73306Spq c73306Spq = new C73306Spq();
        String string = getString(i);
        o.LJIIIIZZ(string, "getString(titleId)");
        c73306Spq.LJFF = string;
        String string2 = getString(i2);
        o.LJIIIIZZ(string2, "getString(descId)");
        c73306Spq.LJI = string2;
        this.LLIFFJFJJ = c73306Spq;
        if (num != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = num.intValue();
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            c73306Spq.LIZ(c2068389v);
        }
        if (i == R.string.r_ && QnaService.LIZ().enablePublicQna()) {
            C73306Spq c73306Spq2 = this.LLIFFJFJJ;
            o.LJI(c73306Spq2);
            c73306Spq2.LJII = new AqS175S0100000_9(this, 148);
        }
        if (C1DH.LJIJJLI()) {
            C73306Spq c73306Spq3 = new C73306Spq();
            String string3 = getString(R.string.hn6);
            o.LJIIIIZZ(string3, "getString(R.string.kids_…notification_description)");
            c73306Spq3.LJFF = string3;
            this.LLIFFJFJJ = c73306Spq3;
        }
        C73306Spq c73306Spq4 = new C73306Spq();
        C73312Spw.LJI(c73306Spq4, new AqS159S0100000_9(this, 340));
        this.LLII = c73306Spq4;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 996) {
            if (i != 1024) {
                return;
            }
            this.LJLLILLLL.incrementAndGet();
            C56741MOr c56741MOr = (C56741MOr) Jl().LJLIL;
            if (c56741MOr == null) {
                return;
            }
            c56741MOr.LJLILLLLZI = true;
            c56741MOr.LJLIL = false;
            c56741MOr.LJIIIZ(0, System.currentTimeMillis() / 1000);
            return;
        }
        C2U8.LIZ(new C9VE());
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View view = (View) ML4.LJ(C8WY.ON_CREATE_VIEW, new AqS156S0200000_9(inflater, viewGroup, 20));
        C29S c29s = null;
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                C10A.LIZIZ(view, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return view;
    }
}
