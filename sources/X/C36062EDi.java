package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaGoofyApi$Companion", f = "RomaGoofyFetcher.kt", l = {30}, m = "getPatternList")
/* renamed from: X.EDi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36062EDi extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C36060EDg LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36062EDi(C36060EDg c36060EDg, InterfaceC67352kd<? super C36062EDi> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c36060EDg;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(this);
    }
}
