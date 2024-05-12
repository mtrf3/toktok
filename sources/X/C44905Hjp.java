package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* renamed from: X.Hjp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44905Hjp {
    public static void LIZ(SharePackage sharePackage) {
        String str;
        String str2;
        String str3;
        Bundle bundle;
        String string;
        String str4;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        Bundle bundle5;
        Bundle bundle6;
        String str5 = null;
        if (sharePackage != null && (bundle6 = sharePackage.extras) != null) {
            str5 = bundle6.getString("enter_from");
        }
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        if (sharePackage == null || (bundle5 = sharePackage.extras) == null || (str = bundle5.getString("enter_method")) == null) {
            str = "";
        }
        Bundle bundle7 = new Bundle();
        C44896Hjg.LJIL = bundle7;
        if (sharePackage == null || (bundle4 = sharePackage.extras) == null || (str2 = bundle4.getString("download_method")) == null) {
            str2 = "";
        }
        bundle7.putString("download_method", str2);
        if (sharePackage == null || (bundle3 = sharePackage.extras) == null || (str3 = bundle3.getString("download_method")) == null) {
            str3 = "";
        }
        C44938HkM.LJII = str3;
        if (Z8A.LIZIZ.isFromProfileLongPress(str5, str)) {
            C44938HkM.LJIILJJIL = false;
            Bundle bundle8 = C44896Hjg.LJIL;
            if (bundle8 != null) {
                if (sharePackage == null || (bundle2 = sharePackage.extras) == null || (str4 = bundle2.getString("profile_uid")) == null) {
                    str4 = "";
                }
                bundle8.putString("profile_uid", str4);
            }
            Bundle bundle9 = C44896Hjg.LJIL;
            if (bundle9 != null) {
                bundle9.putString("enter_from", str5);
            }
            Bundle bundle10 = C44896Hjg.LJIL;
            if (bundle10 != null) {
                bundle10.putString("enter_method", str);
            }
            Bundle bundle11 = C44896Hjg.LJIL;
            if (bundle11 != null) {
                if (sharePackage != null && (bundle = sharePackage.extras) != null && (string = bundle.getString("detail_tab_name")) != null) {
                    str6 = string;
                }
                bundle11.putString("detail_tab_name", str6);
            }
        }
    }
}
