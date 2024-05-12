package X;

import X.C73201So9;
import X.InterfaceC98243tM;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import java.util.Arrays;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS174S0200000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Snp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73181Snp<T, DEC extends C73201So9<T>, RECEIVER extends InterfaceC98243tM> extends AbstractC73151SnL<T, DEC, RECEIVER, C73181Snp<T, DEC, RECEIVER>> {
    public ListViewModel<T, ?, ?> LJIIJ;
    public final AqS162S0100000_12 LJIIJJI;

    public final void LIZ(RecyclerView recyclerView) {
        ListViewModel<T, ?, ?> listViewModel = this.LJIIJ;
        if (listViewModel != null) {
            InterfaceC73150SnK<RECEIVER> interfaceC73150SnK = this.LJIIIZ;
            C73156SnQ.LJIIIIZZ(interfaceC73150SnK, listViewModel, new TBZ() { // from class: X.Snv
                @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
                public final String getName() {
                    return "hasMore";
                }

                @Override // X.AbstractC74233TBl
                public final InterfaceC36731EbH getOwner() {
                    return C65352Pkq.LIZIZ(TPP.class, "ext_adapter_release");
                }

                @Override // X.AbstractC74233TBl
                public final String getSignature() {
                    return "getHasMore(Lcom/bytedance/jedi/arch/ext/list/IListState;)Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;";
                }

                @Override // X.TBZ, X.TBW
                public final Object get(Object obj) {
                    NestedState hasMore = (NestedState) obj;
                    o.LJIIJ(hasMore, "$this$hasMore");
                    return ((ListState) hasMore.getSubstate()).getHasMore();
                }
            }, new AqS194S0100000_12(this, 198));
            C73156SnQ.LJIIIIZZ(interfaceC73150SnK, listViewModel, new TBZ() { // from class: X.Snw
                @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
                public final String getName() {
                    return "isEmpty";
                }

                @Override // X.AbstractC74233TBl
                public final InterfaceC36731EbH getOwner() {
                    return C65352Pkq.LIZIZ(TPP.class, "ext_adapter_release");
                }

                @Override // X.AbstractC74233TBl
                public final String getSignature() {
                    return "isEmpty(Lcom/bytedance/jedi/arch/ext/list/IListState;)Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;";
                }

                @Override // X.TBZ, X.TBW
                public final Object get(Object obj) {
                    NestedState isEmpty = (NestedState) obj;
                    o.LJIIJ(isEmpty, "$this$isEmpty");
                    return ((ListState) isEmpty.getSubstate()).isEmpty();
                }
            }, new AqS194S0100000_12(this, 193));
            C73156SnQ.LIZIZ(interfaceC73150SnK, listViewModel, new TBZ() { // from class: X.Snx
                @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
                public final String getName() {
                    return "refresh";
                }

                @Override // X.AbstractC74233TBl
                public final InterfaceC36731EbH getOwner() {
                    return C65352Pkq.LIZIZ(TPP.class, "ext_adapter_release");
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
            }, new AqS174S0200000_12(this, listViewModel, 19), new AqS178S0100000_12((C73181Snp) this, 421), new AqS194S0100000_12(this, 194), 2);
            C73156SnQ.LIZIZ(interfaceC73150SnK, listViewModel, new TBZ() { // from class: X.So0
                @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
                public final String getName() {
                    return "loadMore";
                }

                @Override // X.AbstractC74233TBl
                public final InterfaceC36731EbH getOwner() {
                    return C65352Pkq.LIZIZ(TPP.class, "ext_adapter_release");
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
            }, new AqS194S0100000_12(this, 195), new AqS178S0100000_12((C73181Snp) this, 424), new AqS194S0100000_12(this, 196), 2);
            C73156SnQ.LJIIIIZZ(interfaceC73150SnK, listViewModel, new TBZ() { // from class: X.So2
                @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
                public final String getName() {
                    return "list";
                }

                @Override // X.AbstractC74233TBl
                public final InterfaceC36731EbH getOwner() {
                    return C65352Pkq.LIZIZ(TPP.class, "ext_adapter_release");
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
            }, new AqS194S0100000_12(this, 197));
            DEC dec = this.LJIIIIZZ;
            dec.LJZL(this.LIZ);
            int[] iArr = this.LIZJ;
            int[] strategy = Arrays.copyOf(iArr, iArr.length);
            o.LJIIJ(strategy, "strategy");
            int i = dec.LJLJJL.LJII;
            if (strategy.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i2 = strategy[0];
            int length = strategy.length - 1;
            if (1 <= length) {
                int i3 = 1;
                while (true) {
                    i2 |= strategy[i3];
                    if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            if (i != i2) {
                C73183Snr c73183Snr = dec.LJLJJL;
                c73183Snr.LJII = i2;
                if (dec.LJLJL.LJLIL != null && c73183Snr.isEnable()) {
                    dec.LJLJJL.LJFF();
                    dec.notifyDataSetChanged();
                }
            }
            if (this.LIZ != 241) {
                ListViewModel<T, ?, ?> listViewModel2 = this.LJIIJ;
                if (listViewModel2 != null) {
                    AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12((ListViewModel) listViewModel2, 1073);
                    C73182Snq c73182Snq = dec.LJLJJI;
                    c73182Snq.LJIIJ = aqS162S0100000_12;
                    if (c73182Snq.LJIIIIZZ == 241) {
                        dec.LJZL(242);
                    }
                }
                InterfaceC88471Ynr interfaceC88471Ynr = this.LIZIZ;
                if (interfaceC88471Ynr == null) {
                    if (this.LIZ == 242) {
                        interfaceC88471Ynr = C73178Snm.LJLIL;
                    } else {
                        interfaceC88471Ynr = C73180Sno.LJLIL;
                    }
                }
                AqS143S0200000_12 aqS143S0200000_12 = new AqS143S0200000_12(interfaceC88471Ynr, this, 91);
                C73182Snq c73182Snq2 = dec.LJLJJI;
                InterfaceC88472Yns<? super ViewGroup, ? extends InterfaceC73206SoE> interfaceC88472Yns = c73182Snq2.LJ;
                if (interfaceC88472Yns == null || interfaceC88472Yns != aqS143S0200000_12) {
                    c73182Snq2.LJ = aqS143S0200000_12;
                    if (dec.LJLJL.LJLIL != null && c73182Snq2.isEnable()) {
                        dec.LJLJJI.LJFF();
                        dec.notifyItemRemoved(dec.LJLLLLLL() + dec.LJLZ() + dec.LJZ());
                        dec.notifyItemInserted(dec.LJLLLLLL() + dec.LJLZ() + dec.LJZ());
                        C73182Snq c73182Snq3 = dec.LJLJJI;
                        int i4 = c73182Snq3.LJII;
                        InterfaceC73206SoE interfaceC73206SoE = c73182Snq3.LJI;
                        if (interfaceC73206SoE != null) {
                            interfaceC73206SoE.LIZIZ(i4);
                        }
                    }
                }
            }
            if (ORY.LJJIJ(1, this.LIZJ)) {
                AqS178S0100000_12 aqS178S0100000_12 = new AqS178S0100000_12((C73181Snp) this, 423);
                C73183Snr c73183Snr2 = dec.LJLJJL;
                InterfaceC88472Yns<? super ViewGroup, ? extends InterfaceC73205SoD> interfaceC88472Yns2 = c73183Snr2.LJ;
                if (interfaceC88472Yns2 == null || interfaceC88472Yns2 != aqS178S0100000_12) {
                    c73183Snr2.LJ = aqS178S0100000_12;
                    if (dec.LJLJL.LJLIL != null && c73183Snr2.isEnable()) {
                        dec.LJLJJL.LJFF();
                        dec.notifyDataSetChanged();
                    }
                }
            }
            recyclerView.setAdapter(dec);
            return;
        }
        "realAdapter does not provide viewModel, please specify one".toString();
        throw new IllegalArgumentException("realAdapter does not provide viewModel, please specify one");
    }

    public C73181Snp(SQT sqt, C73201So9 c73201So9, InterfaceC73150SnK interfaceC73150SnK) {
        super(sqt, c73201So9, interfaceC73150SnK);
        this.LJIIJJI = new AqS162S0100000_12(this, 1070);
    }
}
