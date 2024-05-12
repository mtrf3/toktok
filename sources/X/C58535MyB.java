package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.other.LivePrivilegeCenterSchemaSetting;

/* renamed from: X.MyB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58535MyB extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C58535MyB LJLIL = new C58535MyB();

    public C58535MyB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        String stringValue = SettingsManager.INSTANCE.getStringValue(LivePrivilegeCenterSchemaSetting.class);
        if (stringValue == null) {
            return LivePrivilegeCenterSchemaSetting.DEFAULT;
        }
        return stringValue;
    }
}
