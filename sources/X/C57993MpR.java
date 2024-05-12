package X;

import Y.IDfS130S0100000_9;
import com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility;
import fjb.a;
import kotlin.jvm.internal.AqS113S0300000_9;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility$newAuthFlow$1", f = "AuthCardListScopeAbility.kt", l = {517}, m = "invokeSuspend")
/* renamed from: X.MpR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57993MpR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ AuthCardListScopeAbility LJLJI;
    public final /* synthetic */ EnumC58046MqI LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57993MpR(AuthCardListScopeAbility authCardListScopeAbility, EnumC58046MqI enumC58046MqI, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C57993MpR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = authCardListScopeAbility;
        this.LJLJJI = enumC58046MqI;
        this.LJLJJL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C57993MpR c57993MpR = new C57993MpR(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c57993MpR.LJLILLLLZI = obj;
        return c57993MpR;
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
            C3C3 LIZ = ((USE) C77125UOr.LJII(C78605Ut7.LJIIIIZZ(C57898Mnu.LIZIZ(this.LJLJI.getConfig())), new AqS113S0300000_9((InterfaceC70422pa) this.LJLILLLLZI, this.LJLJI, this.LJLJJI, 7))).LIZ();
            IDfS130S0100000_9 iDfS130S0100000_9 = new IDfS130S0100000_9(this.LJLJJL, 7);
            this.LJLIL = 1;
            if (LIZ.collect(iDfS130S0100000_9, this) == enumC58928NAu) {
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
