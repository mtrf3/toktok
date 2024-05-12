package com.bytedance.effectcreatormobile.ckeapi.api;

import X.EnumC93945aZ3;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes34.dex */
public interface IController extends IService {
    void editObject(FragmentManager fragmentManager, int i, String str);

    LiveData<EnumC93945aZ3> getPanelStateLiveData();

    /* synthetic */ String getTag();

    /* synthetic */ void init();

    /* synthetic */ void onRecycle();

    /* synthetic */ void open(FragmentManager fragmentManager, int i);
}
