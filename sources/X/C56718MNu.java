package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.inbox.experiment.Configuration;

/* renamed from: X.MNu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56718MNu extends AbstractC65781Prl implements InterfaceC65784Pro<Configuration> {
    public static final C56718MNu LJLIL = new C56718MNu();

    public C56718MNu() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Configuration invoke() {
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            Configuration configuration = C56717MNt.LIZ;
            Configuration configuration2 = (Configuration) LIZLLL.LJIIIIZZ("inbox_follow_sort_setting", Configuration.class, configuration);
            if (configuration2 != null) {
                return configuration2;
            }
            return configuration;
        } catch (Throwable unused) {
            return C56717MNt.LIZ;
        }
    }
}
