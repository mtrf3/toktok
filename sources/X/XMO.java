package X;

import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XMO extends AbstractC72278SYg<Object> {
    public final /* synthetic */ AssemListViewModel<InterfaceC208718Hb<Object, Object>, InterfaceC57784Mm4, Object> LIZIZ;

    @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
    public final void onRefresh(InterfaceC67352kd<? super A2G<Object>> con) {
        o.LJIIIZ(con, "con");
        this.LIZIZ.refreshInner(new AqS165S0100000_15(con, (InterfaceC67352kd<? super A2G<Object>>) 38), new AqS146S0200000_15((AssemListViewModel) this.LIZIZ, (InterfaceC67352kd) con, 14));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XMO(AssemListViewModel<InterfaceC208718Hb<Object, Object>, InterfaceC57784Mm4, Object> assemListViewModel, C57939MoZ c57939MoZ) {
        super(c57939MoZ);
        this.LIZIZ = assemListViewModel;
    }

    @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
    public final void onLoadLatest(InterfaceC67352kd<? super A2G<Object>> con, Object obj) {
        o.LJIIIZ(con, "con");
        this.LIZIZ.loadLatestInner(obj, new AqS165S0100000_15(con, (InterfaceC67352kd<? super A2G<Object>>) 36), new AqS146S0200000_15((AssemListViewModel) this.LIZIZ, (InterfaceC67352kd) con, 12));
    }

    @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
    public final void onLoadMore(InterfaceC67352kd<? super A2G<Object>> con, Object obj) {
        o.LJIIIZ(con, "con");
        this.LIZIZ.loadMoreInner(obj, new AqS165S0100000_15(con, (InterfaceC67352kd<? super A2G<Object>>) 37), new AqS146S0200000_15((AssemListViewModel) this.LIZIZ, (InterfaceC67352kd) con, 13));
    }
}
