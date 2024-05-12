package X;

import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.AqN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27475AqN {
    public static C27474AqM LIZ(Intent intent) {
        java.util.Map LJJJLIIL;
        String str;
        boolean z;
        String str2;
        long j;
        String str3;
        Long l;
        o.LJIIIZ(intent, "intent");
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI == null || (LJJJLIIL = C27739Aud.LIZLLL(LLJJIJI, "trackParams")) == null) {
            LJJJLIIL = C113554cx.LJJJLIIL();
        }
        Object obj = LJJJLIIL.get("enter_from");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (o.LJ(str, "notification_page") && C54316LTk.LIZIZ) {
            z = true;
            str2 = "seller_message";
        } else {
            z = false;
            str2 = "shop_message";
        }
        Bundle LLJJIJI2 = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI2 != null) {
            j = LLJJIJI2.getLong("key_launch_time");
        } else {
            j = 0;
        }
        Bundle LLJJIJI3 = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI3 == null || (str3 = LLJJIJI3.getString("previous_page")) == null) {
            str3 = "";
        }
        Object obj2 = LJJJLIIL.get("start_click_time");
        if ((obj2 instanceof Long) && (l = (Long) obj2) != null) {
            j = l.longValue();
        }
        return new C27474AqM(str2, str, str3, j, z);
    }
}
