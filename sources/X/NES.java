package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.player.SearchAdPlayerModule$setState$1", f = "SearchAdPlayerModule.kt", l = {135}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class NES extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C58798N5u LJLILLLLZI;
    public final /* synthetic */ N62 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NES(C58798N5u c58798N5u, N62 n62, InterfaceC67352kd<? super NES> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c58798N5u;
        this.LJLJI = n62;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new NES(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C58825N6v c58825N6v = this.LJLILLLLZI.LJLJL;
            N62 n62 = this.LJLJI;
            this.LJLIL = 1;
            if (c58825N6v.LIZ(n62, this) == enumC58928NAu) {
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