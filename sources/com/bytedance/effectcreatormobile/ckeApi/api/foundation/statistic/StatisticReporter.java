package com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic;

import com.bytedance.news.common.service.manager.IService;
import java.util.Map;

/* loaded from: classes34.dex */
public interface StatisticReporter extends IService {
    void onEvent(String str);

    void onEvent(String str, Map<String, String> map);
}
