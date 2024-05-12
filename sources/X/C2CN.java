package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3", f = "Hoverable.kt", l = {102}, m = "invokeSuspend")
/* renamed from: X.2CN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC37501da, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC70422pa LJLJI;
    public final /* synthetic */ C1OH LJLJJI;
    public final /* synthetic */ InterfaceC35811ar<C1OF> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2CN(C1OH c1oh, InterfaceC35811ar interfaceC35811ar, InterfaceC67352kd interfaceC67352kd, InterfaceC70422pa interfaceC70422pa) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC70422pa;
        this.LJLJJI = c1oh;
        this.LJLJJL = interfaceC35811ar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2CN c2cn = new C2CN(this.LJLJJI, this.LJLJJL, interfaceC67352kd, this.LJLJI);
        c2cn.LJLILLLLZI = obj;
        return c2cn;
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
            InterfaceC37501da interfaceC37501da = (InterfaceC37501da) this.LJLILLLLZI;
            C2CM c2cm = new C2CM(getContext(), this.LJLJI, this.LJLJJI, this.LJLJJL, null);
            this.LJLIL = 1;
            if (interfaceC37501da.LJIJJLI(c2cm, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC37501da interfaceC37501da, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC37501da, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
