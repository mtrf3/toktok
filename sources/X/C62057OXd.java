package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import com.ss.android.ugc.aweme.web.share.model.WebShareInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.OXd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62057OXd {
    public static String LIZ(String str, JSONObject jSONObject) {
        String optString = jSONObject.optString(str);
        if (optString == null || o.LJ(optString, "null")) {
            return null;
        }
        return optString;
    }

    public static WebSharePackage LIZIZ(Context context, WebShareInfo webShareInfo, String str) {
        C62374Odu c62374Odu = new C62374Odu();
        c62374Odu.LIZ = "pic";
        c62374Odu.LIZIZ = "web";
        String str2 = webShareInfo.LIZ;
        o.LJIIIIZZ(str2, "shareInfo.title");
        c62374Odu.LIZLLL = str2;
        String str3 = webShareInfo.LIZIZ;
        o.LJIIIIZZ(str3, "shareInfo.desc");
        c62374Odu.LJ = str3;
        String LJJ = C78609UtB.LJJ(webShareInfo.LJ);
        if (LJJ == null) {
            LJJ = "";
        }
        c62374Odu.LJFF = LJJ;
        WebSharePackage webSharePackage = new WebSharePackage(c62374Odu);
        Bundle bundle = webSharePackage.extras;
        bundle.putString("app_name", context.getString(R.string.bri));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("file://");
        LIZ.append(webShareInfo.LJFF);
        bundle.putString("thumb_url", X1D.LIZIZ(LIZ));
        bundle.putString("thumb_path", webShareInfo.LJFF);
        bundle.putString("url_for_im_share", str);
        Boolean bool = webShareInfo.LIZJ;
        o.LJIIIIZZ(bool, "shareInfo.enableCopyLinkDesc");
        bundle.putBoolean("enable_copylink_desc", bool.booleanValue());
        return webSharePackage;
    }

    public static WebSharePackage LIZJ(Context context, WebShareInfo webShareInfo, String str, boolean z) {
        C62374Odu c62374Odu = new C62374Odu();
        c62374Odu.LIZ = "web";
        c62374Odu.LIZIZ = "web";
        String str2 = webShareInfo.LIZ;
        o.LJIIIIZZ(str2, "shareInfo.title");
        c62374Odu.LIZLLL = str2;
        String str3 = webShareInfo.LIZIZ;
        o.LJIIIIZZ(str3, "shareInfo.desc");
        c62374Odu.LJ = str3;
        String LJJ = C78609UtB.LJJ(webShareInfo.LJ);
        if (LJJ == null) {
            LJJ = "";
        }
        c62374Odu.LJFF = LJJ;
        WebSharePackage webSharePackage = new WebSharePackage(c62374Odu);
        Bundle bundle = webSharePackage.extras;
        bundle.putString("app_name", context.getString(R.string.bri));
        bundle.putString("thumb_url", webShareInfo.LIZLLL);
        bundle.putString("url_for_im_share", str);
        bundle.putBoolean("user_origin_link", z);
        Boolean bool = webShareInfo.LIZJ;
        o.LJIIIIZZ(bool, "shareInfo.enableCopyLinkDesc");
        bundle.putBoolean("enable_copylink_desc", bool.booleanValue());
        String str4 = webShareInfo.LIZLLL;
        webSharePackage.remoteImagePath = str4;
        C78765Uvh.LJIILLIIL(str4);
        return webSharePackage;
    }

    public static WebSharePackage LIZLLL(Context context, String title, JSONObject jSONObject, String str, String str2) {
        C62374Odu c62374Odu = new C62374Odu();
        c62374Odu.LIZ = "web";
        WebSharePackage.Companion.getClass();
        String LIZ = LIZ("title", jSONObject);
        String str3 = "";
        if (LIZ == null) {
            LIZ = "";
        }
        c62374Odu.LIZLLL = LIZ;
        String LIZ2 = LIZ("description", jSONObject);
        if (LIZ2 == null) {
            LIZ2 = "";
        }
        c62374Odu.LJ = LIZ2;
        String LIZ3 = LIZ("url", jSONObject);
        if (LIZ3 != null) {
            str3 = LIZ3;
        }
        c62374Odu.LJFF = str3;
        String str4 = c62374Odu.LIZLLL;
        if (str4 == null || str4.length() == 0) {
            if (title == null || title.length() == 0 || o.LJ(title, "undefined")) {
                c62374Odu.LIZLLL = str2;
            } else {
                o.LJIIIZ(title, "title");
                c62374Odu.LIZLLL = title;
            }
        }
        String str5 = c62374Odu.LJ;
        if (str5 == null || str5.length() == 0) {
            c62374Odu.LJ = " ";
        }
        if (c62374Odu.LJFF != null && (!ujb.o.LJJJJJL(r0))) {
            C38281F0r c38281F0r = new C38281F0r(c62374Odu.LJFF);
            SharedPreferences LIZLLL = C38776FJs.LJIIL().LIZLLL(EF7.LIZIZ());
            if (LIZLLL == null || !LIZLLL.getBoolean("disable_ucode_in_share_url", false)) {
                c38281F0r.LIZLLL("u_code", C40680Fxs.LIZLLL(((RBX) HG3.LJIILL()).getCurUserId()));
            }
            SharedPreferences LIZLLL2 = C38776FJs.LJIIL().LIZLLL(EF7.LIZIZ());
            if (LIZLLL2 == null || !LIZLLL2.getBoolean("disable_iid_in_share_url", false)) {
                c38281F0r.LIZLLL("iid", DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId());
            }
            String LJ = c38281F0r.LJ();
            o.LJIIIIZZ(LJ, "urlBuilder.build()");
            c62374Odu.LJFF = LJ;
        } else {
            c62374Odu.LJFF = str;
        }
        WebSharePackage webSharePackage = new WebSharePackage(c62374Odu);
        Bundle bundle = webSharePackage.extras;
        bundle.putString("app_name", context.getString(R.string.bri));
        bundle.putString("thumb_url", LIZ("image", jSONObject));
        return webSharePackage;
    }
}
