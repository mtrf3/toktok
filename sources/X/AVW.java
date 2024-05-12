package X;

import Y.IDComparatorS32S0000000_4;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.UserPermissionData;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class AVW {
    public static JSONArray LIZ(List loggedInAccounts) {
        String permissions;
        String str;
        o.LJIIIZ(loggedInAccounts, "loggedInAccounts");
        JSONArray jSONArray = new JSONArray();
        int size = loggedInAccounts.size();
        int i = 0;
        while (i < size) {
            SignificantUserInfo significantUserInfo = (SignificantUserInfo) ListProtector.get(loggedInAccounts, i);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("user_id", significantUserInfo.uid);
            List<BaseLoginMethod> LJI = C68517Qun.LIZ.LJI(significantUserInfo.uid);
            if (!((ArrayList) LJI).isEmpty()) {
                jSONObject.put("login_platform", R5D.LIZIZ((BaseLoginMethod) ListProtector.get(ORZ.LLILII(new IDComparatorS32S0000000_4(16), LJI), 0)));
            }
            i++;
            jSONObject.put("order", i);
            UserPermissionData.UserPermissionInfo LIZ = AVK.LIZ();
            if (LIZ == null || (permissions = LIZ.getPermissions()) == null || permissions.length() == 0) {
                jSONObject.put("age_gate_region", "");
                jSONObject.put("has_permission", "");
            } else {
                Iterator<Map.Entry<String, Boolean>> it = LIZ.permissionsMap().entrySet().iterator();
                while (it.hasNext()) {
                    it.next();
                    String str2 = UserPermissionData.UserPermissionRequestType.DEFAULT_TYPE.toString();
                    if (LIZ.permissionsMap().containsKey(str2)) {
                        if (o.LJ(LIZ.permissionsMap().get(str2), Boolean.TRUE)) {
                            str = "1";
                        } else {
                            str = CardStruct.IStatusCode.DEFAULT;
                        }
                        jSONObject.put("has_permission", str);
                    }
                }
                jSONObject.put("age_gate_region", LIZ.getAgeGateRegion());
            }
            jSONObject.put("current_user_store_region", C64707PaR.LIZJ);
            jSONArray.put(jSONObject.toString());
        }
        return jSONArray;
    }
}
