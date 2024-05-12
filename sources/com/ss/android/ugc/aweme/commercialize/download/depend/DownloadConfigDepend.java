package com.ss.android.ugc.aweme.commercialize.download.depend;

import X.C48248Iwe;
import X.HG3;
import X.InterfaceC84217X3l;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class DownloadConfigDepend implements IDownloadConfigDepend {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend
    public boolean needAutoRefreshUnSuccessTask() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend
    public InterfaceC84217X3l getTTNetDownloadHttpService() {
        return new C48248Iwe();
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend
    public String getDeviceId() {
        String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        o.LJIIIIZZ(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, "getDeviceId()");
        return com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId;
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend
    public String getSettingString() {
        String LIZ = SharePrefCache.inst().getDownloadSdkConfig().LIZ();
        o.LJIIIIZZ(LIZ, "inst().downloadSdkConfig.cache");
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend
    public String getUserId() {
        String curUserId = HG3.LJIILL().getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        return curUserId;
    }
}
