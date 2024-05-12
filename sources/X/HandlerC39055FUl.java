package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.FUl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class HandlerC39055FUl extends Handler {
    public static final C39060FUq LJII;
    public static final HandlerC39055FUl LJIIIIZZ = new HandlerC39055FUl();
    public static final int LIZ = 100;
    public static final ConcurrentHashMap<String, HashMap<Integer, SparseArray<List<View>>>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, ArrayList<String>> LIZJ = new ConcurrentHashMap<>();
    public static final ArrayList<String> LIZLLL = new ArrayList<>();
    public static final HashMap<String, Integer> LJ = new HashMap<>();
    public static int LJFF = -1;
    public static final Object LJI = new Object();

    static {
        C39060FUq c39060FUq = new C39060FUq();
        LJII = c39060FUq;
        Context context = C39057FUn.LIZ;
        if (context != null) {
            ((Application) context).registerActivityLifecycleCallbacks(c39060FUq);
            Context context2 = C39057FUn.LIZ;
            if (context2 != null) {
                ((Application) context2).registerComponentCallbacks(new ComponentCallbacks2C39062FUs());
                return;
            } else {
                o.LJIJI("context");
                throw null;
            }
        }
        o.LJIJI("context");
        throw null;
    }

    public HandlerC39055FUl() {
        super(C16880lQ.LLJJJJ());
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        o.LJIIJ(msg, "msg");
        ConcurrentHashMap<String, HashMap<Integer, SparseArray<List<View>>>> concurrentHashMap = LIZIZ;
        Object obj = msg.obj;
        if (obj != null) {
            HashMap<Integer, SparseArray<List<View>>> hashMap = concurrentHashMap.get(obj);
            if (hashMap != null) {
                synchronized (hashMap) {
                    SparseArray<List<View>> sparseArray = hashMap.get(Integer.valueOf(msg.arg1));
                    if (sparseArray != null) {
                        sparseArray.remove(msg.what);
                    }
                }
                return;
            }
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
    }

    public static void LIZIZ(Context context, InterfaceC39061FUr interfaceC39061FUr) {
        if (context instanceof Activity) {
            synchronized (LJII) {
                int hashCode = context.hashCode();
                ConcurrentHashMap<Integer, ArrayList<String>> concurrentHashMap = LIZJ;
                ArrayList<String> arrayList = concurrentHashMap.get(Integer.valueOf(hashCode));
                if (arrayList != null && arrayList.contains(interfaceC39061FUr.LJII())) {
                    return;
                }
                ArrayList<String> arrayList2 = concurrentHashMap.get(Integer.valueOf(hashCode));
                if (arrayList2 != null) {
                    arrayList2.add(interfaceC39061FUr.LJII());
                }
            }
        }
    }

    public static void LIZLLL(Context context, String viewTag) {
        String str;
        o.LJIIJ(viewTag, "viewTag");
        HashMap<Integer, SparseArray<List<View>>> hashMap = LIZIZ.get(viewTag);
        if (hashMap != null) {
            synchronized (hashMap) {
                hashMap.remove(Integer.valueOf(LJIIIIZZ.LJ(context, viewTag, false)));
            }
        }
        StringBuilder LIZIZ2 = C25620zW.LIZIZ("clear ", viewTag, " ");
        if (context != null) {
            str = context.getClass().getName();
        } else {
            str = null;
        }
        LIZIZ2.append(str);
        X1D.LIZIZ(LIZIZ2);
    }

    public static void LJFF(int i, String viewTag) {
        List<View> list;
        o.LJIIJ(viewTag, "viewTag");
        HashMap<Integer, SparseArray<List<View>>> hashMap = LIZIZ.get(viewTag);
        if (hashMap != null) {
            synchronized (hashMap) {
                Iterator<Map.Entry<Integer, SparseArray<List<View>>>> it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    SparseArray<List<View>> value = it.next().getValue();
                    if (value != null && (list = value.get(i)) != null) {
                        list.clear();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
    
        r0 = r1.remove(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048 A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #0 {, blocks: (B:14:0x001e, B:16:0x0031, B:19:0x003c, B:24:0x0048, B:27:0x0050, B:29:0x0060, B:31:0x006a, B:36:0x0074), top: B:13:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[Catch: all -> 0x007e, TRY_ENTER, TryCatch #0 {, blocks: (B:14:0x001e, B:16:0x0031, B:19:0x003c, B:24:0x0048, B:27:0x0050, B:29:0x0060, B:31:0x006a, B:36:0x0074), top: B:13:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LIZ(android.content.Context r8, int r9, java.lang.String r10) {
        /*
            r7 = this;
            java.lang.String r0 = "viewTag"
            kotlin.jvm.internal.o.LJIIJ(r10, r0)
            X.0lb r0 = X.C16970lZ.LIZ
            r6 = 0
            if (r0 == 0) goto Le
            boolean r0 = r0.LJ
            if (r0 != 0) goto Lf
        Le:
            return r6
        Lf:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.HashMap<java.lang.Integer, android.util.SparseArray<java.util.List<android.view.View>>>> r0 = X.HandlerC39055FUl.LIZIZ
            java.lang.Object r3 = r0.get(r10)
            java.util.HashMap r3 = (java.util.HashMap) r3
            monitor-enter(r7)
            if (r3 != 0) goto L1c
            monitor-exit(r7)
            return r6
        L1c:
            monitor-exit(r7)
            monitor-enter(r3)
            X.FUl r5 = X.HandlerC39055FUl.LJIIIIZZ     // Catch: java.lang.Throwable -> L7e
            r4 = 0
            int r0 = r5.LJ(r8, r10, r4)     // Catch: java.lang.Throwable -> L7e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.Throwable -> L7e
            android.util.SparseArray r0 = (android.util.SparseArray) r0     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L38
            java.lang.Object r1 = r0.get(r9)     // Catch: java.lang.Throwable -> L7e
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L7e
            goto L39
        L38:
            r1 = r6
        L39:
            r2 = 1
            if (r1 == 0) goto L45
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L43
            goto L45
        L43:
            r0 = 0
            goto L46
        L45:
            r0 = 1
        L46:
            if (r0 != 0) goto L50
            java.lang.Object r0 = r1.remove(r4)     // Catch: java.lang.Throwable -> L7e
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r3)
            return r0
        L50:
            int r0 = r5.LJ(r8, r10, r2)     // Catch: java.lang.Throwable -> L7e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.Throwable -> L7e
            android.util.SparseArray r0 = (android.util.SparseArray) r0     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L67
            java.lang.Object r1 = r0.get(r9)     // Catch: java.lang.Throwable -> L7e
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L7e
            goto L68
        L67:
            r1 = r6
        L68:
            if (r1 == 0) goto L72
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L71
            goto L72
        L71:
            r2 = 0
        L72:
            if (r2 != 0) goto L7c
            java.lang.Object r0 = r1.remove(r4)     // Catch: java.lang.Throwable -> L7e
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r3)
            return r0
        L7c:
            monitor-exit(r3)
            return r6
        L7e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HandlerC39055FUl.LIZ(android.content.Context, int, java.lang.String):android.view.View");
    }

    public final void LIZJ(View view, InterfaceC39061FUr nitaView, int i) {
        o.LJIIJ(view, "view");
        o.LJIIJ(nitaView, "nitaView");
        String LJII2 = nitaView.LJII();
        ConcurrentHashMap<String, HashMap<Integer, SparseArray<List<View>>>> concurrentHashMap = LIZIZ;
        HashMap<Integer, SparseArray<List<View>>> hashMap = concurrentHashMap.get(LJII2);
        if (hashMap == null) {
            synchronized (this) {
                hashMap = new HashMap<>();
                if (view.getContext() instanceof C39058FUo) {
                    int i2 = LJFF - 1;
                    LJFF = i2;
                    LJ.put(LJII2, Integer.valueOf(i2));
                    hashMap.put(Integer.valueOf(LJFF), new SparseArray<>());
                } else {
                    hashMap.put(Integer.valueOf(view.getContext().hashCode()), new SparseArray<>());
                }
                concurrentHashMap.put(LJII2, hashMap);
            }
        }
        Context context = view.getContext();
        o.LJFF(context, "context");
        if (!AMI.LIZ(context)) {
            return;
        }
        synchronized (hashMap) {
            int LJ2 = LJIIIIZZ.LJ(context, LJII2, false);
            if (hashMap.get(Integer.valueOf(LJ2)) == null) {
                hashMap.put(Integer.valueOf(LJ2), new SparseArray<>());
            }
            SparseArray<List<View>> sparseArray = hashMap.get(Integer.valueOf(LJ2));
            if (sparseArray != null) {
                if (sparseArray.get(i) == null) {
                    sparseArray.put(i, new ArrayList());
                }
                List<View> list = sparseArray.get(i);
                if (list != null) {
                    list.add(view);
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
        }
    }

    public final int LJ(Context context, String str, boolean z) {
        int intValue;
        if ((context instanceof C39058FUo) || context == null || z || (context instanceof Application)) {
            synchronized (this) {
                HashMap<String, Integer> hashMap = LJ;
                Integer num = hashMap.get(str);
                if (num == null) {
                    int i = LJFF - 1;
                    LJFF = i;
                    num = Integer.valueOf(i);
                    hashMap.put(str, num);
                }
                intValue = num.intValue();
            }
            return intValue;
        }
        return context.hashCode();
    }
}
