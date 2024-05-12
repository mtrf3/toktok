package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.mota.runner.network.NetworkRunner", f = "NetworkRunner.kt", l = {122}, m = "waitForNetworkAvailable")
/* loaded from: classes14.dex */
public final class UX6 extends C3CS {
    public C84563XGt LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C84563XGt LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UX6(C84563XGt c84563XGt, InterfaceC67352kd<? super UX6> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c84563XGt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZLLL(this);
    }
}
