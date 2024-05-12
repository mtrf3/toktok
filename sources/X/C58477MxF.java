package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftMsgQueueFetchStrategyFix;

/* renamed from: X.MxF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58477MxF extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C58477MxF LJLIL = new C58477MxF();

    public C58477MxF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveGiftMsgQueueFetchStrategyFix.class));
    }
}
