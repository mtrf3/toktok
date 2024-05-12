package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.share.improve.pkg.MultiImageSharePackage;
import com.ss.android.ugc.aweme.web.share.model.WebShareInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.OXb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62055OXb {
    public static MultiImageSharePackage LIZ(Context context, WebShareInfo webShareInfo, List list, String str, boolean z) {
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
        MultiImageSharePackage multiImageSharePackage = new MultiImageSharePackage(c62374Odu);
        multiImageSharePackage.localImagePaths = list;
        Bundle bundle = multiImageSharePackage.extras;
        bundle.putString("app_name", context.getString(R.string.bri));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("file://");
        LIZ.append(webShareInfo.LJFF);
        bundle.putString("thumb_url", X1D.LIZIZ(LIZ));
        bundle.putString("thumb_path", webShareInfo.LJFF);
        bundle.putBoolean("user_origin_link", z);
        bundle.putString("url_for_im_share", str);
        Boolean bool = webShareInfo.LIZJ;
        o.LJIIIIZZ(bool, "shareInfo.enableCopyLinkDesc");
        bundle.putBoolean("enable_copylink_desc", bool.booleanValue());
        return multiImageSharePackage;
    }
}
