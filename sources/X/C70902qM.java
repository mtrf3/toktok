package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.casting.manager.core.CastingManager$initSDK$1$1$1$onSuccess$1", f = "CastingManager.kt", l = {166}, m = "invokeSuspend")
/* renamed from: X.2qM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70902qM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C71052qb LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70902qM(C71052qb c71052qb, InterfaceC67352kd<? super C70902qM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c71052qb;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70902qM(this.LJLILLLLZI, interfaceC67352kd);
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
            C70922qO.LIZ("CastingManager", "onInitCallback ----------->true");
            C71052qb c71052qb = this.LJLILLLLZI;
            c71052qb.LIZJ = true;
            c71052qb.LIZLLL = false;
            XLM xlm = c71052qb.LJIIIZ;
            Boolean bool = Boolean.TRUE;
            this.LJLIL = 1;
            xlm.setValue(bool);
            if (C76800UCe.LIZ == enumC58928NAu) {
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
