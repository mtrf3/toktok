package X;

import com.bytedance.android.livesdk.model.VoteResponseData;

@InterfaceC65848Psq(c = "com.bytedance.android.live.poll.PollApiTryModeProxy$vote$1$1", f = "PollApiTryModeProxy.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class C1F extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C28467BFf<VoteResponseData>>, Object> {
    public C1F(InterfaceC67352kd<? super C1F> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C1F(interfaceC67352kd);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.bytedance.android.livesdk.model.VoteResponseData] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C28467BFf c28467BFf = new C28467BFf();
        c28467BFf.data = new VoteResponseData();
        return c28467BFf;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C28467BFf<VoteResponseData>> interfaceC67352kd) {
        return new C1F(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
