package X;

import com.ss.android.ugc.tiktok.tpsc.TPSCPageBuildConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;

/* loaded from: classes13.dex */
public final class SNI extends AbstractC65781Prl implements InterfaceC65784Pro<TPSCPageBuildConfigs> {
    public static final SNI LJLIL = new SNI();

    public SNI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TPSCPageBuildConfigs invoke() {
        return new TPSCPageBuildConfigs(Integer.valueOf(SMI.LIZ()), EnumC69896Rbw.FIXED_HEIGHT_SHEET, C47261Igj.LJJIJ(new PrivacySettingsAdapterConfigs("comment", null)), 1);
    }
}
