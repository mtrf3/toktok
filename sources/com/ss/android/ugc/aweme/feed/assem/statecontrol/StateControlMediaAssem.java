package com.ss.android.ugc.aweme.feed.assem.statecontrol;

import X.C214348b8;
import X.C221108m2;
import X.C242489fQ;
import X.C51029K0z;
import X.C54838Lfe;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8T7;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.IDqS451S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class StateControlMediaAssem extends BaseCellSlotComponent<StateControlMediaAssem> implements ComponentPriorityProtocol {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLI;
    public final C62822Ol8 LLFII;
    public final InterfaceC115514g7 LLFZ;

    static {
        TBT tbt = new TBT(StateControlMediaAssem.class, "scmLabelVM", "getScmLabelVM()Lcom/ss/android/ugc/aweme/feed/assem/statecontrol/StateControlMediaVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aby;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "left_container_scm";
    }

    public StateControlMediaAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS154S0100000_4(this, 334));
        C65776Prg LIZ = C65352Pkq.LIZ(StateControlMediaVM.class);
        this.LLFZ = C214348b8.LIZ(this, LIZ, null, new AqS154S0100000_4(LIZ, 335), null, C242489fQ.INSTANCE, null, null);
    }

    public final String getEnterFrom() {
        if (((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().isPhotoMode()) {
            return "photo_mode";
        }
        if (C54838Lfe.LJIIZILJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme()) || C54838Lfe.LJJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
            return "user_story";
        }
        return "for_you_feed";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        StateControlMediaVM stateControlMediaVM = (StateControlMediaVM) this.LLFZ.LIZ(this, LLI[0]);
        stateControlMediaVM.getClass();
        if (item.getAweme() == null) {
            return;
        }
        stateControlMediaVM.setState(new AqS138S0200000_7(item, stateControlMediaVM, 63));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8YN.LJIIJJI(this, (AssemViewModel) this.LLFZ.LIZ(this, LLI[0]), new TBT() { // from class: X.9fR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C242529fU) obj).LJLIL);
            }
        }, new TBT() { // from class: X.9fS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C242529fU) obj).LJLILLLLZI;
            }
        }, new TBT() { // from class: X.9fT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C242529fU) obj).LJLJI;
            }
        }, null, new IDqS451S0100000_4(view, 1), 24);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLFII.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.U00(this, null, Boolean.TRUE);
        }
    }
}
