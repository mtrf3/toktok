package com.ss.android.ugc.aweme.nows.feed.ui;

import X.AnonymousClass852;
import X.C107794Kx;
import X.C185117Oh;
import X.C194607kO;
import X.C195107lC;
import X.C195117lD;
import X.C195237lP;
import X.C200997uh;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C47704Ins;
import X.C55749LuL;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72808Sho;
import X.C73305Spp;
import X.C73J;
import X.C77266UUc;
import X.C78926UyI;
import X.C7NZ;
import X.C85M;
import X.C8YN;
import X.InterfaceC57784Mm4;
import X.QD3;
import X.SYL;
import X.TBT;
import X.X1D;
import Y.AObserverS71S0100000_3;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.nows.feed.common.NowPostImagePowerCell;
import com.ss.android.ugc.aweme.nows.feed.common.NowPostVideoPowerCell;
import com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionContainerCell;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowDistributionListViewModel;
import com.ss.android.ugc.aweme.nows.limit.ui.NowSingleOneExplainCell;
import com.ss.android.ugc.aweme.nows.widget.guide.NowWidgetGuideCell;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowDistributionFeedListAssem extends NowBaseListAssem {
    public final C62822Ol8 LJLJJLL;
    public final String LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C55749LuL LJLJLLL;
    public final C214298b3 LJLL;

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.NowBaseListAssem
    public final void F3() {
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.NowBaseListAssem
    public final Class<? extends PowerCell<?>>[] I3() {
        return new Class[]{NowPostImagePowerCell.class, NowPostVideoPowerCell.class, NowOtherCollectionContainerCell.class, NowSingleOneExplainCell.class, NowWidgetGuideCell.class};
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.common.INowListFragmentPanel
    public final String Zn0() {
        return null;
    }

    public NowDistributionFeedListAssem() {
        new LinkedHashMap();
        this.LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 591));
        this.LJLJL = "NowDistrList";
        this.LJLJLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 592));
        this.LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, C73J.class, null), checkSupervisorPrepared());
        C195117lD c195117lD = C195117lD.LJLIL;
        C65776Prg LIZ = C65352Pkq.LIZ(NowDistributionListViewModel.class);
        this.LJLL = new C214298b3(c195117lD, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C195107lC.INSTANCE, LIZ);
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.NowBaseListAssem
    public final C73305Spp E3() {
        return (C73305Spp) this.LJLJLJ.getValue();
    }

    public final NowDistributionListViewModel K3() {
        return (NowDistributionListViewModel) this.LJLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.NowBaseListAssem
    public final SYL x3() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.NowBaseListAssem, com.ss.android.ugc.aweme.nows.ability.NowListAbility
    public final boolean pt0() {
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            return LIZLLL.getUserVisibleHint();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.NowBaseListAssem
    public final NowDistributionListViewModel v3() {
        return K3();
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.NowBaseListAssem
    public final String A3() {
        return this.LJLJL;
    }

    @QD3
    public final void onEvent(C107794Kx event) {
        o.LJIIIZ(event, "event");
        C200997uh.LIZIZ(event, C212428Vi.LIZ(this));
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.NowBaseListAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        SYL x3 = x3();
        K3().getClass();
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZ = 3;
        c57939MoZ.LIZIZ = true;
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        c57939MoZ.LJI = "now_distribution_list";
        x3.setListConfig(c57939MoZ);
        x3().LJLJLLL(K3().getConfig());
        NowDistributionListViewModel K3 = K3();
        C72808Sho<InterfaceC57784Mm4> state = x3().getState();
        o.LJIIIIZZ(state, "list.state");
        K3.setListState(state);
        C73305Spp E3 = E3();
        if (E3 != null) {
            E3.LJFF();
        }
        C73305Spp E32 = E3();
        if (E32 != null) {
            E32.setVisibility(0);
        }
        List<String> list = ((C73J) this.LJLJLLL.getValue()).LJLIL;
        if (list != null && !list.isEmpty()) {
            NowDistributionListViewModel K32 = K3();
            List<String> list2 = ((C73J) this.LJLJLLL.getValue()).LJLIL;
            K32.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("bind insert user ids: ");
            if (list2 != null) {
                str = (String) ListProtector.get(list2, 0);
            } else {
                str = null;
            }
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
            K32.setStateImmediate(new AqS169S0100000_3(list2, (List<AnonymousClass852<C85M>>) 34));
        }
        C77266UUc.LIZIZ.getRelationService().LJFF().observe(this, new AObserverS71S0100000_3(this, 26));
        C8YN.LJII(this, K3(), new TBT() { // from class: X.7lB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C194847km c194847km = (C194847km) obj;
                c194847km.getClass();
                return C208708Ha.LIZ(c194847km);
            }
        }, null, new AqS185S0100000_3(this, 58), 6);
        C8YN.LJII(this, K3(), new TBT() { // from class: X.7kr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C194847km) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), C194607kO.LJLIL, 4);
        AssemViewModel.asyncSubscribe$default(K3(), new TBT() { // from class: X.7lA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C194847km c194847km = (C194847km) obj;
                c194847km.getClass();
                return C208708Ha.LIZLLL(c194847km);
            }
        }, null, new AqS169S0100000_3(this, 310), null, new AqS169S0100000_3(this, 311), 10, null);
        C8YN.LJII(this, K3(), new TBT() { // from class: X.7kt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C194847km) obj).LJLJJI;
            }
        }, C213688a4.LIZLLL(), C7NZ.LJLIL, 4);
        AssemViewModel.asyncSubscribe$default(K3(), new TBT() { // from class: X.7l9
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C194847km c194847km = (C194847km) obj;
                c194847km.getClass();
                return C208708Ha.LIZJ(c194847km);
            }
        }, null, new AqS169S0100000_3(this, 306), null, new AqS169S0100000_3(this, 307), 10, null);
        C195237lP.LIZ(this, C185117Oh.LIZIZ, new AqS169S0100000_3(this, 308));
        C195237lP.LIZ(this, C185117Oh.LIZJ, new AqS169S0100000_3(this, 309));
        C200997uh.LIZ(C212428Vi.LIZ(this), C212428Vi.LIZLLL(this));
    }
}
