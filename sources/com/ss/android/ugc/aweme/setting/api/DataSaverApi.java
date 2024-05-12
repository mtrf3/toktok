package com.ss.android.ugc.aweme.setting.api;

import X.C10K;
import X.C48669J8f;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes9.dex */
public interface DataSaverApi {
    public static final C48669J8f LIZ = C48669J8f.LIZ;

    @InterfaceC195787mI
    @E4T("/aweme/v1/set/data-saver-setting/")
    C10K<BaseResponse> setDataSaverSetting(@InterfaceC64987Pex("data_saver_setting") int i);
}
