package com.ss.android.ugc.aweme.feed.assem.tikbot;

import X.C16880lQ;
import X.C214348b8;
import X.C221108m2;
import X.C36636EZk;
import X.C48841JEv;
import X.C5H3;
import X.C62822Ol8;
import X.C64962gm;
import X.C65352Pkq;
import X.C8S5;
import X.C8S7;
import X.C8S8;
import X.C8SB;
import X.C8T7;
import X.C8YN;
import X.TBT;
import X.XKX;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TakoAssem extends BaseCellSlotComponent<TakoAssem> implements ComponentPriorityProtocol {
    public final C5H3 LLFII;
    public final C62822Ol8 LLFZ;
    public View LLI;
    public SmartImageView LLIFFJFJJ;
    public Boolean LLII;
    public final C62822Ol8 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final C64962gm LLIIIJ;
    public boolean LLIIIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ad2;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "right_container_chat_gpt";
    }

    public TakoAssem() {
        new LinkedHashMap();
        this.LLFII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C8S7.INSTANCE);
        this.LLFZ = C221108m2.LIZIZ(C8S8.LJLIL);
        this.LLIIII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 381));
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 380));
        this.LLIIIJ = C48841JEv.LIZ(C36636EZk.LIZ);
    }

    public final ISearchService r4() {
        return (ISearchService) this.LLFZ.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLIIIILZ.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.U00(this, null, Boolean.TRUE);
        }
        XKX.LIZLLL(this.LLIIIJ, C36636EZk.LIZ, null, new C8SB(this, null), 2);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LLIFFJFJJ = (SmartImageView) view.findViewById(R.id.l7e);
        View findViewById = view.findViewById(R.id.l7f);
        this.LLI = findViewById;
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 73), findViewById);
        }
        C8YN.LJII(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.8S6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, C8S5.LJLIL, 6);
    }

    public final void q4(boolean z) {
        int i;
        View containerView = getContainerView();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        containerView.setVisibility(i);
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLIIIILZ.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.zn("right_container_chat_gpt", this, z);
        }
    }
}
