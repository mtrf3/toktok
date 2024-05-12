package com.ugc.effectcreator.effectcore.sdk.context;

import X.ActivityC45651qj;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class EditorContextImpl implements IEditorContext {
    public Integer behaviourContainerId;
    public Integer layerContainerId;
    public Integer mainContainerId;
    public WeakReference<Fragment> mainFragmentRef;

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext
    public ViewGroup getContainerView() {
        Fragment fragment;
        View view;
        Integer num = this.mainContainerId;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        WeakReference<Fragment> weakReference = this.mainFragmentRef;
        if (weakReference == null || (fragment = weakReference.get()) == null || (view = fragment.getView()) == null) {
            return null;
        }
        return (ViewGroup) view.findViewById(intValue);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext
    public Context getContext() {
        Fragment fragment;
        WeakReference<Fragment> weakReference = this.mainFragmentRef;
        if (weakReference != null && (fragment = weakReference.get()) != null) {
            return fragment.getContext();
        }
        return null;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext
    public FragmentManager getFragmentManager() {
        Fragment fragment;
        WeakReference<Fragment> weakReference = this.mainFragmentRef;
        if (weakReference != null && (fragment = weakReference.get()) != null) {
            return fragment.getChildFragmentManager();
        }
        return null;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext
    public ActivityC45651qj getHostActivity() {
        Fragment fragment;
        WeakReference<Fragment> weakReference = this.mainFragmentRef;
        if (weakReference != null && (fragment = weakReference.get()) != null) {
            return fragment.mo49getActivity();
        }
        return null;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext
    public View getRootView() {
        Fragment fragment;
        WeakReference<Fragment> weakReference = this.mainFragmentRef;
        if (weakReference != null && (fragment = weakReference.get()) != null) {
            return fragment.getView();
        }
        return null;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext
    public Integer getBehaviourContainerViewId() {
        return this.behaviourContainerId;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext
    public Integer getContainerViewId() {
        return this.mainContainerId;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext
    public Integer getLayerContainerViewId() {
        return this.layerContainerId;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext
    public void registerGlobalContext(Fragment activeFragment, ViewGroup containerView, ViewGroup layerContainerView, ViewGroup behaviourContainerView) {
        o.LJIIIZ(activeFragment, "activeFragment");
        o.LJIIIZ(containerView, "containerView");
        o.LJIIIZ(layerContainerView, "layerContainerView");
        o.LJIIIZ(behaviourContainerView, "behaviourContainerView");
        this.mainContainerId = Integer.valueOf(containerView.getId());
        this.layerContainerId = Integer.valueOf(layerContainerView.getId());
        this.behaviourContainerId = Integer.valueOf(behaviourContainerView.getId());
        this.mainFragmentRef = new WeakReference<>(activeFragment);
    }
}
