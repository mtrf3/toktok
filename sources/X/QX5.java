package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.a1;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QX5 {
    public static final String LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZ = JBR.LJFF(LIZ2, "api-va.tiktokv.com", "/aweme/v1/commit/user/", LIZ2);
        LIZIZ = a1.LJ("https://", "api-va.tiktokv.com", "/passport/login_name/update/");
        LIZJ = a1.LJ("https://", "api-va.tiktokv.com", "/tiktok/v1/username/save_async");
    }

    public static UserResponse LIZIZ(java.util.Map updateUserInfo) {
        String LJIIIIZZ;
        UserResponse userResponse;
        User user;
        JSONObject jSONObject;
        o.LJIIIZ(updateUserInfo, "updateUserInfo");
        String str = LIZ;
        if (updateUserInfo.containsKey("mt_update_username")) {
            str = LIZIZ;
            updateUserInfo.remove("mt_update_username");
        }
        HashMap hashMap = new HashMap();
        RBW rbw = RBW.LJLLI;
        hashMap.put("uid", rbw.LIZJ());
        hashMap.putAll(updateUserInfo);
        if (!o.LJ(str, LIZIZ)) {
            C68542QvC.LIZ.getClass();
            QQC qqc = C68542QvC.LIZJ;
            o.LJI(qqc);
            LJIIIIZZ = ((NetworkProxyAccount) qqc).LJIIJ(str, hashMap);
        } else {
            C68542QvC.LIZ.getClass();
            QQC qqc2 = C68542QvC.LIZJ;
            o.LJI(qqc2);
            LJIIIIZZ = ((NetworkProxyAccount) qqc2).LJIIIIZZ(str, hashMap);
        }
        User LIZIZ2 = rbw.LIZIZ();
        try {
            jSONObject = new JSONObject(LJIIIIZZ);
        } catch (JSONException unused) {
        }
        if (updateUserInfo.containsKey("login_name")) {
            String optString = jSONObject.optString("message");
            o.LJIIIIZZ(optString, "jsonObject.optString(ServerConst.MESSAGE)");
            Locale locale = Locale.getDefault();
            o.LJIIIIZZ(locale, "getDefault()");
            String lowerCase = optString.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (TextUtils.equals(lowerCase, "success")) {
                updateUserInfo.put("unique_id", updateUserInfo.get("login_name"));
                updateUserInfo.remove("login_name");
                LIZIZ2.setUniqueId(JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(jSONObject, "data"), "login_name"));
                LIZIZ2.setHandleModified(new Date().getTime() / 1000);
                userResponse = new UserResponse();
                user = LIZIZ2.m150clone();
                o.LJIIIIZZ(user, "originUser.clone()");
                userResponse.setUser(user);
                if (!TextUtils.isEmpty(LIZIZ2.getUid()) || TextUtils.isEmpty(user.getUid())) {
                    C198517qh c198517qh = new C198517qh();
                    c198517qh.LIZ.put("local_user_json", GsonProtectorUtils.toJson(new Gson(), LIZIZ2));
                    c198517qh.LIZ.put("server_user_json", GsonProtectorUtils.toJson(new Gson(), user));
                    c198517qh.LIZ.put("map", updateUserInfo.toString());
                    JSONObject LJ = c198517qh.LJ();
                    o.LJIIIIZZ(LJ, "newBuilder()\n           …rInfo.toString()).build()");
                    FUA.LIZJ("aweme_user_manager_null_uid", LJ);
                }
                return userResponse;
            }
            String optString2 = jSONObject.optString("message");
            o.LJIIIIZZ(optString2, "jsonObject.optString(ServerConst.MESSAGE)");
            Locale locale2 = Locale.getDefault();
            o.LJIIIIZZ(locale2, "getDefault()");
            String lowerCase2 = optString2.toLowerCase(locale2);
            o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (TextUtils.equals(lowerCase2, "error")) {
                C38333F2r c38333F2r = new C38333F2r(JSONObjectProtectorUtils.getJSONObject(jSONObject, "data").optInt("error_code"));
                c38333F2r.setErrorMsg(JSONObjectProtectorUtils.getJSONObject(jSONObject, "data").optString("description"));
                o.LJIIIIZZ(c38333F2r, "apiServerException.setEr…ServerConst.DESCRIPTION))");
                throw c38333F2r;
            }
        }
        C68542QvC.LIZ.getClass();
        QQC qqc3 = C68542QvC.LIZJ;
        o.LJI(qqc3);
        Object fromJson = GsonProtectorUtils.fromJson(((NetworkProxyAccount) qqc3).LJIIJJI(), LJIIIIZZ, (Class<Object>) UserResponse.class);
        o.LJIIIIZZ(fromJson, "networkProxy!!.gson.from…UserResponse::class.java)");
        userResponse = (UserResponse) fromJson;
        user = userResponse.getUser();
        o.LJIIIIZZ(user, "result.user");
        HashSet hashSet = new HashSet(updateUserInfo.keySet());
        if (hashSet.contains("avatar_uri") || hashSet.contains("video_icon_virtual_URI")) {
            hashSet.remove("avatar_uri");
            hashSet.remove("video_icon_virtual_URI");
            hashSet.add("avatar_larger");
            hashSet.add("avatar_thumb");
            hashSet.add("avatar_medium");
            hashSet.add("video_icon");
        }
        if (!TextUtils.isEmpty(LIZIZ2.getUid())) {
            Field[] fields = User.class.getDeclaredFields();
            o.LJIIIIZZ(fields, "fields");
            for (Field field : fields) {
                InterfaceC65349Pkn interfaceC65349Pkn = (InterfaceC65349Pkn) field.getAnnotation(InterfaceC65349Pkn.class);
                if (interfaceC65349Pkn != null && !hashSet.contains(interfaceC65349Pkn.value())) {
                    try {
                        field.setAccessible(true);
                        field.set(user, field.get(LIZIZ2));
                    } catch (IllegalAccessException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(LIZIZ2.getUid())) {
        }
        C198517qh c198517qh2 = new C198517qh();
        c198517qh2.LIZ.put("local_user_json", GsonProtectorUtils.toJson(new Gson(), LIZIZ2));
        c198517qh2.LIZ.put("server_user_json", GsonProtectorUtils.toJson(new Gson(), user));
        c198517qh2.LIZ.put("map", updateUserInfo.toString());
        JSONObject LJ2 = c198517qh2.LJ();
        o.LJIIIIZZ(LJ2, "newBuilder()\n           …rInfo.toString()).build()");
        FUA.LIZJ("aweme_user_manager_null_uid", LJ2);
        return userResponse;
    }

    public static User LIZ(String str, boolean z) {
        String str2;
        C38281F0r c38281F0r = new C38281F0r(str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c38281F0r.LIZLLL("is_after_login", str2);
        C68542QvC.LIZ.getClass();
        QQC qqc = C68542QvC.LIZJ;
        o.LJI(qqc);
        String LJ = ((NetworkProxyAccount) qqc).LJ(c38281F0r.LJ());
        QQC qqc2 = C68542QvC.LIZJ;
        o.LJI(qqc2);
        User user = ((UserResponse) GsonProtectorUtils.fromJson(((NetworkProxyAccount) qqc2).LJIIJJI(), LJ, UserResponse.class)).getUser();
        o.LJIIIIZZ(user, "networkProxy!!.gson.from…esponse::class.java).user");
        return user;
    }
}
