package com.bytedance.effectcreatormobile.ckeapi.api;

import X.ActivityC45651qj;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes34.dex */
public interface IEditorContext extends IService {
    Integer getBehaviourContainerViewId();

    View getContainerView();

    Integer getContainerViewId();

    Context getContext();

    FragmentManager getFragmentManager();

    ActivityC45651qj getHostActivity();

    Integer getLayerContainerViewId();

    View getRootView();

    void registerGlobalContext(Fragment fragment, ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3);
}
