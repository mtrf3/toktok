package com.bytedance.effectcreatormobile.ckeapi.api.layer;

import X.C94221adV;
import X.C94222adW;
import X.EnumC93710aVG;
import X.EnumC93712aVI;
import X.InterfaceC65462ha;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes34.dex */
public interface ILayer extends IService {
    InterfaceC65462ha<C94221adV> getLayerFeatureOperateData();

    LiveData<C94222adW> getLayerOrderChangeData();

    LiveData<EnumC93712aVI> getLayerPageStatus();

    /* synthetic */ String getTag();

    void hideLayerPage(FragmentManager fragmentManager);

    /* synthetic */ void init();

    /* synthetic */ void onRecycle();

    /* synthetic */ void open(FragmentManager fragmentManager, int i);

    void updateLayerEvent(long j, EnumC93710aVG enumC93710aVG);
}
