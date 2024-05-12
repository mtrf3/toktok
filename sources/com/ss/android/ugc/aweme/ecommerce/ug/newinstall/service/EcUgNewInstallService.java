package com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service;

import X.C36302EMo;
import X.C36304EMq;
import X.C58096Mr6;
import X.C61275O3b;
import X.EF7;
import X.EIN;
import X.FH5;
import X.OSZ;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.feed.CommonFeedLaunchServiceImpl;
import com.ss.android.ugc.aweme.setting.ISettingManagerService;
import com.ss.android.ugc.aweme.settingsrequest.SettingManagerServiceImpl;
import ujb.o;

/* loaded from: classes7.dex */
public final class EcUgNewInstallService implements IEcUgNewInstallService {
    public static IEcUgNewInstallService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IEcUgNewInstallService.class, false);
        if (LIZ != null) {
            return (IEcUgNewInstallService) LIZ;
        }
        if (C58096Mr6.h0 == null) {
            synchronized (IEcUgNewInstallService.class) {
                if (C58096Mr6.h0 == null) {
                    C58096Mr6.h0 = new EcUgNewInstallService();
                }
            }
        }
        return C58096Mr6.h0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService
    public final boolean LIZJ() {
        C36302EMo.LIZ.getClass();
        if (((Number) C36302EMo.LIZIZ.getValue()).intValue() == 1 || C36302EMo.LIZJ == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService
    public final OSZ<String, String> LIZ() {
        return C61275O3b.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService
    public final void LIZIZ(String str) {
        if (C61275O3b.LIZ) {
            return;
        }
        C61275O3b.LIZ = true;
        try {
            C61275O3b.LIZLLL(true);
            FH5.LIZIZ().LJFF(C36302EMo.class, new C36304EMq(str));
            String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            if (com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId == null || o.LJJJJJL(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId)) {
                DeviceRegisterManager.addOnDeviceConfigUpdateListener(new EIN());
            } else {
                try {
                    ISettingManagerService LIZJ = SettingManagerServiceImpl.LIZJ();
                    EF7.LIZIZ();
                    LIZJ.LIZ(0);
                } catch (Throwable unused) {
                }
            }
            C61275O3b.LIZJ(str);
            CommonFeedLaunchServiceImpl.LJ().LIZ();
        } catch (Throwable unused2) {
        }
    }
}
