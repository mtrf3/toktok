package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OHL {
    public static final HashMap<String, OHO> LIZ;

    static {
        HashMap<String, OHO> hashMap = new HashMap<>();
        LIZ = hashMap;
        OHI.LIZ.getClass();
        if (OHI.LIZLLL()) {
            hashMap.put("android.permission.ACCEPT_HANDOVER", new OHM());
            hashMap.put("android.permission.ACCESS_NOTIFICATION_POLICY", new OHN());
            hashMap.put("android.permission.MANAGE_EXTERNAL_STORAGE", new OHK());
            hashMap.put("android.permission.SYSTEM_ALERT_WINDOW", new OHJ());
        }
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public static OHO LIZ(String str) {
        o.LJIIIZ(str, OHQ.LIZ);
        return LIZ.get(str);
    }
}
