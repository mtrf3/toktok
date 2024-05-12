package X;

import com.ss.android.deviceregister.DeviceRegisterManager;
import defpackage.i0;
import java.util.List;
import ujb.o;
import ujb.s;

/* renamed from: X.2zY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76602zY {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (((curUserId == null || o.LJJJJJL(curUserId)) && (curUserId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId()) == null) || o.LJJJJJL(curUserId)) {
            curUserId = "";
        }
        return i0.LJFF("feed_ec_card_no_interest_click_", curUserId);
    }

    public static OSZ LIZIZ() {
        Long LJJIZ;
        Integer LJJIL;
        String string = C76612zZ.LIZ().getString(LIZ(), "");
        int i = 0;
        long j = 0;
        if (string != null && s.LJJJLZIJ(string, "_", false)) {
            List LJLJJL = s.LJLJJL(string, new String[]{"_"}, 0, 6);
            String str = (String) ORZ.LJLLLLLL(0, LJLJJL);
            if (str != null && (LJJIL = C38350F3i.LJJIL(str)) != null) {
                i = LJJIL.intValue();
            }
            String str2 = (String) ORZ.LJLLLLLL(1, LJLJJL);
            if (str2 != null && (LJJIZ = C38350F3i.LJJIZ(str2)) != null) {
                j = LJJIZ.longValue();
            }
        }
        return new OSZ(Integer.valueOf(i), Long.valueOf(j));
    }

    public static void LIZJ(int i, boolean z, int i2) {
        int i3 = 0;
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!z) {
            if (i <= 0) {
                return;
            }
            int i4 = C76612zZ.LIZ().getInt("feed_ec_card_not_display_request_item_count", 0) + i;
            if (i4 >= 0) {
                i3 = i4;
            }
        }
        C76612zZ.LIZ().storeInt("feed_ec_card_not_display_request_item_count", i3);
    }
}
