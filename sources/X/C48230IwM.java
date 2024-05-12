package X;

import android.text.TextUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.IwM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48230IwM extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C48230IwM LJLIL = new C48230IwM();

    public C48230IwM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        boolean z = true;
        if (!TextUtils.isEmpty(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId) && !TextUtils.equals(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, CardStruct.IStatusCode.DEFAULT) && C00F.LIZ(31744, 0, "real_time_report_of_new_user", false) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
