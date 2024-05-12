package X;

import Y.IDfS133S0100000_13;
import fjb.a;
import kotlin.jvm.internal.AqS179S0100000_13;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.setting.unit.privacy.SyncMLBBFriendsUnit$onClick$2", f = "SyncMLBBFriendsUnit.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UU1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ UUE LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UU1(UUE uue, InterfaceC67352kd<? super UU1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = uue;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        UU1 uu1 = new UU1(this.LJLJI, interfaceC67352kd);
        uu1.LJLILLLLZI = obj;
        return uu1;
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
            C3C3 LIZ = ((USE) C77125UOr.LJIIIIZZ(this.LJLJI.LJLJJL, new AqS179S0100000_13((InterfaceC70422pa) this.LJLILLLLZI, 571))).LIZ();
            IDfS133S0100000_13 iDfS133S0100000_13 = new IDfS133S0100000_13(this.LJLJI, 4);
            this.LJLIL = 1;
            if (LIZ.collect(iDfS133S0100000_13, this) == enumC58928NAu) {
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
