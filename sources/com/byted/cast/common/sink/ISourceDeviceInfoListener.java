package com.byted.cast.common.sink;

import com.byted.cast.common.bean.SourceDeviceInfo;
import java.util.List;

/* loaded from: classes29.dex */
public interface ISourceDeviceInfoListener {
    void onFail(int i, String str);

    void onSuccess(List<SourceDeviceInfo> list);
}
