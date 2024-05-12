package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.3il, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91673il {
    public static final /* synthetic */ int LIZ = 0;

    public static HashMap LIZ(String str) {
        HashMap LIZ2 = C1R5.LIZ(str, "createChannel");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source_app_id", EF7.LJIIIZ);
        jSONObject.put("source_type", 6);
        jSONObject.put("create_channel", str);
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "params.toString()");
        LIZ2.put("create", jSONObject2);
        LIZ2.put("group_create_type", String.valueOf(0));
        return LIZ2;
    }
}
