package X;

import android.os.Bundle;
import com.ss.android.ugc.tiktok.tpsc.TPSCPageBuildConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final class SNM extends AbstractC65781Prl implements InterfaceC65784Pro<TPSCPageBuildConfigs> {
    public static final SNM LJLIL = new SNM();

    public SNM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TPSCPageBuildConfigs invoke() {
        int i;
        C72041SPd.LIZ.getClass();
        if (SN3.LIZJ(C72041SPd.LJFF(0, "tag")).LIZIZ && C7F0.LIZJ()) {
            i = R.string.i2n;
        } else {
            i = R.string.i2m;
        }
        Integer valueOf = Integer.valueOf(i);
        Bundle bundle = new Bundle();
        bundle.putBoolean("hasVideoTag", C7F0.LIZJ());
        return new TPSCPageBuildConfigs(valueOf, (EnumC69896Rbw) null, C47261Igj.LJJIJIIJI(new PrivacySettingsAdapterConfigs("TAG_ITEM", bundle), new PrivacySettingsAdapterConfigs("MENTION_ITEM", null)), 5);
    }
}
