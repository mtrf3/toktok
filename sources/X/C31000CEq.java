package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayMatchPointsSetting;

/* renamed from: X.CEq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31000CEq extends AbstractC65781Prl implements InterfaceC65784Pro<LiveGiftTrayMatchPointsSetting.GiftTrayMatchPointsConfig> {
    public static final C31000CEq LJLIL = new C31000CEq();

    public C31000CEq() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayMatchPointsSetting$GiftTrayMatchPointsConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LiveGiftTrayMatchPointsSetting.GiftTrayMatchPointsConfig invoke() {
        return SettingsManager.INSTANCE.getValueSafely(LiveGiftTrayMatchPointsSetting.class);
    }
}
