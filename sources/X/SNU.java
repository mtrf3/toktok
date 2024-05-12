package X;

import com.ss.android.ugc.tiktok.tpsc.TPSCPageBuildConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final class SNU extends AbstractC65781Prl implements InterfaceC65784Pro<TPSCPageBuildConfigs> {
    public static final SNU LJLIL = new SNU();

    public SNU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TPSCPageBuildConfigs invoke() {
        return new TPSCPageBuildConfigs(Integer.valueOf(R.string.r69), EnumC69896Rbw.SHEET, C47261Igj.LJJIJ(new PrivacySettingsAdapterConfigs("story", null)), 1);
    }
}
