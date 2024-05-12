package com.bytedance.effectcreatormobile.ckeapi.api.objectselect;

import X.C94272aeK;
import X.C94273aeL;
import X.EnumC93488aRg;
import X.InterfaceC93818aX0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes34.dex */
public interface IObjectSelect extends IService {
    void add(FragmentManager fragmentManager, int i, String str);

    LiveData<EnumC93488aRg> getPanelStateLiveData();

    /* synthetic */ String getTag();

    void hidePanel();

    /* synthetic */ void init();

    /* synthetic */ void onRecycle();

    /* synthetic */ void open(FragmentManager fragmentManager, int i);

    void prefetchFeatureList();

    MutableLiveData<C94273aeL> previewTemplateEvent();

    void reEdit(Fragment fragment, int i, C94272aeK c94272aeK, long j);

    void replace(FragmentManager fragmentManager, int i, long j);

    void setNextResultHandler(InterfaceC93818aX0 interfaceC93818aX0);
}
