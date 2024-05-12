package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.landscape.trafficincentives.OneMinuteTrafficIncentivesSettings;

/* renamed from: X.97B, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C97B extends AbstractC65781Prl implements InterfaceC65784Pro<OneMinuteTrafficIncentivesSettings.OneMinuteTrafficProfileConfig> {
    public static final C97B LJLIL = new C97B();

    public C97B() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.ss.android.ugc.aweme.feed.landscape.trafficincentives.OneMinuteTrafficIncentivesSettings$OneMinuteTrafficProfileConfig] */
    @Override // X.InterfaceC65784Pro
    public final OneMinuteTrafficIncentivesSettings.OneMinuteTrafficProfileConfig invoke() {
        OneMinuteTrafficIncentivesSettings.LIZ.getClass();
        return SettingsManager.LIZLLL().LJIIIIZZ("1min_traffic_profile_config", OneMinuteTrafficIncentivesSettings.OneMinuteTrafficProfileConfig.class, OneMinuteTrafficIncentivesSettings.LIZIZ);
    }
}
