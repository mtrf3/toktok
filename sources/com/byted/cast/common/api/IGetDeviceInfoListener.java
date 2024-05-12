package com.byted.cast.common.api;

import com.byted.cast.common.bean.DeviceInfo;

/* loaded from: classes29.dex */
public interface IGetDeviceInfoListener {
    void onFail(int i, String str);

    void onSuccess(DeviceInfo deviceInfo);
}
