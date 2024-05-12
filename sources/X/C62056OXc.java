package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.share.improve.pkg.RemoteImageSharePackage;
import com.ss.android.ugc.aweme.web.share.model.WebShareInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OXc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62056OXc {
    public static RemoteImageSharePackage LIZ(Context context, WebShareInfo webShareInfo, String str, String str2) {
        C62374Odu c62374Odu = new C62374Odu();
        c62374Odu.LIZ = "pic";
        c62374Odu.LIZIZ = "web";
        String str3 = webShareInfo.LIZ;
        o.LJIIIIZZ(str3, "shareInfo.title");
        c62374Odu.LIZLLL = str3;
        String str4 = webShareInfo.LIZIZ;
        o.LJIIIIZZ(str4, "shareInfo.desc");
        c62374Odu.LJ = str4;
        String LJJ = C78609UtB.LJJ(webShareInfo.LJ);
        if (LJJ == null) {
            LJJ = "";
        }
        c62374Odu.LJFF = LJJ;
        RemoteImageSharePackage remoteImageSharePackage = new RemoteImageSharePackage(c62374Odu);
        remoteImageSharePackage.imageUrl = str;
        Bundle bundle = remoteImageSharePackage.extras;
        bundle.putString("app_name", context.getString(R.string.bri));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("file://");
        LIZ.append(webShareInfo.LJFF);
        bundle.putString("thumb_url", X1D.LIZIZ(LIZ));
        bundle.putString("thumb_path", webShareInfo.LJFF);
        bundle.putString("url_for_im_share", str2);
        Boolean bool = webShareInfo.LIZJ;
        o.LJIIIIZZ(bool, "shareInfo.enableCopyLinkDesc");
        bundle.putBoolean("enable_copylink_desc", bool.booleanValue());
        return remoteImageSharePackage;
    }
}
