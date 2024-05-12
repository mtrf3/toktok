package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.search.PoiSearchVM", f = "PoiSearchVM.kt", l = {109}, m = "onRefresh")
/* renamed from: X.Xcn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85237Xcn extends C3CS {
    public PoiSearchVM LJLIL;
    public long LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ PoiSearchVM LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85237Xcn(PoiSearchVM poiSearchVM, InterfaceC67352kd<? super C85237Xcn> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = poiSearchVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.onRefresh(this);
    }
}
