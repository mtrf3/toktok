package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.gift.SendGiftRetrySetting;

/* loaded from: classes6.dex */
public final class CEH extends AbstractC65781Prl implements InterfaceC65784Pro<SendGiftRetrySetting.SettingParams> {
    public static final CEH LJLIL = new CEH();

    public CEH() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.gift.SendGiftRetrySetting$SettingParams, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final SendGiftRetrySetting.SettingParams invoke() {
        return SettingsManager.INSTANCE.getValueSafely(SendGiftRetrySetting.class);
    }
}
