package com.bytedance.effectcreatormobile.ckeapi.api;

import X.AbstractC93937aYv;
import X.C76800UCe;
import X.C94342afS;
import X.InterfaceC65462ha;
import X.InterfaceC67352kd;
import X.InterfaceC70352pT;
import X.InterfaceC93942aZ0;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes34.dex */
public interface ICameraRender extends IService {
    void addAlgorithmCallback(int i, InterfaceC93942aZ0 interfaceC93942aZ0);

    Object awaitAlgorithm(boolean z, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd);

    void changeRenderMode(AbstractC93937aYv abstractC93937aYv);

    void createFaceDistortion(FragmentManager fragmentManager, String str, String str2, String str3, String str4, String str5);

    void editFaceDistortion(FragmentManager fragmentManager, long j);

    InterfaceC65462ha<C76800UCe> faceSavedEvent();

    InterfaceC70352pT<C76800UCe> frameRefreshEvent();

    LiveData<C94342afS> getModelPathChangeData();

    LiveData<AbstractC93937aYv> getRenderModeData();

    /* synthetic */ String getTag();

    /* synthetic */ void init();

    boolean isCameraFront();

    void manualBindTexture();

    void notifyAlgorithmFrame();

    void onAlgorithmReady(InterfaceC93942aZ0 interfaceC93942aZ0, int i, Lifecycle lifecycle);

    /* synthetic */ void onRecycle();

    /* synthetic */ void open(FragmentManager fragmentManager, int i);

    void removeAlgorithmCallback(InterfaceC93942aZ0 interfaceC93942aZ0);
}
