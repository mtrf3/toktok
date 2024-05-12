package org.greenrobot.eventbus;

import X.C19U;
import X.P9G;
import X.PEH;
import X.PSR;
import X.QD1;
import X.QD2;
import X.QD4;
import X.QD5;
import X.QD6;
import X.QD8;
import X.QD9;
import X.QDA;
import X.QDC;
import X.QDE;
import X.QDF;
import X.QDG;
import X.QDH;
import X.QDI;
import X.QDJ;
import X.X1D;
import android.os.Looper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;

/* loaded from: classes12.dex */
public class EventBus {
    public static volatile EventBus LIZJ;
    public final ExecutorService LIZ;
    public final P9G LIZIZ;
    public final QD8 asyncPoster;
    public final QD6 backgroundPoster;
    public final ThreadLocal<QD9> currentPostingThreadState;
    public final boolean eventInheritance;
    public final int indexCount;
    public final boolean logNoSubscriberMessages;
    public final boolean logSubscriberExceptions;
    public final QDI mainThreadPoster;
    public final QDH mainThreadSupport;
    public final boolean sendNoSubscriberEvent;
    public final boolean sendSubscriberExceptionEvent;
    public final Map<Class<?>, Object> stickyEvents;
    public final QD2 subscriberMethodFinder;
    public final Map<Class<?>, CopyOnWriteArrayList<QDC>> subscriptionsByEventType;
    public final boolean throwSubscriberException;
    public final Map<Object, List<Class<?>>> typesBySubscriber;
    public static final PSR DEFAULT_BUILDER = new PSR();
    public static final Map<Class<?>, List<Class<?>>> eventTypesCache = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EventBus() {
        /*
            r4 = this;
            X.PSR r3 = org.greenrobot.eventbus.EventBus.DEFAULT_BUILDER
            r4.<init>()
            X.QDD r0 = new X.QDD
            r0.<init>()
            r4.currentPostingThreadState = r0
            r3.getClass()
            boolean r1 = X.P9H.LIZ
            r2 = 0
            if (r1 == 0) goto L20
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()     // Catch: java.lang.RuntimeException -> L20
            if (r0 == 0) goto L20
            X.P9H r0 = new X.P9H
            r0.<init>()
            goto L25
        L20:
            X.P9E r0 = new X.P9E
            r0.<init>()
        L25:
            r4.LIZIZ = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.subscriptionsByEventType = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.typesBySubscriber = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r4.stickyEvents = r0
            if (r1 == 0) goto L4b
            android.os.Looper r1 = X.C16880lQ.LLJJJJ()     // Catch: java.lang.RuntimeException -> L4b
            if (r1 != 0) goto L45
            goto L4b
        L45:
            X.QDF r0 = new X.QDF
            r0.<init>(r1)
            goto L4c
        L4b:
            r0 = r2
        L4c:
            r4.mainThreadSupport = r0
            if (r0 == 0) goto L57
            X.QD7 r2 = new X.QD7
            android.os.Looper r0 = r0.LIZ
            r2.<init>(r4, r0)
        L57:
            r4.mainThreadPoster = r2
            X.QD6 r0 = new X.QD6
            r0.<init>(r4)
            r4.backgroundPoster = r0
            X.QD8 r0 = new X.QD8
            r0.<init>(r4)
            r4.asyncPoster = r0
            r1 = 0
            r4.indexCount = r1
            X.QD2 r0 = new X.QD2
            r0.<init>()
            r4.subscriberMethodFinder = r0
            r0 = 1
            r4.logSubscriberExceptions = r0
            r4.logNoSubscriberMessages = r0
            r4.sendSubscriberExceptionEvent = r0
            r4.sendNoSubscriberEvent = r0
            r4.throwSubscriberException = r1
            r4.eventInheritance = r0
            java.util.concurrent.ExecutorService r0 = r3.LIZ
            r4.LIZ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.eventbus.EventBus.<init>():void");
    }

    public static EventBus LIZJ() {
        if (LIZJ == null) {
            synchronized (EventBus.class) {
                if (LIZJ == null) {
                    LIZJ = new EventBus();
                }
            }
        }
        return LIZJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EventBus[indexCount=");
        LIZ.append(this.indexCount);
        LIZ.append(", eventInheritance=");
        return C19U.LIZ(LIZ, this.eventInheritance, "]", LIZ);
    }

    public final void LIZIZ(Object obj) {
        QD9 qd9 = this.currentPostingThreadState.get();
        if (qd9.LIZIZ) {
            if (obj != null) {
                if (qd9.LJ == obj) {
                    if (qd9.LIZLLL.LIZIZ.LIZIZ == ThreadMode.POSTING) {
                        qd9.LJFF = true;
                        return;
                    }
                    throw new QDE(" event handlers may only abort the incoming event");
                }
                throw new QDE("Only the currently handled event may be aborted");
            }
            throw new QDE("Event may not be null");
        }
        throw new QDE("This method may only be called from inside event handling methods on the posting thread");
    }

    public final <T> T LIZLLL(Class<T> cls) {
        T cast;
        synchronized (this.stickyEvents) {
            cast = cls.cast(this.stickyEvents.get(cls));
        }
        return cast;
    }

    public final void LJ(QDA qda) {
        Object obj = qda.LIZ;
        QDC qdc = qda.LIZIZ;
        qda.LIZ = null;
        qda.LIZIZ = null;
        qda.LIZJ = null;
        List<QDA> list = QDA.LIZLLL;
        synchronized (list) {
            if (((ArrayList) list).size() < 10000) {
                ((ArrayList) list).add(qda);
            }
        }
        if (qdc.LIZJ) {
            LJFF(obj, qdc);
        }
    }

    public final synchronized boolean LJI(Object obj) {
        return this.typesBySubscriber.containsKey(obj);
    }

    public final void LJII(Object obj) {
        Class<?> cls = obj.getClass();
        this.subscriberMethodFinder.getClass();
        List list = (List) ((ConcurrentHashMap) QD2.LIZ).get(cls);
        if (list == null) {
            QD1 LIZJ2 = QD2.LIZJ();
            LIZJ2.LJ = cls;
            LIZJ2.LJFF = false;
            while (LIZJ2.LJ != null) {
                QD2.LIZ(LIZJ2);
                LIZJ2.LIZIZ();
            }
            list = QD2.LIZIZ(LIZJ2);
            if (!list.isEmpty()) {
                ((ConcurrentHashMap) QD2.LIZ).put(cls, list);
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Subscriber ");
                LIZ.append(cls);
                LIZ.append(" and its super classes have no public methods with the @Subscribe annotation");
                throw new QDE(X1D.LIZIZ(LIZ));
            }
        }
        synchronized (this) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LJIIZILJ(obj, (QD4) it.next());
            }
        }
    }

    public final synchronized void LJIIIIZZ(Object obj) {
        List<Class<?>> list = this.typesBySubscriber.get(obj);
        if (list != null) {
            Iterator<Class<?>> it = list.iterator();
            while (it.hasNext()) {
                CopyOnWriteArrayList<QDC> copyOnWriteArrayList = this.subscriptionsByEventType.get(it.next());
                if (copyOnWriteArrayList != null) {
                    int size = copyOnWriteArrayList.size();
                    int i = 0;
                    while (i < size) {
                        QDC qdc = (QDC) ListProtector.get(copyOnWriteArrayList, i);
                        if (qdc.LIZ == obj) {
                            qdc.LIZJ = false;
                            ListProtector.remove(copyOnWriteArrayList, i);
                            i--;
                            size--;
                        }
                        i++;
                    }
                }
            }
            this.typesBySubscriber.remove(obj);
        } else {
            P9G p9g = this.LIZIZ;
            Level level = Level.WARNING;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Subscriber to unregister was not registered before: ");
            LIZ.append(obj.getClass());
            p9g.LIZIZ(level, X1D.LIZIZ(LIZ));
        }
    }

    public final void LJIIIZ(Object obj) {
        boolean z;
        QD9 qd9 = this.currentPostingThreadState.get();
        ArrayList arrayList = (ArrayList) qd9.LIZ;
        arrayList.add(obj);
        if (!qd9.LIZIZ) {
            QDH qdh = this.mainThreadSupport;
            if (qdh == null || ((QDF) qdh).LIZ == Looper.myLooper()) {
                z = true;
            } else {
                z = false;
            }
            qd9.LIZJ = z;
            qd9.LIZIZ = true;
            if (!qd9.LJFF) {
                while (!arrayList.isEmpty()) {
                    try {
                        LJIIJ(arrayList.remove(0), qd9);
                    } finally {
                        qd9.LIZIZ = false;
                        qd9.LIZJ = false;
                    }
                }
                return;
            }
            throw new QDE("Internal error. Abort state was not reset");
        }
    }

    public final void LJIIL(Object obj) {
        synchronized (this.stickyEvents) {
            this.stickyEvents.put(obj.getClass(), obj);
        }
        LJIIIZ(obj);
    }

    public final void LJIILJJIL(Object obj) {
        if (!LIZJ().LJI(obj)) {
            try {
                LJII(obj);
            } catch (QDE e) {
                PEH.LIZJ(e);
            }
        }
    }

    public final void LJIILL(Class cls) {
        synchronized (this.stickyEvents) {
            cls.cast(this.stickyEvents.remove(cls));
        }
    }

    public final void LJIILLIIL(Object obj) {
        synchronized (this.stickyEvents) {
            Class<?> cls = obj.getClass();
            if (obj.equals(this.stickyEvents.get(cls))) {
                this.stickyEvents.remove(cls);
            }
        }
    }

    public final synchronized void LJIJ(Object obj) {
        if (LIZJ().LJI(obj)) {
            try {
                LJIIIIZZ(obj);
            } catch (QDE e) {
                PEH.LIZJ(e);
            }
        }
    }

    public static void LIZ(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            ArrayList arrayList = (ArrayList) list;
            if (!arrayList.contains(cls)) {
                arrayList.add(cls);
                LIZ(list, cls.getInterfaces());
            }
        }
    }

    public final void LJFF(Object obj, QDC qdc) {
        try {
            qdc.LIZIZ.LIZ.invoke(qdc.LIZ, obj);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unexpected exception", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (obj instanceof QDG) {
                if (this.logSubscriberExceptions) {
                    P9G p9g = this.LIZIZ;
                    Level level = Level.SEVERE;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("SubscriberExceptionEvent subscriber ");
                    LIZ.append(qdc.LIZ.getClass());
                    LIZ.append(" threw an exception");
                    p9g.LIZ(level, X1D.LIZIZ(LIZ), cause);
                    QDG qdg = (QDG) obj;
                    P9G p9g2 = this.LIZIZ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Initial event ");
                    LIZ2.append(qdg.LIZIZ);
                    LIZ2.append(" caused exception in ");
                    LIZ2.append(qdg.LIZJ);
                    p9g2.LIZ(level, X1D.LIZIZ(LIZ2), qdg.LIZ);
                    return;
                }
                return;
            }
            if (!this.throwSubscriberException) {
                if (this.logSubscriberExceptions) {
                    P9G p9g3 = this.LIZIZ;
                    Level level2 = Level.SEVERE;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Could not dispatch event: ");
                    LIZ3.append(obj.getClass());
                    LIZ3.append(" to subscribing class ");
                    LIZ3.append(qdc.LIZ.getClass());
                    p9g3.LIZ(level2, X1D.LIZIZ(LIZ3), cause);
                }
                if (!this.sendSubscriberExceptionEvent) {
                    return;
                }
                LJIIIZ(new QDG(cause, obj, qdc.LIZ));
                return;
            }
            throw new QDE("Invoking subscriber failed", cause);
        }
    }

    public final void LJIIJ(Object obj, QD9 qd9) {
        boolean LJIIJJI;
        List<Class<?>> list;
        Class<?> cls = obj.getClass();
        if (this.eventInheritance) {
            Map<Class<?>, List<Class<?>>> map = eventTypesCache;
            synchronized (map) {
                List<Class<?>> list2 = map.get(cls);
                list = list2;
                if (list2 == null) {
                    ArrayList arrayList = new ArrayList();
                    for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                        arrayList.add(cls2);
                        LIZ(arrayList, cls2.getInterfaces());
                    }
                    eventTypesCache.put(cls, arrayList);
                    list = arrayList;
                }
            }
            int size = list.size();
            LJIIJJI = false;
            for (int i = 0; i < size; i++) {
                LJIIJJI |= LJIIJJI(obj, qd9, (Class) ListProtector.get(list, i));
            }
        } else {
            LJIIJJI = LJIIJJI(obj, qd9, cls);
        }
        if (!LJIIJJI) {
            if (this.logNoSubscriberMessages) {
                P9G p9g = this.LIZIZ;
                Level level = Level.FINE;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("No subscribers registered for event ");
                LIZ.append(cls);
                p9g.LIZIZ(level, X1D.LIZIZ(LIZ));
            }
            if (this.sendNoSubscriberEvent && cls != QDJ.class && cls != QDG.class) {
                LJIIIZ(new QDJ(obj));
            }
        }
    }

    public final void LJIIZILJ(Object obj, QD4 qd4) {
        Object value;
        boolean z;
        Class<?> cls = qd4.LIZJ;
        QDC qdc = new QDC(obj, qd4);
        CopyOnWriteArrayList<QDC> copyOnWriteArrayList = this.subscriptionsByEventType.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.subscriptionsByEventType.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(qdc)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Subscriber ");
            LIZ.append(obj.getClass());
            LIZ.append(" already registered to event ");
            LIZ.append(cls);
            throw new QDE(X1D.LIZIZ(LIZ));
        }
        int size = copyOnWriteArrayList.size();
        boolean z2 = false;
        for (int i = 0; i <= size; i++) {
            if (i == size || qd4.LIZLLL > copyOnWriteArrayList.get(i).LIZIZ.LIZLLL) {
                copyOnWriteArrayList.add(i, qdc);
                break;
            }
        }
        List<Class<?>> list = this.typesBySubscriber.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.typesBySubscriber.put(obj, list);
        }
        list.add(cls);
        if (qd4.LJ) {
            if (this.eventInheritance) {
                for (Map.Entry<Class<?>, Object> entry : this.stickyEvents.entrySet()) {
                    if (cls.isAssignableFrom(entry.getKey()) && (value = entry.getValue()) != null) {
                        QDH qdh = this.mainThreadSupport;
                        if (qdh == null || ((QDF) qdh).LIZ == Looper.myLooper()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        LJIILIIL(qdc, value, z);
                    }
                }
                return;
            }
            Object obj2 = this.stickyEvents.get(cls);
            if (obj2 != null) {
                QDH qdh2 = this.mainThreadSupport;
                if (qdh2 == null || ((QDF) qdh2).LIZ == Looper.myLooper()) {
                    z2 = true;
                }
                LJIILIIL(qdc, obj2, z2);
            }
        }
    }

    public final boolean LJIIJJI(Object obj, QD9 qd9, Class<?> cls) {
        CopyOnWriteArrayList<QDC> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.subscriptionsByEventType.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<QDC> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            QDC next = it.next();
            qd9.LJ = obj;
            qd9.LIZLLL = next;
            try {
                LJIILIIL(next, obj, qd9.LIZJ);
                if (qd9.LJFF) {
                    return true;
                }
            } finally {
                qd9.LJ = null;
                qd9.LIZLLL = null;
                qd9.LJFF = false;
            }
        }
        return true;
    }

    public final void LJIILIIL(QDC qdc, Object obj, boolean z) {
        int i = QD5.LIZ[qdc.LIZIZ.LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            this.asyncPoster.LIZ(obj, qdc);
                            return;
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Unknown thread mode: ");
                        LIZ.append(qdc.LIZIZ.LIZIZ);
                        throw new IllegalStateException(X1D.LIZIZ(LIZ));
                    }
                    if (z) {
                        this.backgroundPoster.LIZ(obj, qdc);
                        return;
                    } else {
                        LJFF(obj, qdc);
                        return;
                    }
                }
                QDI qdi = this.mainThreadPoster;
                if (qdi != null) {
                    qdi.LIZ(obj, qdc);
                    return;
                } else {
                    LJFF(obj, qdc);
                    return;
                }
            }
            if (z) {
                LJFF(obj, qdc);
                return;
            } else {
                this.mainThreadPoster.LIZ(obj, qdc);
                return;
            }
        }
        LJFF(obj, qdc);
    }
}
