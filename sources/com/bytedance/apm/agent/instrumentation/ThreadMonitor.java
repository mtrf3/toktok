package com.bytedance.apm.agent.instrumentation;

import X.C09970aH;
import X.C77357UXp;
import X.C79234V7u;
import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ThreadMonitor {
    public static boolean isDebuggable() {
        boolean z;
        Context context = C09970aH.LIZ;
        Boolean bool = C79234V7u.LJLILLLLZI;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context != null) {
            try {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                C79234V7u.LJLILLLLZI = valueOf;
                return valueOf.booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean isLocalChannel() {
        JSONObject jSONObject = C09970aH.LJFF;
        if (jSONObject == null || jSONObject.optString("channel") == null) {
            return false;
        }
        return C09970aH.LJFF.optString("channel").contains("local");
    }

    public static void sleepMonitor(long j) {
        if (C77357UXp.LJJIIJZLJL() && j > 10 && !isDebuggable()) {
            isLocalChannel();
        }
        Thread.sleep(j);
    }
}
