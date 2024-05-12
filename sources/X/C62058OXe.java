package X;

import android.content.Context;
import com.ss.android.ugc.aweme.share.improve.pkg.Base64ImageSharePackage;
import com.ss.android.ugc.aweme.web.share.model.WebShareInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OXe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62058OXe {
    public static Base64ImageSharePackage LIZ(Context context, WebShareInfo webShareInfo) {
        C62374Odu c62374Odu = new C62374Odu();
        c62374Odu.LIZ = "pic";
        c62374Odu.LIZIZ = "web";
        String str = webShareInfo.LIZ;
        o.LJIIIIZZ(str, "shareInfo.title");
        c62374Odu.LIZLLL = str;
        String str2 = webShareInfo.LIZIZ;
        o.LJIIIIZZ(str2, "shareInfo.desc");
        c62374Odu.LJ = str2;
        String LJJ = C78609UtB.LJJ(webShareInfo.LJ);
        if (LJJ == null) {
            LJJ = "";
        }
        c62374Odu.LJFF = LJJ;
        Base64ImageSharePackage base64ImageSharePackage = new Base64ImageSharePackage(c62374Odu);
        base64ImageSharePackage.shareMode = webShareInfo.LJIIIIZZ;
        String str3 = webShareInfo.LJI;
        o.LJIIIIZZ(str3, "shareInfo.imageData");
        base64ImageSharePackage.imageData = str3;
        String str4 = webShareInfo.LJII;
        o.LJIIIIZZ(str4, "shareInfo.type");
        base64ImageSharePackage.type = str4;
        base64ImageSharePackage.extras.putString("app_name", context.getString(R.string.bri));
        return base64ImageSharePackage;
    }

    public static boolean LIZIZ(int i, String type, String imageData) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(imageData, "imageData");
        if (i != 2 || !o.LJ(type, "data") || imageData.length() == 0) {
            return false;
        }
        return true;
    }
}
