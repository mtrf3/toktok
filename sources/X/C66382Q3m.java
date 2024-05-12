package X;

import com.facebook.AccessToken;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Q3m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66382Q3m {
    public static AccessToken LIZIZ() {
        return C66393Q3x.LJFF.LIZ().LIZJ;
    }

    public static boolean LIZJ() {
        AccessToken accessToken = C66393Q3x.LJFF.LIZ().LIZJ;
        if (accessToken != null && !new Date().after(accessToken.expires)) {
            return true;
        }
        return false;
    }

    public static AccessToken LIZ(JSONObject jSONObject) {
        Collection LJJ;
        if (jSONObject.getInt("version") <= 1) {
            String token = jSONObject.getString("token");
            Date date = new Date(jSONObject.getLong("expires_at"));
            JSONArray permissionsArray = jSONObject.getJSONArray(OHQ.LIZIZ);
            JSONArray declinedPermissionsArray = jSONObject.getJSONArray("declined_permissions");
            JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jSONObject.getLong("last_refresh"));
            String string = jSONObject.getString("source");
            o.LJIIIIZZ(string, "jsonObject.getString(SOURCE_KEY)");
            EnumC66385Q3p valueOf = EnumC66385Q3p.valueOf(string);
            String applicationId = jSONObject.getString("application_id");
            String userId = jSONObject.getString("user_id");
            Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0L));
            String optString = jSONObject.optString("graph_domain", null);
            o.LJIIIIZZ(token, "token");
            o.LJIIIIZZ(applicationId, "applicationId");
            o.LJIIIIZZ(userId, "userId");
            o.LJIIIIZZ(permissionsArray, "permissionsArray");
            List<String> LJJ2 = C66373Q3d.LJJ(permissionsArray);
            o.LJIIIIZZ(declinedPermissionsArray, "declinedPermissionsArray");
            List<String> LJJ3 = C66373Q3d.LJJ(declinedPermissionsArray);
            if (optJSONArray == null) {
                LJJ = new ArrayList();
            } else {
                LJJ = C66373Q3d.LJJ(optJSONArray);
            }
            return new AccessToken(token, applicationId, userId, LJJ2, LJJ3, LJJ, valueOf, date, date2, date3, optString);
        }
        throw new Q4W("Unknown AccessToken serialization format.");
    }
}
