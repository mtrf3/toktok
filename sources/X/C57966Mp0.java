package X;

import Y.IDfS24S0200000_9;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.source.UserCardDataSource$init$3", f = "UserCardDataSource.kt", l = {321}, m = "invokeSuspend")
/* renamed from: X.Mp0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57966Mp0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C57962Mow LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57966Mp0(C57962Mow c57962Mow, InterfaceC67352kd<? super C57966Mp0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c57962Mow;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C57966Mp0 c57966Mp0 = new C57966Mp0(this.LJLJI, interfaceC67352kd);
        c57966Mp0.LJLILLLLZI = obj;
        return c57966Mp0;
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
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            XLM xlm = this.LJLJI.LJIJ().LJII;
            if (xlm != null) {
                C70342pS c70342pS = new C70342pS(xlm, this.LJLJI.LJIIZILJ().LJFF, new C57968Mp2(null));
                IDfS24S0200000_9 iDfS24S0200000_9 = new IDfS24S0200000_9(this.LJLJI, interfaceC70422pa, 5);
                this.LJLIL = 1;
                if (c70342pS.collect(iDfS24S0200000_9, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                o.LJIJI("_state");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
