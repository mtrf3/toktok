package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.subscription.SubWaveLynxUrlSetting;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CD0 extends AbstractC65781Prl implements InterfaceC65784Pro<JSONObject> {
    public static final CD0 LJLIL = new CD0();

    public CD0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final JSONObject invoke() {
        try {
            return new JSONObject(SettingsManager.INSTANCE.getStringValue(SubWaveLynxUrlSetting.class));
        } catch (Exception unused) {
            return new JSONObject();
        }
    }
}
