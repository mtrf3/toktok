package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.im.core.client.IMUseCaseClient$receiveWsFailureAck$1", f = "IMUseCaseClient.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4ef, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C114614ef extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ C63383OuB LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C114614ef(long j, C63383OuB c63383OuB, InterfaceC67352kd<? super C114614ef> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = j;
        this.LJLILLLLZI = c63383OuB;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C114614ef(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        StringBuilder LIZIZ = C43881HKb.LIZIZ(obj, "receiveWs failure response seqId is ");
        LIZIZ.append(this.LJLIL);
        C63322OtC.LIZIZ("IMUseCaseClient", X1D.LIZIZ(LIZIZ));
        if (!this.LJLILLLLZI.LIZIZ.LIZJ(this.LJLIL)) {
            this.LJLILLLLZI.LIZJ.LIZJ(new Long(this.LJLIL));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}