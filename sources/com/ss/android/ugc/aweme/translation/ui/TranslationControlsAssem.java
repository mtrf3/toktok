package com.ss.android.ugc.aweme.translation.ui;

import X.C212428Vi;
import X.C221108m2;
import X.C26338AVi;
import X.C32151Nz;
import X.C47261Igj;
import X.C52951KqJ;
import X.C53146KtS;
import X.C53256KvE;
import X.C55096Ljo;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C7MY;
import X.C85054XZq;
import X.C86678Y0c;
import X.C8MM;
import X.C8MQ;
import X.C8PQ;
import X.C8T7;
import X.C8VR;
import X.C8W0;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC55235Lm3;
import X.InterfaceC74236TBo;
import X.O6R;
import X.TBT;
import X.Y2E;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;
import com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TranslationControlsAssem extends BaseCellSlotComponent<TranslationControlsAssem> implements ComponentPriorityProtocol {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIJ;
    public final C62822Ol8 LLFII;
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;
    public FrameLayout LLIFFJFJJ;
    public FrameLayout LLII;
    public final InterfaceC115514g7 LLIIII;
    public final TranslationControlsAssem$descExpandModeProtocol$1 LLIIIILZ;

    static {
        TBT tbt = new TBT(TranslationControlsAssem.class, "translationStatusViewModel", "getTranslationStatusViewModel()Lcom/ss/android/ugc/aweme/translation/viewmodel/TranslationStatusViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIIJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ad3;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "left_container_see_translation";
    }

    public final void q4() {
        C8YN.LJIIJ(this, (AssemViewModel) this.LLIIII.LIZ(this, LLIIIJ[0]), new TBT() { // from class: X.Y2r
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((Y24) obj).LJLIL;
            }
        }, new TBT() { // from class: X.Y2j
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((Y24) obj).LJLJI);
            }
        }, null, Y2E.LJLIL, 12);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.translation.ui.TranslationControlsAssem$descExpandModeProtocol$1] */
    public TranslationControlsAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS165S0100000_15(this, 657));
        this.LLFZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 658));
        this.LLI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 659));
        this.LLIIII = C85054XZq.LIZ(this);
        this.LLIIIILZ = new DescExpandModeProtocol() { // from class: com.ss.android.ugc.aweme.translation.ui.TranslationControlsAssem$descExpandModeProtocol$1
            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void I() {
            }

            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void LLILLJJLI() {
                TranslationControlsAssem translationControlsAssem = TranslationControlsAssem.this;
                if (translationControlsAssem.LLFFF == 0) {
                    translationControlsAssem.Y3().setVisibility(0);
                }
            }
        };
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        if (!C53256KvE.LIZ()) {
            q4();
        }
    }

    public final InterfaceC55235Lm3 getVScope() {
        if (C53146KtS.LIZ()) {
            return (InterfaceC55235Lm3) this.LLFII.getValue();
        }
        return C55096Ljo.LJIIZILJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C62814Ol0.LJJIIJZLJL(getVScope(), DescExpandModeProtocol.class, C47261Igj.LJJIJIL(this.LLIIIILZ));
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams videoItemParams) {
        InteractAreaCommonAbility interactAreaCommonAbility;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        TranslationAbility translationAbility = (TranslationAbility) this.LLI.getValue();
        if (translationAbility != null && translationAbility.pa0() && C86678Y0c.LIZJ(item.getAweme()) && (interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLFZ.getValue()) != null) {
            interactAreaCommonAbility.U00(this, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void N3(View view) {
        ViewGroup.LayoutParams layoutParams;
        int i;
        o.LJIIIZ(view, "view");
        if (C52951KqJ.LIZ()) {
            View containerView = getContainerView();
            ViewGroup.LayoutParams layoutParams2 = getContainerView().getLayoutParams();
            if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams2 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (marginLayoutParams != null) {
                i = marginLayoutParams.bottomMargin;
            } else {
                i = 0;
            }
            C26338AVi.LJI(containerView, null, null, null, Integer.valueOf(i - O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), false, 23);
            FrameLayout frameLayout = this.LLIFFJFJJ;
            if (frameLayout != null) {
                C26338AVi.LJI(frameLayout, null, null, null, 0, false, 23);
            }
            FrameLayout frameLayout2 = this.LLII;
            if (frameLayout2 != null) {
                C26338AVi.LJI(frameLayout2, null, null, null, 0, false, 23);
                return;
            }
            return;
        }
        if (!C8PQ.LIZ() || (layoutParams = Y3().getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = C7MY.LIZIZ(17);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        c8mm.LIZ("event_component_clickable", new AqS178S0100000_12(this, 298));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Y3().setVisibility(0);
        this.LLIFFJFJJ = (FrameLayout) Y3().findViewById(R.id.lk9);
        this.LLII = (FrameLayout) Y3().findViewById(R.id.ci_);
        C8VR.LIZ(this, new AqS181S0100000_15(this, 158));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
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
    }
}
