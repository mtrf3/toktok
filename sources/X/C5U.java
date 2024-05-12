package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.MultiDeviceInterruptGuideData;
import com.bytedance.android.livesdk.livesetting.game.MultiDeviceInterruptGuideSetting;

/* loaded from: classes6.dex */
public final class C5U extends AbstractC65781Prl implements InterfaceC65784Pro<MultiDeviceInterruptGuideData> {
    public static final C5U LJLIL = new C5U();

    public C5U() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.game.MultiDeviceInterruptGuideData, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final MultiDeviceInterruptGuideData invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(MultiDeviceInterruptGuideSetting.class);
        if (valueSafely == 0) {
            return MultiDeviceInterruptGuideSetting.DEFAULT;
        }
        return valueSafely;
    }
}
