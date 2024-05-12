package X;

import Y.IDfS24S0200000_9;
import com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility$subscribeGlobalState$1$1", f = "AuthCardListScopeAbility.kt", l = {517}, m = "invokeSuspend")
/* renamed from: X.MpS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57994MpS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ EnumC77147UPn LJLILLLLZI;
    public final /* synthetic */ AuthCardListScopeAbility LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57994MpS(EnumC77147UPn enumC77147UPn, AuthCardListScopeAbility authCardListScopeAbility, InterfaceC67352kd<? super C57994MpS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = enumC77147UPn;
        this.LJLJI = authCardListScopeAbility;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57994MpS(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            InterfaceC70352pT<C57148Mbo> LJIIIZ = UTK.LIZIZ.LJIIIZ(this.LJLILLLLZI);
            IDfS24S0200000_9 iDfS24S0200000_9 = new IDfS24S0200000_9(this.LJLJI, this.LJLILLLLZI, 4);
            this.LJLIL = 1;
            if (LJIIIZ.collect(iDfS24S0200000_9, this) == enumC58928NAu) {
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
