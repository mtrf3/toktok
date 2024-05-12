package androidx.activity;

import X.AbstractC008301n;
import X.AbstractC008601q;
import X.AbstractC18470nz;
import X.AnonymousClass106;
import X.AnonymousClass107;
import X.AnonymousClass108;
import X.AnonymousClass109;
import X.C007901j;
import X.C00R;
import X.C021606q;
import X.C06W;
import X.C0VK;
import X.C10A;
import X.C16550kt;
import X.C16560ku;
import X.C16880lQ;
import X.C17440mK;
import X.C18I;
import X.C1AU;
import X.C1NH;
import X.C47135Ieh;
import X.InterfaceC008201m;
import X.InterfaceC008701r;
import X.InterfaceC15040iS;
import X.InterfaceC16580kw;
import X.InterfaceC17450mL;
import X.InterfaceC36571c5;
import X.X1D;
import Y.IDRunnableS0S0201000;
import Y.IDRunnableS6S0101000;
import Y.IDRunnableS85S0100000;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class ComponentActivity extends C1AU implements ViewModelStoreOwner, HasDefaultViewModelProviderFactory, InterfaceC36571c5, C18I, InterfaceC008701r {
    public final AbstractC008601q mActivityResultRegistry;
    public int mContentLayoutId;
    public final C17440mK mContextAwareHelper;
    public ViewModelProvider.Factory mDefaultFactory;
    public final LifecycleRegistry mLifecycleRegistry;
    public final C16560ku mMenuHostHelper;
    public final AtomicInteger mNextLocalRequestCode;
    public final OnBackPressedDispatcher mOnBackPressedDispatcher;
    public final CopyOnWriteArrayList<InterfaceC15040iS<Configuration>> mOnConfigurationChangedListeners;
    public final CopyOnWriteArrayList<InterfaceC15040iS<C021606q>> mOnMultiWindowModeChangedListeners;
    public final CopyOnWriteArrayList<InterfaceC15040iS<Intent>> mOnNewIntentListeners;
    public final CopyOnWriteArrayList<InterfaceC15040iS<C06W>> mOnPictureInPictureModeChangedListeners;
    public final CopyOnWriteArrayList<InterfaceC15040iS<Integer>> mOnTrimMemoryListeners;
    public final AnonymousClass109 mSavedStateRegistryController;
    public ViewModelStore mViewModelStore;

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle lambda$new$0() {
        Bundle bundle = new Bundle();
        AbstractC008601q abstractC008601q = this.mActivityResultRegistry;
        abstractC008601q.getClass();
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(((HashMap) abstractC008601q.LIZJ).values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(((HashMap) abstractC008601q.LIZJ).keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC008601q.LJ));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) abstractC008601q.LJII.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", abstractC008601q.LIZ);
        return bundle;
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C007901j c007901j = (C007901j) getLastNonConfigurationInstance();
            if (c007901j != null) {
                this.mViewModelStore = c007901j.LIZIZ;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new ViewModelStore();
            }
        }
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public C0VK getDefaultViewModelCreationExtras() {
        C1NH c1nh = new C1NH();
        if (getApplication() != null) {
            c1nh.LIZIZ(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, getApplication());
        }
        c1nh.LIZIZ(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        c1nh.LIZIZ(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (getIntent() != null && C16880lQ.LLJJIJI(getIntent()) != null) {
            c1nh.LIZIZ(SavedStateHandleSupport.DEFAULT_ARGS_KEY, C16880lQ.LLJJIJI(getIntent()));
        }
        return c1nh;
    }

    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Bundle bundle;
        if (this.mDefaultFactory == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = C16880lQ.LLJJIJI(getIntent());
            } else {
                bundle = null;
            }
            this.mDefaultFactory = new SavedStateViewModelFactory(application, this, bundle);
        }
        return this.mDefaultFactory;
    }

    @Override // X.InterfaceC36571c5
    public final AnonymousClass107 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.LIZIZ;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.LIZJ();
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.LIZIZ;
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new C17440mK();
        this.mMenuHostHelper = new C16560ku(new IDRunnableS6S0101000(0, this, 1));
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        AnonymousClass109 LIZ = AnonymousClass108.LIZ(this);
        this.mSavedStateRegistryController = LIZ;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new IDRunnableS85S0100000(this, 1));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new AbstractC008601q() { // from class: X.18D
            @Override // X.AbstractC008601q
            public final void LIZIZ(int i, AbstractC18470nz abstractC18470nz, Object obj) {
                Bundle bundle;
                ComponentActivity context = ComponentActivity.this;
                abstractC18470nz.getClass();
                o.LJIIIZ(context, "context");
                Intent LIZ2 = abstractC18470nz.LIZ(context, obj);
                if (C16880lQ.LLJJIJI(LIZ2) != null && C16880lQ.LLJJIJI(LIZ2).getClassLoader() == null) {
                    LIZ2.setExtrasClassLoader(context.getClassLoader());
                }
                if (LIZ2.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                    bundle = C16880lQ.LJJLIIIIJ(LIZ2, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    LIZ2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                } else {
                    bundle = null;
                }
                if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(LIZ2.getAction())) {
                    String[] stringArrayExtra = LIZ2.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    if (stringArrayExtra == null) {
                        stringArrayExtra = new String[0];
                    }
                    C1AR.LJFF(context, stringArrayExtra, i);
                    return;
                }
                if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(LIZ2.getAction())) {
                    IntentSenderRequest intentSenderRequest = (IntentSenderRequest) LIZ2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                    try {
                        C06N.LIZJ(context, intentSenderRequest.mIntentSender, i, intentSenderRequest.mFillInIntent, intentSenderRequest.mFlagsMask, intentSenderRequest.mFlagsValues, 0, bundle);
                        return;
                    } catch (IntentSender.SendIntentException e) {
                        new Handler(C16880lQ.LLJJJJ()).post(new IDRunnableS0S0201000(i, e, this, 1));
                        return;
                    }
                }
                C06N.LIZIZ(context, LIZ2, i, bundle);
            }
        };
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() != null) {
            getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.3
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    Window window;
                    View peekDecorView;
                    if (event == Lifecycle.Event.ON_STOP && (window = ComponentActivity.this.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            });
            getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.4
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.LIZIZ = null;
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().clear();
                        }
                    }
                }
            });
            getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.5
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().removeObserver(this);
                }
            });
            LIZ.LIZ();
            SavedStateHandleSupport.enableSavedStateHandles(this);
            if (Build.VERSION.SDK_INT <= 23) {
                getLifecycle().addObserver(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().LIZJ("android:support:activity-result", new AnonymousClass106() { // from class: X.18F
                @Override // X.AnonymousClass106
                public final Bundle saveState() {
                    Bundle lambda$new$0;
                    lambda$new$0 = ComponentActivity.this.lambda$new$0();
                    return lambda$new$0;
                }
            });
            addOnContextAvailableListener(new InterfaceC17450mL() { // from class: X.18G
                @Override // X.InterfaceC17450mL
                public final void LIZ(Context context) {
                    ComponentActivity.this.lambda$new$1(context);
                }
            });
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private void initViewTreeOwners() {
        ViewTreeLifecycleOwner.set(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.set(getWindow().getDecorView(), this);
        C10A.LIZIZ(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        o.LJIIIZ(decorView, "<this>");
        decorView.setTag(R.id.nck, this);
    }

    public Object getLastCustomNonConfigurationInstance() {
        C007901j c007901j = (C007901j) getLastNonConfigurationInstance();
        if (c007901j != null) {
            return c007901j.LIZ;
        }
        return null;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C007901j c007901j;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this.mViewModelStore;
        if (viewModelStore == null && (((c007901j = (C007901j) getLastNonConfigurationInstance()) == null || (viewModelStore = c007901j.LIZIZ) == null) && onRetainCustomNonConfigurationInstance == null)) {
            return null;
        }
        C007901j c007901j2 = new C007901j();
        c007901j2.LIZ = onRetainCustomNonConfigurationInstance;
        c007901j2.LIZIZ = viewModelStore;
        return c007901j2;
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (C00R.LIZ()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
        } finally {
            Trace.endSection();
        }
    }

    @Override // X.InterfaceC008701r
    public final AbstractC008601q getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // X.C1AU, androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // X.C18I
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$new$1(Context context) {
        Bundle LIZ = getSavedStateRegistry().LIZ("android:support:activity-result");
        if (LIZ != null) {
            AbstractC008601q abstractC008601q = this.mActivityResultRegistry;
            abstractC008601q.getClass();
            ArrayList<Integer> integerArrayList = LIZ.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = LIZ.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            abstractC008601q.LJ = LIZ.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            abstractC008601q.LIZ = (Random) LIZ.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
            abstractC008601q.LJII.putAll(LIZ.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            for (int i = 0; i < stringArrayList.size(); i++) {
                String str = (String) ListProtector.get(stringArrayList, i);
                if (((HashMap) abstractC008601q.LIZJ).containsKey(str)) {
                    Object remove = ((HashMap) abstractC008601q.LIZJ).remove(str);
                    if (!abstractC008601q.LJII.containsKey(str)) {
                        ((HashMap) abstractC008601q.LIZIZ).remove(remove);
                    }
                }
                int intValue = ((Integer) ListProtector.get(integerArrayList, i)).intValue();
                Object obj = ListProtector.get(stringArrayList, i);
                ((HashMap) abstractC008601q.LIZIZ).put(Integer.valueOf(intValue), obj);
                ((HashMap) abstractC008601q.LIZJ).put(obj, Integer.valueOf(intValue));
            }
        }
    }

    public void addMenuProvider(InterfaceC16580kw interfaceC16580kw) {
        C16560ku c16560ku = this.mMenuHostHelper;
        c16560ku.LIZIZ.add(interfaceC16580kw);
        c16560ku.LIZ.run();
    }

    public final void addOnConfigurationChangedListener(InterfaceC15040iS<Configuration> interfaceC15040iS) {
        this.mOnConfigurationChangedListeners.add(interfaceC15040iS);
    }

    public final void addOnContextAvailableListener(InterfaceC17450mL interfaceC17450mL) {
        C17440mK c17440mK = this.mContextAwareHelper;
        if (c17440mK.LIZIZ != null) {
            interfaceC17450mL.LIZ(c17440mK.LIZIZ);
        }
        ((CopyOnWriteArraySet) c17440mK.LIZ).add(interfaceC17450mL);
    }

    public final void addOnMultiWindowModeChangedListener(InterfaceC15040iS<C021606q> interfaceC15040iS) {
        this.mOnMultiWindowModeChangedListeners.add(interfaceC15040iS);
    }

    public final void addOnNewIntentListener(InterfaceC15040iS<Intent> interfaceC15040iS) {
        this.mOnNewIntentListeners.add(interfaceC15040iS);
    }

    public final void addOnPictureInPictureModeChangedListener(InterfaceC15040iS<C06W> interfaceC15040iS) {
        this.mOnPictureInPictureModeChangedListeners.add(interfaceC15040iS);
    }

    public final void addOnTrimMemoryListener(InterfaceC15040iS<Integer> interfaceC15040iS) {
        this.mOnTrimMemoryListeners.add(interfaceC15040iS);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC15040iS<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.LIZIZ(bundle);
        C17440mK c17440mK = this.mContextAwareHelper;
        c17440mK.LIZIZ = this;
        Iterator it = ((CopyOnWriteArraySet) c17440mK.LIZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC17450mL) it.next()).LIZ(this);
        }
        super.onCreate(bundle);
        ReportFragment.injectIfNeededIn(this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        Iterator<InterfaceC15040iS<C021606q>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C021606q(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<InterfaceC15040iS<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        Iterator<InterfaceC15040iS<C06W>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C06W(z));
        }
    }

    @Override // X.C1AU, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof LifecycleRegistry) {
            ((LifecycleRegistry) lifecycle).setCurrentState(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.LIZJ(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<InterfaceC15040iS<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    public void removeMenuProvider(InterfaceC16580kw interfaceC16580kw) {
        this.mMenuHostHelper.LIZ(interfaceC16580kw);
    }

    public final void removeOnConfigurationChangedListener(InterfaceC15040iS<Configuration> interfaceC15040iS) {
        this.mOnConfigurationChangedListeners.remove(interfaceC15040iS);
    }

    public final void removeOnContextAvailableListener(InterfaceC17450mL interfaceC17450mL) {
        ((CopyOnWriteArraySet) this.mContextAwareHelper.LIZ).remove(interfaceC17450mL);
    }

    public final void removeOnMultiWindowModeChangedListener(InterfaceC15040iS<C021606q> interfaceC15040iS) {
        this.mOnMultiWindowModeChangedListeners.remove(interfaceC15040iS);
    }

    public final void removeOnNewIntentListener(InterfaceC15040iS<Intent> interfaceC15040iS) {
        this.mOnNewIntentListeners.remove(interfaceC15040iS);
    }

    public final void removeOnPictureInPictureModeChangedListener(InterfaceC15040iS<C06W> interfaceC15040iS) {
        this.mOnPictureInPictureModeChangedListeners.remove(interfaceC15040iS);
    }

    public final void removeOnTrimMemoryListener(InterfaceC15040iS<Integer> interfaceC15040iS) {
        this.mOnTrimMemoryListeners.remove(interfaceC15040iS);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initViewTreeOwners();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(final InterfaceC16580kw interfaceC16580kw, LifecycleOwner lifecycleOwner) {
        final C16560ku c16560ku = this.mMenuHostHelper;
        c16560ku.LIZIZ.add(interfaceC16580kw);
        c16560ku.LIZ.run();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        C16550kt c16550kt = (C16550kt) ((HashMap) c16560ku.LIZJ).remove(interfaceC16580kw);
        if (c16550kt != null) {
            c16550kt.LIZ.removeObserver(c16550kt.LIZIZ);
            c16550kt.LIZIZ = null;
        }
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: X.1mp
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                C16560ku c16560ku2 = C16560ku.this;
                InterfaceC16580kw interfaceC16580kw2 = interfaceC16580kw;
                c16560ku2.getClass();
                if (event == Lifecycle.Event.ON_DESTROY) {
                    c16560ku2.LIZ(interfaceC16580kw2);
                }
            }
        };
        ((HashMap) c16560ku.LIZJ).put(interfaceC16580kw, new C16550kt(lifecycle, lifecycleEventObserver));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            C16560ku c16560ku = this.mMenuHostHelper;
            getMenuInflater();
            Iterator<InterfaceC16580kw> it = c16560ku.LIZIZ.iterator();
            while (it.hasNext()) {
                it.next().LIZ();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator<InterfaceC16580kw> it = this.mMenuHostHelper.LIZIZ.iterator();
        while (it.hasNext()) {
            if (it.next().LIZIZ()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        Iterator<InterfaceC15040iS<C021606q>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C021606q(z, configuration));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator<InterfaceC16580kw> it = this.mMenuHostHelper.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZJ();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        Iterator<InterfaceC15040iS<C06W>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C06W(z, 0));
        }
    }

    public final <I, O> AbstractC008301n<I> registerForActivityResult(AbstractC18470nz<I, O> abstractC18470nz, InterfaceC008201m<O> interfaceC008201m) {
        return registerForActivityResult(abstractC18470nz, this.mActivityResultRegistry, interfaceC008201m);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    public void addMenuProvider(final InterfaceC16580kw interfaceC16580kw, LifecycleOwner lifecycleOwner, final Lifecycle.State state) {
        final C16560ku c16560ku = this.mMenuHostHelper;
        c16560ku.getClass();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        C16550kt c16550kt = (C16550kt) ((HashMap) c16560ku.LIZJ).remove(interfaceC16580kw);
        if (c16550kt != null) {
            c16550kt.LIZ.removeObserver(c16550kt.LIZIZ);
            c16550kt.LIZIZ = null;
        }
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: X.1mq
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                C16560ku c16560ku2 = C16560ku.this;
                Lifecycle.State state2 = state;
                InterfaceC16580kw interfaceC16580kw2 = interfaceC16580kw;
                c16560ku2.getClass();
                if (event == Lifecycle.Event.upTo(state2)) {
                    c16560ku2.LIZIZ.add(interfaceC16580kw2);
                    c16560ku2.LIZ.run();
                } else if (event == Lifecycle.Event.ON_DESTROY) {
                    c16560ku2.LIZ(interfaceC16580kw2);
                } else {
                    if (event != Lifecycle.Event.downFrom(state2)) {
                        return;
                    }
                    c16560ku2.LIZIZ.remove(interfaceC16580kw2);
                    c16560ku2.LIZ.run();
                }
            }
        };
        ((HashMap) c16560ku.LIZJ).put(interfaceC16580kw, new C16550kt(lifecycle, lifecycleEventObserver));
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.mActivityResultRegistry.LIZ(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            Iterator<InterfaceC16580kw> it = this.mMenuHostHelper.LIZIZ.iterator();
            while (it.hasNext()) {
                it.next().LIZLLL();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, X.C06Q
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.LIZ(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public final <I, O> AbstractC008301n<I> registerForActivityResult(AbstractC18470nz<I, O> abstractC18470nz, AbstractC008601q abstractC008601q, InterfaceC008201m<O> interfaceC008201m) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("activity_rq#");
        return abstractC008601q.LIZJ(C47135Ieh.LIZJ(this.mNextLocalRequestCode, LIZ, LIZ), this, abstractC18470nz, interfaceC008201m);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
