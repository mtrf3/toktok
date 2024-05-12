package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.roaming.NearbyRegionSearchV1Response;
import com.ss.android.ugc.aweme.roaming.RegionSearchViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.roaming.RegionSearchViewModel", f = "RegionSearchViewModel.kt", l = {66}, m = "requestRegionItems")
/* renamed from: X.Lci, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54656Lci extends C3CS {
    public RegionSearchViewModel LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public NearbyRegionSearchV1Response LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ RegionSearchViewModel LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54656Lci(RegionSearchViewModel regionSearchViewModel, InterfaceC67352kd<? super C54656Lci> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = regionSearchViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.iv0(null, this);
    }
}
