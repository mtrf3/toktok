package com.bytedance.effectcreatormobile.ckeapi.api.objectselect;

import X.EnumC93821aX3;
import X.InterfaceC71762rk;
import androidx.fragment.app.FragmentManager;
import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes34.dex */
public interface PrefabPanel extends IService {
    void addPrefab(PrefabData prefabData, FragmentManager fragmentManager, int i);

    void editPrefab(long j, FragmentManager fragmentManager, int i);

    InterfaceC71762rk<EnumC93821aX3> getPanelStatus();
}
