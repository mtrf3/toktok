package androidx.fragment.app;

import X.AbstractC020606g;
import X.ActivityC45651qj;
import X.AnonymousClass093;
import X.AnonymousClass095;
import X.AnonymousClass098;
import X.AnonymousClass107;
import X.AnonymousClass108;
import X.AnonymousClass109;
import X.BPQ;
import X.BPR;
import X.C03880Dg;
import X.C08U;
import X.C08V;
import X.C08W;
import X.C09I;
import X.C09N;
import X.C0VK;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1B2;
import X.C1B8;
import X.C1B9;
import X.C1BB;
import X.C29S;
import X.C39144FXw;
import X.C3C5;
import X.C65300Pk0;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC36571c5;
import X.X1D;
import Y.ARunnableS1S0111000_8;
import Y.IDRunnableS85S0100000;
import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import defpackage.i0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, InterfaceC36571c5 {
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public boolean mAdded;
    public C08U mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mCalled;
    public FragmentManager mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    public int mContentLayoutId;
    public ViewModelProvider.Factory mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public FragmentManager mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public C1BB<?> mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    public boolean mIsNewlyAdded;
    public Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public LifecycleRegistry mLifecycleRegistry;
    public Lifecycle.State mMaxState;
    public boolean mMenuVisible;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public float mPostponedAlpha;
    public Runnable mPostponedDurationRunnable;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public AnonymousClass109 mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    public C1B9 mViewLifecycleOwner;
    public MutableLiveData<LifecycleOwner> mViewLifecycleOwnerLiveData;
    public String mWho;

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final /* synthetic */ C0VK getDefaultViewModelCreationExtras() {
        return C09I.LIZ(this);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return androidx_fragment_app_Fragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(this, layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            FragmentManager fragmentManager = this.mChildFragmentManager;
            if (!fragmentManager.mDestroyed) {
                fragmentManager.LJIJI();
                this.mChildFragmentManager = new FragmentManagerImpl();
                return;
            }
            return;
        }
        throw new AnonymousClass093(C1B8.LIZ("Fragment ", this, " did not call through to super.onDetach()"));
    }

    public void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-8040495993281861033");
        if (c03880Dg.LIZJ(10502, "androidx/fragment/app/Fragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "androidx/fragment/app/Fragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
        } else {
            androidx_fragment_app_Fragment_com_bytedance_scalpel_scene_lancet_common_FragmentManagerLancet_setUserVisibleHint(this, z);
            c03880Dg.LIZIZ(10502, "androidx/fragment/app/Fragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
        }
    }

    private C08U ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C08U();
        }
        return this.mAnimationInfo;
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        this.mSavedStateRegistryController = AnonymousClass108.LIZ(this);
        this.mLifecycleRegistry.addObserver(new LifecycleEventObserver() { // from class: androidx.fragment.app.Fragment.2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                View view;
                if (event == Lifecycle.Event.ON_STOP && (view = Fragment.this.mView) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
    }

    public void callStartTransitionListener() {
        C08U c08u = this.mAnimationInfo;
        if (c08u == null) {
            return;
        }
        c08u.LJIILIIL = false;
        C08W c08w = c08u.LJIILJJIL;
        c08u.LJIILJJIL = null;
        if (c08w == null) {
            return;
        }
        C1B2 c1b2 = (C1B2) c08w;
        int i = c1b2.LIZJ - 1;
        c1b2.LIZJ = i;
        if (i != 0) {
            return;
        }
        c1b2.LIZIZ.LJIILLIIL.LJLIIIL();
    }

    @Override // X.InterfaceC85801Xlt
    /* renamed from: getActivity, reason: merged with bridge method [inline-methods] */
    public final ActivityC45651qj mo49getActivity() {
        C1BB<?> c1bb = this.mHost;
        if (c1bb == null) {
            return null;
        }
        return (ActivityC45651qj) c1bb.LJLIL;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C08U c08u = this.mAnimationInfo;
        if (c08u == null || (bool = c08u.LJIIL) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C08U c08u = this.mAnimationInfo;
        if (c08u == null || (bool = c08u.LJIIJJI) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        C08U c08u = this.mAnimationInfo;
        if (c08u == null) {
            return null;
        }
        return c08u.LIZ;
    }

    public Animator getAnimator() {
        C08U c08u = this.mAnimationInfo;
        if (c08u == null) {
            return null;
        }
        return c08u.LIZIZ;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(C1B8.LIZ("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        C1BB<?> c1bb = this.mHost;
        if (c1bb == null) {
            return null;
        }
        return c1bb.LJLILLLLZI;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                this.mDefaultFactory = new SavedStateViewModelFactory(requireActivity().getApplication(), this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public Object getEnterTransition() {
        C08U c08u = this.mAnimationInfo;
        if (c08u == null) {
            return null;
        }
        return c08u.LJFF;
    }

    public AbstractC020606g getEnterTransitionCallback() {
        C08U c08u = this.mAnimationInfo;
        if (c08u == null) {
            return null;
        }
        c08u.getClass();
        return null;
    }

    public Object getExitTransition() {
        C08U c08u = this.mAnimationInfo;
        if (c08u == null) {
            return null;
        }
        return c08u.LJII;
    }

    public AbstractC020606g getExitTransitionCallback() {
        C08U c08u = this.mAnimationInfo;
        if (c08u == null) {
            return null;
        }
        c08u.getClass();
        return null;
    }

    public final Object getHost() {
        C1BB<?> c1bb = this.mHost;
        if (c1bb == null) {
            return null;
        }
        return c1bb.LJFF();
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        if (layoutInflater == null) {
            return performGetLayoutInflater(null);
        }
        return layoutInflater;
    }

    public int getNextAnim() {
        C08U c08u = this.mAnimationInfo;
        if (c08u == null) {
            return 0;
        }
        return c08u.LIZLLL;
    }

    public int getNextTransition() {
        C08U c08u = this.mAnimationInfo;
        if (c08u == null) {
            return 0;
        }
        return c08u.LJ;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException(C1B8.LIZ("Fragment ", this, " not associated with a fragment manager."));
    }

    public Object getReenterTransition() {
        C08U c08u = this.mAnimationInfo;
        if (c08u == null) {
            return null;
        }
        Object obj = c08u.LJIIIIZZ;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return obj;
    }

    public Object getReturnTransition() {
        C08U c08u = this.mAnimationInfo;
        if (c08u == null) {
            return null;
        }
        Object obj = c08u.LJI;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return obj;
    }

    @Override // X.InterfaceC36571c5
    public final AnonymousClass107 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.LIZIZ;
    }

    public Object getSharedElementEnterTransition() {
        C08U c08u = this.mAnimationInfo;
        if (c08u == null) {
            return null;
        }
        return c08u.LJIIIZ;
    }

    public Object getSharedElementReturnTransition() {
        C08U c08u = this.mAnimationInfo;
        if (c08u == null) {
            return null;
        }
        Object obj = c08u.LJIIJ;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return obj;
    }

    public int getStateAfterAnimating() {
        C08U c08u = this.mAnimationInfo;
        if (c08u == null) {
            return 0;
        }
        return c08u.LIZJ;
    }

    public final Fragment getTargetFragment() {
        String str;
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null && (str = this.mTargetWho) != null) {
            return fragmentManager.LJJJ(str);
        }
        return null;
    }

    public LifecycleOwner getViewLifecycleOwner() {
        C1B9 c1b9 = this.mViewLifecycleOwner;
        if (c1b9 != null) {
            return c1b9;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager.LJJJJLL(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final boolean isAdded() {
        if (this.mHost != null && this.mAdded) {
            return true;
        }
        return false;
    }

    public boolean isHideReplaced() {
        C08U c08u = this.mAnimationInfo;
        if (c08u == null) {
            return false;
        }
        return c08u.LJIILL;
    }

    public final boolean isInBackStack() {
        if (this.mBackStackNesting > 0) {
            return true;
        }
        return false;
    }

    public boolean isPostponed() {
        C08U c08u = this.mAnimationInfo;
        if (c08u == null) {
            return false;
        }
        return c08u.LJIILIIL;
    }

    public final boolean isResumed() {
        if (this.mState >= 4) {
            return true;
        }
        return false;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.LJJJLZIJ();
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.LJJLIIIJ();
    }

    public void performAttach() {
        this.mChildFragmentManager.LJII(this.mHost, new AnonymousClass095() { // from class: X.1Ax
            @Override // X.AnonymousClass095
            public final boolean LIZIZ() {
                if (Fragment.this.mView != null) {
                    return true;
                }
                return false;
            }

            @Override // X.AnonymousClass095
            public final View LIZ(int i) {
                View view = Fragment.this.mView;
                if (view != null) {
                    return view.findViewById(i);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Fragment ");
                LIZ.append(this);
                LIZ.append(" does not have a view");
                throw new IllegalStateException(X1D.LIZIZ(LIZ));
            }
        }, this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.LJLILLLLZI);
        if (this.mCalled) {
        } else {
            throw new AnonymousClass093(C1B8.LIZ("Fragment ", this, " did not call through to super.onAttach()"));
        }
    }

    public void performDestroy() {
        this.mChildFragmentManager.LJIJI();
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
        } else {
            throw new AnonymousClass093(C1B8.LIZ("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.LJJIIJZLJL(1);
        if (this.mView != null) {
            this.mViewLifecycleOwner.LIZ(Lifecycle.Event.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            C09N.LIZIZ(this).LJ();
            this.mPerformedCreateView = false;
            return;
        }
        throw new AnonymousClass093(C1B8.LIZ("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    public void performPause() {
        this.mChildFragmentManager.LJJIIJZLJL(3);
        if (this.mView != null) {
            this.mViewLifecycleOwner.LIZ(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        this.mState = 3;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
        } else {
            throw new AnonymousClass093(C1B8.LIZ("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean LJJJLL = FragmentManager.LJJJLL(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != LJJJLL) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(LJJJLL);
            onPrimaryNavigationFragmentChanged(LJJJLL);
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.LJLJL();
            fragmentManager.LJJI(fragmentManager.mPrimaryNav);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.LJJLIIIJ();
        this.mChildFragmentManager.LJJIJIL(true);
        this.mState = 4;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
            Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
            lifecycleRegistry.handleLifecycleEvent(event);
            if (this.mView != null) {
                this.mViewLifecycleOwner.LIZ(event);
            }
            this.mChildFragmentManager.LJJIII();
            return;
        }
        throw new AnonymousClass093(C1B8.LIZ("Fragment ", this, " did not call through to super.onResume()"));
    }

    public void performStart() {
        this.mChildFragmentManager.LJJLIIIJ();
        this.mChildFragmentManager.LJJIJIL(true);
        this.mState = 3;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
            Lifecycle.Event event = Lifecycle.Event.ON_START;
            lifecycleRegistry.handleLifecycleEvent(event);
            if (this.mView != null) {
                this.mViewLifecycleOwner.LIZ(event);
            }
            this.mChildFragmentManager.LJJIIJ();
            return;
        }
        throw new AnonymousClass093(C1B8.LIZ("Fragment ", this, " did not call through to super.onStart()"));
    }

    public void performStop() {
        this.mChildFragmentManager.LJJIIZ();
        if (this.mView != null) {
            this.mViewLifecycleOwner.LIZ(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        this.mState = 2;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
        } else {
            throw new AnonymousClass093(C1B8.LIZ("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void startPostponedEnterTransition() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || fragmentManager.mHost == null) {
            ensureAnimationInfo().LJIILIIL = false;
        } else if (Looper.myLooper() != this.mFragmentManager.mHost.LJLJI.getLooper()) {
            this.mFragmentManager.mHost.LJLJI.postAtFrontOfQueue(new IDRunnableS85S0100000(this, 18));
        } else {
            callStartTransitionListener();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(C16880lQ.LJLLJ(getClass()));
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        sb.append(")");
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" ");
            sb.append(this.mTag);
        }
        sb.append('}');
        return sb.toString();
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new FragmentManagerImpl();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new IDRunnableS85S0100000(this, 17);
        this.mMaxState = Lifecycle.State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new MutableLiveData<>();
        initLifecycle();
    }

    public C09N getLoaderManager() {
        return C09N.LIZIZ(this);
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new FragmentManagerImpl();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isRemovingParent() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (parentFragment.isRemoving() || parentFragment.isRemovingParent())) {
            return true;
        }
        return false;
    }

    public final boolean isVisible() {
        View view;
        if (isAdded() && !isHidden() && (view = this.mView) != null && view.getWindowToken() != null && this.mView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.LJIJJ();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().LJIILIIL = true;
    }

    public final ActivityC45651qj requireActivity() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            return mo49getActivity;
        }
        throw new IllegalStateException(C1B8.LIZ("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(C1B8.LIZ("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(C1B8.LIZ("Fragment ", this, " not attached to a context."));
    }

    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(C1B8.LIZ("Fragment ", this, " not attached to a host."));
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            if (getContext() == null) {
                throw new IllegalStateException(C1B8.LIZ("Fragment ", this, " is not attached to any Fragment or host"));
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Fragment ");
            LIZ.append(this);
            LIZ.append(" is not a child Fragment, it is directly attached to ");
            LIZ.append(getContext());
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
        return parentFragment;
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(C1B8.LIZ("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public final String getTag() {
        return this.mTag;
    }

    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public LiveData<LifecycleOwner> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        return this.mMenuVisible;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.08T
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new Fragment.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Fragment.SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final Fragment.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new Fragment.SavedState(parcel, classLoader);
            }
        };
        public final Bundle LJLIL;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public SavedState(Bundle bundle) {
            this.LJLIL = bundle;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.LJLIL = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.LJLIL);
        }
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }

    public void androidx_fragment_app_Fragment__setUserVisibleHint$___twin___(boolean z) {
        boolean z2;
        if (!this.mUserVisibleHint && z && this.mState < 3 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            this.mFragmentManager.LJJLIIIJILLIZJL(this);
        }
        this.mUserVisibleHint = z;
        if (this.mState < 3 && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.LJJJJ(str);
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        C1BB<?> c1bb = this.mHost;
        if (c1bb != null) {
            LayoutInflater LJI = c1bb.LJI();
            LJI.setFactory2(this.mChildFragmentManager.mLayoutInflaterFactory);
            return LJI;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    public void onAttach(Context context) {
        Activity activity;
        this.mCalled = true;
        C1BB<?> c1bb = this.mHost;
        if (c1bb == null || (activity = c1bb.LJLIL) == null) {
            return;
        }
        this.mCalled = false;
        onAttach(activity);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.mCurState >= 1) {
            return;
        }
        fragmentManager.LJIIZILJ();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-8040495993281861033");
        if (c03880Dg.LIZJ(10501, "androidx/fragment/app/Fragment", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "androidx/fragment/app/Fragment", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
        } else {
            c03880Dg.LIZIZ(10501, "androidx/fragment/app/Fragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.LJJLIIIJ();
        this.mState = 2;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            this.mChildFragmentManager.LJIILJJIL();
            return;
        }
        throw new AnonymousClass093(C1B8.LIZ("Fragment ", this, " did not call through to super.onActivityCreated()"));
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.LJIILL(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (onContextItemSelected(menuItem) || this.mChildFragmentManager.LJIILLIIL(menuItem)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.LJJLIIIJ();
        this.mState = 1;
        this.mCalled = false;
        this.mSavedStateRegistryController.LIZIZ(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
            return;
        }
        throw new AnonymousClass093(C1B8.LIZ("Fragment ", this, " did not call through to super.onCreate()"));
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.LJIJJLI(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if ((this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) || this.mChildFragmentManager.LJIL(menuItem)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.LJJ(menu);
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.LJJIFFI(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return z | this.mChildFragmentManager.LJJII(menu);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.LIZJ(bundle);
        Parcelable LJL = this.mChildFragmentManager.LJL();
        if (LJL != null) {
            bundle.putParcelable("android:support:fragments", LJL);
        }
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.mChildFragmentManager.LJJZZIII(parcelable);
            this.mChildFragmentManager.LJIIZILJ();
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.LIZ(Lifecycle.Event.ON_CREATE);
                return;
            }
            return;
        }
        throw new AnonymousClass093(C1B8.LIZ("Fragment ", this, " did not call through to super.onViewStateRestored()"));
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().LJIIL = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().LJIIJJI = Boolean.valueOf(z);
    }

    public void setAnimatingAway(View view) {
        ensureAnimationInfo().LIZ = view;
    }

    public void setAnimator(Animator animator) {
        ensureAnimationInfo().LIZIZ = animator;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void setEnterSharedElementCallback(AbstractC020606g abstractC020606g) {
        ensureAnimationInfo().getClass();
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().LJFF = obj;
    }

    public void setExitSharedElementCallback(AbstractC020606g abstractC020606g) {
        ensureAnimationInfo().getClass();
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().LJII = obj;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.LJIIL();
            }
        }
    }

    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().LJIILL = z;
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (savedState == null || (bundle = savedState.LJLIL) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.LJIIL();
            }
        }
    }

    public void setNextAnim(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        ensureAnimationInfo().LIZLLL = i;
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.LJ = i;
    }

    public void setOnStartEnterTransitionListener(C08W c08w) {
        ensureAnimationInfo();
        C08U c08u = this.mAnimationInfo;
        C08W c08w2 = c08u.LJIILJJIL;
        if (c08w == c08w2) {
            return;
        }
        if (c08w == null || c08w2 == null) {
            if (c08u.LJIILIIL) {
                c08u.LJIILJJIL = c08w;
            }
            if (c08w != null) {
                ((C1B2) c08w).LIZJ++;
                return;
            }
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Trying to set a replacement startPostponedEnterTransition on ");
        LIZ.append(this);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().LJIIIIZZ = obj;
    }

    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            if (z) {
                fragmentManager.LJFF(this);
                return;
            } else {
                fragmentManager.LJJZZI(this);
                return;
            }
        }
        this.mRetainInstanceChangedWhileDetached = true;
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().LJI = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().LJIIIZ = obj;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().LJIIJ = obj;
    }

    public void setStateAfterAnimating(int i) {
        ensureAnimationInfo().LIZJ = i;
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        C1BB<?> c1bb = this.mHost;
        if (c1bb != null) {
            return c1bb.LJIIIZ(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public static void androidx_fragment_app_Fragment_com_bytedance_scalpel_scene_lancet_common_FragmentManagerLancet_setUserVisibleHint(Fragment fragment, boolean z) {
        fragment.androidx_fragment_app_Fragment__setUserVisibleHint$___twin___(z);
        BPR LIZ = C39144FXw.LIZ();
        if (LIZ != null && LIZ.LIZ) {
            BPQ.LIZIZ().execute(new ARunnableS1S0111000_8(fragment, z, 2));
        }
    }

    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return z | this.mChildFragmentManager.LJIJ(menu, menuInflater);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().LJIILIIL = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            handler = fragmentManager.mHost.LJLJI;
        } else {
            handler = new Handler(C16880lQ.LLJJJJ());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final void requestPermissions(String[] strArr, int i) {
        C1BB<?> c1bb = this.mHost;
        if (c1bb != null) {
            c1bb.LJII(this, strArr, i);
            return;
        }
        throw new IllegalStateException(C1B8.LIZ("Fragment ", this, " not attached to Activity"));
    }

    public void setTargetFragment(Fragment fragment, int i) {
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2 = this.mFragmentManager;
        if (fragment != null) {
            fragmentManager = fragment.mFragmentManager;
        } else {
            fragmentManager = null;
        }
        if (fragmentManager2 == null || fragmentManager == null || fragmentManager2 == fragmentManager) {
            for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment()) {
                if (fragment2 == this) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Setting ");
                    LIZ.append(fragment);
                    LIZ.append(" as the target of ");
                    LIZ.append(this);
                    LIZ.append(" would create a target cycle");
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                }
            }
            if (fragment == null) {
                this.mTargetWho = null;
                this.mTarget = null;
            } else if (this.mFragmentManager != null && fragment.mFragmentManager != null) {
                this.mTargetWho = fragment.mWho;
                this.mTarget = null;
            } else {
                this.mTargetWho = null;
                this.mTarget = fragment;
            }
            this.mTargetRequestCode = i;
            return;
        }
        throw new IllegalArgumentException(C1B8.LIZ("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
    }

    public void startActivity(Intent intent, Bundle bundle) {
        C1BB<?> c1bb = this.mHost;
        if (c1bb != null) {
            c1bb.LJIIJ(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException(C1B8.LIZ("Fragment ", this, " not attached to Activity"));
    }

    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = AnonymousClass098.LIZ(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.setArguments(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e) {
            throw new C08V(a1.LJ("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new C08V(a1.LJ("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new C08V(a1.LJ("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new C08V(a1.LJ("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    public View androidx_fragment_app_Fragment__onCreateView$___twin___(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return C16880lQ.LLLLIILL(layoutInflater, i, viewGroup, false);
        }
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        Activity activity;
        this.mCalled = true;
        C1BB<?> c1bb = this.mHost;
        if (c1bb == null || (activity = c1bb.LJLIL) == null) {
            return;
        }
        this.mCalled = false;
        onInflate(activity, attributeSet, bundle);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.LJJLIIIJ();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C1B9();
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        if (onCreateView != null) {
            onCreateView.setTag(R.id.bq7, this);
        }
        this.mView = onCreateView;
        if (onCreateView != null) {
            C1B9 c1b9 = this.mViewLifecycleOwner;
            if (c1b9.LJLIL == null) {
                c1b9.LJLIL = new LifecycleRegistry(c1b9);
            }
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
            return;
        }
        if (this.mViewLifecycleOwner.LJLIL != null) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
        this.mViewLifecycleOwner = null;
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        C1BB<?> c1bb = this.mHost;
        if (c1bb != null) {
            c1bb.LJIIJ(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException(C1B8.LIZ("Fragment ", this, " not attached to Activity"));
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public static View androidx_fragment_app_Fragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(Fragment fragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View androidx_fragment_app_Fragment__onCreateView$___twin___ = fragment.androidx_fragment_app_Fragment__onCreateView$___twin___(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(androidx_fragment_app_Fragment__onCreateView$___twin___ instanceof View)) {
            androidx_fragment_app_Fragment__onCreateView$___twin___ = null;
        }
        if (androidx_fragment_app_Fragment__onCreateView$___twin___ != null) {
            try {
                ViewTreeLifecycleOwner.set(androidx_fragment_app_Fragment__onCreateView$___twin___, fragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(androidx_fragment_app_Fragment__onCreateView$___twin___, fragment);
                C10A.LIZIZ(androidx_fragment_app_Fragment__onCreateView$___twin___, fragment);
                ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return androidx_fragment_app_Fragment__onCreateView$___twin___;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        if (getNextAnim() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(getNextAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(getStateAfterAnimating());
        }
        if (getContext() != null) {
            C09N.LIZIZ(this).LIZLLL(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Child ");
        LIZ.append(this.mChildFragmentManager);
        LIZ.append(":");
        printWriter.println(X1D.LIZIZ(LIZ));
        this.mChildFragmentManager.LJJIIZI(i0.LJFF(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        C1BB<?> c1bb = this.mHost;
        if (c1bb != null) {
            c1bb.LJIIJJI(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException(C1B8.LIZ("Fragment ", this, " not attached to Activity"));
    }
}
