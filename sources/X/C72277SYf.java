package X;

import kotlin.jvm.internal.o;

/* renamed from: X.SYf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72277SYf extends AbstractC72278SYg<Object> {
    public final /* synthetic */ AbstractC72276SYe<Object> LIZIZ;

    @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
    public final void onRefresh(InterfaceC67352kd<? super A2G<Object>> continuation) {
        o.LJIIIZ(continuation, "continuation");
        this.LIZIZ.onRefresh(continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72277SYf(C57939MoZ c57939MoZ, C222888ou c222888ou) {
        super(c57939MoZ);
        this.LIZIZ = c222888ou;
    }

    @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
    public final void onLoadLatest(InterfaceC67352kd<? super A2G<Object>> continuation, Object obj) {
        o.LJIIIZ(continuation, "continuation");
        this.LIZIZ.onLoadLatest(continuation, obj);
    }

    @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
    public final void onLoadMore(InterfaceC67352kd<? super A2G<Object>> continuation, Object obj) {
        o.LJIIIZ(continuation, "continuation");
        this.LIZIZ.onLoadMore(continuation, obj);
    }
}
