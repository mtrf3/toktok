package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveGiftAnnouncementFrequencySetting;

/* loaded from: classes6.dex */
public final class CK9 extends AbstractC65781Prl implements InterfaceC65784Pro<LiveGiftAnnouncementFrequencySetting.AnnouncementFrequencyConfig> {
    public static final CK9 LJLIL = new CK9();

    public CK9() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.roomfunction.LiveGiftAnnouncementFrequencySetting$AnnouncementFrequencyConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LiveGiftAnnouncementFrequencySetting.AnnouncementFrequencyConfig invoke() {
        return SettingsManager.INSTANCE.getValueSafely(LiveGiftAnnouncementFrequencySetting.class);
    }
}
