package X;

import com.ss.android.ugc.tiktok.tpsc.TPSCPageBuildConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.zhiliaoapp.musically.R;

/* renamed from: X.SNc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71988SNc extends AbstractC65781Prl implements InterfaceC65784Pro<TPSCPageBuildConfigs> {
    public static final C71988SNc LJLIL = new C71988SNc();

    public C71988SNc() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TPSCPageBuildConfigs invoke() {
        return new TPSCPageBuildConfigs(Integer.valueOf(R.string.r29), EnumC69896Rbw.SHEET, C47261Igj.LJJIJ(new PrivacySettingsAdapterConfigs("MENTION", null)), 1);
    }
}
