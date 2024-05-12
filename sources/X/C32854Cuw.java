package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.send.sending.PreRequestSendGiftInterceptor", f = "PreRequestSendGiftInterceptor.kt", l = {59}, m = "doCheck")
/* renamed from: X.Cuw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32854Cuw extends C3CS {
    public C32797Cu1 LJLIL;
    public C32816CuK LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C32797Cu1 LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32854Cuw(C32797Cu1 c32797Cu1, InterfaceC67352kd<? super C32854Cuw> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c32797Cu1;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJIIJ(null, this);
    }
}
