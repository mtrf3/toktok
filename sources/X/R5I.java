package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R5I {
    public static void LIZ(Activity activity, Bundle data, List methods, R47 r47) {
        BaseLoginMethod baseLoginMethod;
        Long lastActiveTime;
        long time;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(data, "data");
        o.LJIIIZ(methods, "methods");
        HashMap hashMap = new HashMap();
        java.util.Map LIZJ = C68972R5c.LIZJ(data);
        if (LIZJ != null) {
            hashMap.putAll(LIZJ);
        }
        hashMap.put("show_user_cnt", Integer.valueOf(methods.size()));
        hashMap.put("trust_one_click_is_show", 1);
        hashMap.put("login_last_time", 1);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = new JSONArray();
        int size = methods.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = new JSONObject();
            try {
                baseLoginMethod = (BaseLoginMethod) ListProtector.get(methods, i);
                String LIZIZ = R5D.LIZIZ(baseLoginMethod);
                hashSet.add(LIZIZ);
                jSONObject.put("user_id", baseLoginMethod.getUid());
                jSONObject.put("platform", LIZIZ);
                lastActiveTime = baseLoginMethod.getLastActiveTime();
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            if (lastActiveTime != null) {
                time = 0;
                if (lastActiveTime.longValue() > 0) {
                    Long lastActiveTime2 = baseLoginMethod.getLastActiveTime();
                    if (lastActiveTime2 != null) {
                        time = lastActiveTime2.longValue();
                    }
                    jSONArray.put(jSONObject.put("last_active", R3P.LIZ(time)));
                }
            }
            time = baseLoginMethod.getExpires().getTime() - 2592000000L;
            jSONArray.put(jSONObject.put("last_active", R3P.LIZ(time)));
        }
        String jSONArray2 = jSONArray.toString();
        o.LJIIIIZZ(jSONArray2, "JSONArray().apply {\n    …\n            }.toString()");
        hashMap.put("user_detail", jSONArray2);
        data.putString("login_panel_type", "oneclick_login");
        data.putString("enter_type", "oneclick_login");
        Intent intent = new Intent(activity, (Class<?>) LoginMethodListActivity.class);
        intent.putExtra("next_page", EnumC69113RAn.ONE_KEY_LOGIN.getValue());
        EnumC69116RAq enumC69116RAq = EnumC69116RAq.ONE_KEY_LOGIN;
        intent.putExtra("current_scene", enumC69116RAq.getValue());
        intent.putExtras(data);
        intent.putExtra("action_type", enumC69116RAq.getValue());
        intent.putExtra("origin_bundle", data);
        intent.putExtra("ONE_KEY_LOGIN_MOB_PARAMS", hashMap);
        intent.setFlags(536870912);
        CommonFlowActivity.Companion.LIZ(activity, enumC69116RAq.getValue(), r47, Boolean.FALSE);
        C16880lQ.LIZIZ(activity, intent);
        activity.overridePendingTransition(R.anim.a4, 0);
    }
}
