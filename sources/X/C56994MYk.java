package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightMediaListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightMediaListViewModel", f = "SkylightMediaListViewModel.kt", l = {345, 130}, m = "onRefresh")
/* renamed from: X.MYk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56994MYk extends C3CS {
    public SkylightMediaListViewModel LJLIL;
    public InterfaceC75422xe LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ SkylightMediaListViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56994MYk(SkylightMediaListViewModel skylightMediaListViewModel, InterfaceC67352kd<? super C56994MYk> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = skylightMediaListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.onRefresh(this);
    }
}
