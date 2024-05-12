package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.send.presend.PreSendGiftProcessor", f = "PreSendGiftProcessor.kt", l = {39, 45}, m = "doProcess")
/* renamed from: X.Cuu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32852Cuu extends C3CS {
    public C32806CuA LJLIL;
    public C32804Cu8 LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C32806CuA LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32852Cuu(C32806CuA c32806CuA, InterfaceC67352kd<? super C32852Cuu> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c32806CuA;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJIIIZ(null, this);
    }
}
