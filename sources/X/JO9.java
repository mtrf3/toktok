package X;

import com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchResponse;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;

/* loaded from: classes9.dex */
public final class JO9 extends AbstractC65781Prl implements InterfaceC88472Yns<C49069JNp, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ ClickSearchViewModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ C50764Jw8<ClickSearchResponse> LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JO9(int i, ClickSearchViewModel clickSearchViewModel, String str, String str2, C50764Jw8<ClickSearchResponse> c50764Jw8, boolean z) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = clickSearchViewModel;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = c50764Jw8;
        this.LJLJJLL = z;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C49069JNp c49069JNp) {
        C49069JNp c49069JNp2 = c49069JNp;
        if (c49069JNp2 != null && c49069JNp2.LJLILLLLZI == IM1.DATA_FETCHING && this.LJLIL == c49069JNp2.LJLIL) {
            this.LJLILLLLZI.iv0().postValue(new JP4(this.LJLIL, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL));
            this.LJLILLLLZI.hv0().setValue(new C49069JNp(this.LJLIL, IM1.FINISHED));
        }
        return C76800UCe.LIZ;
    }
}
