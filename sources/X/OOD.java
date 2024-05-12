package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.live.model.LivePreviewCardMaskConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreViewMaskSettings;

/* loaded from: classes11.dex */
public final class OOD extends AbstractC65781Prl implements InterfaceC65784Pro<LivePreviewCardMaskConfig> {
    public static final OOD LJLIL = new OOD();

    public OOD() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.live.model.LivePreviewCardMaskConfig] */
    @Override // X.InterfaceC65784Pro
    public final LivePreviewCardMaskConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LivePreViewMaskSettings.class);
        if (valueSafely == 0) {
            return LivePreViewMaskSettings.INSTANCE.getDEFAULT();
        }
        return valueSafely;
    }
}
