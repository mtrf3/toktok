package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.framework.MicroActionChain", f = "MicroActionChain.kt", l = {79}, m = "execute-BWLJW6A")
/* renamed from: X.WpK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83466WpK extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C83467WpL<I, O> LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83466WpK(C83467WpL<I, O> c83467WpL, InterfaceC67352kd<? super C83466WpK> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c83467WpL;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        Object LIZ = this.LJLILLLLZI.LIZ(null, null, null, this);
        if (LIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZ;
        }
        return C3C5.m6boximpl(LIZ);
    }
}
