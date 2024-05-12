package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecomsearch.middle.viewmodel.EcSuggestWordsViewModel$requestGuessSearchAdvanced$4$2", f = "EcSuggestWordsViewModel.kt", l = {231}, m = "invokeSuspend")
/* renamed from: X.2eN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63472eN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63472eN(String str, InterfaceC67352kd<? super C63472eN> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63472eN(this.LJLILLLLZI, interfaceC67352kd);
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
            XIA xia = C78613UtF.LIZJ;
            C63482eO c63482eO = new C63482eO(this.LJLILLLLZI, null);
            this.LJLIL = 1;
            if (XKX.LJI(xia, c63482eO, this) == enumC58928NAu) {
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
