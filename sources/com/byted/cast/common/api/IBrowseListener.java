package com.byted.cast.common.api;

import com.byted.cast.common.source.ServiceInfo;
import java.util.List;

/* loaded from: classes29.dex */
public interface IBrowseListener {
    void onBrowse(int i, List<ServiceInfo> list);

    void onBrowseInvalidDevice(int i, List<ServiceInfo> list);

    void onError(int i, String str);
}
