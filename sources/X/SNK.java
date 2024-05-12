package X;

import com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.CommentFilterConfig;
import com.ss.android.ugc.tiktok.tpsc.TPSCPageBuildConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;

/* loaded from: classes13.dex */
public final class SNK extends AbstractC65781Prl implements InterfaceC65784Pro<TPSCPageBuildConfigs> {
    public static final SNK LJLIL = new SNK();

    public SNK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TPSCPageBuildConfigs invoke() {
        return new TPSCPageBuildConfigs(Integer.valueOf(SMI.LIZ()), (EnumC69896Rbw) null, C47261Igj.LJJIJIIJI(new PrivacySettingsAdapterConfigs("comment_item", C0JT.LIZ("show_icon", false, "contain_comment_filter", false)), new CommentFilterConfig()), 5);
    }
}
