package X;

import fjb.a;
import java.util.HashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.SendMessageParams$report$1", f = "MessageReportTransform.kt", l = {66}, m = "invokeSuspend")
/* renamed from: X.3Uy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84923Uy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C109544Rq LJLILLLLZI;
    public final /* synthetic */ C84933Uz LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84923Uy(C109544Rq c109544Rq, C84933Uz c84933Uz, InterfaceC67352kd<? super C84923Uy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c109544Rq;
        this.LJLJI = c84933Uz;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C84923Uy(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                C48G c48g = C48G.LIZ;
                C109544Rq c109544Rq = this.LJLILLLLZI;
                C48N c48n = this.LJLJI.LIZ;
                this.LJLIL = 1;
                if (c48g.LJIIIIZZ(c109544Rq, c48n, new C84843Uq(), C772831o.LIZ(), this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (Exception e) {
            HashMap hashMap = new HashMap();
            hashMap.put("error_msg", "report error send msg");
            hashMap.put("error_desc", e);
            C36L.LJ("send_msg_error", hashMap);
            C36922EeM.LIZ(new RuntimeException(e));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
