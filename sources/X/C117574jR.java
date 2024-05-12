package X;

import com.bytedance.im.core.proto.Response;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.im.core.client.IMUseCaseClient$receiveWs$1$1", f = "IMUseCaseClient.kt", l = {189}, m = "invokeSuspend")
/* renamed from: X.4jR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117574jR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C63383OuB LJLILLLLZI;
    public final /* synthetic */ Response LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C117574jR(C63383OuB c63383OuB, Response response, InterfaceC67352kd<? super C117574jR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c63383OuB;
        this.LJLJI = response;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C117574jR(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C63631OyB c63631OyB = (C63631OyB) this.LJLILLLLZI.LJIILJJIL.getValue();
            Response response = this.LJLJI;
            this.LJLIL = 1;
            if (c63631OyB.LIZ(response, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
