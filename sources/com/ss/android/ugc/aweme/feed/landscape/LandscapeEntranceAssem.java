package com.ss.android.ugc.aweme.feed.landscape;

import X.C16880lQ;
import X.C214348b8;
import X.C215588d8;
import X.C217408g4;
import X.C217418g5;
import X.C217428g6;
import X.C217438g7;
import X.C217448g8;
import X.C217498gD;
import X.C221108m2;
import X.C32151Nz;
import X.C51029K0z;
import X.C54840Lfg;
import X.C55096Ljo;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C79004UzY;
import X.C8T7;
import X.C8YN;
import X.EnumC215578d7;
import X.EnumC215618dB;
import X.InterfaceC217378g1;
import X.O6R;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LandscapeEntranceAssem extends BaseCellSlotComponent<LandscapeEntranceAssem> implements InterfaceC217378g1, ComponentPriorityProtocol {
    public final C62822Ol8 LLFII;
    public final C5H3 LLFZ;
    public boolean LLI;
    public View LLIFFJFJJ;
    public View LLII;

    @Override // X.InterfaceC217378g1
    public final boolean LLII() {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.afc;
    }

    @Override // X.InterfaceC217378g1
    public final void b2() {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "top_bottom_container_landscape_entrance";
    }

    public LandscapeEntranceAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 399));
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C217498gD.INSTANCE);
    }

    @Override // X.InterfaceC217378g1
    public final boolean F1() {
        return C79004UzY.LJJIJIIJIL(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme());
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // X.InterfaceC217378g1
    public final EnumC215618dB getPriority() {
        return EnumC215618dB.FULLSCREEN;
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        LandscapeEntrancesControlAbility landscapeEntrancesControlAbility = (LandscapeEntrancesControlAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), LandscapeEntrancesControlAbility.class, null);
        if (landscapeEntrancesControlAbility != null) {
            landscapeEntrancesControlAbility.XQ(this);
        }
    }

    @Override // X.InterfaceC217378g1
    public final void LLJIJIL(EnumC215578d7 showType) {
        InteractAreaCommonAbility interactAreaCommonAbility;
        o.LJIIIZ(showType, "showType");
        int i = C215588d8.LIZ[showType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    getContainerView().setVisibility(0);
                    View view = this.LLIFFJFJJ;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    View view2 = this.LLII;
                    if (view2 != null) {
                        C54840Lfg.LJLIIL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), view2);
                    }
                }
            } else {
                getContainerView().setVisibility(0);
                View view3 = this.LLIFFJFJJ;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                View view4 = this.LLII;
                if (view4 != null) {
                    C54840Lfg.LJLIIL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), view4);
                }
            }
        } else {
            getContainerView().setVisibility(8);
        }
        if (showType != EnumC215578d7.HIDE && (interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLFII.getValue()) != null) {
            interactAreaCommonAbility.U00(this, null, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLIFFJFJJ = view.findViewById(R.id.dpu);
        View findViewById = view.findViewById(R.id.dpt);
        this.LLII = findViewById;
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 81), findViewById);
        }
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.8eX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LLD;
            }
        }, null, C217428g6.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.8gA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, C217408g4.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.8gB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJLJ;
            }
        }, null, C217418g5.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.8gC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJL;
            }
        }, null, C217448g8.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.8g9
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, null, C217438g7.LJLIL, 6);
    }
}
