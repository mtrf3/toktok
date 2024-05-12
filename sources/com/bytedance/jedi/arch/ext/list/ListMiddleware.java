package com.bytedance.jedi.arch.ext.list;

import X.AYP;
import X.AbstractC73133Sn3;
import X.AbstractC73672Svk;
import X.C221108m2;
import X.C62822Ol8;
import X.C70839Rr9;
import X.C70840RrA;
import X.C73139Sn9;
import X.C76800UCe;
import X.InterfaceC61312at;
import X.InterfaceC61500OBs;
import X.InterfaceC73142SnC;
import X.InterfaceC73150SnK;
import X.InterfaceC73226SoY;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC98243tM;
import X.LB4;
import X.OSZ;
import X.TBZ;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListState;
import java.util.List;
import kotlin.jvm.internal.AqS128S0300000_12;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ListMiddleware<S extends InterfaceC61312at, T, P extends C70839Rr9> extends C73139Sn9<S, ListState> implements InterfaceC61500OBs {
    public final C62822Ol8 LJLJJL;
    public final InterfaceC88472Yns<S, AbstractC73672Svk<OSZ<List<T>, P>>> LJLJJLL;
    public final InterfaceC88472Yns<S, AbstractC73672Svk<OSZ<List<T>, P>>> LJLJL;
    public final InterfaceC88471Ynr<List<? extends T>, List<? extends T>, List<T>> LJLJLJ;
    public final InterfaceC88471Ynr<List<? extends T>, List<? extends T>, List<T>> LJLJLLL;

    public final void loadMore() {
        InterfaceC88472Yns<S, AbstractC73672Svk<OSZ<List<T>, P>>> interfaceC88472Yns = this.LJLJL;
        if (interfaceC88472Yns != null) {
            AqS128S0300000_12 aqS128S0300000_12 = new AqS128S0300000_12(this, interfaceC88472Yns, this.LJLJLLL, 5);
            JediViewModel<S> jediViewModel = this.LJLILLLLZI;
            if (jediViewModel != null) {
                jediViewModel.Gv0(new AqS143S0200000_12(this, aqS128S0300000_12, 20));
            } else {
                o.LJIJI("viewModel");
                throw null;
            }
        }
    }

    public final void refresh() {
        AqS128S0300000_12 aqS128S0300000_12 = new AqS128S0300000_12(this, this.LJLJJLL, this.LJLJLJ, 6);
        JediViewModel<S> jediViewModel = this.LJLILLLLZI;
        if (jediViewModel != null) {
            jediViewModel.Gv0(new AqS143S0200000_12(this, aqS128S0300000_12, 20));
        } else {
            o.LJIJI("viewModel");
            throw null;
        }
    }

    public final void LJIIIZ(List<? extends T> newList) {
        o.LJIIJ(newList, "newList");
        LJI(new AqS143S0200000_12(this, newList, 18));
    }

    @Override // X.InterfaceC61500OBs
    public final void zB(int i) {
        ((AbstractC73133Sn3) this.LJLJJL.getValue()).zB(i);
    }

    public final C70840RrA LJII(ListState listState, List<? extends T> list) {
        boolean isEmpty = list.isEmpty();
        if (isEmpty == listState.isEmpty().LIZ) {
            return listState.isEmpty();
        }
        return new C70840RrA(isEmpty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListMiddleware(InterfaceC88472Yns<? super S, ? extends AbstractC73672Svk<OSZ<List<T>, P>>> interfaceC88472Yns, InterfaceC88472Yns<? super S, ? extends AbstractC73672Svk<OSZ<List<T>, P>>> interfaceC88472Yns2, InterfaceC88471Ynr<? super List<? extends T>, ? super List<? extends T>, ? extends List<? extends T>> refreshStrategy, InterfaceC88471Ynr<? super List<? extends T>, ? super List<? extends T>, ? extends List<? extends T>> loadMoreStrategy) {
        o.LJIIJ(refreshStrategy, "refreshStrategy");
        o.LJIIJ(loadMoreStrategy, "loadMoreStrategy");
        this.LJLJJLL = interfaceC88472Yns;
        this.LJLJL = interfaceC88472Yns2;
        this.LJLJLJ = refreshStrategy;
        this.LJLJLLL = loadMoreStrategy;
        this.LJLJJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 76));
    }

    public ListMiddleware(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, InterfaceC88471Ynr interfaceC88471Ynr, int i) {
        this(interfaceC88472Yns, (i & 2) != 0 ? null : interfaceC88472Yns2, (i & 4) != 0 ? LB4.LJLIL : null, (i & 8) != 0 ? AYP.LJLIL : interfaceC88471Ynr);
    }

    public static /* synthetic */ void LJIIIIZZ(ListMiddleware listMiddleware, InterfaceC73150SnK interfaceC73150SnK, InterfaceC73226SoY interfaceC73226SoY, boolean z, InterfaceC73142SnC interfaceC73142SnC, InterfaceC73142SnC interfaceC73142SnC2, InterfaceC88471Ynr interfaceC88471Ynr, AqS186S0100000_4 aqS186S0100000_4, InterfaceC88471Ynr interfaceC88471Ynr2, int i) {
        InterfaceC88471Ynr interfaceC88471Ynr3 = interfaceC88471Ynr2;
        boolean z2 = z;
        InterfaceC73226SoY interfaceC73226SoY2 = interfaceC73226SoY;
        InterfaceC73142SnC interfaceC73142SnC3 = interfaceC73142SnC;
        InterfaceC73142SnC interfaceC73142SnC4 = interfaceC73142SnC2;
        InterfaceC88471Ynr interfaceC88471Ynr4 = interfaceC88471Ynr;
        AqS186S0100000_4 aqS186S0100000_42 = aqS186S0100000_4;
        if ((i & 2) != 0) {
            interfaceC73226SoY2 = null;
        }
        if ((i & 8) != 0) {
            z2 = interfaceC73150SnK.getUniqueOnlyGlobal();
        }
        if ((i & 16) != 0) {
            interfaceC73142SnC3 = null;
        }
        if ((i & 32) != 0) {
            interfaceC73142SnC4 = null;
        }
        if ((i & 64) != 0) {
            interfaceC88471Ynr4 = null;
        }
        if ((i & 128) != 0) {
            aqS186S0100000_42 = null;
        }
        if ((i & 512) != 0) {
            interfaceC88471Ynr3 = null;
        }
        listMiddleware.subscribe(interfaceC73150SnK, interfaceC73226SoY2, false, z2, interfaceC73142SnC3, interfaceC73142SnC4, interfaceC88471Ynr4, aqS186S0100000_42, null, interfaceC88471Ynr3);
    }

    public final <RECEIVER extends InterfaceC98243tM> void subscribe(InterfaceC73150SnK<? extends RECEIVER> subscriber, InterfaceC73226SoY<T> interfaceC73226SoY, boolean z, boolean z2, InterfaceC73142SnC<T, RECEIVER> interfaceC73142SnC, InterfaceC73142SnC<T, RECEIVER> interfaceC73142SnC2, InterfaceC88471Ynr<? super RECEIVER, ? super Boolean, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super RECEIVER, ? super Boolean, C76800UCe> interfaceC88471Ynr2, InterfaceC88472Yns<? super RECEIVER, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super RECEIVER, ? super P, C76800UCe> interfaceC88471Ynr3) {
        o.LJIIJ(subscriber, "subscriber");
        if (interfaceC88471Ynr3 != null) {
            LJFF(subscriber, new TBZ() { // from class: X.SnD
                @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
                public final String getName() {
                    return "payload";
                }

                @Override // X.AbstractC74233TBl
                public final InterfaceC36731EbH getOwner() {
                    return C65352Pkq.LIZ(ListState.class);
                }

                @Override // X.AbstractC74233TBl
                public final String getSignature() {
                    return "getPayload()Lcom/bytedance/jedi/arch/ext/list/Payload;";
                }

                @Override // X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((ListState) obj).getPayload();
                }
            }, z2, z, new AqS194S0100000_12(interfaceC88471Ynr3, 18));
        }
        if (interfaceC88471Ynr != null) {
            LJFF(subscriber, new TBZ() { // from class: X.SnH
                @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
                public final String getName() {
                    return "hasMore";
                }

                @Override // X.AbstractC74233TBl
                public final InterfaceC36731EbH getOwner() {
                    return C65352Pkq.LIZ(ListState.class);
                }

                @Override // X.AbstractC74233TBl
                public final String getSignature() {
                    return "getHasMore()Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;";
                }

                @Override // X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((ListState) obj).getHasMore();
                }
            }, z2, z, new AqS194S0100000_12(interfaceC88471Ynr, 19));
        }
        if (interfaceC88471Ynr2 != null) {
            LJFF(subscriber, new TBZ() { // from class: X.SnE
                @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
                public final String getName() {
                    return "isEmpty";
                }

                @Override // X.AbstractC74233TBl
                public final InterfaceC36731EbH getOwner() {
                    return C65352Pkq.LIZ(ListState.class);
                }

                @Override // X.AbstractC74233TBl
                public final String getSignature() {
                    return "isEmpty()Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;";
                }

                @Override // X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((ListState) obj).isEmpty();
                }
            }, z2, z, new AqS194S0100000_12(interfaceC88471Ynr2, 20));
        }
        if (interfaceC73142SnC != null) {
            LIZ(subscriber, new TBZ() { // from class: X.SnF
                @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
                public final String getName() {
                    return "refresh";
                }

                @Override // X.AbstractC74233TBl
                public final InterfaceC36731EbH getOwner() {
                    return C65352Pkq.LIZ(ListState.class);
                }

                @Override // X.AbstractC74233TBl
                public final String getSignature() {
                    return "getRefresh()Lcom/bytedance/jedi/arch/Async;";
                }

                @Override // X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((ListState) obj).getRefresh();
                }
            }, z2, z, new AqS194S0100000_12(interfaceC73142SnC, 21), new AqS178S0100000_12((InterfaceC73142SnC) interfaceC73142SnC, 92), new AqS194S0100000_12(interfaceC73142SnC, 22));
        }
        if (interfaceC73142SnC2 != null) {
            LIZ(subscriber, new TBZ() { // from class: X.SnG
                @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
                public final String getName() {
                    return "loadMore";
                }

                @Override // X.AbstractC74233TBl
                public final InterfaceC36731EbH getOwner() {
                    return C65352Pkq.LIZ(ListState.class);
                }

                @Override // X.AbstractC74233TBl
                public final String getSignature() {
                    return "getLoadMore()Lcom/bytedance/jedi/arch/Async;";
                }

                @Override // X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((ListState) obj).getLoadMore();
                }
            }, z2, z, new AqS194S0100000_12(interfaceC73142SnC2, 23), new AqS178S0100000_12((InterfaceC73142SnC) interfaceC73142SnC2, 93), new AqS194S0100000_12(interfaceC73142SnC2, 24));
        }
        if (interfaceC73226SoY != null) {
            LJFF(subscriber, new TBZ() { // from class: X.SnI
                @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
                public final String getName() {
                    return "list";
                }

                @Override // X.AbstractC74233TBl
                public final InterfaceC36731EbH getOwner() {
                    return C65352Pkq.LIZ(ListState.class);
                }

                @Override // X.AbstractC74233TBl
                public final String getSignature() {
                    return "getList()Ljava/util/List;";
                }

                @Override // X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((ListState) obj).getList();
                }
            }, z2, z, new AqS128S0300000_12(interfaceC73226SoY, subscriber, interfaceC88472Yns, 0));
        }
    }
}
