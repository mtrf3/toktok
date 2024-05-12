package com.bytedance.effectcreatormobile.ckeapi.api.eventTracking;

import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes34.dex */
public interface ISubmissionProccessor extends IService {
    Integer getInt(String str);

    String getString(String str);

    void onSubmissionExtra(Object obj, String str);

    void putInt(String str, int i);

    void putString(String str, String str2);

    void remove(String str);

    void removeAll();
}
