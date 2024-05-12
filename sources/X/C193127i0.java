package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.zhiliaoapp.musically.R;

/* renamed from: X.7i0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193127i0 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C193137i1.LJLIL);
    public static final C5H3 LIZIZ = C221108m2.LIZ(EnumC221088m0.NONE, C96463qU.LJLIL);

    public static void LIZ(String str) {
        String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group", str);
        c188727au.LJIIIZ("did", com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId);
        FMX.LJIIL("first_like_config", c188727au.LIZ);
    }

    public static void LIZIZ(final Context context, boolean z, final String str, final String str2) {
        Activity LJIJJ;
        if (context == null || (LJIJJ = C45804HyK.LJIJJ(context)) == null || LJIJJ.isFinishing()) {
            return;
        }
        AKT akt = new AKT(LJIJJ);
        akt.LJFF(R.string.tfw);
        akt.LIZ.LJLJJI = 0;
        int intValue = ((Number) LIZIZ.getValue()).intValue();
        C208158Ex c208158Ex = akt.LIZ;
        c208158Ex.LJLJL = intValue;
        AKW akw = c208158Ex.LJLIL;
        akw.LJFF = true;
        akw.LJI = false;
        c208158Ex.LJLJLJ = new View.OnClickListener() { // from class: X.72t
            public final /* synthetic */ String LJLILLLLZI = "click_like";

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str3 = str;
                String str4 = this.LJLILLLLZI;
                String str5 = str2;
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", str3);
                c188727au.LJIIIZ("enter_method", str4);
                c188727au.LJIIIZ("previous_page", str5);
                FMX.LJIIL("unlogin_like_toast_click", c188727au.LIZ);
                J9P.LIZIZ(C45804HyK.LJIJJ(context), "unlogin_like_toast", "click_like", (Bundle) new C40883G2t().LIZ, null);
            }
        };
        if (z) {
            akt.LJ(R.style.ul);
        } else {
            akt.LJ(R.style.ux);
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("enter_method", "click_like");
        c188727au.LJIIIZ("previous_page", str2);
        FMX.LJIIL("unlogin_like_toast_show", c188727au.LIZ);
        akt.LJII();
    }
}
