package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleFallBackSetting;

/* loaded from: classes6.dex */
public final class CEE extends AbstractC65781Prl implements InterfaceC65784Pro<LiveCapsuleFallBackSetting.CapsuleTypeScene[]> {
    public static final CEE LJLIL = new CEE();

    public CEE() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleFallBackSetting$CapsuleTypeScene[], java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LiveCapsuleFallBackSetting.CapsuleTypeScene[] invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveCapsuleFallBackSetting.class);
        if (valueSafely == 0) {
            return LiveCapsuleFallBackSetting.DEFAULT;
        }
        return valueSafely;
    }
}
