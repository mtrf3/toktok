package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.model.MonitorSampleData;

/* renamed from: X.C8e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30832C8e extends AbstractC65781Prl implements InterfaceC65784Pro<MonitorSampleData> {
    public static final C30832C8e LJLIL = new C30832C8e();

    public C30832C8e() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.model.MonitorSampleData] */
    @Override // X.InterfaceC65784Pro
    public final MonitorSampleData invoke() {
        return SettingsManager.INSTANCE.getValueSafely(LiveMonitorSampleSetting.class);
    }
}
