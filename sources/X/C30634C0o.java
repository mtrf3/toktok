package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePollContainerBgColorSetting;

/* renamed from: X.C0o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30634C0o extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C30634C0o LJLIL = new C30634C0o();

    public C30634C0o() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        String stringValue = SettingsManager.INSTANCE.getStringValue(LivePollContainerBgColorSetting.class);
        if (stringValue == null) {
            return "";
        }
        return stringValue;
    }
}
