package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.service.assets.giftlist.GiftListManager", f = "GiftListManager.kt", l = {215}, m = "fetchHotData")
/* loaded from: classes14.dex */
public final class UWT extends C3CS {
    public UWM LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ UWM LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UWT(UWM uwm, InterfaceC67352kd<? super UWT> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = uwm;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(0, 0L, null, this);
    }
}
