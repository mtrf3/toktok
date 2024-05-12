package com.bytedance.effectcreatormobile.ckeapi.api.behaviour;

import X.C76800UCe;
import X.EnumC93993aZp;
import X.InterfaceC70352pT;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes34.dex */
public interface IBehaviour extends IService {
    LiveData<EnumC93993aZp> getPanelStateLiveData();

    /* synthetic */ String getTag();

    void hidePanel();

    /* synthetic */ void init();

    /* synthetic */ void onRecycle();

    /* synthetic */ void open(FragmentManager fragmentManager, int i);

    void open(FragmentManager fragmentManager, int i, long j);

    InterfaceC70352pT<C76800UCe> validCommandAdded();
}
