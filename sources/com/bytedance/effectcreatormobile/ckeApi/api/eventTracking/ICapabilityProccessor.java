package com.bytedance.effectcreatormobile.ckeapi.api.eventTracking;

import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes34.dex */
public interface ICapabilityProccessor extends IService {
    Boolean getBoolFromAMEExtraCreation(String str);

    Integer getIntFromAMEExtraCreation(String str);

    String getStringFromAMEExtraCreation(String str);

    void onCapability(Object obj, String str);

    void putBoolInAMEExtraCreation(String str, boolean z);

    void putIntInAMEExtraCreation(String str, int i);

    void putStringInAMEExtraCreation(String str, String str2);

    void remove(String str);
}
