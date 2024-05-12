package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.tiktok.tpsc.TPSCPageBuildConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.batchdelete.BatchDeleteAdapterConfigs;
import com.zhiliaoapp.musically.R;

/* renamed from: X.SNe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71990SNe extends AbstractC65781Prl implements InterfaceC65784Pro<TPSCPageBuildConfigs> {
    public static final C71990SNe LJLIL = new C71990SNe();

    public C71990SNe() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TPSCPageBuildConfigs invoke() {
        Integer valueOf = Integer.valueOf(R.string.b4u);
        Bundle LIZ = C0JT.LIZ("show_icon", false, "delete_associated_duet_stitch_experiment", false);
        LIZ.putBoolean("enableStitch", AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableStitch());
        return new TPSCPageBuildConfigs(valueOf, (EnumC69896Rbw) null, C47261Igj.LJJIJIIJI(new PrivacySettingsAdapterConfigs("stitch_item", LIZ), new BatchDeleteAdapterConfigs(SHR.TYPE_STITCH, C7MY.LIZIZ(8))), 5);
    }
}
