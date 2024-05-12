package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaOpenApi$Companion", f = "RomaOpenApi.kt", l = {57}, m = "getPatternList")
/* renamed from: X.EDs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36072EDs extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C36071EDr LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36072EDs(C36071EDr c36071EDr, InterfaceC67352kd<? super C36072EDs> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c36071EDr;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZIZ(null, this);
    }
}
