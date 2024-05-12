package X;

import com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedCheckResult;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedPage;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedPageDetail;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS59S0201000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OTQ extends AbstractC65781Prl implements InterfaceC88472Yns<ARI, C76800UCe> {
    public final /* synthetic */ BaseI18nAuthorizedFragment LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ AuthorizedPage LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ AuthorizedCheckResult LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTQ(BaseI18nAuthorizedFragment baseI18nAuthorizedFragment, boolean z, AuthorizedPage authorizedPage, int i, AuthorizedCheckResult authorizedCheckResult) {
        super(1);
        this.LJLIL = baseI18nAuthorizedFragment;
        this.LJLILLLLZI = z;
        this.LJLJI = authorizedPage;
        this.LJLJJI = i;
        this.LJLJJL = authorizedCheckResult;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARI ari) {
        AuthorizedPageDetail pageDetail;
        String textValueByKey;
        ARI actionGroup = ari;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String string = this.LJLIL.getString(R.string.hxa);
        o.LJIIIIZZ(string, "getString(R.string.login_kit_error_modal_CTA1)");
        actionGroup.LJII(string, new AqS59S0201000_10(this.LJLIL, this.LJLJJI, this.LJLJJL, 1));
        if (this.LJLILLLLZI && (pageDetail = this.LJLJI.getPageDetail()) != null && (textValueByKey = pageDetail.textValueByKey("key_switch_account_button")) != null) {
            actionGroup.LJIIIZ(textValueByKey, C61950OTa.LJLIL);
        }
        return C76800UCe.LIZ;
    }
}
