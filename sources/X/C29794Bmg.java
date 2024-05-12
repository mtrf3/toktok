package X;

import com.bytedance.android.livesdk.livesetting.level.FansClubReadConfigFailMonitorSetting;
import org.json.JSONObject;

/* renamed from: X.Bmg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29794Bmg {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2) {
        if (FansClubReadConfigFailMonitorSetting.INSTANCE.getValue()) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            C05630Jz.LJI(jSONObject, WM7.SCENE_SERVICE, str);
            C05630Jz.LJI(jSONObject3, "error_string", str2);
            C05630Jz.LIZJ("extra", jSONObject4, jSONObject3);
            C0K2.LJI("fans_club_disk_read_fail_event", jSONObject, jSONObject2, jSONObject4);
        }
    }
}
