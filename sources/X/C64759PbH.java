package X;

import com.bytedance.ttnet.TTNetInit;
import org.json.JSONObject;

/* renamed from: X.PbH, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64759PbH {
    public static InterfaceC64788Pbk LIZ = null;
    public static volatile boolean LIZIZ = true;

    public static void LIZ(int i, String str, JSONObject jSONObject) {
        if (LIZ != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", str);
                jSONObject2.put("value", i);
                jSONObject2.put("ext_value", 0);
                jSONObject2.put("extraObject", jSONObject);
                TTNetInit.getTTNetDepend().LIZLLL();
            } catch (Throwable unused) {
            }
        }
    }
}
