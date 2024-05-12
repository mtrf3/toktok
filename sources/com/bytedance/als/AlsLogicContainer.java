package com.bytedance.als;

import X.AbstractC29891Fh;
import X.AbstractC42021ks;
import X.AbstractC48231ut;
import X.AbstractC82618Wbe;
import X.C0I2;
import X.C0I5;
import X.C0I6;
import X.C0I7;
import X.C0IA;
import X.C0IB;
import X.C113554cx;
import X.C16880lQ;
import X.C1FS;
import X.C1FT;
import X.C275616i;
import X.C29821Fa;
import X.C29831Fb;
import X.C29841Fc;
import X.C82621Wbh;
import X.C82622Wbi;
import X.C82624Wbk;
import X.C82628Wbo;
import X.EnumC06840Oq;
import X.InterfaceC04060Dy;
import X.InterfaceC82629Wbp;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.X1D;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.als.ui.UIPanelComponent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class AlsLogicContainer implements GenericLifecycleObserver {
    public final Lifecycle LJLIL;
    public final List<C29841Fc> LJLILLLLZI;
    public final LinkedHashMap<Class<?>, C29841Fc> LJLJI;
    public final ArrayList<AbstractC29891Fh<?>> LJLJJI;
    public final List<AbstractC29891Fh<?>> LJLJJL;
    public final HashMap<Class<?>, Class<?>> LJLJJLL;
    public final HashMap<Class<?>, AbstractC29891Fh<?>> LJLJL;
    public final C1FT LJLJLJ;
    public final LifecycleRegistry LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public final C1FS LJLLILLLL;
    public final C82621Wbh LJLLJ;
    public C82622Wbi LJLLL;
    public final String LJLLLL;
    public final ApiCenter LJLLLLLL;
    public final C82622Wbi LJLZ;
    public final C275616i LJZ;
    public final StackTraceElement[] LJZI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onActivityCreated();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onStart();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroyView();
        }
    }

    public final void LJFF() {
        List<C29841Fc> list = this.LJLILLLLZI;
        ArrayList arrayList = new ArrayList();
        for (C29841Fc c29841Fc : list) {
            if (c29841Fc.LJLJJI == C0I7.IMMEDIATE) {
                arrayList.add(c29841Fc);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C29841Fc c29841Fc2 = (C29841Fc) it.next();
                C82622Wbi c82622Wbi = this.LJLLL;
                AbstractC29891Fh<?> abstractC29891Fh = null;
                if (c82622Wbi != null) {
                    abstractC29891Fh = (AbstractC29891Fh) c82622Wbi.LJ(c29841Fc2.LJLIL, null);
                }
                LIZ(abstractC29891Fh, c29841Fc2);
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onActivityCreated() {
        if (!this.LJLL && this.LJZ.LIZ) {
            LJFF();
        }
        this.LJLL = true;
        Iterator it = ORZ.LLJI(this.LJLJJI).iterator();
        while (it.hasNext()) {
            LJI((AbstractC29891Fh) it.next(), Lifecycle.State.CREATED);
        }
        LifecycleRegistry lifecycleRegistry = this.LJLJLJ.LJLIL.LJLJLLL;
        o.LJIIIIZZ(lifecycleRegistry, "timingLifeCycleOwner.lifecycle");
        if (!lifecycleRegistry.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            this.LJLJLLL.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroyView() {
        HashMap hashMap = new HashMap();
        for (AbstractC29891Fh<?> abstractC29891Fh : ORZ.LLJI(this.LJLJJI)) {
            LJI(abstractC29891Fh, Lifecycle.State.DESTROYED);
            hashMap.put(abstractC29891Fh.getClass(), C113554cx.LJJLIIIJLLLLLLLZ(abstractC29891Fh.performanceMonitorCalculate.LIZ));
        }
        this.LJLJLLL.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        Iterator it = ORZ.LLJI(this.LJLJJI).iterator();
        while (it.hasNext()) {
            LJI((AbstractC29891Fh) it.next(), Lifecycle.State.STARTED);
        }
        this.LJLJLLL.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        Iterator it = ORZ.LLJI(this.LJLJJI).iterator();
        while (it.hasNext()) {
            LJI((AbstractC29891Fh) it.next(), Lifecycle.State.RESUMED);
        }
        this.LJLJLLL.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        Iterator it = ORZ.LLJI(this.LJLJJI).iterator();
        while (it.hasNext()) {
            LJI((AbstractC29891Fh) it.next(), Lifecycle.State.STARTED);
        }
        this.LJLJLLL.handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        Iterator it = ORZ.LLJI(this.LJLJJI).iterator();
        while (it.hasNext()) {
            LJI((AbstractC29891Fh) it.next(), Lifecycle.State.CREATED);
        }
        this.LJLJLLL.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    public final <T extends C0I6> T LJ(Class<T> clazz) {
        o.LJIIIZ(clazz, "clazz");
        C82622Wbi c82622Wbi = this.LJLLL;
        if (c82622Wbi != null) {
            if (!c82622Wbi.LIZIZ(clazz)) {
                return null;
            }
            return (T) this.LJLLILLLL.LIZIZ(clazz);
        }
        throw new IllegalStateException("ALS container not started");
    }

    public final void LIZ(AbstractC29891Fh<?> abstractC29891Fh, C29841Fc c29841Fc) {
        InterfaceC82629Wbp interfaceC82629Wbp;
        List<Class<? extends C0I6>> list;
        if (abstractC29891Fh == null) {
            return;
        }
        if (abstractC29891Fh instanceof AbstractC48231ut) {
            AbstractC48231ut abstractC48231ut = (AbstractC48231ut) abstractC29891Fh;
            Class<?> cls = c29841Fc.LJLJJLL;
            if (cls != null) {
                abstractC48231ut.LJLLL(cls);
                abstractC48231ut.LJLJJI = c29841Fc.LJLJL;
                EnumC06840Oq enumC06840Oq = c29841Fc.LJLJLJ;
                o.LJI(enumC06840Oq);
                abstractC48231ut.LJLLILLLL(enumC06840Oq);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<*>");
            }
        } else if (abstractC29891Fh instanceof UIPanelComponent) {
            UIPanelComponent uIPanelComponent = (UIPanelComponent) abstractC29891Fh;
            Class<?> cls2 = c29841Fc.LJLJJLL;
            if (cls2 != null) {
                uIPanelComponent.LJLLL(cls2);
                EnumC06840Oq enumC06840Oq2 = c29841Fc.LJLJLJ;
                o.LJI(enumC06840Oq2);
                uIPanelComponent.LJLLILLLL(enumC06840Oq2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<*>");
            }
        } else if (abstractC29891Fh instanceof AbstractC42021ks) {
            AbstractC42021ks abstractC42021ks = (AbstractC42021ks) abstractC29891Fh;
            abstractC42021ks.LJLJI = c29841Fc.LJLJL;
            EnumC06840Oq enumC06840Oq3 = c29841Fc.LJLJLJ;
            o.LJI(enumC06840Oq3);
            abstractC42021ks.LJJZZI(enumC06840Oq3);
        }
        this.LJLJL.put(c29841Fc.LJLIL, abstractC29891Fh);
        C29831Fb c29831Fb = c29841Fc.LJLJI;
        if (c29831Fb != null && (list = c29831Fb.LJLJI) != null) {
            Iterator<Class<? extends C0I6>> it = list.iterator();
            while (it.hasNext()) {
                this.LJLJL.put(it.next(), abstractC29891Fh);
            }
        }
        C0I2.LIZ();
        if (this.LJLIL.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        if (!this.LJLJJI.contains(abstractC29891Fh)) {
            this.LJLJJI.add(abstractC29891Fh);
            if ((!o.LJ(abstractC29891Fh.getApiComponent(), C0I6.class)) && !(abstractC29891Fh.getApiComponent() instanceof C0IA) && !(abstractC29891Fh instanceof InterfaceC04060Dy)) {
                ApiCenter apiCenter = this.LJLLLLLL;
                Object instance = abstractC29891Fh.getApiComponent();
                apiCenter.getClass();
                o.LJIIIZ(instance, "instance");
                if (!apiCenter.LIZIZ) {
                    Class<?> cls3 = instance.getClass();
                    if (!o.LJ(cls3, C0I6.class)) {
                        for (Class cls4 : ((HashMap) apiCenter.LIZ).keySet()) {
                            if (!o.LJ(cls3, cls4)) {
                                if (!ApiCenter.LIZIZ(cls3, cls4)) {
                                    if (ApiCenter.LIZIZ(cls4, cls3)) {
                                        StringBuilder LIZ = X1D.LIZ();
                                        LIZ.append(cls3);
                                        LIZ.append(" parent found ");
                                        LIZ.append(cls4);
                                        throw new IllegalStateException(X1D.LIZIZ(LIZ));
                                    }
                                } else {
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append(cls3);
                                    LIZ2.append(" child found ");
                                    LIZ2.append(cls4);
                                    throw new IllegalStateException(X1D.LIZIZ(LIZ2));
                                }
                            } else {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append(cls3);
                                LIZ3.append(" already register");
                                throw new IllegalStateException(X1D.LIZIZ(LIZ3));
                            }
                        }
                        ((HashMap) apiCenter.LIZ).put(cls3, instance);
                    } else {
                        throw new IllegalArgumentException("ApiComponent can't register, use subclass instead");
                    }
                }
            }
            C82622Wbi c82622Wbi = this.LJLLL;
            if (c82622Wbi != null) {
                interfaceC82629Wbp = c82622Wbi.LIZ;
            } else {
                interfaceC82629Wbp = null;
            }
            abstractC29891Fh.registeredObjectContainerName = interfaceC82629Wbp;
            abstractC29891Fh.attachedLazyComponentSearcher = this.LJLLILLLL;
            if (!this.LJLIL.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                return;
            }
            this.LJLLI = true;
            abstractC29891Fh.dispatchOnCreate$als_release();
            if (this.LJLIL.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                abstractC29891Fh.dispatchOnStart$als_release();
                if (this.LJLIL.getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                    abstractC29891Fh.dispatchOnResume$als_release();
                }
            }
            this.LJLLI = false;
            return;
        }
        throw new IllegalArgumentException("LogicComponent already exists");
    }

    public final <A extends C0I6, B extends AbstractC29891Fh<A>> C29831Fb LIZLLL(Class<A> cls, final Class<B> cls2) {
        this.LJLJJLL.put(cls2, cls2);
        if (o.LJ(cls, C0I6.class)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C29821Fa.LIZ(cls, linkedHashSet);
        List LLJI = ORZ.LLJI(linkedHashSet);
        List LLJILJILJ = ORZ.LLJILJILJ(linkedHashSet);
        ListProtector.add(LLJILJILJ, 0, cls);
        C29831Fb c29831Fb = new C29831Fb(cls, LLJI, ORZ.LLJI(LLJILJILJ));
        C82621Wbh c82621Wbh = this.LJLLJ;
        Class<? extends C0I6> cls3 = c29831Fb.LJLIL;
        if (cls3 != null) {
            C82624Wbk LIZLLL = c82621Wbh.LIZLLL(cls3, null, new AbstractC82618Wbe<A>() { // from class: X.1FR
                @Override // X.AbstractC82618Wbe
                public final Object LIZIZ(C82622Wbi container) {
                    o.LJIIIZ(container, "container");
                    return ((AbstractC29891Fh) container.LJ(cls2, null)).getApiComponent();
                }
            });
            this.LJLJJLL.put(c29831Fb.LJLIL, cls2);
            for (Class<? extends C0I6> cls4 : c29831Fb.LJLILLLLZI) {
                Class[] clsArr = new Class[1];
                if (cls4 != null) {
                    clsArr[0] = cls4;
                    LIZLLL.LIZ(clsArr);
                    this.LJLJJLL.put(cls4, cls2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<kotlin.Any?>");
                }
            }
            return c29831Fb;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<A>");
    }

    public final void LJI(AbstractC29891Fh<?> abstractC29891Fh, Lifecycle.State state) {
        this.LJLLI = true;
        int i = C0I5.LIZ[state.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (C16880lQ.LLJJIJIL(abstractC29891Fh.getLifecycle().getCurrentState(), Lifecycle.State.RESUMED) >= 0) {
                            abstractC29891Fh.dispatchOnPause$als_release();
                        }
                        if (C16880lQ.LLJJIJIL(abstractC29891Fh.getLifecycle().getCurrentState(), Lifecycle.State.STARTED) >= 0) {
                            abstractC29891Fh.dispatchOnStop$als_release();
                        }
                        if (C16880lQ.LLJJIJIL(abstractC29891Fh.getLifecycle().getCurrentState(), Lifecycle.State.CREATED) >= 0) {
                            abstractC29891Fh.dispatchOnDestroy$als_release();
                            Object instance = abstractC29891Fh.getApiComponent();
                            if (!o.LJ(instance, C0I6.class)) {
                                ApiCenter apiCenter = this.LJLLLLLL;
                                apiCenter.getClass();
                                o.LJIIIZ(instance, "instance");
                                if (!apiCenter.LIZIZ) {
                                    ((HashMap) apiCenter.LIZ).remove(instance.getClass());
                                }
                            }
                        }
                    }
                } else if (C16880lQ.LLJJIJIL(abstractC29891Fh.getLifecycle().getCurrentState(), Lifecycle.State.RESUMED) < 0) {
                    if (C16880lQ.LLJJIJIL(abstractC29891Fh.getLifecycle().getCurrentState(), Lifecycle.State.CREATED) < 0) {
                        abstractC29891Fh.dispatchOnCreate$als_release();
                    }
                    if (C16880lQ.LLJJIJIL(abstractC29891Fh.getLifecycle().getCurrentState(), Lifecycle.State.STARTED) < 0) {
                        abstractC29891Fh.dispatchOnStart$als_release();
                    }
                    abstractC29891Fh.dispatchOnResume$als_release();
                }
            } else {
                Lifecycle.State currentState = abstractC29891Fh.getLifecycle().getCurrentState();
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                if (C16880lQ.LLJJIJIL(currentState, state2) < 0) {
                    if (C16880lQ.LLJJIJIL(abstractC29891Fh.getLifecycle().getCurrentState(), Lifecycle.State.CREATED) < 0) {
                        abstractC29891Fh.dispatchOnCreate$als_release();
                    }
                    abstractC29891Fh.dispatchOnStart$als_release();
                } else if (C16880lQ.LLJJIJIL(abstractC29891Fh.getLifecycle().getCurrentState(), state2) > 0) {
                    abstractC29891Fh.dispatchOnPause$als_release();
                }
            }
        } else {
            Lifecycle.State currentState2 = abstractC29891Fh.getLifecycle().getCurrentState();
            Lifecycle.State state3 = Lifecycle.State.CREATED;
            if (C16880lQ.LLJJIJIL(currentState2, state3) < 0) {
                abstractC29891Fh.dispatchOnCreate$als_release();
            } else {
                if (C16880lQ.LLJJIJIL(abstractC29891Fh.getLifecycle().getCurrentState(), Lifecycle.State.STARTED) > 0) {
                    abstractC29891Fh.dispatchOnPause$als_release();
                }
                if (C16880lQ.LLJJIJIL(abstractC29891Fh.getLifecycle().getCurrentState(), state3) > 0) {
                    abstractC29891Fh.dispatchOnStop$als_release();
                }
            }
        }
        this.LJLLI = false;
    }

    public AlsLogicContainer(String str, Lifecycle containerLifecycle, ApiCenter apiCenter, C82622Wbi c82622Wbi, C275616i config, StackTraceElement[] stackTraceElementArr) {
        o.LJIIIZ(containerLifecycle, "containerLifecycle");
        o.LJIIIZ(apiCenter, "apiCenter");
        o.LJIIIZ(config, "config");
        this.LJLLLL = str;
        this.LJLLLLLL = apiCenter;
        this.LJLZ = c82622Wbi;
        this.LJZ = config;
        this.LJZI = stackTraceElementArr;
        this.LJLIL = containerLifecycle;
        this.LJLILLLLZI = new ArrayList();
        this.LJLJI = new LinkedHashMap<>();
        ArrayList<AbstractC29891Fh<?>> arrayList = new ArrayList<>();
        this.LJLJJI = arrayList;
        this.LJLJJL = arrayList;
        this.LJLJJLL = new HashMap<>();
        this.LJLJL = new HashMap<>();
        C1FT c1ft = new C1FT(this);
        this.LJLJLJ = c1ft;
        this.LJLJLLL = new LifecycleRegistry(c1ft);
        this.LJLLILLLL = new C1FS(this);
        containerLifecycle.addObserver(this);
        this.LJLLJ = new C82621Wbh(new C82628Wbo(i0.LJFF(str, " attach{}")), c82622Wbi);
    }

    public final void LIZJ(C0I7 attachOption, C0IB c0ib, Class cls, Class cls2, int i, EnumC06840Oq defaultVisibility, final InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(attachOption, "attachOption");
        o.LJIIIZ(defaultVisibility, "defaultVisibility");
        this.LJLLJ.LIZLLL(cls2, null, new AbstractC82618Wbe<Object>() { // from class: X.1FY
            @Override // X.AbstractC82618Wbe
            public final Object LIZIZ(C82622Wbi container) {
                o.LJIIIZ(container, "container");
                return InterfaceC88472Yns.this.invoke(container);
            }
        });
        LJII(i, attachOption, LIZLLL(cls, cls2), c0ib, defaultVisibility, cls2, cls, null);
    }

    public final void LIZIZ(C0I7 attachOption, C0IB c0ib, Class cls, Class cls2, Class cls3, int i, EnumC06840Oq defaultVisibility, final InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(attachOption, "attachOption");
        o.LJIIIZ(defaultVisibility, "defaultVisibility");
        this.LJLLJ.LIZLLL(cls2, null, new AbstractC82618Wbe<Object>() { // from class: X.1FX
            @Override // X.AbstractC82618Wbe
            public final Object LIZIZ(C82622Wbi container) {
                o.LJIIIZ(container, "container");
                return InterfaceC88472Yns.this.invoke(container);
            }
        });
        LJII(i, attachOption, LIZLLL(cls, cls2), c0ib, defaultVisibility, cls2, cls, cls3);
    }

    public final void LJII(int i, C0I7 attachOption, C29831Fb c29831Fb, C0IB c0ib, EnumC06840Oq enumC06840Oq, Class cls, Class cls2, Class cls3) {
        o.LJIIIZ(attachOption, "attachOption");
        if (!o.LJ(cls2, C0I6.class) || ((attachOption != C0I7.LAZY && attachOption != C0I7.FORCE_LAZY) || c0ib != null)) {
            C29841Fc c29841Fc = new C29841Fc(i, attachOption, c29831Fb, c0ib, enumC06840Oq, cls, cls2, cls3);
            ((ArrayList) this.LJLILLLLZI).add(c29841Fc);
            this.LJLJI.put(cls, c29841Fc);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Because ");
        LIZ.append(cls);
        LIZ.append(" only implement ApiComponent, its attachOption is ");
        LIZ.append(attachOption);
        LIZ.append(", its attachTiming can't be null");
        final String LIZIZ = X1D.LIZIZ(LIZ);
        throw new RuntimeException(LIZIZ) { // from class: X.00c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(LIZIZ);
                o.LJIIIZ(LIZIZ, "message");
            }
        };
    }
}
