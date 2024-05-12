package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecomsearch.middle.viewmodel.EcSuggestWordsViewModel$requestGuessSearchAdvanced$4$1$1", f = "EcSuggestWordsViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2fX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64192fX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C50948Jz6 LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64192fX(String str, C50948Jz6 c50948Jz6, boolean z, InterfaceC67352kd<? super C64192fX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = c50948Jz6;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C64192fX(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        String data = this.LJLIL;
        o.LJIIIIZZ(data, "data");
        C51258K9u.LIZLLL(data, this.LJLILLLLZI.getEcSearchEntranceData(), this.LJLJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
