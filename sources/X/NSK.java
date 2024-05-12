package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ad.experiment.FixVideoProgressSettingModel;

/* loaded from: classes11.dex */
public final class NSK extends AbstractC65781Prl implements InterfaceC65784Pro<FixVideoProgressSettingModel> {
    public static final NSK LJLIL = new NSK();

    public NSK() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ad.experiment.FixVideoProgressSettingModel, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final FixVideoProgressSettingModel invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        FixVideoProgressSettingModel fixVideoProgressSettingModel = NSJ.LIZIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("enable_auto_fix_player_event", FixVideoProgressSettingModel.class, fixVideoProgressSettingModel);
        if (LJIIIIZZ == 0) {
            return fixVideoProgressSettingModel;
        }
        return LJIIIIZZ;
    }
}
