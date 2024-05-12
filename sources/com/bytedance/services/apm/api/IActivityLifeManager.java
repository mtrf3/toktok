package com.bytedance.services.apm.api;

import X.InterfaceC64217PIf;
import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes12.dex */
public interface IActivityLifeManager extends IService {
    boolean isForeground();

    void register(InterfaceC64217PIf interfaceC64217PIf);

    void unregister(InterfaceC64217PIf interfaceC64217PIf);
}
