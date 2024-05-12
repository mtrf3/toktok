package com.bytedance.ies.foundation.fragment;

import X.ActivityC45651qj;
import X.ActivityC86117Xqz;
import X.C221108m2;
import X.C5H3;
import X.C76800UCe;
import X.C87437YTh;
import X.G29;
import X.InterfaceC78499UrP;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class BaseFragment extends Fragment implements InterfaceC78499UrP {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final C5H3 baseViewModel$delegate = C221108m2.LIZIZ(new AqS165S0100000_15(this, 39));
    public WeakReference<BaseFragment> fragmentRef;
    public boolean viewValid;
    public static final G29 Companion = new G29();
    public static Class<? extends BaseFragmentViewModel> viewModelClass = BaseFragmentViewModel.class;
    public static final C87437YTh callback = new C87437YTh();

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void buildCommonIntent() {
    }

    private final BaseFragmentViewModel getBaseViewModel() {
        return (BaseFragmentViewModel) this.baseViewModel$delegate.getValue();
    }

    public final BaseFragmentViewModel getViewModel() {
        return (BaseFragmentViewModel) ViewModelProviders.of(this).get(viewModelClass);
    }

    public final boolean isActive() {
        Lifecycle.State state;
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            state = lifecycle.getCurrentState();
        } else {
            state = null;
        }
        if (state == Lifecycle.State.RESUMED) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.viewValid = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.viewValid = false;
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC78499UrP
    public BaseFragmentViewModel provideBaseViewModel() {
        return getBaseViewModel();
    }

    public final void activityConfiguration(InterfaceC88472Yns<? super BaseActivityViewModel, C76800UCe> build) {
        ActivityC86117Xqz activityC86117Xqz;
        BaseActivityViewModel viewModel;
        o.LJIIIZ(build, "build");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if ((mo49getActivity instanceof ActivityC86117Xqz) && (activityC86117Xqz = (ActivityC86117Xqz) mo49getActivity) != null && (viewModel = activityC86117Xqz.getViewModel()) != null) {
            build.invoke(viewModel);
        }
    }

    public final void fragmentConfiguration(InterfaceC88472Yns<? super BaseFragmentViewModel, C76800UCe> build) {
        o.LJIIIZ(build, "build");
        build.invoke(getViewModel());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        FragmentManager supportFragmentManager;
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        this.fragmentRef = new WeakReference<>(this);
        BaseFragmentViewModel baseViewModel = getBaseViewModel();
        if (!baseViewModel.initialized) {
            buildCommonIntent();
            baseViewModel.init();
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (supportFragmentManager = mo49getActivity.getSupportFragmentManager()) != null && getParentFragment() == null) {
            supportFragmentManager.LJJLIL(callback, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.viewValid = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        outState.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.viewValid = true;
    }
}
