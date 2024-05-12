package X;

import com.ss.android.ugc.tiktok.tpsc.TPSCPageBuildConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.zhiliaoapp.musically.R;

/* renamed from: X.SNf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71991SNf extends AbstractC65781Prl implements InterfaceC65784Pro<TPSCPageBuildConfigs> {
    public static final C71991SNf LJLIL = new C71991SNf();

    public C71991SNf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TPSCPageBuildConfigs invoke() {
        return new TPSCPageBuildConfigs(Integer.valueOf(R.string.p9e), (EnumC69896Rbw) null, C47261Igj.LJJIJIIJI(new PrivacySettingsAdapterConfigs("sug_to_contacts", null), new PrivacySettingsAdapterConfigs("sug_to_fb_friends", null), new PrivacySettingsAdapterConfigs("sug_to_mlbb", null), new PrivacySettingsAdapterConfigs("sug_to_mutual_connections", null), new PrivacySettingsAdapterConfigs("sug_to_who_share_link", null), new PrivacySettingsAdapterConfigs("sug_to_interested_users", null)), 5);
    }
}
