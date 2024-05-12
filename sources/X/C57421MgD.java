package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.MgD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57421MgD {
    public static String LIZIZ(String str) {
        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "user_id");
        if (queryParameter == null) {
            return "";
        }
        return queryParameter;
    }

    public static String LIZJ(String str) {
        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "gd_label");
        if (queryParameter == null) {
            return "";
        }
        return queryParameter;
    }

    public static HashMap LIZLLL(InnerPushMessage innerPushMessage) {
        Object LIZ;
        HashMap hashMap = new HashMap();
        try {
            String mobEventJsonStr = innerPushMessage.getMobEventJsonStr();
            if (mobEventJsonStr != null) {
                JSONObject jSONObject = new JSONObject(mobEventJsonStr);
                Iterator<String> keys = jSONObject.keys();
                o.LJIIIIZZ(keys, "json.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    o.LJIIIIZZ(optString, "json.optString(key)");
                    hashMap.put(next, optString);
                }
                LIZ = C76800UCe.LIZ;
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C86478Xwo.LIZJ("InnerPushMob", "getInnerPushExtraInfoMap error", m10exceptionOrNullimpl);
        }
        return hashMap;
    }

    public static String LJ(String str) {
        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "inner_push_type");
        if (TextUtils.isEmpty(queryParameter)) {
            return "official";
        }
        return queryParameter;
    }

    public static String LJFF(String str) {
        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "room_id");
        if (queryParameter == null) {
            return "";
        }
        return queryParameter;
    }

    public static String LIZ(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('(');
            LIZ.append(str2);
            LIZ.append("=[^&]*)");
            String regex = X1D.LIZIZ(LIZ);
            String replacement = C00F.LIZIZ(str2, '=', "inner_push");
            o.LJIIIZ(str, "<this>");
            o.LJIIIZ(regex, "regex");
            o.LJIIIZ(replacement, "replacement");
            String replaceAll = PatternProtector.compile(regex).matcher(str).replaceAll(replacement);
            o.LJIIIIZZ(replaceAll, "compile(regex).matcher(t…).replaceAll(replacement)");
            return replaceAll;
        }
        return str;
    }

    public static void LJI(String str, String str2, String str3, String str4, boolean z, String str5) {
        if (z) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("room_id", str);
            c188727au.LJIIIZ("inner_push_type", str4);
            c188727au.LJIIIZ("enter_method", "inner_push");
            c188727au.LJIIIZ("enter_from_merge", "inner_push");
            c188727au.LJIIIZ("type", str3);
            c188727au.LJIIIZ("anchor_id", str2);
            c188727au.LJIIIZ("gd_label", str5);
            C67142kI.LIZIZ(c188727au, "");
            FMX.LJIIL("livesdk_inner_push_disappear", c188727au.LIZ);
        }
    }
}
