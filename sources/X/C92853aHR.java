package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.utils.NonceContainer", f = "NonceContainer.kt", l = {28}, m = "getNonce")
/* renamed from: X.aHR, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92853aHR extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C91964a36 LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92853aHR(C91964a36 c91964a36, InterfaceC67352kd<? super C92853aHR> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c91964a36;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(this);
    }
}
