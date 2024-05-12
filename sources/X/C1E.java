package X;

import com.bytedance.android.livesdk.model.VoteResponseData;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.poll.PollApiTryModeProxy$vote$1", f = "PollApiTryModeProxy.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class C1E extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super InterfaceC68342mE<? extends C28467BFf<VoteResponseData>>>, Object> {
    public /* synthetic */ Object LJLIL;

    public C1E(InterfaceC67352kd<? super C1E> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C1E c1e = new C1E(interfaceC67352kd);
        c1e.LJLIL = obj;
        return c1e;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return XKX.LIZIZ((InterfaceC70422pa) this.LJLIL, null, null, new C1F(null), 3);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super InterfaceC68342mE<? extends C28467BFf<VoteResponseData>>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
