package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveUserRiskVerify;
import com.bytedance.android.livesdk.livesetting.gift.LiveUserRiskVerifySetting;

/* loaded from: classes6.dex */
public final class CLJ extends AbstractC65781Prl implements InterfaceC65784Pro<LiveUserRiskVerify> {
    public static final CLJ LJLIL = new CLJ();

    public CLJ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.gift.LiveUserRiskVerify, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LiveUserRiskVerify invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveUserRiskVerifySetting.class);
        if (valueSafely == 0) {
            return LiveUserRiskVerifySetting.DEFAULT;
        }
        return valueSafely;
    }
}
