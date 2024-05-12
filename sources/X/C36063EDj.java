package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaGoofyFetcher", f = "RomaGoofyFetcher.kt", l = {54}, m = "fetchRemote")
/* renamed from: X.EDj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36063EDj extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C36061EDh LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36063EDj(C36061EDh c36061EDh, InterfaceC67352kd<? super C36063EDj> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c36061EDh;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZIZ(this);
    }
}
