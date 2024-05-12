package X;

import android.os.Build;
import com.ss.android.common.lib.AppLogNewUtils;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Y5d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86809Y5d implements Y6J {
    public final Y6P LIZ;

    public C86809Y5d(Y6P y6p) {
        this.LIZ = y6p;
    }

    @Override // X.Y6J
    public void onEvent(String event) {
        o.LJIIIZ(event, "event");
        JSONObject jSONObject = new JSONObject();
        Y6P y6p = this.LIZ;
        if (y6p == null) {
            AppLogNewUtils.onEventV3(event, jSONObject);
        } else {
            y6p.onEvent(event, jSONObject);
        }
    }

    @Override // X.Y6J
    public final void LIZ(C86826Y5u c86826Y5u, C86825Y5t c86825Y5t) {
        if (c86826Y5u.LIZ.length() == 0) {
            throw new RuntimeException("SDK id is Empty");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sdk_aid", c86826Y5u.LIZ);
        jSONObject.put("sdk_version", c86826Y5u.LIZIZ);
        String str = c86825Y5t.LIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        jSONObject.put("app_version", str);
        String str3 = c86825Y5t.LIZIZ;
        if (str3 != null) {
            str2 = str3;
        }
        jSONObject.put("update_version_code", str2);
        jSONObject.put("os_version", Build.VERSION.RELEASE);
        Y6P y6p = this.LIZ;
        if (y6p == null) {
            AppLogNewUtils.onEventV3("sdk_session_launch", jSONObject);
        } else {
            y6p.onEvent("sdk_session_launch", jSONObject);
        }
    }
}
