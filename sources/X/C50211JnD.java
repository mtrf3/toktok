package X;

import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubHeaderVM$mobPictureShow$1$1", f = "SearchHubHeaderVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.JnD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50211JnD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C50214JnG LJLIL;
    public final /* synthetic */ C50201Jn3 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50211JnD(C50214JnG c50214JnG, C50201Jn3 c50201Jn3, InterfaceC67352kd<? super C50211JnD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c50214JnG;
        this.LJLILLLLZI = c50201Jn3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C50211JnD(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ISearchContextAbility LJJJJLL = C17N.LJJJJLL();
        JN8 jn8 = new JN8(null);
        C50214JnG c50214JnG = this.LJLIL;
        C50201Jn3 c50201Jn3 = this.LJLILLLLZI;
        C50322Jp0 LIZJ = LJJJJLL.If().LIZJ();
        jn8.LJJIFFI(LIZJ.LJLJI);
        jn8.LJIIZILJ("search_keyword", LIZJ.LJLJJI);
        jn8.LJIJI("general_search");
        jn8.LJJII(c50214JnG.LJLIL);
        jn8.LJJI(new Integer(0));
        jn8.LJIIZILJ("token_type", c50214JnG.LJLJJL.getTokenType());
        jn8.LIZLLL("card_title", c50214JnG.LJLILLLLZI);
        jn8.LIZLLL("card_url", c50214JnG.LJLJJI);
        jn8.LIZLLL("entity_type", c50201Jn3.LJLJJI.getMobType());
        jn8.LIZLLL("is_entity", "1");
        jn8.LIZLLL("card_style", "picture");
        jn8.LJIILIIL();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
