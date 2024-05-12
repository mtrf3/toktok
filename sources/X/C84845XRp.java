package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.poi.detail.discovery.category.PoiDetailDiscoveryCategoryViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.detail.discovery.category.PoiDetailDiscoveryCategoryViewModel", f = "PoiDetailDiscoveryCategoryViewModel.kt", l = {63}, m = "onLoadMore")
/* renamed from: X.XRp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84845XRp extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ PoiDetailDiscoveryCategoryViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84845XRp(PoiDetailDiscoveryCategoryViewModel poiDetailDiscoveryCategoryViewModel, InterfaceC67352kd<? super C84845XRp> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = poiDetailDiscoveryCategoryViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.gv0(0L, this);
    }
}
