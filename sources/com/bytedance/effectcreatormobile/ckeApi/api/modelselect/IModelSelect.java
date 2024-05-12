package com.bytedance.effectcreatormobile.ckeapi.api.modelselect;

import X.C76800UCe;
import X.C94255ae3;
import X.C94256ae4;
import X.InterfaceC67352kd;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes34.dex */
public interface IModelSelect extends IService {
    void fetchDefaultModel(InterfaceC88471Ynr<? super String, ? super Boolean, C76800UCe> interfaceC88471Ynr);

    Object fetchFaceModel(InterfaceC67352kd<? super C94255ae3> interfaceC67352kd);

    void fetchModelByCategoryKey(String str, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns);

    void fetchModelByResourceId(String str, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns);

    LiveData<C94256ae4> getModelPathLiveData();

    String getSelectedModel();

    /* synthetic */ String getTag();

    /* synthetic */ void init();

    /* synthetic */ void onRecycle();

    /* synthetic */ void open(FragmentManager fragmentManager, int i);

    void registerAutoSwitchModelCallback(Lifecycle lifecycle, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns);

    void setSelectedModel(String str);

    void unregisterAutoSwitchModelCallback(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns);
}
