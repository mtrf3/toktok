package X;

import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.ecommerce.middle.SearchResultFragmentNew$onVoiceSearchSuccess$1", f = "SearchResultFragmentNew.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Juf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50673Juf extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ SearchResultFragmentNew LJLIL;
    public final /* synthetic */ C50674Jug LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50673Juf(SearchResultFragmentNew searchResultFragmentNew, C50674Jug c50674Jug, InterfaceC67352kd<? super C50673Juf> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = searchResultFragmentNew;
        this.LJLILLLLZI = c50674Jug;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C50673Juf(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.Pm();
        SearchResultParam searchResultParam = new SearchResultParam();
        searchResultParam.setKeyword(this.LJLILLLLZI.LJLIL);
        searchResultParam.setEnterMethod("voice_input");
        searchResultParam.setSearchFrom("voice_input");
        boolean z = false;
        searchResultParam.setOpenNewSearchContainer(false);
        searchResultParam.setEnterFromSecond(this.LJLILLLLZI.LJLJJI);
        if (this.LJLILLLLZI.LJLJI == 2) {
            z = true;
        }
        searchResultParam.setIsSongRecognition(z);
        C50674Jug c50674Jug = this.LJLILLLLZI;
        if (c50674Jug.LJLJI == 2) {
            searchResultParam.setSongID(c50674Jug.LJLILLLLZI);
        }
        SearchResultFragmentNew searchResultFragmentNew = this.LJLIL;
        searchResultFragmentNew.Cm(searchResultFragmentNew.getContext(), searchResultParam);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
