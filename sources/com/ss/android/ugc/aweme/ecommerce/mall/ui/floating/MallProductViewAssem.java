package com.ss.android.ugc.aweme.ecommerce.mall.ui.floating;

import X.C214298b3;
import X.C47704Ins;
import X.C55534Lqs;
import X.C55536Lqu;
import X.C55749LuL;
import X.C55796Lv6;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.InterfaceC55798Lv8;
import X.TBT;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MallProductViewAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public RecyclerView LJLILLLLZI;
    public C55796Lv6 LJLJI;
    public LinearLayoutManager LJLJJI;
    public InterfaceC55798Lv8 LJLJJL;
    public final C55749LuL LJLJJLL;

    public MallProductViewAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MallProductViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 135), C55536Lqu.INSTANCE, null);
        this.LJLJJLL = new C55749LuL(C47704Ins.LIZJ(this, C55534Lqs.class, "RacunFragmentHierarchyData"), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LJLJJL = ((C55534Lqs) this.LJLJJLL.getValue()).LJLIL;
        this.LJLILLLLZI = (RecyclerView) getContainerView().findViewById(R.id.gcq);
        C55796Lv6 c55796Lv6 = new C55796Lv6(this.LJLJJL);
        this.LJLJI = c55796Lv6;
        RecyclerView recyclerView = this.LJLILLLLZI;
        if (recyclerView != null) {
            recyclerView.setAdapter(c55796Lv6);
        }
        C55796Lv6 c55796Lv62 = this.LJLJI;
        if (c55796Lv62 != null) {
            c55796Lv62.setShowFooter(false);
        }
        getContainerView().getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.LJLJJI = linearLayoutManager;
        linearLayoutManager.LLJJIII(0);
        RecyclerView recyclerView2 = this.LJLILLLLZI;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(this.LJLJJI);
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.LnD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C55305LnB) obj).LJLIL;
            }
        }, null, new AqS191S0100000_9(this, 116), 6);
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.LnC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C55305LnB) obj).LJLILLLLZI);
            }
        }, null, new AqS191S0100000_9(this, 117), 6);
    }
}
