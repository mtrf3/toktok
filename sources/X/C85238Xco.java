package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.search.PoiSearchVM", f = "PoiSearchVM.kt", l = {90}, m = "onLoadMore")
/* renamed from: X.Xco, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85238Xco extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ PoiSearchVM LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85238Xco(PoiSearchVM poiSearchVM, InterfaceC67352kd<? super C85238Xco> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = poiSearchVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.onLoadMore(null, this);
    }
}
