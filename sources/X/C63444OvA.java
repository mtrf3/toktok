package X;

import com.bytedance.im.core.proto.SendMessageResponseBody;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.sendmsg.SendMsgUseCase$send$sendMessageResponse$networkResponse$1", f = "SendMsgUseCase.kt", l = {158}, m = "invokeSuspend")
/* renamed from: X.OvA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63444OvA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super SendMessageResponseBody>, Object> {
    public int LJLIL;
    public final /* synthetic */ C63537Owf LJLILLLLZI;
    public final /* synthetic */ C63588OxU LJLJI;
    public final /* synthetic */ C109544Rq LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63444OvA(C63537Owf c63537Owf, C63588OxU c63588OxU, C109544Rq c109544Rq, InterfaceC67352kd<? super C63444OvA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c63537Owf;
        this.LJLJI = c63588OxU;
        this.LJLJJI = c109544Rq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63444OvA(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super SendMessageResponseBody> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            StringBuilder LIZIZ = C43881HKb.LIZIZ(obj, "job is running on ");
            LIZIZ.append(C16880lQ.LLLLIIIILLL().getName());
            C63322OtC.LJI("SendMsgUseCase", X1D.LIZIZ(LIZIZ), null);
            C63537Owf c63537Owf = this.LJLILLLLZI;
            C63588OxU c63588OxU = this.LJLJI;
            C109544Rq c109544Rq = this.LJLJJI;
            this.LJLIL = 1;
            obj = c63537Owf.LIZJ(c63588OxU, c109544Rq, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
