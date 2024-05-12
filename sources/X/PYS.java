package X;

import com.bytedance.helios.api.config.SettingsModel;
import com.ss.android.ugc.aweme.kids.homepage.compliance.KidsSettingsServiceImpl;

/* loaded from: classes12.dex */
public final class PYS extends AbstractC65781Prl implements InterfaceC65784Pro<SettingsModel> {
    public static final PYS LJLIL = new PYS();

    public PYS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final SettingsModel invoke() {
        SettingsModel LJ = KidsSettingsServiceImpl.LJIIJJI().LJ();
        if (LJ == null) {
            return new SettingsModel(null, null, false, false, false, 0L, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 1073741823, null);
        }
        return LJ;
    }
}
