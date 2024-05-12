package X;

import com.ss.android.ugc.tiktok.tpsc.TPSCPageBuildConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.batchdelete.BatchDeleteAdapterConfigs;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final class SNJ extends AbstractC65781Prl implements InterfaceC65784Pro<TPSCPageBuildConfigs> {
    public static final SNJ LJLIL = new SNJ();

    public SNJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TPSCPageBuildConfigs invoke() {
        return new TPSCPageBuildConfigs(Integer.valueOf(R.string.b4s), (EnumC69896Rbw) null, C47261Igj.LJJIJIIJI(new PrivacySettingsAdapterConfigs("duet_item", C0JT.LIZ("show_icon", false, "delete_associated_duet_stitch_experiment", false)), new BatchDeleteAdapterConfigs(SHR.TYPE_DUET, C7MY.LIZIZ(8))), 5);
    }
}
