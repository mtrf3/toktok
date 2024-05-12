package com.ss.android.ugc.feed.platform.cell.interact.bottom;

import X.C16880lQ;
import X.C2053083y;
import X.C210508Ny;
import X.C210708Os;
import X.C210768Oy;
import X.C210778Oz;
import X.C210888Pk;
import X.C212428Vi;
import X.C214348b8;
import X.C221108m2;
import X.C27570Aru;
import X.C2K0;
import X.C2L4;
import X.C3C8;
import X.C47261Igj;
import X.C51029K0z;
import X.C53326KwM;
import X.C53664L4i;
import X.C55096Ljo;
import X.C59050NFm;
import X.C5H3;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C76800UCe;
import X.C76965UIn;
import X.C78926UyI;
import X.C79057V0z;
import X.C8MM;
import X.C8MQ;
import X.C8MX;
import X.C8PQ;
import X.C8PV;
import X.C8PW;
import X.C8PX;
import X.C8T7;
import X.C8W0;
import X.C8YN;
import X.EnumC210578Of;
import X.EnumC210828Pe;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.TBT;
import Y.ARunnableS39S0100000_3;
import Y.ARunnableS9S0110000_3;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ad.feed.CommercializeFeedServiceImpl;
import com.ss.android.ugc.aweme.commercialize.tcm.service.TcmServiceImpl;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.addiction.AntiAddictionToastAssemTrigger;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackBannerTrigger;
import com.ss.android.ugc.aweme.feed.assem.review.VideoReviewStatusBarAssemTrigger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.AdFeeDeductionBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.AuthorSurveyBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.BottomSurveyAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.EditCaptionBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedEcSearchBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.GameLiveBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.GiftBagBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.LiveTaskBarBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.PlayListBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.PodcastBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.PoiReTagBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.PoiWriteReviewBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.QnaBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.ReferralBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.ReplaceMusicBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.ReportWarnBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.ScheduleBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import com.ss.android.ugc.feed.platform.container.scope.BottomBarComponentScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class InteractBottomBannerComponent extends BaseContainer implements BottomBarPriorityAbility, InteractBottomBarAbility, ComponentPriorityProtocol, InterfaceC55102Lju, C2L4 {
    public final C62822Ol8 LLFFF;
    public final C62822Ol8 LLFII;
    public final C5H3 LLFZ;
    public final EnumC210578Of LLI;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final String LQ() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void Od0() {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return C210888Pk.LIZJ(C210888Pk.LIZLLL(a1()), rp0().eventType, p4().LJIIIZ(EnumC210828Pe.BOTTOM_BANNER));
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -20851065 || hashCode == 223331207) {
            return this;
        }
        return null;
    }

    public InteractBottomBannerComponent() {
        new LinkedHashMap();
        this.LLFFF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1251));
        this.LLFII = C221108m2.LIZIZ(C210708Os.LJLIL);
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C210508Ny.INSTANCE);
        this.LLI = EnumC210578Of.INTERACT_BOTTOM_BANNER_COMPONENT;
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(BottomBarComponentScope.class);
    }

    public final View n4() {
        FrameLayout frameLayout = new FrameLayout(getContainerView().getContext());
        frameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        frameLayout.setId(R.id.bpi);
        return frameLayout;
    }

    public final C8PV p4() {
        return (C8PV) this.LLFII.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void E1() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).E1();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LLIILZL() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).LLIILZL();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility
    public final List<String> M30() {
        return p4().LIZLLL();
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility
    public final void Wf0() {
        InteractAreaCommonAbility interactAreaCommonAbility;
        String o0 = o0();
        if (o0 == null || o0.length() == 0 || !o.LJ(o0, "bottom_banner_anti_addiction") || (interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLFFF.getValue()) == null) {
            return;
        }
        interactAreaCommonAbility.Qb0(this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility
    public final boolean am() {
        if (getContainerView().getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        String o0 = o0();
        if (o0 != null && o0.length() != 0) {
            PriorityProtocol priorityProtocol = (PriorityProtocol) ((LinkedHashMap) p4().LJIIIZ(EnumC210828Pe.BOTTOM_BANNER)).get(o0());
            if (priorityProtocol != null) {
                return priorityProtocol.LJLILLLLZI();
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility
    /* renamed from: if, reason: not valid java name */
    public final String mo196if() {
        return p4().LJI();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBarAbility
    public final void mp0() {
        List<BottomBarPriorityProtocol> LJIJ = C62814Ol0.LJIJ(C55096Ljo.LJIIZILJ(this), BottomBarPriorityProtocol.class);
        if (LJIJ != null) {
            for (BottomBarPriorityProtocol bottomBarPriorityProtocol : LJIJ) {
                if (C210768Oy.LIZIZ.contains(bottomBarPriorityProtocol.y2())) {
                    bottomBarPriorityProtocol.d1();
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onCreateView() {
        super.onCreateView();
        p4().LIZ((ViewGroup) getContainerView(), new C8PX() { // from class: X.8Ow
            public final C62822Ol8 LIZ;

            @Override // X.C8PX
            public final void LIZ(PriorityProtocol priorityProtocol) {
            }

            @Override // X.C8PX
            public final java.util.Set<String> LIZJ() {
                return (java.util.Set) this.LIZ.getValue();
            }

            @Override // X.C8PX
            public final java.util.Set<String> LIZIZ() {
                return OQY.INSTANCE;
            }

            @Override // X.C8PX
            public final LifecycleOwner getLifecycleOwner() {
                return InteractBottomBannerComponent.this;
            }

            {
                this.LIZ = C221108m2.LIZIZ(new AqS153S0100000_3(InteractBottomBannerComponent.this, 1252));
            }
        });
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    public final boolean q4() {
        if (C53664L4i.LIZIZ(rp0().eventType) || C53664L4i.LIZ(C210888Pk.LIZLLL(a1()))) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility
    public final ViewGroup.MarginLayoutParams u1() {
        return C27570Aru.LJFF(getContainerView());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBarAbility
    public final void xs0() {
        p4().LJIIJJI();
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final EnumC210578Of c4() {
        return this.LLI;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJIII(int i) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).LJJIII(i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJIJIIJIL(int i) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).LJJIJIIJIL(i);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBarAbility
    public final void YB(String str) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        List LJIJ = C62814Ol0.LJIJ(C55096Ljo.LJIIZILJ(this), BottomBarPriorityProtocol.class);
        if (LJIJ != null) {
            Iterator it = ((ArrayList) LJIJ).iterator();
            while (it.hasNext()) {
                BottomBarPriorityProtocol bottomBarPriorityProtocol = (BottomBarPriorityProtocol) it.next();
                VideoItemParams videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL(this);
                if (o.LJ(str, bottomBarPriorityProtocol.y2())) {
                    if (bottomBarPriorityProtocol instanceof BaseCellSlotComponent) {
                        if (o.LJ("bottom_banner_tcm", str)) {
                            en(bottomBarPriorityProtocol);
                        }
                        ((BaseCellSlotComponent) bottomBarPriorityProtocol).q4(videoItemParams);
                    } else if (bottomBarPriorityProtocol instanceof BaseCellContentComponent) {
                        if (bottomBarPriorityProtocol instanceof BaseCellTriggerComponent) {
                            ((ReusedAssem) bottomBarPriorityProtocol).LJLIL = c2(videoItemParams);
                            AssemSupervisor LIZJ = C212428Vi.LIZJ((C8W0) bottomBarPriorityProtocol);
                            if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
                                ArrayList arrayList = new ArrayList();
                                Iterator<C8W0> it2 = copyOnWriteArrayList.iterator();
                                while (it2.hasNext()) {
                                    C8W0 next = it2.next();
                                    if (next instanceof BaseCellSlotComponent) {
                                        arrayList.add(next);
                                    }
                                }
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    ((BaseCellSlotComponent) it3.next()).c2(videoItemParams);
                                }
                            }
                        }
                        ((BaseCellContentComponent) bottomBarPriorityProtocol).q4(videoItemParams);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void en(PriorityProtocol protocol) {
        String str;
        PriorityProtocol priorityProtocol;
        o.LJIIIZ(protocol, "protocol");
        C8PV p4 = p4();
        p4.getClass();
        if (p4.LJIIIIZZ().containsKey(protocol.y2())) {
            p4.LJIIIIZZ().remove(protocol.y2());
            if (o.LJ(p4.LJII(), protocol)) {
                MutableLiveData<C8PW<PriorityProtocol>> LJII = p4.LJII();
                if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
                    LJII.setValue(null);
                } else {
                    LJII.postValue(null);
                }
            }
            String y2 = protocol.y2();
            if (!TextUtils.isEmpty(y2)) {
                C8PW<PriorityProtocol> c8pw = p4.LJIIIIZZ;
                if (c8pw != null && (priorityProtocol = c8pw.LIZ) != null) {
                    str = priorityProtocol.y2();
                } else {
                    str = null;
                }
                if (o.LJ(y2, str)) {
                    p4.LJIILJJIL(null);
                    ((LiveData) p4.LJI.getValue()).setValue(null);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        c8mm.LIZ("event_enter_clear_mode", new AqS169S0100000_3(this, 565));
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility
    public final void if0(boolean z) {
        C79057V0z.LJJJ(getContainerView(), new ARunnableS9S0110000_3(this, z, 3));
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility
    public final void nD(int i) {
        ViewGroup.MarginLayoutParams LJFF = C27570Aru.LJFF(getContainerView());
        if (LJFF != null) {
            LJFF.bottomMargin = i;
        }
        getContainerView().requestLayout();
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C79057V0z.LJJJ(getContainerView(), new ARunnableS39S0100000_3(this, 118));
        if (C8PQ.LIZ() || ((Number) C8PQ.LIZ.getValue()).intValue() == 3) {
            ((LiveData) p4().LJI.getValue()).observe(this, new Observer() { // from class: X.8Nt
                @Override // androidx.lifecycle.Observer
                public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                }
            });
            ((LiveData) p4().LJI.getValue()).setValue(null);
        }
        InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(new AuthorSurveyBottomBarAssemTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(new PoiWriteReviewBottomBarAssemTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(new ReferralBottomBarAssemTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(new GiftBagBottomBarAssemTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(new QnaBottomBarAssemTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(new EditCaptionBottomBarAssemTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(new ReportWarnBottomBarAssemTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(new PlayListBottomBarAssemTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(new LiveTaskBarBottomBarAssemTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(new GameLiveBottomBarAssemTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(new FeedSearchBottomBarAssemTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(new FeedEcSearchBottomBarAssemTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(new ScheduleBottomBarAssemTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(new PoiReTagBottomBarAssemTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(new ReplaceMusicBottomBarAssemTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(new VideoReviewStatusBarAssemTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(new AntiAddictionToastAssemTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(CommercializeFeedServiceImpl.LIZLLL().LIZ()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(new AdFeeDeductionBottomBarAssemTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(TcmServiceImpl.LJIJI().LJ()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(new PodcastBottomBarAssemTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(new BottomSurveyAssemTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(C59050NFm.LIZIZ.LJII()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, BottomBarPriorityProtocol.class, C47261Igj.LJJIJIL(new EarlyFeedbackBannerTrigger()));
        C78926UyI.LJFF(this, new AqS134S0200000_3(C62814Ol0.LJIJ(C55096Ljo.LJIIZILJ(this), BottomBarPriorityProtocol.class), (List<? extends BottomBarPriorityProtocol>) this, (InteractBottomBannerComponent) 168));
        C8YN.LJIIJ(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.8Ns
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, new TBT() { // from class: X.8Lh
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJZI;
            }
        }, null, C8MX.LJLIL, 12);
    }

    public final void r4(Set<String> set) {
        String str;
        if (C53326KwM.LIZ()) {
            if (set != null) {
                set.removeAll(C210778Oz.LIZJ);
            }
        } else {
            if (!((Boolean) C210778Oz.LIZ.getValue()).booleanValue()) {
                return;
            }
            BaseFeedPageParams baseFeedPageParams = a1().LJ;
            if (baseFeedPageParams != null) {
                str = baseFeedPageParams.eventType;
            } else {
                str = null;
            }
            if (!o.LJ(str, "homepage_hot") || set == null) {
                return;
            }
            set.removeAll(C210778Oz.LIZIZ);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        InteractAreaCommonAbility interactAreaCommonAbility;
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).B2(i, aweme);
            }
        }
        if (q4() && !TextUtils.isEmpty(o0()) && (interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLFFF.getValue()) != null) {
            interactAreaCommonAbility.U00(this, new AqS185S0100000_3(this, 214), Boolean.TRUE);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void Sn(ReusedUIAssem<? extends C3C8> ins, InterfaceC65784Pro<C76800UCe> win) {
        o.LJIIIZ(ins, "ins");
        o.LJIIIZ(win, "win");
        C2053083y.LIZ(ins, win);
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final void b4(int i, Aweme aweme) {
        super.b4(i, aweme);
        C8PV.LJIILIIL(p4());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void v0(int i, Aweme aweme) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).v0(i, aweme);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void yZ(PriorityProtocol protocol, boolean z) {
        o.LJIIIZ(protocol, "protocol");
        p4().LJIILLIIL(protocol, z);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void Es(PriorityProtocol protocol, Boolean bool, InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(protocol, "protocol");
        p4().LJIIL(protocol, bool, new AqS134S0200000_3((InterfaceC88472Yns) interfaceC88472Yns, (InterfaceC88472Yns<? super View, C76800UCe>) this, (InteractBottomBannerComponent) 169));
    }
}
