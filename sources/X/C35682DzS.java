package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.inbox.monitor.InboxSampleRate;

/* renamed from: X.DzS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35682DzS extends AbstractC65781Prl implements InterfaceC65784Pro<InboxSampleRate.Config> {
    public static final C35682DzS LJLIL = new C35682DzS();

    public C35682DzS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InboxSampleRate.Config invoke() {
        InboxSampleRate.Config config;
        try {
            SettingsManager.LIZLLL().getClass();
            config = (InboxSampleRate.Config) SettingsManager.LJII("inbox_event_sample_rate", InboxSampleRate.Config.class);
        } catch (Throwable unused) {
            config = InboxSampleRate.LIZ;
        }
        if (config == null) {
            return InboxSampleRate.LIZ;
        }
        return config;
    }
}
