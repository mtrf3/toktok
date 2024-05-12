package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.core.sendv2.presend.PreSendGiftChecker", f = "PreSendGiftChecker.kt", l = {128, 143}, m = "doProcess")
/* loaded from: classes14.dex */
public final class UVZ extends C3CS {
    public UVV LJLIL;
    public C32816CuK LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ UVV LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UVZ(UVV uvv, InterfaceC67352kd<? super UVZ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = uvv;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZJ(null, this);
    }
}
