package X;

import Y.IDfS133S0100000_13;
import com.ss.android.ugc.aweme.setting.unit.privacy.RemoveFBFriendsUnit;
import fjb.a;
import kotlin.jvm.internal.AqS179S0100000_13;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.setting.unit.privacy.RemoveFBFriendsUnit$newAuthFlow$1", f = "RemoveFBFriendsUnit.kt", l = {335}, m = "invokeSuspend")
/* renamed from: X.UTy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77262UTy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ RemoveFBFriendsUnit LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77262UTy(RemoveFBFriendsUnit removeFBFriendsUnit, InterfaceC67352kd<? super C77262UTy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = removeFBFriendsUnit;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C77262UTy c77262UTy = new C77262UTy(this.LJLJI, interfaceC67352kd);
        c77262UTy.LJLILLLLZI = obj;
        return c77262UTy;
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
            C3C3 LIZ = ((USE) C77125UOr.LJIIIIZZ(this.LJLJI.LJLJJL, new AqS179S0100000_13((InterfaceC70422pa) this.LJLILLLLZI, 578))).LIZ();
            IDfS133S0100000_13 iDfS133S0100000_13 = new IDfS133S0100000_13(this.LJLJI, 7);
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