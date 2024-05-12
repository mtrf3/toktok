package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.search.PoiSearchVM", f = "PoiSearchVM.kt", l = {324}, m = "sendRequest")
/* renamed from: X.Xcm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85236Xcm extends C3CS {
    public PoiSearchVM LJLIL;
    public C53611L2h LJLILLLLZI;
    public C68322mC LJLJI;
    public C34K LJLJJI;
    public C68322mC LJLJJL;
    public long LJLJJLL;
    public /* synthetic */ Object LJLJL;
    public final /* synthetic */ PoiSearchVM LJLJLJ;
    public int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85236Xcm(PoiSearchVM poiSearchVM, InterfaceC67352kd<? super C85236Xcm> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLJ = poiSearchVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJL = obj;
        this.LJLJLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLJ.iv0(null, this);
    }
}
