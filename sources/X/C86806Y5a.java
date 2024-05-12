package X;

import android.os.Build;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import rj2.a$a;

/* renamed from: X.Y5a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86806Y5a {
    public static final void onEvent(String event) {
        o.LJIIIZ(event, "event");
        AppLogNewUtils.onEventV3(event, new JSONObject(new LinkedHashMap()));
    }

    public static final void LIZ(C86823Y5r c86823Y5r, a$a a_a) {
        String str;
        String str2;
        if (c86823Y5r.LIZ.length() == 0) {
            throw new RuntimeException("SDK id is Empty");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdk_aid", c86823Y5r.LIZ);
        linkedHashMap.put("sdk_version", c86823Y5r.LIZIZ);
        String str3 = "";
        if (a_a == null || (str = a_a.LIZ) == null) {
            str = "";
        }
        linkedHashMap.put("app_version", str);
        if (a_a != null && (str2 = a_a.LIZIZ) != null) {
            str3 = str2;
        }
        linkedHashMap.put("update_version_code", str3);
        linkedHashMap.put("os_version", Build.VERSION.RELEASE);
        AppLogNewUtils.onEventV3("sdk_session_launch", new JSONObject(linkedHashMap));
    }
}
