package com.ss.android.ugc.common.component.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.KRB;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.uikit.base.AbsFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class ComponentFragment extends AbsFragment {
    public SparseArray<KRB> mComponents;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com_ss_android_ugc_common_component_fragment_ComponentFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(this, layoutInflater, viewGroup, bundle);
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).onDestroy();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).onDetach();
        }
        SparseArray<KRB> sparseArray = this.mComponents;
        if (sparseArray != null) {
            sparseArray.clear();
            this.mComponents = null;
        }
        super.onDetach();
    }

    public abstract SparseArray<KRB> registerComponents();

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).onPause();
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).onStart();
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).onStop();
        }
    }

    public SparseArray<KRB> getComponents() {
        return this.mComponents;
    }

    /* renamed from: getComponent, reason: merged with bridge method [inline-methods] */
    public KRB m195getComponent(int i) {
        return this.mComponents.get(i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        this.mComponents = registerComponents();
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).onAttach(activity, this);
        }
        super.onAttach(activity);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).onConfigurationChanged(configuration);
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).onCreate(bundle);
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).onSaveInstanceState(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).onViewStateRestored(bundle);
        }
    }

    public View com_ss_android_ugc_common_component_fragment_ComponentFragment__onCreateView$___twin___(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public static View com_ss_android_ugc_common_component_fragment_ComponentFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(ComponentFragment componentFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View com_ss_android_ugc_common_component_fragment_ComponentFragment__onCreateView$___twin___ = componentFragment.com_ss_android_ugc_common_component_fragment_ComponentFragment__onCreateView$___twin___(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(com_ss_android_ugc_common_component_fragment_ComponentFragment__onCreateView$___twin___ instanceof View)) {
            com_ss_android_ugc_common_component_fragment_ComponentFragment__onCreateView$___twin___ = null;
        }
        if (com_ss_android_ugc_common_component_fragment_ComponentFragment__onCreateView$___twin___ != null) {
            try {
                ViewTreeLifecycleOwner.set(com_ss_android_ugc_common_component_fragment_ComponentFragment__onCreateView$___twin___, componentFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(com_ss_android_ugc_common_component_fragment_ComponentFragment__onCreateView$___twin___, componentFragment);
                C10A.LIZIZ(com_ss_android_ugc_common_component_fragment_ComponentFragment__onCreateView$___twin___, componentFragment);
                ActivityC45651qj mo49getActivity = componentFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return com_ss_android_ugc_common_component_fragment_ComponentFragment__onCreateView$___twin___;
    }
}
