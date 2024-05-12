package X;

import com.bytedance.android.live_settings.Monitor;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.SettingManagerCustomTypeOptSetting;
import defpackage.b1;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CMk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31202CMk implements Monitor {
    public final boolean LIZ;

    public C31202CMk(boolean z) {
        this.LIZ = z;
    }

    @Override // com.bytedance.android.live_settings.Monitor
    public final void reportException(String scene, String msg) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(msg, "msg");
        JSONObject jSONObject = new JSONObject();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(scene);
        LIZ.append(", ");
        LIZ.append(msg);
        JSONObject put = jSONObject.put("exception", X1D.LIZIZ(LIZ));
        InterfaceC31203CMl interfaceC31203CMl = C0K2.LIZ;
        if (interfaceC31203CMl == null) {
            return;
        }
        interfaceC31203CMl.LJIJI(put);
    }

    public final void LIZ(long j, String str, String str2, boolean z) {
        if (this.LIZ) {
            StringBuilder LIZJ = b1.LIZJ(str, " getValue cost ");
            LIZJ.append(((float) j) / 1000.0f);
            LIZJ.append(" us, fieldTypeName is: ");
            LIZJ.append(str2);
            LIZJ.append(", fromCache is ");
            LIZJ.append(z);
            C0NB.LJIIIZ("Live-Settings-Manager", X1D.LIZIZ(LIZJ));
            return;
        }
        if (!LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_setting_manager_performance", 0.001d)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fromCache", z);
        JSONObject LIZJ2 = C65232Piu.LIZJ("setting_key", str);
        LIZJ2.put("duration", Float.valueOf(((float) j) / 1000.0f));
        LIZJ2.put("field_type_name", str2);
        C0K2.LJI("ttlive_setting_manager_performance", jSONObject, LIZJ2, new JSONObject());
    }

    @Override // com.bytedance.android.live_settings.Monitor
    public final void reportSettingReadPerformance(String str, long j, String str2, boolean z) {
        if (((int) (Math.random() * 10000)) >= C30922CBq.LJI) {
            return;
        }
        if (SettingManagerCustomTypeOptSetting.enableOpt()) {
            C38995FSd.LIZIZ().submit(new RunnableC31204CMm(this, str, j, str2, z));
        } else {
            LIZ(j, str, str2, z);
        }
    }
}
