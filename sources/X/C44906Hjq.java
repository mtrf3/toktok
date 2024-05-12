package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* renamed from: X.Hjq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44906Hjq {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Bundle bundle, Aweme aweme, SharePackage sharePackage) {
        String str;
        Bundle bundle2;
        String string;
        Bundle bundle3;
        Bundle bundle4;
        String str2 = null;
        if (sharePackage != null && (bundle4 = sharePackage.extras) != null) {
            str2 = bundle4.getString("now_type");
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        bundle.putString("now_type", str2);
        if (sharePackage == null || (bundle3 = sharePackage.extras) == null || (str = bundle3.getString("download_method")) == null) {
            str = "";
        }
        bundle.putString("download_method", str);
        if (sharePackage != null && (bundle2 = sharePackage.extras) != null && (string = bundle2.getString("download_method")) != null) {
            str3 = string;
        }
        C44938HkM.LJII = str3;
        C44896Hjg.LJIL = bundle;
    }
}
