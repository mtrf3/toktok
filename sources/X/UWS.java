package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.service.assets.giftlist.GiftListManager", f = "GiftListManager.kt", l = {163}, m = "runHotStep")
/* loaded from: classes14.dex */
public final class UWS extends C3CS {
    public UWM LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ UWM LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UWS(UWM uwm, InterfaceC67352kd<? super UWS> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = uwm;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZLLL(0, 0L, null, this);
    }
}
