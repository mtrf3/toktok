package X;

import com.ss.android.ugc.tiktok.tpsc.TPSCPageBuildConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final class SNT extends AbstractC65781Prl implements InterfaceC65784Pro<TPSCPageBuildConfigs> {
    public static final SNT LJLIL = new SNT();

    public SNT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TPSCPageBuildConfigs invoke() {
        return new TPSCPageBuildConfigs(Integer.valueOf(R.string.b4u), EnumC69896Rbw.FIXED_HEIGHT_SHEET, C47261Igj.LJJIJ(new PrivacySettingsAdapterConfigs("stitch", null)), 1);
    }
}