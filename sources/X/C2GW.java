package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", l = {887}, m = "invokeSuspend")
/* renamed from: X.2GW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2GW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC88473Ynt<InterfaceC70422pa, InterfaceC44041o8, InterfaceC67352kd<? super C76800UCe>, Object> LJLJI;
    public final /* synthetic */ InterfaceC44041o8 LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2GW(InterfaceC88473Ynt<? super InterfaceC70422pa, ? super InterfaceC44041o8, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88473Ynt, InterfaceC44041o8 interfaceC44041o8, InterfaceC67352kd<? super C2GW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC88473Ynt;
        this.LJLJJI = interfaceC44041o8;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2GW c2gw = new C2GW(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c2gw.LJLILLLLZI = obj;
        return c2gw;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
            Object obj2 = this.LJLILLLLZI;
            InterfaceC88473Ynt<InterfaceC70422pa, InterfaceC44041o8, InterfaceC67352kd<? super C76800UCe>, Object> interfaceC88473Ynt = this.LJLJI;
            InterfaceC44041o8 interfaceC44041o8 = this.LJLJJI;
            this.LJLIL = 1;
            if (interfaceC88473Ynt.invoke(obj2, interfaceC44041o8, this) == enumC58928NAu) {
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
