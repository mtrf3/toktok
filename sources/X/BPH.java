package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAboutMeMergeConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAboutMeMergeSetting;

/* loaded from: classes6.dex */
public final class BPH extends AbstractC65781Prl implements InterfaceC65784Pro<LiveAboutMeMergeConfig> {
    public static final BPH LJLIL = new BPH();

    public BPH() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.livesetting.broadcast.LiveAboutMeMergeConfig] */
    @Override // X.InterfaceC65784Pro
    public final LiveAboutMeMergeConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveAboutMeMergeSetting.class);
        if (valueSafely == 0) {
            return LiveAboutMeMergeSetting.DEFAULT;
        }
        return valueSafely;
    }
}
