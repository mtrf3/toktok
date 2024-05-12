package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* renamed from: X.HkE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44930HkE {
    public static void LIZ(C45344Hqu c45344Hqu, SharePackage sharePackage) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Bundle bundle;
        String string;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        Bundle bundle5;
        Bundle bundle6;
        Bundle bundle7;
        Z8A z8a = Z8A.LIZIZ;
        String str6 = null;
        if (sharePackage != null && (bundle7 = sharePackage.extras) != null) {
            str = bundle7.getString("enter_from");
        } else {
            str = null;
        }
        String str7 = "";
        if (str == null) {
            str = "";
        }
        if (sharePackage == null || (bundle6 = sharePackage.extras) == null || (str2 = bundle6.getString("enter_method")) == null) {
            str2 = "";
        }
        if (z8a.isFromProfileLongPress(str, str2)) {
            C44938HkM.LJIILJJIL = false;
            if (sharePackage != null && (bundle5 = sharePackage.extras) != null) {
                str6 = bundle5.getString("detail_tab_name");
            }
            C44938HkM.LJIILIIL = str6;
            Bundle bundle8 = c45344Hqu.LLIIJLIL;
            if (sharePackage == null || (bundle4 = sharePackage.extras) == null || (str3 = bundle4.getString("profile_uid")) == null) {
                str3 = "";
            }
            bundle8.putString("profile_uid", str3);
            Bundle bundle9 = c45344Hqu.LLIIJLIL;
            if (sharePackage == null || (bundle3 = sharePackage.extras) == null || (str4 = bundle3.getString("enter_method")) == null) {
                str4 = "";
            }
            bundle9.putString("enter_method", str4);
            Bundle bundle10 = c45344Hqu.LLIIJLIL;
            if (sharePackage == null || (bundle2 = sharePackage.extras) == null || (str5 = bundle2.getString("enter_from")) == null) {
                str5 = "";
            }
            bundle10.putString("enter_from", str5);
            Bundle bundle11 = c45344Hqu.LLIIJLIL;
            if (sharePackage != null && (bundle = sharePackage.extras) != null && (string = bundle.getString("detail_tab_name")) != null) {
                str7 = string;
            }
            bundle11.putString("detail_tab_name", str7);
        }
    }
}
