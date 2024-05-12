package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.TrackerEventDeprecated;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;

/* renamed from: X.CEi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30992CEi extends AbstractC65781Prl implements InterfaceC65784Pro<TrackerEventDeprecated> {
    public static final C30992CEi LJLIL = new C30992CEi();

    public C30992CEi() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.model.TrackerEventDeprecated, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final TrackerEventDeprecated invoke() {
        return SettingsManager.INSTANCE.getValueSafely(UnusedLogOfflineSetting.class);
    }
}
