package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.profile.model.UserPermissionData;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes5.dex */
public final class AVK {
    public static UserPermissionData.UserPermissionInfo LIZ() {
        Keva keva = AVJ.LIZ;
        if (!keva.contains("user_permission_info")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        LIZLLL(new JSONObject(keva.getString("user_permission_info", "")), hashMap);
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (!hashMap.containsKey(curUserId)) {
            return null;
        }
        Gson gson = new Gson();
        Object obj = hashMap.get(curUserId);
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        return (UserPermissionData.UserPermissionInfo) GsonProtectorUtils.fromJson(gson, (String) obj, UserPermissionData.UserPermissionInfo.class);
    }

    public static boolean LIZJ() {
        Keva keva = AVJ.LIZ;
        if (!keva.contains("user_permission_info")) {
            return true;
        }
        LIZLLL(new JSONObject(keva.getString("user_permission_info", "")), new HashMap());
        return !r1.containsKey(((RBX) HG3.LJIILL()).getCurUserId());
    }

    public static boolean LIZIZ() {
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            return false;
        }
        return AVJ.LIZ.getBoolean("use_current_user_info", false);
    }

    public static void LJ(String userPermissionInfo) {
        o.LJIIIZ(userPermissionInfo, "userPermissionInfo");
        if (!s.LJJJLZIJ(userPermissionInfo, OHQ.LIZIZ, false) || !s.LJJJLZIJ(userPermissionInfo, "age_gate_region", false)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(((RBX) HG3.LJIILL()).getCurUserId(), userPermissionInfo);
        Keva keva = AVJ.LIZ;
        if (keva.contains("user_permission_info")) {
            LIZLLL(new JSONObject(keva.getString("user_permission_info", "")), hashMap);
        }
        keva.storeString("user_permission_info", new JSONObject(hashMap).toString());
    }

    public static void LIZLLL(JSONObject jSONObject, HashMap hashMap) {
        Iterator<String> keys = jSONObject.keys();
        o.LJIIIIZZ(keys, "myObj.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.get(next));
        }
    }
}
