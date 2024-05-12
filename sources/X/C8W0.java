package X;

import android.content.Context;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8W0, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8W0 extends C8WB implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] $$delegatedProperties;
    public static final C8W9 Companion;
    public C8V1<? extends C8W0> _config;
    public final LifecycleRegistry _lifecycleRegistry;
    public volatile boolean active;
    public String assemTagInternal;
    public final C5H3 destroyTask$delegate;
    public boolean hasLoaded;
    public C8W6 interactor;
    public boolean isAssemViewCreated;
    public final C5H3 isHitTrack$delegate;
    public final InterfaceC214508bO parent$delegate;
    public AssemSupervisor supervisor;
    public final ViewModelStore viewModelStore;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.8W9] */
    static {
        TBV tbv = new TBV(C8W0.class, "parent", "getParent()Landroidx/lifecycle/LifecycleOwner;", 0);
        C65352Pkq.LIZ.getClass();
        $$delegatedProperties = new InterfaceC74236TBo[]{tbv};
        Companion = new Object() { // from class: X.8W9
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C8W0() {
        /*
            r3 = this;
            r2 = 2
            java.lang.String r1 = "assem_logic_scope"
            r0 = 0
            r3.<init>(r1, r0, r2, r0)
            X.8W7 r0 = X.C8W7.LJLIL
            X.Ol8 r0 = X.C221108m2.LIZIZ(r0)
            r3.isHitTrack$delegate = r0
            X.8W5 r0 = X.C8W5.LJLIL
            X.Ol8 r0 = X.C221108m2.LIZIZ(r0)
            r3.destroyTask$delegate = r0
            X.8W8 r0 = X.C8WA.LIZ
            r3.interactor = r0
            r0 = 1
            r3.active = r0
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r3)
            r3._lifecycleRegistry = r0
            androidx.lifecycle.ViewModelStore r0 = new androidx.lifecycle.ViewModelStore
            r0.<init>()
            r3.viewModelStore = r0
            X.8WE r0 = new X.8WE
            r0.<init>(r3)
            r3.parent$delegate = r0
            X.Ol8 r0 = X.C8WK.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L42
            return
        L42:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = X.C16880lQ.LJLLJ(r0)
            r1.append(r0)
            java.lang.String r0 = "---"
            r1.append(r0)
            int r0 = r3.hashCode()
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8W0.<init>():void");
    }

    public static /* synthetic */ void getInteractor$annotations() {
    }

    public void didUpdateConfig(C8V1<? extends C8W0> oldConfig) {
        o.LJIIIZ(oldConfig, "oldConfig");
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final /* synthetic */ C0VK getDefaultViewModelCreationExtras() {
        return C09I.LIZ(this);
    }

    @Override // X.C8WB, X.InterfaceC55235Lm3
    public Object getHost() {
        return this;
    }

    public void onCreate() {
    }

    public void onParentSet() {
    }

    public void onParentViewCreated() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public void triggerLazyLoad(InterfaceC65784Pro<C76800UCe> trigger) {
        o.LJIIIZ(trigger, "trigger");
    }

    private final boolean isHitTrack() {
        return ((Boolean) this.isHitTrack$delegate.getValue()).booleanValue();
    }

    public final boolean checkSupervisorPrepared() {
        if (this.supervisor != null) {
            return true;
        }
        return false;
    }

    public C8V1<? extends C8W0> getConfig() {
        C8V1<? extends C8W0> c8v1 = this._config;
        if (c8v1 != null) {
            return c8v1;
        }
        o.LJIJI("_config");
        throw null;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return new ViewModelProvider.NewInstanceFactory();
    }

    public final List<Runnable> getDestroyTask() {
        return (List) this.destroyTask$delegate.getValue();
    }

    public final LifecycleOwner getParent() {
        return (LifecycleOwner) this.parent$delegate.LIZ(this, $$delegatedProperties[0]);
    }

    public final AssemSupervisor getSupervisor() {
        AssemSupervisor assemSupervisor = this.supervisor;
        if (assemSupervisor != null) {
            return assemSupervisor;
        }
        o.LJIJI("supervisor");
        throw null;
    }

    public final void handleOnCreate$assem_release() {
        C8V8 c8v8 = C214368bA.LJII;
        if (c8v8 != null) {
            C16880lQ.LJLLJ(getClass());
            c8v8.LIZIZ("assem_oncreate_");
        }
        track$assem_release(C8W1.ON_CREATE, new AqS153S0100000_3(this, 17));
        C8V8 c8v82 = C214368bA.LJII;
        if (c8v82 != null) {
            c8v82.end(C16880lQ.LJLLJ(getClass()), "assem_oncreate_");
        }
    }

    public final void handleOnDestroy$assem_release() {
        track$assem_release(C8W1.ON_DESTROY, new AqS153S0100000_3(this, 18));
    }

    public final void handleOnPause$assem_release() {
        track$assem_release(C8W1.ON_PAUSE, new AqS153S0100000_3(this, 19));
    }

    public void handleOnResume() {
        C8V8 c8v8 = C214368bA.LJII;
        if (c8v8 != null) {
            C16880lQ.LJLLJ(getClass());
            c8v8.LIZIZ("assem_onresume_");
        }
        track$assem_release(C8W1.ON_RESUME, new AqS153S0100000_3(this, 20));
        C8V8 c8v82 = C214368bA.LJII;
        if (c8v82 != null) {
            c8v82.end(C16880lQ.LJLLJ(getClass()), "assem_onresume_");
        }
    }

    public final void handleOnStart$assem_release() {
        C8V8 c8v8 = C214368bA.LJII;
        if (c8v8 != null) {
            C16880lQ.LJLLJ(getClass());
            c8v8.LIZIZ("assem_onstart_");
        }
        track$assem_release(C8W1.ON_START, new AqS153S0100000_3(this, 21));
        C8V8 c8v82 = C214368bA.LJII;
        if (c8v82 != null) {
            c8v82.end(C16880lQ.LJLLJ(getClass()), "assem_onstart_");
        }
    }

    public final void handleOnStop$assem_release() {
        track$assem_release(C8W1.ON_STOP, new AqS153S0100000_3(this, 22));
    }

    public void onDestroy() {
        C8VV.LJI(new AqS153S0100000_3(this, 23));
    }

    public final Boolean checkParentPrepared() {
        Object LIZ;
        boolean z;
        try {
            if (getParent() != null) {
                z = true;
            } else {
                z = false;
            }
            LIZ = Boolean.valueOf(z);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        Boolean bool = (Boolean) LIZ;
        if (bool == null) {
            return null;
        }
        bool.booleanValue();
        return Boolean.FALSE;
    }

    public final List<C8W0> getChildren() {
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null) {
            return LIZJ.LJLLI;
        }
        return null;
    }

    public final Context getContext() {
        return getSupervisor().LJLJLJ;
    }

    public final boolean getHasChildren() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ == null || (copyOnWriteArrayList = LIZJ.LJLLI) == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    public void handleOnParentViewCreated$assem_release() {
        onParentViewCreated();
        setAssemViewCreated$assem_release(true);
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null) {
            Iterator<C8W0> it = LIZJ.LIZIZ().iterator();
            while (it.hasNext()) {
                it.next().handleOnParentViewCreated$assem_release();
            }
            LIZJ.LJLL = true;
        }
    }

    public final boolean isActive() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED);
    }

    public final boolean isDestroy$assem_release() {
        if (getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return true;
        }
        return false;
    }

    public void onAssemPostCreate() {
        if (getSupervisor().LJLL) {
            handleOnParentViewCreated$assem_release();
        }
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        return this.viewModelStore;
    }

    public boolean isAssemViewCreated$assem_release() {
        return this.isAssemViewCreated;
    }

    public Object provideDynamicComponent() {
        return this.interactor;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public LifecycleRegistry getLifecycle() {
        return this._lifecycleRegistry;
    }

    public void setAssemViewCreated$assem_release(boolean z) {
        this.isAssemViewCreated = z;
    }

    public void setConfig(C8V1<? extends C8W0> v) {
        o.LJIIIZ(v, "v");
        this._config = v;
    }

    public final void setInteractor(C8W6 c8w6) {
        o.LJIIIZ(c8w6, "<set-?>");
        this.interactor = c8w6;
    }

    public final void setParent(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "<set-?>");
        this.parent$delegate.LIZIZ($$delegatedProperties[0], this, lifecycleOwner);
    }

    public final void setSupervisor(AssemSupervisor assemSupervisor) {
        o.LJIIIZ(assemSupervisor, "<set-?>");
        this.supervisor = assemSupervisor;
    }

    public final void whenDestroy$assem_release(Runnable task) {
        o.LJIIIZ(task, "task");
        List<Runnable> destroyTask = getDestroyTask();
        synchronized (destroyTask) {
            destroyTask.add(task);
        }
    }

    public final void track$assem_release(C8W1 stage, InterfaceC65784Pro<C76800UCe> action) {
        o.LJIIIZ(stage, "stage");
        o.LJIIIZ(action, "action");
        if (isHitTrack()) {
            SZE.LJ(C65352Pkq.LIZ(C88502YoM.class), new C8W3(this, stage), action);
        } else {
            action.invoke();
        }
    }
}
