package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.36L, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36L {
    public static String LIZ() {
        String secUid;
        User LIZJ = C80763Ey.LIZJ();
        if (LIZJ == null || (secUid = LIZJ.getSecUid()) == null) {
            return "";
        }
        return secUid;
    }

    public static long LIZIZ() {
        Long LJJIZ = C38350F3i.LJJIZ(C80763Ey.LIZIZ());
        if (LJJIZ != null) {
            return LJJIZ.longValue();
        }
        return -1L;
    }

    public static boolean LIZJ(IMUser iMUser) {
        if (iMUser == null || !C80763Ey.LIZ(false).equals(iMUser.getUid())) {
            return false;
        }
        return true;
    }

    public static void LJ(String str, java.util.Map<String, Object> map) {
        LIZLLL(str, null, "im_error_event", map);
    }

    public static void LIZLLL(String str, String str2, String str3, java.util.Map map) {
        JSONObject jSONObject = new JSONObject();
        if (!map.isEmpty()) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str);
                    LIZ.append("_");
                    LIZ.append(str2);
                    jSONObject.put("service", X1D.LIZIZ(LIZ));
                } else {
                    jSONObject.put("service", str);
                }
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
                C09900aA.LJ(str3, jSONObject);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }
}
