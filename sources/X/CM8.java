package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveFlymicGiftDowngradeStrategy;

/* loaded from: classes6.dex */
public final class CM8 extends AbstractC65781Prl implements InterfaceC65784Pro<LiveFlymicGiftDowngradeStrategy.SettingParams> {
    public static final CM8 LJLIL = new CM8();

    public CM8() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.gift.LiveFlymicGiftDowngradeStrategy$SettingParams, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LiveFlymicGiftDowngradeStrategy.SettingParams invoke() {
        return SettingsManager.INSTANCE.getValueSafely(LiveFlymicGiftDowngradeStrategy.class);
    }
}
