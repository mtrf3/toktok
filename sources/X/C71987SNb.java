package X;

import com.ss.android.ugc.tiktok.tpsc.TPSCPageBuildConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.zhiliaoapp.musically.R;

/* renamed from: X.SNb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71987SNb extends AbstractC65781Prl implements InterfaceC65784Pro<TPSCPageBuildConfigs> {
    public static final C71987SNb LJLIL = new C71987SNb();

    public C71987SNb() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TPSCPageBuildConfigs invoke() {
        return new TPSCPageBuildConfigs(Integer.valueOf(R.string.pgu), (EnumC69896Rbw) null, C47261Igj.LJJIJ(new PrivacySettingsAdapterConfigs("profile_view_history", null)), 5);
    }
}
