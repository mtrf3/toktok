package com.ss.android.ugc.aweme.utils;

import X.C63763P0t;
import X.InterfaceC63764P0u;
import X.InterfaceC63765P0v;
import X.JEX;
import X.OJM;
import android.app.Activity;
import android.app.Application;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes11.dex */
public final class ActivityStack {
    public static LinkedList<Activity> sActivityStack = new LinkedList<>();
    public static OJM<Activity> sStartedActivities = new OJM<>();
    public static boolean sAppBackGround = true;
    public static Application.ActivityLifecycleCallbacks lifecycleCallbacks = new C63763P0t();
    public static OJM<InterfaceC63764P0u> sAppBackgroundListeners = new OJM<>();
    public static OJM<JEX> sAppBackgroundMobListeners = new OJM<>();
    public static final List<InterfaceC63764P0u> nonWeakAppBackgroundListeners = new ArrayList();
    public static final List<JEX> nonWeakAppBackgroundMobListeners = new ArrayList();

    public static synchronized Activity[] getActivityStack() {
        Activity[] activityArr;
        synchronized (ActivityStack.class) {
            activityArr = (Activity[]) sActivityStack.toArray(new Activity[sActivityStack.size()]);
        }
        return activityArr;
    }

    public static synchronized Activity getPreviousActivity() {
        synchronized (ActivityStack.class) {
            if (sActivityStack.size() >= 2) {
                LinkedList<Activity> linkedList = sActivityStack;
                return linkedList.get(linkedList.size() - 2);
            }
            return null;
        }
    }

    public static synchronized Activity[] getStartedActivitys() {
        Activity[] activityArr;
        synchronized (ActivityStack.class) {
            ArrayList arrayList = new ArrayList();
            Iterator<Activity> it = sStartedActivities.iterator();
            while (it != null && it.hasNext()) {
                Activity next = it.next();
                if (next != null) {
                    arrayList.add(next);
                }
            }
            activityArr = (Activity[]) arrayList.toArray(new Activity[arrayList.size()]);
        }
        return activityArr;
    }

    public static synchronized Activity getTopActivity() {
        Activity last;
        synchronized (ActivityStack.class) {
            if (!sActivityStack.isEmpty()) {
                last = sActivityStack.getLast();
            } else {
                last = null;
            }
        }
        return last;
    }

    public static synchronized Activity getValidTopActivity() {
        Activity topActivity;
        synchronized (ActivityStack.class) {
            topActivity = getTopActivity();
            if (topActivity != null && topActivity.isFinishing()) {
                sActivityStack.removeLast();
                topActivity = getValidTopActivity();
            }
        }
        return topActivity;
    }

    public static boolean isAppBackGround() {
        return sAppBackGround;
    }

    public static synchronized void addAppBackGroundListener(InterfaceC63764P0u interfaceC63764P0u) {
        synchronized (ActivityStack.class) {
            if (interfaceC63764P0u != null) {
                if (!sAppBackgroundListeners.LJLIL.containsKey(interfaceC63764P0u)) {
                    sAppBackgroundListeners.LJIIZILJ(interfaceC63764P0u);
                }
            }
        }
    }

    public static synchronized void addAppBackGroundMobListener(JEX jex) {
        synchronized (ActivityStack.class) {
            if (jex != null) {
                if (!sAppBackgroundMobListeners.LJLIL.containsKey(jex)) {
                    sAppBackgroundMobListeners.LJIIZILJ(jex);
                }
            }
        }
    }

    public static synchronized void addNonWeakAppBackGroundListener(InterfaceC63764P0u interfaceC63764P0u) {
        synchronized (ActivityStack.class) {
            if (interfaceC63764P0u != null) {
                List<InterfaceC63764P0u> list = nonWeakAppBackgroundListeners;
                if (!list.contains(interfaceC63764P0u)) {
                    list.add(interfaceC63764P0u);
                }
            }
        }
    }

    public static synchronized void addNonWeakAppBackGroundMobListener(JEX jex) {
        synchronized (ActivityStack.class) {
            if (jex != null) {
                List<JEX> list = nonWeakAppBackgroundMobListeners;
                if (!list.contains(jex)) {
                    list.add(jex);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void finishAllFlipChatActivity(Class<?> cls) {
        Iterator<Activity> it = sActivityStack.iterator();
        while (it.hasNext()) {
            Activity next = it.next();
            if (cls.isInstance(next)) {
                if (next instanceof InterfaceC63765P0v) {
                    ((InterfaceC63765P0v) next).LIZ();
                } else {
                    next.finish();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        r0 = r3.get(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized android.app.Activity getPreviousActivity(android.app.Activity r5) {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.utils.ActivityStack> r4 = com.ss.android.ugc.aweme.utils.ActivityStack.class
            monitor-enter(r4)
            java.util.LinkedList<android.app.Activity> r3 = com.ss.android.ugc.aweme.utils.ActivityStack.sActivityStack     // Catch: java.lang.Throwable -> L31
            int r0 = r3.size()     // Catch: java.lang.Throwable -> L31
            int r2 = r0 + (-1)
        Lb:
            if (r2 < 0) goto L2e
            java.lang.Object r0 = r3.get(r2)     // Catch: java.lang.Throwable -> L31
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> L31
            if (r0 == r5) goto L1f
            int r1 = r0.getTaskId()     // Catch: java.lang.Throwable -> L31
            int r0 = r5.getTaskId()     // Catch: java.lang.Throwable -> L31
            if (r1 == r0) goto L24
        L1f:
            int r0 = r2 + (-1)
            if (r0 < 0) goto L24
            goto L27
        L24:
            int r2 = r2 + (-1)
            goto Lb
        L27:
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.Throwable -> L31
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> L31
            goto L2f
        L2e:
            r0 = 0
        L2f:
            monitor-exit(r4)
            return r0
        L31:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.ActivityStack.getPreviousActivity(android.app.Activity):android.app.Activity");
    }

    public static synchronized void removeAppBackGroundListener(InterfaceC63764P0u interfaceC63764P0u) {
        synchronized (ActivityStack.class) {
            if (interfaceC63764P0u != null) {
                sAppBackgroundListeners.LJIJ(interfaceC63764P0u);
                nonWeakAppBackgroundListeners.remove(interfaceC63764P0u);
            }
        }
    }

    public static synchronized void removeAppBackGroundMobListener(JEX jex) {
        synchronized (ActivityStack.class) {
            if (jex != null) {
                sAppBackgroundMobListeners.LJIJ(jex);
                nonWeakAppBackgroundMobListeners.remove(jex);
            }
        }
    }
}
