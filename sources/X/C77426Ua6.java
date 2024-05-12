package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {410, 414}, m = "onSubscription")
/* renamed from: X.Ua6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77426Ua6 extends C3CS {
    public C77425Ua5 LJLIL;
    public C77427Ua7 LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C77425Ua5<Object> LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77426Ua6(C77425Ua5<Object> c77425Ua5, InterfaceC67352kd<? super C77426Ua6> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c77425Ua5;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZLLL(this);
    }
}
