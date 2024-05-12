package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePullPureAudioSetting;

/* loaded from: classes6.dex */
public final class BPW extends AbstractC65781Prl implements InterfaceC65784Pro<LivePullPureAudioSetting.PullPureAudioConfig> {
    public static final BPW LJLIL = new BPW();

    public BPW() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.livesetting.watchlive.LivePullPureAudioSetting$PullPureAudioConfig] */
    @Override // X.InterfaceC65784Pro
    public final LivePullPureAudioSetting.PullPureAudioConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LivePullPureAudioSetting.class);
        if (valueSafely == 0) {
            return LivePullPureAudioSetting.DEFAULT;
        }
        return valueSafely;
    }
}
