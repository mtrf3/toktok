package X;

import android.os.Bundle;
import com.ss.android.ugc.tiktok.tpsc.TPSCPageBuildConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final class SNN extends AbstractC65781Prl implements InterfaceC65784Pro<TPSCPageBuildConfigs> {
    public static final SNN LJLIL = new SNN();

    public SNN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TPSCPageBuildConfigs invoke() {
        Integer valueOf = Integer.valueOf(R.string.r2h);
        EnumC69896Rbw enumC69896Rbw = EnumC69896Rbw.SHEET;
        Bundle bundle = new Bundle();
        bundle.putBoolean("hasVideoTag", C7F0.LIZJ());
        return new TPSCPageBuildConfigs(valueOf, enumC69896Rbw, C47261Igj.LJJIJ(new PrivacySettingsAdapterConfigs("TAG", bundle)), 1);
    }
}
