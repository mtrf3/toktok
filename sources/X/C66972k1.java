package X;

import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardContainerSharedVM;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardContainerSharedVM$setup$1", f = "SearchCardProtocolManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2k1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66972k1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC55235Lm3 LJLIL;
    public final /* synthetic */ SearchCardContainerSharedVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66972k1(InterfaceC55235Lm3 interfaceC55235Lm3, SearchCardContainerSharedVM searchCardContainerSharedVM, InterfaceC67352kd<? super C66972k1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC55235Lm3;
        this.LJLILLLLZI = searchCardContainerSharedVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66972k1(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        List LJIJ = C62814Ol0.LJIJ(this.LJLIL, ISearchCardProtocol.class);
        if (LJIJ != null) {
            SearchCardContainerSharedVM searchCardContainerSharedVM = this.LJLILLLLZI;
            searchCardContainerSharedVM.LJLIL.clear();
            searchCardContainerSharedVM.LJLIL.addAll(LJIJ);
        }
        this.LJLILLLLZI.LJLILLLLZI.clear();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
