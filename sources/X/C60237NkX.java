package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NkX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60237NkX {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, android.net.Uri uri, android.net.Uri uri2, JSONObject jSONObject, JSONObject jSONObject2, String str3) {
        InterfaceC60276NlA interfaceC60276NlA = (InterfaceC60276NlA) C60373Nmj.LIZIZ().LIZJ(InterfaceC60276NlA.class, str);
        if (interfaceC60276NlA != null) {
            Boolean bool = null;
            C60547NpX c60547NpX = new C60547NpX(str2, null, null, 254);
            if (str3 != null && str3.length() != 0) {
                InterfaceC60311Nlj<String, Object> LJII = C60373Nmj.LIZIZ().LJII(str3);
                if (LJII != null) {
                    bool = LJII.getBoolean("res_memory");
                }
                jSONObject.put("res_memory", o.LJ(bool, Boolean.TRUE) ? 1 : 0);
            }
            c60547NpX.LJI = jSONObject;
            c60547NpX.LJII = jSONObject2;
            if (uri2 == null) {
                c60547NpX.LJ = uri.toString();
            } else {
                c60547NpX.LIZJ = new C60550Npa(uri2);
            }
            interfaceC60276NlA.LJ(c60547NpX);
        }
    }

    public static void LIZIZ(String str, android.net.Uri uri, String str2, String str3, String str4, long j, int i) {
        android.net.Uri uri2 = uri;
        String bid = str;
        if ((i & 1) != 0) {
            bid = "default_bid";
        }
        if ((i & 4) != 0) {
            uri2 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        o.LJIIJ(bid, "bid");
        android.net.Uri uri3 = android.net.Uri.EMPTY;
        o.LJFF(uri3, "Uri.EMPTY");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("schema", "unknown");
        jSONObject.put("type", str2);
        jSONObject.put("status", str3);
        if (str4 != null) {
            jSONObject.put("error_message", str4);
        }
        LIZ(bid, "bdx_monitor_router_close", uri3, uri2, jSONObject, Q7K.LIZLLL("duration", j), null);
    }

    public static void LIZJ(String bid, android.net.Uri uri, android.net.Uri uri2, String str, String str2, String str3, long j, Long l, String sessionId) {
        android.net.Uri uri3;
        String str4;
        o.LJIIJ(bid, "bid");
        o.LJIIJ(sessionId, "sessionId");
        if (uri != null) {
            uri3 = uri;
        } else {
            uri3 = android.net.Uri.EMPTY;
            o.LJFF(uri3, "Uri.EMPTY");
        }
        JSONObject jSONObject = new JSONObject();
        if (uri == null || (str4 = uri.toString()) == null) {
            str4 = "unknown";
        }
        jSONObject.put("schema", str4);
        jSONObject.put("type", str);
        jSONObject.put("status", str2);
        if (str3 != null) {
            jSONObject.put("error_message", str3);
        }
        JSONObject LIZLLL = Q7K.LIZLLL("duration", j);
        if (l != null) {
            LIZLLL.put("bullet_duration", l.longValue());
        }
        LIZ(bid, "bdx_monitor_router_open", uri3, uri2, jSONObject, LIZLLL, sessionId);
    }
}
