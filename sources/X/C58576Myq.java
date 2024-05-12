package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.live.model.VolumeDetectConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveVolumeDetectSetting;

/* renamed from: X.Myq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58576Myq extends AbstractC65781Prl implements InterfaceC65784Pro<VolumeDetectConfig> {
    public static final C58576Myq LJLIL = new C58576Myq();

    public C58576Myq() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.live.model.VolumeDetectConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final VolumeDetectConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveVolumeDetectSetting.class);
        if (valueSafely == 0) {
            return LiveVolumeDetectSetting.DEFAULT;
        }
        return valueSafely;
    }
}
