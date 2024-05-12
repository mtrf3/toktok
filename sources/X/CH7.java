package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterEducationSetting;

/* loaded from: classes6.dex */
public final class CH7 extends AbstractC65781Prl implements InterfaceC65784Pro<LiveGiftNewGifterEducationSetting.NewGifterConfig> {
    public static final CH7 LJLIL = new CH7();

    public CH7() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterEducationSetting$NewGifterConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LiveGiftNewGifterEducationSetting.NewGifterConfig invoke() {
        return SettingsManager.INSTANCE.getValueSafely(LiveGiftNewGifterEducationSetting.class);
    }
}
