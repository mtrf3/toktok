package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.poi.collect.PoiCollectListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.collect.PoiCollectListViewModel", f = "PoiCollectListViewModel.kt", l = {34}, m = "sendRequest")
/* renamed from: X.7Wb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187137Wb extends C3CS {
    public PoiCollectListViewModel LJLIL;
    public long LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ PoiCollectListViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C187137Wb(PoiCollectListViewModel poiCollectListViewModel, InterfaceC67352kd<? super C187137Wb> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = poiCollectListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.gv0(null, this);
    }
}
