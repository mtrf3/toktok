package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.websocket.api.ab.EventSampleRateExp;

/* renamed from: X.DzU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35684DzU extends AbstractC65781Prl implements InterfaceC65784Pro<EventSampleRateExp.Config> {
    public static final C35684DzU LJLIL = new C35684DzU();

    public C35684DzU() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.websocket.api.ab.EventSampleRateExp$Config] */
    @Override // X.InterfaceC65784Pro
    public final EventSampleRateExp.Config invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EventSampleRateExp.Config config = EventSampleRateExp.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("social_event_sample_rate", EventSampleRateExp.Config.class, config);
        if (LJIIIIZZ == 0) {
            return config;
        }
        return LJIIIIZZ;
    }
}
