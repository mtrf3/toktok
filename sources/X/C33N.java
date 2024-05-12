package X;

import Y.IDfS126S0100000_1;
import com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchDefaultVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchDefaultVM$initRepository$1", f = "IMSearchDefaultVM.kt", l = {135}, m = "invokeSuspend")
/* renamed from: X.33N, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C33N extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ IMSearchDefaultVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33N(IMSearchDefaultVM iMSearchDefaultVM, InterfaceC67352kd<? super C33N> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = iMSearchDefaultVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C33N(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C70342pS c70342pS;
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
            IMSearchDefaultVM iMSearchDefaultVM = this.LJLILLLLZI;
            C33A c33a = iMSearchDefaultVM.LJLIL;
            if (c33a != null && (c70342pS = c33a.LJIIIIZZ) != null) {
                IDfS126S0100000_1 iDfS126S0100000_1 = new IDfS126S0100000_1(iMSearchDefaultVM, 20);
                this.LJLIL = 1;
                if (c70342pS.collect(iDfS126S0100000_1, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
