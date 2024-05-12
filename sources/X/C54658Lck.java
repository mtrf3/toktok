package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.roaming.RegionSearchViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.roaming.RegionSearchViewModel", f = "RegionSearchViewModel.kt", l = {47}, m = "onRefresh")
/* renamed from: X.Lck, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54658Lck extends C3CS {
    public RegionSearchViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ RegionSearchViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54658Lck(RegionSearchViewModel regionSearchViewModel, InterfaceC67352kd<? super C54658Lck> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = regionSearchViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.onRefresh(this);
    }
}
