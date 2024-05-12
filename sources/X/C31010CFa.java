package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveBattleDrawOnceMoreDurationOptSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.SettingsParams;

/* renamed from: X.CFa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31010CFa extends AbstractC65781Prl implements InterfaceC65784Pro<SettingsParams> {
    public static final C31010CFa LJLIL = new C31010CFa();

    public C31010CFa() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.linkmic.SettingsParams, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final SettingsParams invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveBattleDrawOnceMoreDurationOptSettings.class);
        if (valueSafely == 0) {
            return LiveBattleDrawOnceMoreDurationOptSettings.DEFAULT;
        }
        return valueSafely;
    }
}
