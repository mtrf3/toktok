package X;

import com.ss.android.ugc.tiktok.tpsc.TPSCPageBuildConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.zhiliaoapp.musically.R;

/* renamed from: X.SNa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71986SNa extends AbstractC65781Prl implements InterfaceC65784Pro<TPSCPageBuildConfigs> {
    public static final C71986SNa LJLIL = new C71986SNa();

    public C71986SNa() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TPSCPageBuildConfigs invoke() {
        return new TPSCPageBuildConfigs(Integer.valueOf(R.string.tp1), (EnumC69896Rbw) null, C47261Igj.LJJIJ(new PrivacySettingsAdapterConfigs("video_view_history", null)), 5);
    }
}
