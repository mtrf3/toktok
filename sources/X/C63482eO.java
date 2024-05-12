package X;

import com.bytedance.keva.Keva;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecomsearch.middle.viewmodel.EcSuggestWordsViewModel$requestGuessSearchAdvanced$4$2$1", f = "EcSuggestWordsViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2eO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63482eO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63482eO(String str, InterfaceC67352kd<? super C63482eO> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63482eO(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        String data = this.LJLIL;
        o.LJIIIIZZ(data, "data");
        Keva.getRepo("ecommerce_search_repo").storeString("ecommerce_suggest_words", data);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
