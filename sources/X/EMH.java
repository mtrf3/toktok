package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.contact.handler.ContactBaseHandler$handle$2", f = "ContactBaseHandler.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EMH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C9U5>, Object> {
    public int LJLIL;
    public final /* synthetic */ EMJ LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EMH(EMJ emj, InterfaceC67352kd<? super EMH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = emj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EMH(this.LJLILLLLZI, interfaceC67352kd);
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
            EMJ emj = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = emj.LIZJ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C9U5> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
