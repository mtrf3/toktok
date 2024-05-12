package com.bytedance.router;

import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public interface IMappingInitializer {
    int getMapSize();

    void init(Map<String, String> map);

    void initInterceptorMap(Map<String, List<String>> map);
}
