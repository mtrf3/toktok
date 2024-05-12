package com.bytedance.poplayer.core;

import X.C16880lQ;
import X.C40675Fxn;
import X.C44384HbQ;
import X.C47135Ieh;
import X.C54082LKk;
import X.C55743LuF;
import X.C55745LuH;
import X.C56309M8b;
import X.C56311M8d;
import X.C56319M8l;
import X.C9PK;
import X.EnumC56312M8e;
import X.EnumC56313M8f;
import X.InterfaceC55643Lsd;
import X.InterfaceC56317M8j;
import X.InterfaceC56318M8k;
import X.InterfaceC56322M8o;
import X.InterfaceC56324M8q;
import X.InterfaceRunnableC56320M8m;
import X.JC2;
import X.JC3;
import X.M74;
import X.M78;
import X.M7A;
import X.X1D;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class PopupManager {
    public static long LIZIZ;
    public static C55743LuF LJII;
    public static final PopupManager LIZ = new PopupManager();
    public static final ConcurrentHashMap<InterfaceC55643Lsd, CopyOnWriteArrayList<C56309M8b>> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<InterfaceC55643Lsd, InterfaceRunnableC56320M8m> LIZLLL = new ConcurrentHashMap<>();
    public static final CopyOnWriteArraySet<InterfaceC55643Lsd> LJ = new CopyOnWriteArraySet<>();
    public static final CopyOnWriteArrayList<String> LJFF = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<InterfaceC55643Lsd> LJI = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<InterfaceC56317M8j> LJIIIIZZ = new CopyOnWriteArrayList<>();
    public static final AtomicBoolean LJIIIZ = new AtomicBoolean(false);

    public static C55743LuF LIZLLL() {
        C55743LuF c55743LuF = LJII;
        if (c55743LuF == null) {
            return C55745LuH.LIZ;
        }
        return c55743LuF;
    }

    public static final M74 LJ() {
        PopupTaskExecutor popupTaskExecutor;
        C56309M8b c56309M8b;
        Iterator<InterfaceC55643Lsd> it = LJ.iterator();
        if (!it.hasNext()) {
            return null;
        }
        InterfaceRunnableC56320M8m interfaceRunnableC56320M8m = LIZLLL.get(it.next());
        if (!(interfaceRunnableC56320M8m instanceof PopupTaskExecutor) || (popupTaskExecutor = (PopupTaskExecutor) interfaceRunnableC56320M8m) == null || (c56309M8b = popupTaskExecutor.LJLJL) == null) {
            return null;
        }
        return c56309M8b.LJLJJLL;
    }

    public static final boolean LJFF() {
        return !LJ.isEmpty();
    }

    public static final void LJII() {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            if (LJIIIZ.compareAndSet(true, false)) {
                C44384HbQ.LLFZ("PopupManager restart.");
                return;
            }
            return;
        }
        new Handler(C16880lQ.LLJJJJ()).post(JC2.LJLIL);
    }

    public static final void LJIIJ() {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            if (LJIIIZ.compareAndSet(false, true)) {
                C44384HbQ.LLFZ("PopupManager stopped.");
                Iterator LIZLLL2 = C47135Ieh.LIZLLL(LIZLLL, "mSceneExecutors.values");
                while (LIZLLL2.hasNext()) {
                    ((InterfaceRunnableC56320M8m) LIZLLL2.next()).interrupt();
                }
                LIZLLL.clear();
                return;
            }
            return;
        }
        new Handler(C16880lQ.LLJJJJ()).post(JC3.LJLIL);
    }

    public static final synchronized void LIZ(M74 m74) {
        C56309M8b c56309M8b;
        synchronized (PopupManager.class) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("addTask: === ");
            LIZ2.append(m74.getId());
            C44384HbQ.LLFZ(X1D.LIZIZ(LIZ2));
            InterfaceC55643Lsd interfaceC55643Lsd = m74.scene;
            ConcurrentHashMap<InterfaceC55643Lsd, CopyOnWriteArrayList<C56309M8b>> concurrentHashMap = LIZJ;
            if (concurrentHashMap.containsKey(interfaceC55643Lsd)) {
                CopyOnWriteArrayList<C56309M8b> copyOnWriteArrayList = concurrentHashMap.get(interfaceC55643Lsd);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                }
                Iterator<C56309M8b> it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        c56309M8b = it.next();
                        if (o.LJ(c56309M8b.LJLILLLLZI, m74.getId())) {
                            break;
                        }
                    } else {
                        c56309M8b = null;
                        break;
                    }
                }
                C56309M8b c56309M8b2 = c56309M8b;
                if (c56309M8b2 != null) {
                    copyOnWriteArrayList.remove(c56309M8b2);
                }
                C56309M8b c56309M8b3 = new C56309M8b(m74);
                c56309M8b3.LJLJJLL = m74;
                M78 stateWrapper = m74.getStateWrapper();
                stateWrapper.getClass();
                stateWrapper.LIZJ(M7A.PENDING);
                copyOnWriteArrayList.add(c56309M8b3);
                try {
                    C40675Fxn.LJJLIIIIJ(copyOnWriteArrayList);
                } catch (Exception e) {
                    C44384HbQ.LLFZ(e.toString());
                }
            } else {
                CopyOnWriteArrayList<C56309M8b> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                C56309M8b c56309M8b4 = new C56309M8b(m74);
                c56309M8b4.LJLJJLL = m74;
                M78 stateWrapper2 = m74.getStateWrapper();
                stateWrapper2.getClass();
                stateWrapper2.LIZJ(M7A.PENDING);
                copyOnWriteArrayList2.add(c56309M8b4);
                concurrentHashMap.put(interfaceC55643Lsd, copyOnWriteArrayList2);
            }
            if (LJFF()) {
                m74.onConflict();
            }
        }
    }

    public static boolean LIZIZ(final InterfaceC55643Lsd interfaceC55643Lsd) {
        C54082LKk popupContext;
        LifecycleOwner lifecycleOwner;
        final Lifecycle lifecycle;
        if (!interfaceC55643Lsd.isSceneActive()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(interfaceC55643Lsd.getSceneId());
            LIZ2.append(" is aborted because it is not active.");
            C44384HbQ.LLFZ(X1D.LIZIZ(LIZ2));
            return false;
        }
        CopyOnWriteArraySet<InterfaceC55643Lsd> copyOnWriteArraySet = LJ;
        if (copyOnWriteArraySet.contains(interfaceC55643Lsd)) {
            return false;
        }
        if (!copyOnWriteArraySet.isEmpty()) {
            JSONObject jSONObject = LIZLLL().LJI;
            if ((jSONObject == null || JSONObjectProtectorUtils.getBoolean(jSONObject, "popup_memory_leak_experiment")) && (popupContext = interfaceC55643Lsd.getPopupContext()) != null && (lifecycleOwner = popupContext.LIZIZ) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.poplayer.core.PopupManager$checkSceneCanShowDirect$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            onDestroy();
                        }
                    }

                    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                    public final void onDestroy() {
                        CopyOnWriteArrayList<InterfaceC55643Lsd> copyOnWriteArrayList = PopupManager.LJI;
                        if (copyOnWriteArrayList.contains(interfaceC55643Lsd)) {
                            copyOnWriteArrayList.remove(interfaceC55643Lsd);
                        }
                        lifecycle.removeObserver(this);
                    }
                });
            }
            if (interfaceC55643Lsd instanceof InterfaceC56324M8q) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(interfaceC55643Lsd.getSceneId());
                LIZ3.append(" is pending because ");
                LIZ3.append(LJ());
                LIZ3.append(" is showing.");
                C44384HbQ.LLFZ(X1D.LIZIZ(LIZ3));
                C56311M8d.LIZ(copyOnWriteArraySet, interfaceC55643Lsd);
                CopyOnWriteArrayList<InterfaceC55643Lsd> copyOnWriteArrayList = LJI;
                if (!copyOnWriteArrayList.contains(interfaceC55643Lsd)) {
                    copyOnWriteArrayList.add(0, interfaceC55643Lsd);
                }
                return false;
            }
            if (interfaceC55643Lsd instanceof InterfaceC56322M8o) {
                if (((InterfaceC56322M8o) interfaceC55643Lsd).needConflictWithParent()) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(interfaceC55643Lsd.getSceneId());
                    LIZ4.append(" is pending because ");
                    LIZ4.append(LJ());
                    LIZ4.append(" is showing.");
                    C44384HbQ.LLFZ(X1D.LIZIZ(LIZ4));
                    C56311M8d.LIZ(copyOnWriteArraySet, interfaceC55643Lsd);
                    CopyOnWriteArrayList<InterfaceC55643Lsd> copyOnWriteArrayList2 = LJI;
                    if (!copyOnWriteArrayList2.contains(interfaceC55643Lsd)) {
                        copyOnWriteArrayList2.add(interfaceC55643Lsd);
                    }
                    return false;
                }
            } else if ((interfaceC55643Lsd instanceof C9PK) && ((C9PK) interfaceC55643Lsd).needConflictWithParent()) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(interfaceC55643Lsd.getSceneId());
                LIZ5.append(" is pending because ");
                LIZ5.append(LJ());
                LIZ5.append(" is showing.");
                C44384HbQ.LLFZ(X1D.LIZIZ(LIZ5));
                C56311M8d.LIZ(copyOnWriteArraySet, interfaceC55643Lsd);
                CopyOnWriteArrayList<InterfaceC55643Lsd> copyOnWriteArrayList3 = LJI;
                if (!copyOnWriteArrayList3.contains(interfaceC55643Lsd)) {
                    copyOnWriteArrayList3.add(interfaceC55643Lsd);
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x000e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized void LIZJ(java.lang.Class<?> r7) {
        /*
            java.lang.Class<com.bytedance.poplayer.core.PopupManager> r6 = com.bytedance.poplayer.core.PopupManager.class
            monitor-enter(r6)
            java.lang.String r0 = "taskClass"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.CopyOnWriteArraySet<X.Lsd> r0 = com.bytedance.poplayer.core.PopupManager.LJ     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r5 = r0.iterator()     // Catch: java.lang.Throwable -> L6d
        Le:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L6b
            java.lang.Object r4 = r5.next()     // Catch: java.lang.Throwable -> L6d
            X.Lsd r4 = (X.InterfaceC55643Lsd) r4     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.ConcurrentHashMap<X.Lsd, X.M8m> r0 = com.bytedance.poplayer.core.PopupManager.LIZLLL     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r1 = r0.get(r4)     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r1 instanceof com.bytedance.poplayer.core.PopupTaskExecutor     // Catch: java.lang.Throwable -> L6d
            r3 = 0
            if (r0 == 0) goto L68
            com.bytedance.poplayer.core.PopupTaskExecutor r1 = (com.bytedance.poplayer.core.PopupTaskExecutor) r1     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L68
            X.M8b r2 = r1.LJLJL     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L69
            java.lang.String r1 = r2.LJLILLLLZI     // Catch: java.lang.Throwable -> L6d
        L2f:
            java.lang.String r0 = r7.getName()     // Catch: java.lang.Throwable -> L6d
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto Le
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = "=== dismiss running task === "
            r1.append(r0)     // Catch: java.lang.Throwable -> L6d
            r1.append(r4)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = " === "
            r1.append(r0)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L4e
            java.lang.String r3 = r2.LJLILLLLZI     // Catch: java.lang.Throwable -> L6d
        L4e:
            r1.append(r3)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L6d
            X.C44384HbQ.LLFZ(r0)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto Le
            X.M74 r0 = r2.LJLJJLL     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto Le
            X.M78 r0 = r0.getStateWrapper()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto Le
            r0.LIZ()     // Catch: java.lang.Throwable -> L6d
            goto Le
        L68:
            r2 = r3
        L69:
            r1 = r3
            goto L2f
        L6b:
            monitor-exit(r6)
            return
        L6d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.poplayer.core.PopupManager.LIZJ(java.lang.Class):void");
    }

    public static final synchronized void LJI(Class cls) {
        C56309M8b c56309M8b;
        C56319M8l c56319M8l = C56319M8l.LJLIL;
        synchronized (PopupManager.class) {
            CopyOnWriteArrayList<C56309M8b> copyOnWriteArrayList = LIZJ.get(c56319M8l);
            if (copyOnWriteArrayList != null) {
                Iterator<C56309M8b> it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        c56309M8b = it.next();
                        if (o.LJ(c56309M8b.LJLILLLLZI, cls.getName())) {
                            break;
                        }
                    } else {
                        c56309M8b = null;
                        break;
                    }
                }
                C56309M8b c56309M8b2 = c56309M8b;
                if (c56309M8b2 != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("global");
                    LIZ2.append(" has remove task: ");
                    LIZ2.append(cls.getName());
                    C44384HbQ.LLFZ(X1D.LIZIZ(LIZ2));
                    CopyOnWriteArrayList<C56309M8b> copyOnWriteArrayList2 = LIZJ.get(c56319M8l);
                    if (copyOnWriteArrayList2 != null) {
                        copyOnWriteArrayList2.remove(c56309M8b2);
                    }
                }
            }
        }
    }

    public static void LJIIIIZZ(InterfaceC55643Lsd interfaceC55643Lsd) {
        ConcurrentHashMap<InterfaceC55643Lsd, InterfaceRunnableC56320M8m> concurrentHashMap = LIZLLL;
        InterfaceRunnableC56320M8m interfaceRunnableC56320M8m = concurrentHashMap.get(interfaceC55643Lsd);
        if (interfaceRunnableC56320M8m != null && interfaceRunnableC56320M8m.isRunning()) {
            return;
        }
        C54082LKk popupContext = interfaceC55643Lsd.getPopupContext();
        CopyOnWriteArrayList<C56309M8b> copyOnWriteArrayList = LIZJ.get(interfaceC55643Lsd);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        PopupTaskExecutor popupTaskExecutor = new PopupTaskExecutor(popupContext, interfaceC55643Lsd, copyOnWriteArrayList);
        LIZLLL().LJII.execute(popupTaskExecutor);
        concurrentHashMap.put(interfaceC55643Lsd, popupTaskExecutor);
    }

    public static void LJIIIZ(final InterfaceC55643Lsd interfaceC55643Lsd) {
        LifecycleOwner lifecycleOwner;
        final Lifecycle lifecycle;
        if (interfaceC55643Lsd instanceof InterfaceC56324M8q) {
            LJIIIIZZ(interfaceC55643Lsd);
            return;
        }
        C54082LKk popupContext = interfaceC55643Lsd.getPopupContext();
        if (popupContext == null || (lifecycleOwner = popupContext.LIZIZ) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.poplayer.core.PopupManager$startShowLayer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                ConcurrentHashMap<InterfaceC55643Lsd, InterfaceRunnableC56320M8m> concurrentHashMap = PopupManager.LIZLLL;
                InterfaceRunnableC56320M8m interfaceRunnableC56320M8m = concurrentHashMap.get(interfaceC55643Lsd);
                if (interfaceRunnableC56320M8m != null) {
                    interfaceRunnableC56320M8m.interrupt();
                }
                InterfaceC55643Lsd scene = interfaceC55643Lsd;
                o.LJIIIZ(scene, "scene");
                PopupManager.LIZJ.remove(scene);
                concurrentHashMap.remove(scene);
                PopupManager.LJ.remove(scene);
                lifecycle.removeObserver(this);
            }
        });
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            LJIIIIZZ(interfaceC55643Lsd);
        } else {
            if (!lifecycle.getCurrentState().isAtLeast(Lifecycle.State.INITIALIZED)) {
                return;
            }
            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.poplayer.core.PopupManager$startShowLayer$2
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        onDestroy();
                    } else if (event == Lifecycle.Event.ON_START) {
                        onStart();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void onDestroy() {
                    Lifecycle.this.removeObserver(this);
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_START)
                public final void onStart() {
                    PopupManager.LJIIIIZZ(interfaceC55643Lsd);
                    Lifecycle.this.removeObserver(this);
                }
            });
        }
    }

    public static final synchronized void LJIIJJI(InterfaceC55643Lsd interfaceC55643Lsd) {
        synchronized (PopupManager.class) {
            if (LJIIIZ.get()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(interfaceC55643Lsd.getSceneId());
                LIZ2.append(" is aborted because PopupManager is stopped.");
                C44384HbQ.LLFZ(X1D.LIZIZ(LIZ2));
                return;
            }
            if (LIZIZ(interfaceC55643Lsd)) {
                if (interfaceC55643Lsd instanceof InterfaceC56324M8q) {
                    LJ.add(interfaceC55643Lsd);
                }
                if ((interfaceC55643Lsd instanceof InterfaceC56322M8o) && ((InterfaceC56322M8o) interfaceC55643Lsd).needConflictWithParent()) {
                    LJ.add(interfaceC55643Lsd);
                }
                if ((interfaceC55643Lsd instanceof C9PK) && ((C9PK) interfaceC55643Lsd).needConflictWithParent()) {
                    LJ.add(interfaceC55643Lsd);
                }
                LJIIIZ(interfaceC55643Lsd);
            }
        }
    }

    public static final synchronized void LJIIL(M74 m74) {
        synchronized (PopupManager.class) {
            if (LJIIIZ.get()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(m74.scene.getSceneId());
                LIZ2.append(" is aborted because PopupManager is stopped.");
                C44384HbQ.LLFZ(X1D.LIZIZ(LIZ2));
                EnumC56313M8f enumC56313M8f = EnumC56313M8f.STOP_SWITCH_OPEN;
                int errCode = enumC56313M8f.getErrCode();
                EnumC56312M8e enumC56312M8e = EnumC56312M8e.STOP_SWITCH_OPEN;
                m74.showPopupFailed(errCode, enumC56312M8e.getErrMsg());
                InterfaceC56318M8k interfaceC56318M8k = LIZLLL().LJ;
                if (interfaceC56318M8k != null) {
                    enumC56313M8f.getErrCode();
                    interfaceC56318M8k.LIZIZ(m74, enumC56312M8e.getErrMsg());
                }
                return;
            }
            LIZ(m74);
            InterfaceC55643Lsd interfaceC55643Lsd = m74.scene;
            if (LIZIZ(interfaceC55643Lsd)) {
                if (interfaceC55643Lsd instanceof InterfaceC56324M8q) {
                    LJ.add(interfaceC55643Lsd);
                }
                if ((interfaceC55643Lsd instanceof InterfaceC56322M8o) && ((InterfaceC56322M8o) interfaceC55643Lsd).needConflictWithParent()) {
                    LJ.add(interfaceC55643Lsd);
                }
                if ((interfaceC55643Lsd instanceof C9PK) && ((C9PK) interfaceC55643Lsd).needConflictWithParent()) {
                    LJ.add(interfaceC55643Lsd);
                }
                LJIIIZ(interfaceC55643Lsd);
            }
        }
    }
}
