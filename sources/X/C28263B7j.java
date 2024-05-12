package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.comp.api.subscription.base.flashcomponent.setting.FlashComponentSetting;
import org.json.JSONObject;

/* renamed from: X.B7j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28263B7j extends AbstractC65781Prl implements InterfaceC65784Pro<JSONObject> {
    public static final C28263B7j LJLIL = new C28263B7j();

    public C28263B7j() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final JSONObject invoke() {
        try {
            return new JSONObject(SettingsManager.INSTANCE.getStringValue(FlashComponentSetting.class));
        } catch (Exception unused) {
            return new JSONObject();
        }
    }
}
