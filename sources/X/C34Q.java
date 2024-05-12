package X;

import Y.IDfS126S0100000_1;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.casting.CastingPlayerImpl$addSeekListener$1", f = "CastingPlayerImpl.kt", l = {74}, m = "invokeSuspend")
/* renamed from: X.34Q, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C34Q extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C34N LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34Q(C34N c34n, InterfaceC67352kd<? super C34Q> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c34n;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C34Q(this.LJLILLLLZI, interfaceC67352kd);
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
            XLM xlm = C71042qa.LIZJ;
            IDfS126S0100000_1 iDfS126S0100000_1 = new IDfS126S0100000_1(this.LJLILLLLZI, 12);
            this.LJLIL = 1;
            if (xlm.collect(iDfS126S0100000_1, this) == enumC58928NAu) {
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
