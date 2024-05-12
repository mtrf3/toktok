package X;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.Ixh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48313Ixh {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(int i, String str) {
        LIZJ("rd_ec_media_auto_play", C113554cx.LJJL(new OSZ("page_name", "mall"), new OSZ("media_type", "live"), new OSZ("item_id", str), new OSZ("rd_page_type", "native"), new OSZ("value", Integer.valueOf(i))));
    }

    public static void LIZJ(String str, java.util.Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        C48658J7u.LIZIZ(str, jSONObject);
    }

    public static void LIZ(Boolean bool, String str, String str2, String str3) {
        OSZ[] oszArr = new OSZ[6];
        boolean z = false;
        oszArr[0] = new OSZ("page_name", "live");
        oszArr[1] = new OSZ("media_type", "live");
        oszArr[2] = new OSZ("item_id", str2);
        oszArr[3] = new OSZ("rd_page_type", "native");
        if (str3 == null) {
            str3 = "-1";
        }
        oszArr[4] = new OSZ("duration", str3);
        if (bool != null) {
            z = bool.booleanValue();
        }
        oszArr[5] = new OSZ("is_playing", Boolean.valueOf(z));
        LIZJ(str, C113554cx.LJJL(oszArr));
    }
}
