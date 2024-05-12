package com.bytedance.jedi.arch.ext.list;

import X.AYP;
import X.AbstractC73133Sn3;
import X.AbstractC73672Svk;
import X.C221108m2;
import X.C62822Ol8;
import X.C70839Rr9;
import X.C70840RrA;
import X.C73156SnQ;
import X.C73228Soa;
import X.InterfaceC61500OBs;
import X.InterfaceC73142SnC;
import X.InterfaceC73150SnK;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.LB4;
import X.OSZ;
import X.TBZ;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ext.list.IListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import java.util.List;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS128S0300000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class ListViewModel<T, P extends C70839Rr9, S extends IListState<T, P>> extends JediViewModel<S> implements InterfaceC61500OBs {
    public final LB4 LJLJJLL = LB4.LJLIL;
    public final AYP LJLJL = AYP.LJLIL;
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS162S0100000_12((ListViewModel) this, 77));

    public InterfaceC88472Yns<S, AbstractC73672Svk<OSZ<List<T>, P>>> Iv0() {
        return null;
    }

    public abstract InterfaceC88472Yns<S, AbstractC73672Svk<OSZ<List<T>, P>>> Jv0();

    public final void LJIIJJI() {
        InterfaceC88472Yns<S, AbstractC73672Svk<OSZ<List<T>, P>>> Iv0 = Iv0();
        if (Iv0 != null) {
            InterfaceC88471Ynr<List<? extends T>, List<? extends T>, List<T>> loadMoreStrategy = Kv0();
            o.LJIIJ(loadMoreStrategy, "loadMoreStrategy");
            withState(new AqS116S0300000_12(this, Iv0, loadMoreStrategy, 23));
        }
    }

    public final void refresh() {
        InterfaceC88471Ynr<List<? extends T>, List<? extends T>, List<T>> refreshStrategy = Lv0();
        InterfaceC88472Yns<S, AbstractC73672Svk<OSZ<List<T>, P>>> refreshCall = Jv0();
        o.LJIIJ(refreshStrategy, "refreshStrategy");
        o.LJIIJ(refreshCall, "refreshCall");
        withState(new AqS116S0300000_12(this, refreshCall, refreshStrategy, 24));
    }

    public InterfaceC88471Ynr<List<? extends T>, List<? extends T>, List<T>> Kv0() {
        return this.LJLJL;
    }

    public InterfaceC88471Ynr<List<? extends T>, List<? extends T>, List<T>> Lv0() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC61500OBs
    public final void zB(int i) {
        ((AbstractC73133Sn3) this.LJLJLJ.getValue()).zB(i);
    }

    public final C70840RrA Hv0(ListState listState, List<? extends T> list) {
        boolean isEmpty = list.isEmpty();
        if (isEmpty == listState.isEmpty().LIZ) {
            return listState.isEmpty();
        }
        return new C70840RrA(isEmpty);
    }

    public static void Mv0(CommonListViewModel commonListViewModel, InterfaceC73150SnK subscriber, C73228Soa c73228Soa, InterfaceC73142SnC interfaceC73142SnC, InterfaceC73142SnC interfaceC73142SnC2, int i) {
        if ((i & 2) != 0) {
            c73228Soa = null;
        }
        if ((i & 4) != 0) {
            interfaceC73142SnC = null;
        }
        if ((i & 8) != 0) {
            interfaceC73142SnC2 = null;
        }
        commonListViewModel.getClass();
        o.LJIIJ(subscriber, "subscriber");
        if (interfaceC73142SnC != null) {
            C73156SnQ.LIZIZ(subscriber, commonListViewModel, new TBZ() { // from class: X.Sny
                @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
                public final String getName() {
                    return "refresh";
                }

                @Override // X.AbstractC74233TBl
                public final InterfaceC36731EbH getOwner() {
                    return C65352Pkq.LIZIZ(TPP.class, "ext_list_release");
                }

                @Override // X.AbstractC74233TBl
                public final String getSignature() {
                    return "getRefresh(Lcom/bytedance/jedi/arch/ext/list/IListState;)Lcom/bytedance/jedi/arch/Async;";
                }

                @Override // X.TBZ, X.TBW
                public final Object get(Object obj) {
                    NestedState refresh = (NestedState) obj;
                    o.LJIIJ(refresh, "$this$refresh");
                    return ((ListState) refresh.getSubstate()).getRefresh();
                }
            }, new AqS194S0100000_12(interfaceC73142SnC, 177), new AqS178S0100000_12(interfaceC73142SnC, 377), new AqS194S0100000_12(interfaceC73142SnC, 178), 2);
        }
        if (interfaceC73142SnC2 != null) {
            C73156SnQ.LIZIZ(subscriber, commonListViewModel, new TBZ() { // from class: X.Snz
                @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
                public final String getName() {
                    return "loadMore";
                }

                @Override // X.AbstractC74233TBl
                public final InterfaceC36731EbH getOwner() {
                    return C65352Pkq.LIZIZ(TPP.class, "ext_list_release");
                }

                @Override // X.AbstractC74233TBl
                public final String getSignature() {
                    return "getLoadMore(Lcom/bytedance/jedi/arch/ext/list/IListState;)Lcom/bytedance/jedi/arch/Async;";
                }

                @Override // X.TBZ, X.TBW
                public final Object get(Object obj) {
                    NestedState loadMore = (NestedState) obj;
                    o.LJIIJ(loadMore, "$this$loadMore");
                    return ((ListState) loadMore.getSubstate()).getLoadMore();
                }
            }, new AqS194S0100000_12(interfaceC73142SnC2, 180), new AqS178S0100000_12(interfaceC73142SnC2, 378), new AqS194S0100000_12(interfaceC73142SnC2, 182), 2);
        }
        if (c73228Soa != null) {
            C73156SnQ.LJIIIIZZ(subscriber, commonListViewModel, new TBZ() { // from class: X.So1
                @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
                public final String getName() {
                    return "list";
                }

                @Override // X.AbstractC74233TBl
                public final InterfaceC36731EbH getOwner() {
                    return C65352Pkq.LIZIZ(TPP.class, "ext_list_release");
                }

                @Override // X.AbstractC74233TBl
                public final String getSignature() {
                    return "getList(Lcom/bytedance/jedi/arch/ext/list/IListState;)Ljava/util/List;";
                }

                @Override // X.TBZ, X.TBW
                public final Object get(Object obj) {
                    NestedState list = (NestedState) obj;
                    o.LJIIJ(list, "$this$list");
                    return ((ListState) list.getSubstate()).getList();
                }
            }, new AqS128S0300000_12(c73228Soa, subscriber, (InterfaceC88472Yns) null, 7));
        }
    }
}
