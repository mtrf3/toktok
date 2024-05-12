package com.ss.android.ugc.aweme.bnpl.biz.bill.detail;

import X.C113554cx;
import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C47704Ins;
import X.C55749LuL;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C78926UyI;
import X.C8YN;
import X.C91924a2S;
import X.C92213a77;
import X.C92331a91;
import X.C92527aCB;
import X.C92648aE8;
import X.C92649aE9;
import X.C92650aEA;
import X.C92651aEB;
import X.C9BE;
import X.InterfaceC191547fS;
import X.SYL;
import X.TBT;
import Y.IDCListenerS138S0100000_31;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.IDqS445S0100000_31;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class DetailsAssem extends UIListContentAssem<DetailViewModel> implements InterfaceC191547fS {
    public C92331a91 LJLJJL;
    public final C214298b3 LJLJJLL;
    public final C55749LuL LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new IDqS422S0100000_31(this, 35));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new IDqS422S0100000_31(this, 33));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new IDqS422S0100000_31(this, 32));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new IDqS422S0100000_31(this, 31));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public DetailsAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(DetailViewModel.class);
        this.LJLJJLL = C78926UyI.LJ(this, LIZ, c9be, new IDqS422S0100000_31(LIZ, 34), C92527aCB.INSTANCE, null);
        this.LJLJL = new C55749LuL(C47704Ins.LIZJ(this, C92213a77.class, "bill_detail_arg_key"), checkSupervisorPrepared());
    }

    public final View C3() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-contentContainer>(...)");
        return (View) value;
    }

    public final C73305Spp E3() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-listEmptyView>(...)");
        return (C73305Spp) value;
    }

    public final C73305Spp F3() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: H3, reason: merged with bridge method [inline-methods] */
    public final DetailViewModel A3() {
        return (DetailViewModel) this.LJLJJLL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = false;
        c57939MoZ.LIZ = 2;
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        return c57939MoZ;
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        A3().manualListLoadMore(A3().LJLJLLL);
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        DetailViewModel A3 = A3();
        C92213a77 billDetailRouteArg = (C92213a77) this.LJLJL.getValue();
        A3.getClass();
        o.LJIIIZ(billDetailRouteArg, "billDetailRouteArg");
        A3.LJLJLJ = billDetailRouteArg.LJLILLLLZI;
        if (A3.LJLJJI) {
            A3.LJLJJI = false;
            A3.LJLJJL = System.currentTimeMillis();
            A3.manualListRefresh();
            return;
        }
        System.currentTimeMillis();
        Map<String, String> map = A3.LJLJL;
        if (map == null) {
            return;
        }
        map.put("interface_return_cost", CardStruct.IStatusCode.DEFAULT);
        map.put("source", "back");
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_statement_details_show", "bnpl_statement_details", ((C92213a77) A3.LJLIL.getValue()).LJLJI, C113554cx.LJJLIIIJLLLLLLLZ(map), 8);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        v3().LLLF.LJZL(StatementDetailCell.class);
        SYL v3 = v3();
        getContext();
        v3.setLayoutManager(new LinearLayoutManager());
        this.LJLJJL = new C92331a91(v3(), this);
        C8YN.LJIILLIIL(this, A3(), null, new IDqS445S0100000_31(this, 7), 3);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.aMs
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C93077aL3) obj).LJLLL);
            }
        }, null, C92650aEA.LJLIL, 6);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.aMt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C93077aL3) obj).LJLJJL;
            }
        }, null, C92651aEB.LJLIL, 6);
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.c3), new IDCListenerS138S0100000_31(this, 1));
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.aMu
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C93077aL3 c93077aL3 = (C93077aL3) obj;
                c93077aL3.getClass();
                return C208708Ha.LIZLLL(c93077aL3);
            }
        }, null, new IDqS418S0100000_31(this, 63), new IDqS422S0100000_31(this, 72), new IDqS418S0100000_31(this, 61), 2, null);
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.aMr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C93077aL3 c93077aL3 = (C93077aL3) obj;
                c93077aL3.getClass();
                return C208708Ha.LIZJ(c93077aL3);
            }
        }, null, new IDqS418S0100000_31(this, 62), C92648aE8.LJLIL, C92649aE9.LJLIL, 2, null);
    }
}
