package com.ss.android.ugc.aweme.wire;

import X.C09900aA;
import X.C16880lQ;
import X.C35Y;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class WireUseageMonitor {
    public static final Set<C35Y> DEDUPLICATE_SET = new HashSet();

    public static String getStackTrace() {
        return Log.getStackTraceString(new Throwable());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void upload(final String str, final String str2) {
        Object obj = new Object(str, str2) { // from class: X.35Y
            public final String LIZ;
            public final String LIZIZ;

            public final int hashCode() {
                int hashCode;
                String str3 = this.LIZ;
                int i = 0;
                if (str3 == null) {
                    hashCode = 0;
                } else {
                    hashCode = str3.hashCode();
                }
                String str4 = this.LIZIZ;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                return hashCode + i;
            }

            public final boolean equals(Object obj2) {
                if (obj2 == null) {
                    return false;
                }
                C35Y c35y = (C35Y) obj2;
                String str3 = this.LIZ;
                if (str3 == null) {
                    if (c35y.LIZ != null) {
                        return false;
                    }
                } else if (!str3.equals(c35y.LIZ)) {
                    return false;
                }
                String str4 = this.LIZIZ;
                String str5 = c35y.LIZIZ;
                if (str4 == null) {
                    if (str5 != null) {
                        return false;
                    }
                } else if (!str4.equals(str5)) {
                    return false;
                }
                return true;
            }

            {
                this.LIZ = str;
                this.LIZIZ = str2;
            }
        };
        Set<C35Y> set = DEDUPLICATE_SET;
        if (set.contains(obj)) {
            return;
        }
        set.add(obj);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("class_name", str);
            jSONObject.put("method_name", str2);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C09900aA.LJIIJJI("wire_usage_monitor", 1, jSONObject);
    }
}
