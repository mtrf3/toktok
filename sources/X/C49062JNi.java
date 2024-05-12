package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopVideoHolderVM;

/* renamed from: X.JNi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49062JNi extends AbstractC65781Prl implements InterfaceC88472Yns<Long, C76800UCe> {
    public final /* synthetic */ ClickSearchViewModel LJLIL;
    public final /* synthetic */ C49045JMr LJLILLLLZI;
    public final /* synthetic */ Aweme LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49062JNi(ClickSearchViewModel clickSearchViewModel, C49045JMr c49045JMr, Aweme aweme, String str, int i) {
        super(1);
        this.LJLIL = clickSearchViewModel;
        this.LJLILLLLZI = c49045JMr;
        this.LJLJI = aweme;
        this.LJLJJI = str;
        this.LJLJJL = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Long l) {
        IM1 im1;
        if (l.longValue() >= TopVideoHolderVM.LLFZ) {
            C49069JNp value = this.LJLIL.hv0().getValue();
            if (value != null) {
                im1 = value.LJLILLLLZI;
            } else {
                im1 = null;
            }
            if (im1 != IM1.DATA_FETCHING) {
                this.LJLILLLLZI.LJLJL = null;
                this.LJLIL.gv0(this.LJLJJL, 0, this.LJLJI, this.LJLJJI);
            }
        }
        return C76800UCe.LIZ;
    }
}
