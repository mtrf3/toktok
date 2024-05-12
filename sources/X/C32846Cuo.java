package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.send.result.SendGiftFailureInterceptorBizHandler", f = "SendGiftFailureInterceptorBizHandler.kt", l = {642, 650, 658, 670, 673}, m = "doSuccessCallback")
/* renamed from: X.Cuo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32846Cuo extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C32802Cu6 LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32846Cuo(C32802Cu6 c32802Cu6, InterfaceC67352kd<? super C32846Cuo> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c32802Cu6;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJIIJ(null, null, this);
    }
}
