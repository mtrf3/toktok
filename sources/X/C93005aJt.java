package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.api.APIService", f = "APIService.kt", l = {406, 408}, m = "getStarlingMap")
/* renamed from: X.aJt, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93005aJt extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C92083a51 LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93005aJt(C92083a51 c92083a51, InterfaceC67352kd<? super C93005aJt> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c92083a51;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZIZ(null, this);
    }
}
