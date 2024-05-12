package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.model.LiveLogSampleData;

/* renamed from: X.C8d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30831C8d extends AbstractC65781Prl implements InterfaceC65784Pro<LiveLogSampleData> {
    public static final C30831C8d LJLIL = new C30831C8d();

    public C30831C8d() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.model.LiveLogSampleData] */
    @Override // X.InterfaceC65784Pro
    public final LiveLogSampleData invoke() {
        return SettingsManager.INSTANCE.getValueSafely(LiveLogMonitorSampleSetting.class);
    }
}
