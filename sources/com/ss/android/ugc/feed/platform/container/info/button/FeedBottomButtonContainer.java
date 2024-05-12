package com.ss.android.ugc.feed.platform.container.info.button;

import X.C210638Ol;
import X.C210688Oq;
import X.C210698Or;
import X.C210728Ou;
import X.C210888Pk;
import X.C212428Vi;
import X.C214348b8;
import X.C218518hr;
import X.C221108m2;
import X.C241249dQ;
import X.C2K0;
import X.C2L4;
import X.C2S4;
import X.C51029K0z;
import X.C53326KwM;
import X.C55096Ljo;
import X.C5H3;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C76965UIn;
import X.C78926UyI;
import X.C8MQ;
import X.C8ON;
import X.C8PV;
import X.C8PX;
import X.C8QI;
import X.C8T7;
import X.C8W0;
import X.EnumC210578Of;
import X.EnumC210828Pe;
import X.InterfaceC115514g7;
import X.InterfaceC55102Lju;
import X.InterfaceC74236TBo;
import X.InterfaceC88472Yns;
import X.TBT;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.feed.adapter.FeedBottomButtonContainerScope;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedBottomButtonContainer extends BaseContainer implements PriorityAbility, FeedBottomButtonAbility, ComponentPriorityProtocol, InterfaceC55102Lju, C2L4 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIJ;
    public final InterfaceC115514g7 LLFFF;
    public final C62822Ol8 LLFII;
    public final C5H3 LLFZ;
    public final Set<String> LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final EnumC210578Of LLII;
    public final AtomicBoolean LLIIII;
    public boolean LLIIIILZ;

    static {
        TBT tbt = new TBT(FeedBottomButtonContainer.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIIJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return C210888Pk.LIZJ(C210888Pk.LIZLLL(a1()), rp0().eventType, p4().LJIIIZ(EnumC210828Pe.BOTTOM_BUTTON));
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        int hashCode = str.hashCode();
        if (hashCode == 229016414 || hashCode == 1244115485) {
            return this;
        }
        return null;
    }

    public FeedBottomButtonContainer() {
        new LinkedHashMap();
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ConstraintSizeVM.class);
        this.LLFFF = C214348b8.LIZ(this, LIZ, c241249dQ, new AqS153S0100000_3(LIZ, 1322), null, C210638Ol.INSTANCE, null, null);
        this.LLFII = C221108m2.LIZIZ(C210698Or.LJLIL);
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C210688Oq.INSTANCE);
        this.LLI = C2S4.LIZIZ;
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1321));
        this.LLII = EnumC210578Of.FEED_BOTTOM_BTN_CONTAINER;
        this.LLIIII = new AtomicBoolean(false);
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(FeedBottomButtonContainerScope.class);
    }

    public final View n4() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Context context = getContainerView().getContext();
        o.LJIIIIZZ(context, "containerView.context");
        C218518hr c218518hr = new C218518hr(context, null);
        c218518hr.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        c218518hr.setId(R.id.bpj);
        this.LLFFF.LIZ(this, LLIIIJ[0]).getClass();
        ViewGroup.LayoutParams layoutParams = c218518hr.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            int LIZIZ = C8ON.LIZIZ();
            int marginStart = marginLayoutParams.getMarginStart();
            int i = marginLayoutParams.topMargin;
            int marginEnd = marginLayoutParams.getMarginEnd();
            marginLayoutParams.setMarginStart(marginStart);
            marginLayoutParams.topMargin = i;
            marginLayoutParams.setMarginEnd(marginEnd);
            marginLayoutParams.bottomMargin = LIZIZ;
        }
        return c218518hr;
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

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final String LQ() {
        return p4().LJI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void Od0() {
        List LJIJ = C62814Ol0.LJIJ(C55096Ljo.LJIIZILJ(this), PriorityProtocol.class);
        if (LJIJ != null) {
            Iterator it = ((ArrayList) LJIJ).iterator();
            while (it.hasNext()) {
                PriorityProtocol priorityProtocol = (PriorityProtocol) it.next();
                VideoItemParams videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL(this);
                if (o.LJ("bottom_button_share_info", priorityProtocol.y2())) {
                    if (priorityProtocol instanceof BaseCellSlotComponent) {
                        ((BaseCellSlotComponent) priorityProtocol).q4(videoItemParams);
                    } else if (priorityProtocol instanceof BaseCellContentComponent) {
                        if (priorityProtocol instanceof BaseCellTriggerComponent) {
                            ((ReusedAssem) priorityProtocol).LJLIL = c2(videoItemParams);
                        }
                        ((BaseCellContentComponent) priorityProtocol).q4(videoItemParams);
                    }
                }
            }
        }
        p4().LJIIJJI();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        String o0 = o0();
        if (o0 != null && o0.length() != 0) {
            PriorityProtocol priorityProtocol = (PriorityProtocol) ((LinkedHashMap) p4().LJIIIZ(EnumC210828Pe.BOTTOM_BUTTON)).get(o0());
            if (priorityProtocol != null) {
                return priorityProtocol.LJLILLLLZI();
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onCreateView() {
        super.onCreateView();
        if (this.LLIIII.compareAndSet(false, true)) {
            p4().LIZ((ViewGroup) getContainerView(), new C8PX() { // from class: X.8Oo
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
                    if (C53326KwM.LIZ() || ((Boolean) C210728Ou.LIZ.getValue()).booleanValue()) {
                        return FeedBottomButtonContainer.this.LLI;
                    }
                    return OQY.INSTANCE;
                }

                @Override // X.C8PX
                public final LifecycleOwner getLifecycleOwner() {
                    return FeedBottomButtonContainer.this;
                }

                {
                    this.LIZ = C221108m2.LIZIZ(new AqS153S0100000_3(FeedBottomButtonContainer.this, 1616));
                }
            });
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonAbility
    public final List<String> pd0() {
        return p4().LIZLLL();
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final EnumC210578Of c4() {
        return this.LLII;
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* renamed from: Z3 */
    public final boolean c2(VideoItemParams item) {
        Set<String> set;
        o.LJIIIZ(item, "item");
        if ((C53326KwM.LIZ() || ((Boolean) C210728Ou.LIZ.getValue()).booleanValue()) && ((set = this.LLI) == null || set.isEmpty())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(Object obj) {
        return c2((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        getContainerView().post(new ARunnableS39S0100000_3(this, 124));
        synchronized (this) {
            if (!this.LLIIIILZ) {
                BottomButtonPriorityConfig.LIZ(this);
                C78926UyI.LJFF(this, new AqS134S0200000_3(C62814Ol0.LJIJ(C55096Ljo.LJIIZILJ(this), PriorityProtocol.class), (List<? extends PriorityProtocol>) this, (FeedBottomButtonContainer) 263));
                this.LLIIIILZ = true;
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonAbility
    public final void th0(boolean z) {
        InteractAreaCommonAbility interactAreaCommonAbility;
        String o0 = o0();
        if (o.LJ(o0, "bottom_button_story_message") && C8QI.LIZIZ.contains(o0) && (interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLIFFJFJJ.getValue()) != null) {
            interactAreaCommonAbility.zn(o0, this, z);
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
        if (!TextUtils.isEmpty(o0()) && (interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLIFFJFJJ.getValue()) != null) {
            interactAreaCommonAbility.U00(this, new AqS185S0100000_3(this, 128), Boolean.TRUE);
        }
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
        p4().LJIIL(protocol, bool, new AqS134S0200000_3((InterfaceC88472Yns) interfaceC88472Yns, (InterfaceC88472Yns<? super View, C76800UCe>) this, (FeedBottomButtonContainer) 177));
    }
}
