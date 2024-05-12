package X;

import X.InterfaceC57357MfB;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.mota.runner.network.NetworkRunner", f = "NetworkRunner.kt", l = {83, 113, 115}, m = "runNetTransportWithRetry")
/* renamed from: X.XGu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84564XGu<D extends InterfaceC57357MfB> extends C3CS {
    public C84563XGt LJLIL;
    public InterfaceC84562XGs LJLILLLLZI;
    public XH8 LJLJI;
    public C76732zl LJLJJI;
    public C34K LJLJJL;
    public C72242sW LJLJJLL;
    public Object LJLJL;
    public /* synthetic */ Object LJLJLJ;
    public final /* synthetic */ C84563XGt LJLJLLL;
    public int LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84564XGu(C84563XGt c84563XGt, InterfaceC67352kd<? super C84564XGu> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLLL = c84563XGt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJLJ = obj;
        this.LJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLLL.LIZJ(null, null, null, this);
    }
}
