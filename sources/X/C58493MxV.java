package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftCpcFaqUrlSetting;

/* renamed from: X.MxV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58493MxV extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C58493MxV LJLIL = new C58493MxV();

    public C58493MxV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        return SettingsManager.INSTANCE.getStringValue(LiveGiftCpcFaqUrlSetting.class);
    }
}
