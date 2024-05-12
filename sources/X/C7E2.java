package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.comment.experiment.Configuration;

/* renamed from: X.7E2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7E2 extends AbstractC65781Prl implements InterfaceC65784Pro<Configuration> {
    public static final C7E2 LJLIL = new C7E2();

    public C7E2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Configuration invoke() {
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            Configuration configuration = C7E1.LIZ;
            Configuration configuration2 = (Configuration) LIZLLL.LJIIIIZZ("video_view_history_guide_tips", Configuration.class, configuration);
            if (configuration2 != null) {
                return configuration2;
            }
            return configuration;
        } catch (Throwable unused) {
            return C7E1.LIZ;
        }
    }
}
