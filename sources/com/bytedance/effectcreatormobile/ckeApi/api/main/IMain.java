package com.bytedance.effectcreatormobile.ckeapi.api.main;

import X.AbstractC93769aWD;
import X.EnumC93724aVU;
import X.EnumC93725aVV;
import X.InterfaceC65462ha;
import android.graphics.Rect;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.PrefabData;
import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes34.dex */
public interface IMain extends IService {
    int getFragmentContainer();

    InterfaceC65462ha<AbstractC93769aWD> getMainEvent();

    LiveData<EnumC93724aVU> getMainOperation();

    LiveData<EnumC93725aVV> getMainPageStatus();

    LiveData<Rect> getPreviewLocationInWindow();

    /* synthetic */ String getTag();

    LiveData<Rect> getTopToolPanelLocationInWindow();

    /* synthetic */ void init();

    boolean isLoading();

    void mainLoading(boolean z);

    void onFireEvent(AbstractC93769aWD abstractC93769aWD);

    void onNewIntent(FragmentManager fragmentManager, String str);

    /* synthetic */ void onRecycle();

    /* synthetic */ void open(FragmentManager fragmentManager, int i);

    void open(FragmentManager fragmentManager, int i, String str);

    void openPrefabPanel(FragmentManager fragmentManager, PrefabData prefabData, Long l);

    void updateEffectHintSelectionShow(boolean z);
}
