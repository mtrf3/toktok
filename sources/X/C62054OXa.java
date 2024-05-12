package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.share.improve.pkg.HybridImageSharePackage;
import com.ss.android.ugc.aweme.web.share.model.WebShareInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OXa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62054OXa {
    public static boolean LIZ(String str, WebShareInfo.HybridContainerInfo hybridContainerInfo) {
        if (!o.LJ(str, "custom") || hybridContainerInfo == null || (!C78685UuP.LJJJZ(hybridContainerInfo.url) && (!C78685UuP.LJJJZ(hybridContainerInfo.urlContent) || hybridContainerInfo.urlContentType != 1))) {
            return false;
        }
        return true;
    }

    public static HybridImageSharePackage LIZIZ(Context context, WebShareInfo webShareInfo, String str) {
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
        HybridImageSharePackage hybridImageSharePackage = new HybridImageSharePackage(c62374Odu);
        hybridImageSharePackage.shareMode = webShareInfo.LJIIIIZZ;
        hybridImageSharePackage.hybridContainerInfo = webShareInfo.LJIIIZ;
        Bundle bundle = hybridImageSharePackage.extras;
        bundle.putString("app_name", context.getString(R.string.bri));
        bundle.putString("url_for_im_share", str);
        Boolean bool = webShareInfo.LIZJ;
        o.LJIIIIZZ(bool, "shareInfo.enableCopyLinkDesc");
        bundle.putBoolean("enable_copylink_desc", bool.booleanValue());
        return hybridImageSharePackage;
    }
}
