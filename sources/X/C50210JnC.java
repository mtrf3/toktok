package X;

import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubHeaderVM$mobPictureClick$1$1", f = "SearchHubHeaderVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.JnC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50210JnC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C50214JnG LJLIL;
    public final /* synthetic */ C50201Jn3 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50210JnC(C50214JnG c50214JnG, C50201Jn3 c50201Jn3, InterfaceC67352kd<? super C50210JnC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c50214JnG;
        this.LJLILLLLZI = c50201Jn3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C50210JnC(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ISearchContextAbility LJJJJLL = C17N.LJJJJLL();
        JNB jnb = new JNB(null);
        C50214JnG c50214JnG = this.LJLIL;
        C50201Jn3 c50201Jn3 = this.LJLILLLLZI;
        C50322Jp0 LIZJ = LJJJJLL.If().LIZJ();
        jnb.LJJIFFI(LIZJ.LJLJI);
        jnb.LJIIZILJ("search_keyword", LIZJ.LJLJJI);
        jnb.LJIJI("general_search");
        jnb.LJJII(c50214JnG.LJLIL);
        jnb.LJJI(new Integer(0));
        jnb.LJIIZILJ("token_type", c50214JnG.LJLJJL.getTokenType());
        jnb.LIZLLL("card_title", c50214JnG.LJLILLLLZI);
        jnb.LIZLLL("card_url", c50214JnG.LJLJJI);
        jnb.LIZLLL("entity_type", c50201Jn3.LJLJJI.getMobType());
        jnb.LIZLLL("is_entity", "1");
        jnb.LIZLLL("card_style", "picture");
        jnb.LJIILIIL();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
