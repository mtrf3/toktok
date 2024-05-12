package X;

import android.webkit.CookieManager;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F9M extends O6R {
    @Override // X.O6R
    public final void LJJ(String bridgeName, String str, C37945Eur c37945Eur) {
        Object cookie;
        o.LJIIIZ(bridgeName, "bridgeName");
        String string = JSONObjectProtectorUtils.getString(new JSONObject(str), "url");
        OSZ[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ("code", 1);
        OSZ[] oszArr2 = new OSZ[1];
        CookieManager cookieManager = CookieManager.getInstance();
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(103100, "android/webkit/CookieManager", "getCookie", cookieManager, new Object[]{string}, "java.lang.String", new C65300Pk0(false, "(Ljava/lang/String;)Ljava/lang/String;", "5629128203165540441"));
        if (LIZJ.LIZ) {
            cookie = LIZJ.LIZIZ;
        } else {
            cookie = cookieManager.getCookie(string);
        }
        if (cookie == null) {
            cookie = "";
        }
        oszArr2[0] = new OSZ("cookie", cookie);
        oszArr[1] = new OSZ("data", C113554cx.LJJLIIIIJ(oszArr2));
        c37945Eur.LIZ(1, "", new JSONObject(C113554cx.LJJLIIIIJ(oszArr)));
    }
}
