package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel", f = "SkylightListViewModel.kt", l = {297, 118}, m = "onRefresh")
/* renamed from: X.MYj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56993MYj extends C3CS {
    public Object LJLIL;
    public XJO LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ SkylightListViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56993MYj(SkylightListViewModel skylightListViewModel, InterfaceC67352kd<? super C56993MYj> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = skylightListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.onRefresh(this);
    }
}
