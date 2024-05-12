package X;

import java.util.UUID;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.a3C, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91970a3C {
    public static final String LIZ;

    static {
        String uuid = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid, "randomUUID().toString()");
        LIZ = uuid;
    }

    public static String LIZ(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.put("device_fingerprint_id", LIZ);
                return jSONObject.toString();
            } catch (Throwable th) {
                System.out.println((Object) o.LJIILLIIL(th, "fail to concatenate risk info: "));
            }
        }
        return null;
    }
}
