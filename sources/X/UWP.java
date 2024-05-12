package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.service.assets.giftlist.GiftListManager", f = "GiftListManager.kt", l = {288, 301}, m = "tryFetchColdData")
/* loaded from: classes14.dex */
public final class UWP extends C3CS {
    public UWM LJLIL;
    public C32420Cnw LJLILLLLZI;
    public C32287Cln LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ UWM LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UWP(UWM uwm, InterfaceC67352kd<? super UWP> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = uwm;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJ(null, null, this);
    }
}
