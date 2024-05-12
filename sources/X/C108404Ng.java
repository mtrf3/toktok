package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.ShareTextBoxViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.List;

/* renamed from: X.4Ng, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108404Ng extends AbstractC65781Prl implements InterfaceC88472Yns<C63120Opw, C76800UCe> {
    public final /* synthetic */ ShareTextBoxViewModel LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ BaseContent LJLJI;
    public final /* synthetic */ java.util.Map<String, String> LJLJJI;
    public final /* synthetic */ java.util.Map<String, String> LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C108404Ng(ShareTextBoxViewModel shareTextBoxViewModel, String str, BaseContent baseContent, java.util.Map<String, String> map, java.util.Map<String, String> map2, boolean z) {
        super(1);
        this.LJLIL = shareTextBoxViewModel;
        this.LJLILLLLZI = str;
        this.LJLJI = baseContent;
        this.LJLJJI = map;
        this.LJLJJL = map2;
        this.LJLJJLL = z;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C63120Opw c63120Opw) {
        C63120Opw c63120Opw2 = c63120Opw;
        this.LJLIL.jv0(false);
        if (c63120Opw2 != null) {
            List<? extends IMContact> LJJIJIL = C47261Igj.LJJIJIL(C3K0.LIZIZ(c63120Opw2));
            this.LJLIL.LJLIL.extras.putBoolean("is_new_group", true);
            ShareTextBoxViewModel shareTextBoxViewModel = this.LJLIL;
            if (shareTextBoxViewModel.LJLIL.sendMessageTemplateTask != null) {
                shareTextBoxViewModel.iv0(this.LJLILLLLZI, LJJIJIL);
            } else {
                shareTextBoxViewModel.hv0(LJJIJIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
            }
        }
        return C76800UCe.LIZ;
    }
}
