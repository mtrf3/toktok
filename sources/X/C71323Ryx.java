package X;

import com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;

/* renamed from: X.Ryx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71323Ryx extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public final /* synthetic */ InterfaceC43919HLn<C76800UCe> LJLIL;
    public final /* synthetic */ SHA LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ AnchorPanelAdapter LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ ShopWindowAnchorModel LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71323Ryx(InterfaceC43919HLn<C76800UCe> interfaceC43919HLn, SHA sha, String str, AnchorPanelAdapter anchorPanelAdapter, int i, ShopWindowAnchorModel shopWindowAnchorModel) {
        super(1);
        this.LJLIL = interfaceC43919HLn;
        this.LJLILLLLZI = sha;
        this.LJLJI = str;
        this.LJLJJI = anchorPanelAdapter;
        this.LJLJJL = i;
        this.LJLJJLL = shopWindowAnchorModel;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        InterfaceC43919HLn<C76800UCe> interfaceC43919HLn = this.LJLIL;
        if (interfaceC43919HLn != null && interfaceC43919HLn.isCompleted()) {
            SHA sha = this.LJLILLLLZI;
            String str = this.LJLJI;
            AnchorPanelAdapter.LLFFF(this.LJLJJL, sha, this.LJLJJI, this.LJLJJLL, str, booleanValue);
        } else {
            XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C71322Ryw(this.LJLIL, booleanValue, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, null), 2);
        }
        return C76800UCe.LIZ;
    }
}
