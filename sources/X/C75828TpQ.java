package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicStateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.StateConfig;

/* renamed from: X.TpQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75828TpQ extends AbstractC65781Prl implements InterfaceC65784Pro<StateConfig> {
    public static final C75828TpQ LJLIL = new C75828TpQ();

    public C75828TpQ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.linkmic.StateConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final StateConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LinkMicStateSetting.class);
        if (valueSafely == 0) {
            return LinkMicStateSetting.DEFAULT;
        }
        return valueSafely;
    }
}
