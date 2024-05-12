package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import org.json.JSONObject;

/* renamed from: X.9oC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247929oC extends AV1 {
    public static void LJIL(JSONObject jSONObject) {
        long j;
        String str;
        String str2;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        boolean z = false;
        if (curUser != null && ((RBX) HG3.LJIILL()).isLogin()) {
            j = CastLongProtector.parseLong(((RBX) HG3.LJIILL()).getCurUserId());
            if (TextUtils.isEmpty(curUser.getUniqueId())) {
                str = curUser.getShortId();
            } else {
                str = curUser.getUniqueId();
            }
            str2 = curUser.getBindPhone();
            UrlModel avatarMedium = curUser.getAvatarMedium();
            if (avatarMedium != null && avatarMedium.getUrlList() != null && !avatarMedium.getUrlList().isEmpty()) {
                jSONObject.put("avatar_url", ListProtector.get(avatarMedium.getUrlList(), 0));
            }
            z = true;
        } else {
            j = -1;
            str = "";
            str2 = "";
        }
        jSONObject.put("is_login", z);
        jSONObject.put("success", z);
        jSONObject.put("user_id", String.valueOf(j));
        jSONObject.put("nickname", "");
        jSONObject.put("unique_id", str);
        jSONObject.put("bind_phone", str2);
        jSONObject.put("code", 1);
        Long LIZ = C225378sv.LIZ(curUser);
        if (LIZ != null) {
            jSONObject.put("decoration_id", LIZ);
        }
    }
}
