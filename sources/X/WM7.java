package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public abstract class WM7 implements LifecycleOwner, InterfaceC36571c5, ViewModelStoreOwner {
    public static final String SCENE_SERVICE = "scene";
    public Activity mActivity;
    public Bundle mArguments;
    public boolean mCalled;
    public final Handler mHandler;
    public LayoutInflater mLayoutInflater;
    public final C72426Sbe mLifecycleRegistry;
    public WM7 mParentScene;
    public final List<Runnable> mPendingActionList;
    public InterfaceC78896Uxo mRootScopeFactory = V8O.LJ;
    public AnonymousClass109 mSavedStateRegistryController;
    public Context mSceneContext;
    public boolean mSceneRestoreEnabled;
    public V8O mScope;
    public WME mState;
    public final StringBuilder mStateHistoryBuilder;
    public int mThemeResource;
    public View mView;
    public boolean mVisibleDispatched;

    public final void disableSceneRestore() {
        this.mSceneRestoreEnabled = false;
    }

    public void dispatchDestroy() {
        this.mCalled = false;
        dispatchOnPreSceneDestroyed(this, false);
        onDestroy();
        if (this.mCalled) {
            dispatchOnSceneDestroyed(this, false);
            return;
        }
        throw new P3G(C279217s.LIZ("Scene ", this, " did not call through to super.onDestroy()"));
    }

    public void dispatchDetachScene() {
        this.mParentScene = null;
    }

    public void dispatchResume() {
        this.mCalled = false;
        dispatchOnPreSceneResumed(this, false);
        onResume();
        if (this.mCalled) {
            dispatchOnSceneResumed(this, false);
            setState(WME.RESUMED);
            this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
            return;
        }
        throw new P3G(C279217s.LIZ("Scene ", this, " did not call through to super.onResume()"));
    }

    public void dispatchStart() {
        this.mCalled = false;
        dispatchOnPreSceneStarted(this, false);
        onStart();
        if (this.mCalled) {
            dispatchOnSceneStarted(this, false);
            setState(WME.STARTED);
            dispatchVisibleChanged();
            this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
            return;
        }
        throw new P3G(C279217s.LIZ("Scene ", this, " did not call through to super.onStart()"));
    }

    public void onAttach() {
        this.mCalled = true;
    }

    public abstract View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
        executePendingActions();
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
        dispatchVisibleChanged();
    }

    public void onVisibleChanged(boolean z) {
    }

    private void executePendingActions() {
        if (this.mPendingActionList.size() > 0) {
            ArrayList arrayList = new ArrayList(this.mPendingActionList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.mPendingActionList.removeAll(arrayList);
        }
    }

    public void dispatchDestroyView() {
        ViewParent parent;
        View view = this.mView;
        if (C79057V0z.LIZ == 0) {
            try {
                C79057V0z.LIZ = 2;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("cancelTouchTarget", View.class);
                C79057V0z.LIZIZ = declaredMethod;
                declaredMethod.setAccessible(true);
                C79057V0z.LIZ = 1;
            } catch (NoSuchMethodException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (C79057V0z.LIZ == 1 && (parent = view.getParent()) != null) {
            try {
                C79057V0z.LJIIJJI(parent, C79057V0z.LIZIZ, new Object[]{view});
            } catch (IllegalAccessException e2) {
                C16880lQ.LLLLIIL(e2);
            } catch (InvocationTargetException e3) {
                C16880lQ.LLLLIIL(e3);
            }
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        setState(WME.NONE);
        this.mCalled = false;
        dispatchOnPreSceneViewDestroyed(this, false);
        onDestroyView();
        if (this.mCalled) {
            dispatchOnSceneViewDestroyed(this, false);
            this.mView.cancelPendingInputEvents();
            this.mView = null;
            this.mLayoutInflater = null;
            return;
        }
        throw new P3G(C279217s.LIZ("Scene ", this, " did not call through to super.onDestroyView()"));
    }

    public void dispatchDetachActivity() {
        Activity activity = this.mActivity;
        this.mActivity = null;
        this.mSceneContext = null;
        this.mCalled = false;
        onDetach();
        if (this.mCalled) {
            if (!activity.isChangingConfigurations()) {
                V8O v8o = this.mScope;
                V8O v8o2 = v8o.LIZ;
                if (v8o2 != null) {
                    ((HashMap) v8o2.LIZJ).remove(v8o.LIZIZ);
                }
                for (Object obj : ((HashMap) v8o.LIZLLL).values()) {
                    if (obj instanceof V8P) {
                        ((V8P) obj).onUnRegister();
                    }
                }
                ((HashMap) v8o.LIZLLL).clear();
                ((HashMap) v8o.LIZJ).clear();
            }
            this.mScope = null;
            this.mPendingActionList.clear();
            return;
        }
        throw new P3G(C279217s.LIZ("Scene ", this, " did not call through to super.onDetach()"));
    }

    public void dispatchPause() {
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        setState(WME.STARTED);
        this.mCalled = false;
        dispatchOnPreScenePaused(this, false);
        onPause();
        if (this.mCalled) {
            dispatchOnScenePaused(this, false);
            return;
        }
        throw new P3G(C279217s.LIZ("Scene ", this, " did not call through to super.onPause()"));
    }

    public void dispatchStop() {
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        setState(WME.ACTIVITY_CREATED);
        this.mCalled = false;
        dispatchOnPreSceneStopped(this, false);
        onStop();
        if (this.mCalled) {
            dispatchOnSceneStopped(this, false);
            return;
        }
        throw new P3G(C279217s.LIZ("Scene ", this, " did not call through to super.onStop()"));
    }

    public final Context getApplicationContext() {
        Activity activity = this.mActivity;
        if (activity == null) {
            return null;
        }
        return C16880lQ.LLLLJ(activity);
    }

    public final String getDebugSceneHierarchy() {
        StringBuilder sb = new StringBuilder();
        C78932UyO.LIZJ(this, sb, 0);
        return sb.toString();
    }

    public final LayoutInflater getLayoutInflater() {
        if (this.mLayoutInflater == null) {
            this.mLayoutInflater = onGetLayoutInflater();
        }
        return this.mLayoutInflater;
    }

    @Override // X.InterfaceC36571c5
    public final AnonymousClass107 getSavedStateRegistry() {
        AnonymousClass109 anonymousClass109 = this.mSavedStateRegistryController;
        if (anonymousClass109 != null) {
            return anonymousClass109.LIZIZ;
        }
        throw new IllegalStateException("SavedStateRegistry is not created, you can't call before onCreate");
    }

    public final Context getSceneContext() {
        if (this.mActivity == null) {
            return null;
        }
        if (this.mSceneContext == null) {
            this.mSceneContext = onGetSceneContext();
        }
        return this.mSceneContext;
    }

    public final V8O getScope() {
        V8O v8o = this.mScope;
        if (v8o != null) {
            return v8o;
        }
        throw new IllegalStateException("Scope is not created, you can't call before onCreate");
    }

    public final String getStateHistory() {
        return this.mStateHistoryBuilder.toString();
    }

    public boolean isVisible() {
        if (this.mState.value >= WME.STARTED.value) {
            return true;
        }
        return false;
    }

    public LayoutInflater onGetLayoutInflater() {
        if (this.mActivity != null) {
            return new C67614QgE(requireActivity(), this);
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Scene is attached to the Activity.");
    }

    public Context onGetSceneContext() {
        if (this.mActivity != null) {
            if (this.mThemeResource > 0) {
                return new C81117VsX(this, this.mActivity, this.mThemeResource);
            }
            Activity activity = this.mActivity;
            return new C81118VsY(this, activity, activity.getTheme());
        }
        throw new IllegalStateException("onGetContextThemeWrapper() cannot be executed until the Scene is attached to the Activity.");
    }

    public final Activity requireActivity() {
        Activity activity = this.mActivity;
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(C279217s.LIZ("Scene ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(C279217s.LIZ("Scene ", this, " does not have any arguments."));
    }

    public final WM7 requireParentScene() {
        WM7 wm7 = this.mParentScene;
        if (wm7 == null) {
            if (getApplicationContext() == null) {
                throw new IllegalStateException(C279217s.LIZ("Scene ", this, " is not attached to any Scene or host"));
            }
            throw new IllegalStateException(C279217s.LIZ("Scene ", this, " is root Scene, not a child Scene"));
        }
        return wm7;
    }

    public final View requireView() {
        View view = this.mView;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("requireView() should not be called before onCreateView() or after onDestroyView()");
    }

    public String toString() {
        int lastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        String LJLLJ = C16880lQ.LJLLJ(getClass());
        if (LJLLJ.length() <= 0 && (lastIndexOf = (LJLLJ = getClass().getName()).lastIndexOf(46)) > 0) {
            LJLLJ = LJLLJ.substring(lastIndexOf + 1);
        }
        sb.append(LJLLJ);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append('}');
        return sb.toString();
    }

    public WM7() {
        WME wme = WME.NONE;
        this.mState = wme;
        this.mStateHistoryBuilder = new StringBuilder(wme.name);
        this.mSceneRestoreEnabled = true;
        this.mHandler = new Handler(C16880lQ.LLJJJJ());
        this.mPendingActionList = new ArrayList();
        this.mCalled = false;
        this.mVisibleDispatched = false;
        this.mLifecycleRegistry = new C72426Sbe(new LifecycleRegistry(this));
    }

    public final void dispatchVisibleChanged() {
        boolean isVisible = isVisible();
        if (isVisible == this.mVisibleDispatched) {
            return;
        }
        this.mVisibleDispatched = isVisible;
        onVisibleChanged(isVisible);
    }

    public final Resources getResources() {
        return requireActivity().getResources();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        V8O scope = getScope();
        if (((HashMap) scope.LIZLLL).containsKey(WM9.class)) {
            return ((WM9) scope.LIZ(WM9.class)).LIZ;
        }
        ViewModelStore viewModelStore = new ViewModelStore();
        ((HashMap) scope.LIZLLL).put(WM9.class, new WM9(viewModelStore));
        return viewModelStore;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final Context requireApplicationContext() {
        Context applicationContext = getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        throw new IllegalStateException(C279217s.LIZ("Scene ", this, " not attached to a context."));
    }

    public final Context requireSceneContext() {
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            return sceneContext;
        }
        throw new IllegalStateException(C279217s.LIZ("Scene ", this, " not attached to an activity."));
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    private void dispatchViewStateRestored(Bundle bundle) {
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
        } else {
            throw new P3G(C279217s.LIZ("Scene ", this, " did not call through to super.onViewStateRestored()"));
        }
    }

    private void setState(WME wme) {
        WME wme2 = this.mState;
        int i = wme.value;
        int i2 = wme2.value;
        if (i > i2) {
            if (i - i2 != 1) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Cant setState from ");
                LIZ.append(wme2.name);
                LIZ.append(" to ");
                LIZ.append(wme.name);
                throw new WM8(X1D.LIZIZ(LIZ));
            }
        } else if (i < i2 && ((wme2 != WME.ACTIVITY_CREATED || wme != WME.NONE) && i - i2 != -1)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Cant setState from ");
            LIZ2.append(wme2.name);
            LIZ2.append(" to ");
            LIZ2.append(wme.name);
            throw new WM8(X1D.LIZIZ(LIZ2));
        }
        this.mState = wme;
        StringBuilder sb = this.mStateHistoryBuilder;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(" - ");
        LIZ3.append(wme.name);
        sb.append(X1D.LIZIZ(LIZ3));
    }

    public void dispatchActivityCreated(Bundle bundle) {
        this.mCalled = false;
        dispatchOnPreSceneActivityCreated(this, bundle, false);
        onActivityCreated(bundle);
        if (this.mCalled) {
            dispatchOnSceneActivityCreated(this, bundle, false);
            if (bundle != null) {
                dispatchViewStateRestored(bundle);
            }
            setState(WME.ACTIVITY_CREATED);
            this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
            return;
        }
        throw new P3G(C279217s.LIZ("Scene ", this, " did not call through to super.onActivityCreated()"));
    }

    public void dispatchAttachActivity(Activity activity) {
        this.mActivity = activity;
        if (this.mLifecycleRegistry.getCurrentState() != Lifecycle.State.INITIALIZED) {
            C72426Sbe c72426Sbe = this.mLifecycleRegistry;
            Iterator it = ((ArrayList) c72426Sbe.LJLILLLLZI).iterator();
            while (it.hasNext()) {
                c72426Sbe.LJLIL.removeObserver((LifecycleObserver) it.next());
            }
            c72426Sbe.LJLIL.markState(Lifecycle.State.INITIALIZED);
            Iterator it2 = ((ArrayList) c72426Sbe.LJLILLLLZI).iterator();
            while (it2.hasNext()) {
                c72426Sbe.LJLIL.addObserver((LifecycleObserver) it2.next());
            }
        }
    }

    public void dispatchAttachScene(WM7 wm7) {
        if (wm7 != null) {
            this.mParentScene = wm7;
        }
        this.mCalled = false;
        onAttach();
        if (this.mCalled) {
        } else {
            throw new P3G(C279217s.LIZ("Scene ", this, " did not call through to super.onAttach()"));
        }
    }

    public void dispatchCreate(Bundle bundle) {
        String str;
        WM7 wm7 = this.mParentScene;
        if (wm7 == null) {
            this.mScope = this.mRootScopeFactory.Xk();
        } else {
            V8O scope = wm7.getScope();
            scope.getClass();
            if (bundle != null) {
                str = bundle.getString("scope_key");
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Scene #");
                str = C47135Ieh.LIZJ(V8O.LJFF, LIZ, LIZ);
            }
            V8O v8o = (V8O) ((HashMap) scope.LIZJ).get(str);
            if (v8o == null) {
                v8o = new V8O(scope, str);
                ((HashMap) scope.LIZJ).put(str, v8o);
            }
            this.mScope = v8o;
        }
        if (bundle != null && bundle.getBoolean("bd-scene-nav:scene_argument_has")) {
            Bundle bundle2 = bundle.getBundle("bd-scene-nav:scene_argument");
            if (bundle2 != null) {
                bundle2.setClassLoader(getClass().getClassLoader());
                this.mArguments = bundle2;
            } else {
                throw new IllegalStateException("can't get Scene arguments from savedInstanceState");
            }
        }
        this.mCalled = false;
        AnonymousClass109 LIZ2 = AnonymousClass108.LIZ(this);
        this.mSavedStateRegistryController = LIZ2;
        LIZ2.LIZIZ(bundle);
        dispatchOnPreSceneCreated(this, bundle, false);
        onCreate(bundle);
        if (this.mCalled) {
            dispatchOnSceneCreated(this, bundle, false);
            return;
        }
        throw new P3G(C279217s.LIZ("Scene ", this, " did not call through to super.onCreate()"));
    }

    public void dispatchSaveInstanceState(Bundle bundle) {
        this.mCalled = false;
        onSaveInstanceState(bundle);
        if (this.mCalled) {
            this.mSavedStateRegistryController.LIZJ(bundle);
            return;
        }
        throw new P3G(C279217s.LIZ("Scene ", this, " did not call through to super.onSaveInstanceState()"));
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final void executeNowOrScheduleAtNextResume(Runnable runnable) {
        if (this.mState == WME.RESUMED) {
            runnable.run();
        } else {
            this.mPendingActionList.add(runnable);
        }
    }

    public final <T extends View> T findViewById(int i) {
        View view = this.mView;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i);
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    public void onActivityCreated(Bundle bundle) {
        View decorView = requireActivity().getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if ((systemUiVisibility & 1024) != 0) {
            C16340kY.LIZJ(decorView);
        } else if ((systemUiVisibility & 512) != 0) {
            C16340kY.LIZJ(decorView);
        }
        this.mCalled = true;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.mCalled = true;
        if (this.mArguments != null) {
            bundle.putBoolean("bd-scene-nav:scene_argument_has", true);
            bundle.putBundle("bd-scene-nav:scene_argument", this.mArguments);
        } else {
            bundle.putBoolean("bd-scene-nav:scene_argument_has", false);
        }
        bundle.putString("scope_key", this.mScope.LIZIZ);
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.mView.saveHierarchyState(sparseArray);
        bundle.putSparseParcelableArray("bd-scene:views", sparseArray);
        View findFocus = this.mView.findFocus();
        if (findFocus != null && findFocus.getId() != -1) {
            bundle.putInt("bd-scene:focusedViewId", findFocus.getId());
        }
        dispatchOnSceneSaveInstanceState(this, bundle, false);
    }

    public void onViewStateRestored(Bundle bundle) {
        View findViewById;
        this.mCalled = true;
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("bd-scene:views");
        if (sparseParcelableArray != null) {
            this.mView.restoreHierarchyState(sparseParcelableArray);
        }
        int i = bundle.getInt("bd-scene:focusedViewId", -1);
        if (i != -1 && (findViewById = this.mView.findViewById(i)) != null) {
            findViewById.requestFocus();
        }
    }

    public final <T extends View> T requireViewById(int i) {
        T t = (T) requireView().findViewById(i);
        if (t != null) {
            return t;
        }
        try {
            String resourceName = getResources().getResourceName(i);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" ");
            LIZ.append(resourceName);
            LIZ.append(" view not found");
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        } catch (Resources.NotFoundException unused) {
            throw new IllegalArgumentException(C0NY.LIZIZ(" ", i, " view not found"));
        }
    }

    public final void setTheme(int i) {
        if (this.mView == null) {
            if (this.mThemeResource != i) {
                this.mThemeResource = i;
                Context context = this.mSceneContext;
                if (context != null) {
                    context.setTheme(i);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("setTheme should be invoked before view is created, the best place is in onCreateView method");
    }

    public void dispatchCreateView(Bundle bundle, ViewGroup viewGroup) {
        if (this.mView == null) {
            View onCreateView = onCreateView(getLayoutInflater(), viewGroup, bundle);
            if (onCreateView != null) {
                if (onCreateView.getParent() == null) {
                    onCreateView.getId();
                    Context requireSceneContext = requireSceneContext();
                    Context context = onCreateView.getContext();
                    if (context == requireSceneContext || this.mThemeResource == 0 || C16880lQ.LLILL(context, SCENE_SERVICE) == this) {
                        onCreateView.setTag(R.id.ncj, this);
                        onCreateView.setTag(R.id.ncm, this);
                        onCreateView.setTag(R.id.ncl, this);
                        onCreateView.setTag(R.id.b2r, this);
                        onCreateView.setSaveFromParentEnabled(false);
                        this.mView = onCreateView;
                        this.mCalled = false;
                        dispatchOnPreSceneViewCreated(this, bundle, false);
                        onViewCreated(this.mView, bundle);
                        if (this.mCalled) {
                            dispatchOnSceneViewCreated(this, bundle, false);
                            setState(WME.VIEW_CREATED);
                            return;
                        }
                        throw new P3G(C279217s.LIZ("Scene ", this, " did not call through to super.onViewCreated()"));
                    }
                    throw new IllegalArgumentException("Scene view's context is incorrect, you should create view with getLayoutInflater() or requireSceneContext() instead");
                }
                throw new IllegalArgumentException("onCreateView returned view already has a parent. You must call removeView() on the view's parent first.");
            }
            throw new IllegalArgumentException("onCreateView cant return null");
        }
        throw new IllegalArgumentException("Scene already call onCreateView");
    }

    public void dispatchOnPreSceneDestroyed(WM7 wm7, boolean z) {
        boolean z2;
        WM7 wm72 = this.mParentScene;
        if (wm72 != null) {
            if (wm7 == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            wm72.dispatchOnPreSceneDestroyed(wm7, z2);
        }
    }

    public void dispatchOnPreScenePaused(WM7 wm7, boolean z) {
        boolean z2;
        WM7 wm72 = this.mParentScene;
        if (wm72 != null) {
            if (wm7 == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            wm72.dispatchOnPreScenePaused(wm7, z2);
        }
    }

    public void dispatchOnPreSceneResumed(WM7 wm7, boolean z) {
        boolean z2;
        WM7 wm72 = this.mParentScene;
        if (wm72 != null) {
            if (wm7 == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            wm72.dispatchOnPreSceneResumed(wm7, z2);
        }
    }

    public void dispatchOnPreSceneStarted(WM7 wm7, boolean z) {
        boolean z2;
        WM7 wm72 = this.mParentScene;
        if (wm72 != null) {
            if (wm7 == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            wm72.dispatchOnPreSceneStarted(wm7, z2);
        }
    }

    public void dispatchOnPreSceneStopped(WM7 wm7, boolean z) {
        boolean z2;
        WM7 wm72 = this.mParentScene;
        if (wm72 != null) {
            if (wm7 == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            wm72.dispatchOnPreSceneStopped(wm7, z2);
        }
    }

    public void dispatchOnPreSceneViewDestroyed(WM7 wm7, boolean z) {
        boolean z2;
        WM7 wm72 = this.mParentScene;
        if (wm72 != null) {
            if (wm7 == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            wm72.dispatchOnPreSceneViewDestroyed(wm7, z2);
        }
    }

    public void dispatchOnSceneDestroyed(WM7 wm7, boolean z) {
        boolean z2;
        WM7 wm72 = this.mParentScene;
        if (wm72 != null) {
            if (wm7 == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            wm72.dispatchOnSceneDestroyed(wm7, z2);
        }
    }

    public void dispatchOnScenePaused(WM7 wm7, boolean z) {
        boolean z2;
        WM7 wm72 = this.mParentScene;
        if (wm72 != null) {
            if (wm7 == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            wm72.dispatchOnScenePaused(wm7, z2);
        }
    }

    public void dispatchOnSceneResumed(WM7 wm7, boolean z) {
        boolean z2;
        WM7 wm72 = this.mParentScene;
        if (wm72 != null) {
            if (wm7 == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            wm72.dispatchOnSceneResumed(wm7, z2);
        }
    }

    public void dispatchOnSceneStarted(WM7 wm7, boolean z) {
        boolean z2;
        WM7 wm72 = this.mParentScene;
        if (wm72 != null) {
            if (wm7 == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            wm72.dispatchOnSceneStarted(wm7, z2);
        }
    }

    public void dispatchOnSceneStopped(WM7 wm7, boolean z) {
        boolean z2;
        WM7 wm72 = this.mParentScene;
        if (wm72 != null) {
            if (wm7 == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            wm72.dispatchOnSceneStopped(wm7, z2);
        }
    }

    public void dispatchOnSceneViewDestroyed(WM7 wm7, boolean z) {
        boolean z2;
        WM7 wm72 = this.mParentScene;
        if (wm72 != null) {
            if (wm7 == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            wm72.dispatchOnSceneViewDestroyed(wm7, z2);
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.mCalled = true;
    }

    public void dispatchOnPreSceneActivityCreated(WM7 wm7, Bundle bundle, boolean z) {
        boolean z2;
        WM7 wm72 = this.mParentScene;
        if (wm72 != null) {
            if (wm7 == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            wm72.dispatchOnPreSceneActivityCreated(wm7, bundle, z2);
        }
    }

    public void dispatchOnPreSceneCreated(WM7 wm7, Bundle bundle, boolean z) {
        boolean z2;
        WM7 wm72 = this.mParentScene;
        if (wm72 != null) {
            if (wm7 == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            wm72.dispatchOnPreSceneCreated(wm7, bundle, z2);
        }
    }

    public void dispatchOnPreSceneViewCreated(WM7 wm7, Bundle bundle, boolean z) {
        boolean z2;
        WM7 wm72 = this.mParentScene;
        if (wm72 != null) {
            if (wm7 == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            wm72.dispatchOnPreSceneViewCreated(wm7, bundle, z2);
        }
    }

    public void dispatchOnSceneActivityCreated(WM7 wm7, Bundle bundle, boolean z) {
        boolean z2;
        WM7 wm72 = this.mParentScene;
        if (wm72 != null) {
            if (wm7 == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            wm72.dispatchOnSceneActivityCreated(wm7, bundle, z2);
        }
    }

    public void dispatchOnSceneCreated(WM7 wm7, Bundle bundle, boolean z) {
        boolean z2;
        WM7 wm72 = this.mParentScene;
        if (wm72 != null) {
            if (wm7 == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            wm72.dispatchOnSceneCreated(wm7, bundle, z2);
        }
    }

    public void dispatchOnSceneSaveInstanceState(WM7 wm7, Bundle bundle, boolean z) {
        boolean z2;
        WM7 wm72 = this.mParentScene;
        if (wm72 != null) {
            if (wm7 == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            wm72.dispatchOnSceneSaveInstanceState(wm7, bundle, z2);
        }
    }

    public void dispatchOnSceneViewCreated(WM7 wm7, Bundle bundle, boolean z) {
        boolean z2;
        WM7 wm72 = this.mParentScene;
        if (wm72 != null) {
            if (wm7 == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            wm72.dispatchOnSceneViewCreated(wm7, bundle, z2);
        }
    }
}
