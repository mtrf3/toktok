package X;

import Y.IDfS126S0100000_1;
import fjb.a;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", l = {147}, m = "invokeSuspend")
/* renamed from: X.3CI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3CI extends AbstractC65782Prm implements InterfaceC88471Ynr<C3CK<? super Object>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC65462ha<Object> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3CI(InterfaceC65462ha<Object> interfaceC65462ha, InterfaceC67352kd<? super C3CI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC65462ha;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C3CI c3ci = new C3CI(this.LJLJI, interfaceC67352kd);
        c3ci.LJLILLLLZI = obj;
        return c3ci;
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
            C3CK c3ck = (C3CK) this.LJLILLLLZI;
            InterfaceC65462ha<Object> interfaceC65462ha = this.LJLJI;
            IDfS126S0100000_1 iDfS126S0100000_1 = new IDfS126S0100000_1(c3ck, 5);
            this.LJLIL = 1;
            if (interfaceC65462ha.collect(iDfS126S0100000_1, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C3CK<? super Object> c3ck, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c3ck, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}