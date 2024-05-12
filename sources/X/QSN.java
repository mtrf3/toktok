package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.ad.feed.CommercializeFeedServiceImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.awemepushlib.events.PushShowInterceptEvent;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QSN {
    public static void LIZ(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (JSONObjectProtectorUtils.getInt(new JSONObject(str), "IsCommerce") == 1) {
                CommercializeFeedServiceImpl.LIZLLL().LIZJ(str, z);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LIZLLL(String str, boolean z) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        android.net.Uri parse = UriProtector.parse(str);
        if (TextUtils.equals(UriProtector.getQueryParameter(parse, "gd_label"), "click_push_user")) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "push_out_app");
            c188727au.LJIIIZ("scene_type", "push");
            c188727au.LJIIIZ("action_type", "show");
            c188727au.LJIIIZ("to_user_id", UriProtector.getQueryParameter(parse, "to_user_id"));
            c188727au.LJIIIZ("rule_id", UriProtector.getQueryParameter(parse, "rule_id"));
            c188727au.LJIIIZ("rec_type", UriProtector.getQueryParameter(parse, "rec_type"));
            c188727au.LJIIIZ("follow_type", UriProtector.getQueryParameter(parse, "follow_type"));
            c188727au.LJIIIZ("relation_type", UriProtector.getQueryParameter(parse, "relation_type"));
            FMX.LJIIL("follow_recommend", c188727au.LIZ);
        }
        String host = parse.getHost();
        List<String> pathSegments = parse.getPathSegments();
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(parse);
        StringBuilder sb = new StringBuilder("//");
        sb.append(host);
        for (String str3 : pathSegments) {
            if (!TextUtils.isEmpty(str3)) {
                sb.append("/");
                try {
                    CastLongProtector.parseLong(str3);
                    sb.append("xxx");
                } catch (NumberFormatException unused) {
                    sb.append(str3);
                }
            }
        }
        if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
            sb.append("?");
            Iterator<String> it = queryParameterNames.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                if (it.hasNext()) {
                    sb.append("&");
                }
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("open_url", sb.toString());
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_push", str2);
            FUA.LIZIZ("deep_link_collect", "", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LJFF(C67230Qa2 c67230Qa2, int i) {
        boolean z;
        boolean z2;
        int i2 = 0;
        if (!TextUtils.isEmpty(c67230Qa2.imageUrl) || !TextUtils.isEmpty(c67230Qa2.extra.largeModeIconUrl)) {
            z = true;
        } else {
            z = false;
        }
        if (C84763XOl.LJIIIIZZ() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        JSONObject jSONObject = new JSONObject(C67228Qa0.LIZIZ(c67230Qa2, i, z2, z));
        try {
            jSONObject.put("real_receive_time", System.currentTimeMillis());
            if (AccountService.LJIJ().LJFF().isChildrenMode()) {
                i2 = 1;
            }
            jSONObject.put("is_push_enabled", i2);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        FMX.LJIILJJIL("push_receive", jSONObject);
    }

    public static void LJ(int i, int i2, String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", str);
        c188727au.LIZLLL(i, "group_cnt");
        c188727au.LIZLLL(i2, "msg_cnt");
        FMX.LJIIL("push_cancel_group", c188727au.LIZ);
    }

    public static void LJI(C67230Qa2 c67230Qa2, int i, String reason) {
        PushShowInterceptEvent pushShowInterceptEvent = new PushShowInterceptEvent();
        try {
            String ruleId = String.valueOf(c67230Qa2.id);
            o.LJIIIZ(ruleId, "ruleId");
            pushShowInterceptEvent.LIZLLL(ruleId, "rule_id");
            String ruleId64 = String.valueOf(c67230Qa2.rid64);
            o.LJIIIZ(ruleId64, "ruleId64");
            pushShowInterceptEvent.LIZLLL(ruleId64, "rule_id64");
            if (!TextUtils.isEmpty(c67230Qa2.openUrl)) {
                android.net.Uri parse = UriProtector.parse(c67230Qa2.openUrl);
                if (!TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "gd_label"))) {
                    String pushLabel = UriProtector.getQueryParameter(parse, "gd_label");
                    o.LJIIIZ(pushLabel, "pushLabel");
                    pushShowInterceptEvent.LIZLLL(pushLabel, "push_label");
                }
                if (!TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "msg_id"))) {
                    String msgId = UriProtector.getQueryParameter(parse, "msg_id");
                    o.LJIIIZ(msgId, "msgId");
                    pushShowInterceptEvent.LIZLLL(msgId, "msg_id");
                }
            }
            String pushChannel = C67227QZz.LIZIZ(i);
            o.LJIIIZ(pushChannel, "pushChannel");
            pushShowInterceptEvent.LIZLLL(pushChannel, "push_channel");
            o.LJIIIZ(reason, "reason");
            pushShowInterceptEvent.LIZLLL(reason, "reason");
            pushShowInterceptEvent.LJFF();
        } catch (Exception unused) {
        }
    }

    public static void LIZJ(long j, String str, java.util.Map map, String str2) {
        try {
            map.put("click_position", "notify");
            if (str2 == null) {
                map.put("position", "push_body");
            } else {
                map.put("position", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                map.put("post_back", str);
            }
            map.put("rule_id", String.valueOf(j));
            FMX.LJIILIIL("non_login_push_click", map, true);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LIZIZ(Context context, String str, long j, long j2, JSONObject... jSONObjectArr) {
        if (jSONObjectArr.length > 0) {
            C38836FMa.LIZIZ(context, "apn", str, j, j2, jSONObjectArr[0]);
        } else {
            C38836FMa.LIZJ(context, "event_v1", "apn", str, j, j2, null);
        }
    }
}
