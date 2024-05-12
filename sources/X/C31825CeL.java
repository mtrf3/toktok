package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.other.LiveFileMonitorSampleSetting;
import org.json.JSONObject;

/* renamed from: X.CeL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31825CeL extends AbstractC65781Prl implements InterfaceC65784Pro<JSONObject> {
    public static final C31825CeL LJLIL = new C31825CeL();

    public C31825CeL() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [org.json.JSONObject, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final JSONObject invoke() {
        return SettingsManager.INSTANCE.getValueSafely(LiveFileMonitorSampleSetting.class);
    }
}
