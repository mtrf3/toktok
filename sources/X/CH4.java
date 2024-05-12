package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPostRechargeRetentionSetting;
import com.bytedance.android.livesdk.livesetting.gift.PostRechargeRetentionParams;

/* loaded from: classes6.dex */
public final class CH4 extends AbstractC65781Prl implements InterfaceC65784Pro<PostRechargeRetentionParams> {
    public static final CH4 LJLIL = new CH4();

    public CH4() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.gift.PostRechargeRetentionParams, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final PostRechargeRetentionParams invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveGiftPostRechargeRetentionSetting.class);
        if (valueSafely == 0) {
            return LiveGiftPostRechargeRetentionSetting.INSTANCE.getDEFAULT();
        }
        return valueSafely;
    }
}
