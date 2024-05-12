package com.ss.android.ugc.aweme.topic.recommend.ui;

import X.C184077Kh;
import X.C184897Nl;
import X.C184907Nm;
import X.C184917Nn;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C47704Ins;
import X.C55749LuL;
import X.C57939MoZ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72808Sho;
import X.C78926UyI;
import X.C7PR;
import X.C8W0;
import X.C8YN;
import X.InterfaceC65784Pro;
import X.SYL;
import X.TBT;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.detail.prefab.DetailListAssem;
import com.ss.android.ugc.aweme.topic.book.recommend.BookRecommendItemCell;
import com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TopicRecommendListAssem extends DetailListAssem {
    public final C55749LuL LJLLLL;
    public final C214378bB LJLLLLLL;

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem
    public final void Q3() {
        SYL M3 = M3();
        M3.setListConfig(N3());
        AssemListViewModel assemListViewModel = (AssemListViewModel) this.LJLLLLLL.getValue();
        if (assemListViewModel.state == null) {
            assemListViewModel.setListState(new C72808Sho<>());
        }
        M3.LJLJLLL(((AssemListViewModel) this.LJLLLLLL.getValue()).getConfig());
        M3().setItemAnimator(null);
        C8YN.LJII(this, (AssemViewModel) this.LJLLLLLL.getValue(), new TBT() { // from class: X.7No
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C184937Np) obj).LJLILLLLZI;
            }
        }, null, new AqS185S0100000_3(this, 92), 6);
    }

    public TopicRecommendListAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        this.LJLLLL = new C55749LuL(C47704Ins.LIZJ(this, C184897Nl.class, null), checkSupervisorPrepared());
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 1083);
        C65776Prg LIZ = C65352Pkq.LIZ(TopicRecommendListVM.class);
        C184907Nm c184907Nm = C184907Nm.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS153S0100000_3((C8W0) this, 1082);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLLLLLL = new C214378bB(LIZ, aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c184907Nm, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
    }

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem
    public final C57939MoZ N3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = false;
        c57939MoZ.LJII = false;
        c57939MoZ.LIZ = 5;
        return c57939MoZ;
    }

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem
    public final AssemListViewModel P3() {
        return (AssemListViewModel) this.LJLLLLLL.getValue();
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        ((AssemViewModel) this.LJLLLLLL.getValue()).setState(C184917Nn.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailListAssem, com.ss.android.ugc.aweme.prefab.ListAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C7PR c7pr;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        O3().setVisibility(8);
        M3().setVisibility(0);
        M3().setLifecycleOwner(this);
        C184897Nl c184897Nl = (C184897Nl) this.LJLLLL.getValue();
        if (c184897Nl != null && (c7pr = c184897Nl.LJLJJI) != null && c7pr.getType() == C7PR.BOOK.getType()) {
            M3().LLLF.LJZL(BookRecommendItemCell.class);
        }
        SYL M3 = M3();
        getContext();
        M3.setLayoutManager(new LinearLayoutManager(0, false));
        M3().LJLLI();
        M3().LJLL();
    }
}
