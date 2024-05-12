package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.im.core.client.IMUseCaseClient$checkMessageCompleteness$1", f = "IMUseCaseClient.kt", l = {335}, m = "invokeSuspend")
/* renamed from: X.2xX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75352xX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C63383OuB LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ List<C109544Rq> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C75352xX(C63383OuB c63383OuB, int i, String str, List<? extends C109544Rq> list, InterfaceC67352kd<? super C75352xX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c63383OuB;
        this.LJLJI = i;
        this.LJLJJI = str;
        this.LJLJJL = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75352xX(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            InterfaceC75342xW interfaceC75342xW = this.LJLILLLLZI.LJIIJ;
            int i2 = this.LJLJI;
            String str = this.LJLJJI;
            List<C109544Rq> list = this.LJLJJL;
            this.LJLIL = 1;
            if (interfaceC75342xW.LIZ(i2, str, list, this) == enumC58928NAu) {
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
