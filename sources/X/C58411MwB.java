package X;

import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.MwB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58411MwB {
    public final java.util.Map<OSZ<String, String>, O5M> LIZ;
    public final Context LIZIZ;

    public C58411MwB(Context context) {
        o.LJIIJ(context, "context");
        this.LIZIZ = context;
        this.LIZ = new LinkedHashMap();
    }

    public final O5M LIZ(String sessionId, String accessKey) {
        o.LJIIJ(sessionId, "sessionId");
        o.LJIIJ(accessKey, "accessKey");
        OSZ osz = new OSZ(sessionId, accessKey);
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZ;
        O5M o5m = (O5M) linkedHashMap.get(osz);
        if (o5m != null) {
            return o5m;
        }
        O5M o5m2 = new O5M(this.LIZIZ, accessKey);
        linkedHashMap.put(osz, o5m2);
        return o5m2;
    }
}
