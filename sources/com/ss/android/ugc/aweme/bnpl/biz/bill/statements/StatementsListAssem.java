package com.ss.android.ugc.aweme.bnpl.biz.bill.statements;

import X.C113554cx;
import X.C214298b3;
import X.C221108m2;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C78926UyI;
import X.C80896Voy;
import X.C91834a10;
import X.C91924a2S;
import X.C91931a2Z;
import X.C92260a7s;
import X.C92568aCq;
import X.C9BE;
import X.EnumC92259a7r;
import X.SYL;
import X.TBT;
import X.X1D;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class StatementsListAssem extends UIListContentAssem<StatementsViewModel> {
    public final C62822Ol8 LJLILLLLZI;
    public final C214298b3 LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new IDqS422S0100000_31(this, 50));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJJI;
        Integer valueOf = Integer.valueOf(R.id.itq);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(R.id.itq)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public StatementsListAssem() {
        C221108m2.LIZIZ(new IDqS422S0100000_31(this, 46));
        this.LJLILLLLZI = C221108m2.LIZIZ(new IDqS422S0100000_31(this, 47));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StatementsViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9be, new IDqS422S0100000_31(LIZ, 49), C92568aCq.INSTANCE, null);
    }

    public final C73305Spp C3() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: E3, reason: merged with bridge method [inline-methods] */
    public final StatementsViewModel A3() {
        return (StatementsViewModel) this.LJLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = false;
        c57939MoZ.LIZ = 2;
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        c57939MoZ.LJII = false;
        return c57939MoZ;
    }

    @Override // X.C8W0
    public final void onResume() {
        String str;
        super.onResume();
        StatementsViewModel A3 = A3();
        A3.getClass();
        EnumC92259a7r paidStatus = A3.hv0();
        o.LJIIIZ(paidStatus, "paidStatus");
        if (paidStatus == EnumC92259a7r.PAID) {
            str = "paid";
        } else {
            str = "unpaid";
        }
        C91834a10.LIZ = str;
        StatementsViewModel A32 = A3();
        if (A32.LJLJJI) {
            A32.LJLJJI = false;
            A32.LJLJJL = System.currentTimeMillis();
            A32.manualListRefresh();
        } else {
            C91834a10.LIZIZ = System.currentTimeMillis();
            Map<String, String> map = A32.LJLJL;
            if (map != null) {
                map.put("interface_return_cost", CardStruct.IStatusCode.DEFAULT);
                map.put("timestamp", String.valueOf(C91834a10.LIZIZ));
                map.put("source", "back");
                C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_all_statements_show", "bnpl_all_statements", ((C92260a7s) A32.LJLIL.getValue()).LJLILLLLZI, C113554cx.LJJLIIIJLLLLLLLZ(map), 8);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(StatementsListAssem.class);
        LIZ.append(",  ");
        LIZ.append(this);
        LIZ.append(", resume");
        C91931a2Z.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        v3().LLLF.LJZL(StatementsCellBill.class, StatementsCellBillPaid.class, StatementsCellLineDivider.class, StatementsCellGroupHeader.class);
        getContext();
        v3().setLayoutManager(new LinearLayoutManager());
        ((C80896Voy) _$_findCachedViewById(R.id.itq)).setOnRefreshListener(new IDqS422S0100000_31(this, 48));
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.aN6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C93131aLv c93131aLv = (C93131aLv) obj;
                c93131aLv.getClass();
                return C208708Ha.LIZLLL(c93131aLv);
            }
        }, null, new IDqS418S0100000_31(this, 87), new IDqS422S0100000_31(this, 101), new IDqS418S0100000_31(this, 88), 2, null);
    }
}
