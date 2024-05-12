package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.2gP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64732gP {
    public static JSONObject LIZ(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        if (jSONObject != null) {
            str = jSONObject.optString("key");
            str2 = jSONObject.optString("value");
            str3 = jSONObject.optString(WM7.SCENE_SERVICE);
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        if (o.LJ(str3, "cart_cache")) {
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("cart_cache_");
            LIZ.append(createIUserServicebyMonsterPlugin.getCurrentUserID());
            C71284RyK.LIZIZ("cart_cache", X1D.LIZIZ(LIZ), str2);
            XKX.LIZLLL(C780334l.LJLIL, null, null, new C64722gO(str2, null), 3);
        } else {
            C71284RyK.LIZIZ(str3, str, str2);
        }
        return new JSONObject();
    }
}
