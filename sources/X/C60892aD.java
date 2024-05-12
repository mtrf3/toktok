package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.deviceregister.DeviceRegisterManager;

/* renamed from: X.2aD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60892aD extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C60892aD LJLIL = new C60892aD();

    public C60892aD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j;
        boolean z;
        String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        if (com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId != null) {
            if (com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && C38350F3i.LJJIZ(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId) != null) {
                try {
                    j = CastLongProtector.parseLong(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId) % 10000;
                } catch (NumberFormatException unused) {
                }
                return Long.valueOf(j);
            }
        }
        j = -1;
        return Long.valueOf(j);
    }
}
