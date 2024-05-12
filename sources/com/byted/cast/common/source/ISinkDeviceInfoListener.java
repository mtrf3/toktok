package com.byted.cast.common.source;

import com.byted.cast.common.bean.SinkDeviceInfo;

/* loaded from: classes29.dex */
public interface ISinkDeviceInfoListener {
    void onFail(int i, String str);

    void onSuccess(SinkDeviceInfo sinkDeviceInfo);
}
