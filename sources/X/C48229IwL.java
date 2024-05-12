package X;

import android.text.TextUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.IwL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48229IwL {
    public static final C0M6<String, C48231IwN> LIZ = new C0M6<>(C00F.LIZ(31744, 10, "real_time_report_max_nums", true));
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C48230IwM.LJLIL);

    public static final void LIZ(C48231IwN c48231IwN) {
        if (C58122Pw.LIZ) {
            if (!((Boolean) LIZIZ.getValue()).booleanValue()) {
                return;
            }
        } else {
            String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            if (!TextUtils.isEmpty(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId) && !TextUtils.equals(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, CardStruct.IStatusCode.DEFAULT) && C00F.LIZ(31744, 0, "real_time_report_of_new_user", false) != 1) {
                return;
            }
        }
        C0M6<String, C48231IwN> c0m6 = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(c48231IwN.LJLIL);
        LIZ2.append(c48231IwN.LJLILLLLZI);
        c0m6.LIZJ(X1D.LIZIZ(LIZ2), c48231IwN);
    }
}
