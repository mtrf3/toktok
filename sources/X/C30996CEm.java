package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestPageFirstFrameLogConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestPageFirstFrameLogSetting;

/* renamed from: X.CEm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30996CEm extends AbstractC65781Prl implements InterfaceC65784Pro<LinkMicMultiGuestPageFirstFrameLogConfig> {
    public static final C30996CEm LJLIL = new C30996CEm();

    public C30996CEm() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestPageFirstFrameLogConfig] */
    @Override // X.InterfaceC65784Pro
    public final LinkMicMultiGuestPageFirstFrameLogConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LinkMicMultiGuestPageFirstFrameLogSetting.class);
        if (valueSafely == 0) {
            return LinkMicMultiGuestPageFirstFrameLogSetting.DEFAULT;
        }
        return valueSafely;
    }
}
