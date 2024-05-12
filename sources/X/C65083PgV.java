package X;

import android.text.TextUtils;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.net.monitor.HybridTrafficColoringInterceptor;
import com.ss.android.ugc.aweme.net.monitor.TTNetMonitorInterceptor;
import com.ss.android.ugc.aweme.network.experiment.HybridTrafficColoringSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.PgV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65083PgV {
    public static volatile CopyOnWriteArrayList<InterfaceC37216Ej6> LIZ = new CopyOnWriteArrayList<>();
    public static volatile java.util.Map<String, InterfaceC37216Ej6> LIZIZ = new ConcurrentHashMap();
    public static final C35979EAd<String, C65019PfT> LIZJ;
    public static final C35979EAd<String, C65019PfT> LIZLLL;

    public static C65019PfT LIZJ(C65064PgC c65064PgC) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(400200, "com/bytedance/retrofit2/Retrofit$Builder", "build", c65064PgC, new Object[0], "com.bytedance.retrofit2.Retrofit", new C65300Pk0(false, "()Lcom/bytedance/retrofit2/Retrofit;", "6551802732005827036"));
        return LIZJ2.LIZ ? (C65019PfT) LIZJ2.LIZIZ : c65064PgC.LIZLLL();
    }

    static {
        C65019PfT.LJIIIZ = LIZ;
        LIZJ = new C35979EAd<>(10);
        LIZLLL = new C35979EAd<>(10);
    }

    public static C65019PfT LIZ(C65064PgC c65064PgC) {
        if (PXY.LIZ().enable) {
            try {
                InterfaceC64805Pc1 interfaceC64805Pc1 = (InterfaceC64805Pc1) Reflect.on(c65064PgC).field("clientProvider", new Class[0]).get();
                InterfaceC64777PbZ interfaceC64777PbZ = interfaceC64805Pc1.get();
                if ("com.ss.android.ugc.aweme.app.api.OkClient".equals(interfaceC64805Pc1.getClass().getName()) || (interfaceC64777PbZ instanceof C64667PZn)) {
                    return LIZJ(c65064PgC);
                }
            } catch (Throwable unused) {
            }
        }
        C65019PfT LIZJ2 = LIZJ(c65064PgC);
        List<InterfaceC37216Ej6> list = LIZJ2.LJIIIIZZ;
        if (list != null) {
            list.add(new TTNetMonitorInterceptor());
            if (HybridTrafficColoringSettings.LIZ().enabled) {
                List<InterfaceC37216Ej6> list2 = LIZJ2.LJIIIIZZ;
                int i = 0;
                while (true) {
                    if (i >= list2.size()) {
                        break;
                    }
                    if (ListProtector.get(list2, i) instanceof com.bytedance.helios.network.ttnet.TTNetMonitorInterceptor) {
                        if (i != -1) {
                            ListProtector.add(list2, i, new HybridTrafficColoringInterceptor());
                        }
                    } else {
                        i++;
                    }
                }
                list2.add(new HybridTrafficColoringInterceptor());
            }
            ListProtector.set(LIZJ2.LJIIIIZZ, 0, new C37215Ej5((InterfaceC37216Ej6) ListProtector.get(LIZJ2.LJIIIIZZ, 0)));
        }
        return LIZJ2;
    }

    public static synchronized void LIZIZ(InterfaceC37216Ej6 interfaceC37216Ej6) {
        synchronized (C65083PgV.class) {
            if (interfaceC37216Ej6 == null) {
                return;
            }
            if (!LIZ.contains(interfaceC37216Ej6)) {
                LIZ.add(interfaceC37216Ej6);
            }
            V1M.LJJJJI(LIZJ, interfaceC37216Ej6);
            V1M.LJJJJI(LIZLLL, interfaceC37216Ej6);
        }
    }

    public static synchronized C65019PfT LIZLLL(String str) {
        C65019PfT LJ;
        synchronized (C65083PgV.class) {
            LJ = LJ(str, null, null, null, new C65094Pgg());
        }
        return LJ;
    }

    public static synchronized C65019PfT LJIIJJI(String str) {
        synchronized (C65083PgV.class) {
            if (C38354F3m.LJ(str)) {
                return null;
            }
            C35979EAd<String, C65019PfT> c35979EAd = LIZLLL;
            C65019PfT LIZIZ2 = c35979EAd.LIZIZ(str);
            if (LIZIZ2 != null) {
                return LIZIZ2;
            }
            C65019PfT LIZLLL2 = LIZLLL(str);
            c35979EAd.LIZLLL(str, LIZLLL2);
            return LIZLLL2;
        }
    }

    public static synchronized C65019PfT LJIIL(String str) {
        synchronized (C65083PgV.class) {
            if (C38354F3m.LJ(str)) {
                return null;
            }
            C35979EAd<String, C65019PfT> c35979EAd = LIZJ;
            C65019PfT LIZIZ2 = c35979EAd.LIZIZ(str);
            if (LIZIZ2 != null) {
                return LIZIZ2;
            }
            C65019PfT LJII = LJII(str, null, null);
            c35979EAd.LIZLLL(str, LJII);
            return LJII;
        }
    }

    public static synchronized <S> S LJI(C65019PfT c65019PfT, Class<S> cls) {
        synchronized (C65083PgV.class) {
            if (c65019PfT != null) {
                return (S) c65019PfT.LIZ(cls);
            }
            return null;
        }
    }

    public static synchronized Object LJIIIIZZ(Class cls, String str) {
        Object LJI;
        synchronized (C65083PgV.class) {
            LJI = LJI(LJIIL(str), cls);
        }
        return LJI;
    }

    public static EJ6 LJIIIZ(String str, List list) {
        if (list != null && !C38354F3m.LJ(str)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                EJ6 ej6 = (EJ6) it.next();
                if (str.equalsIgnoreCase(ej6.LIZ)) {
                    return ej6;
                }
            }
        }
        return null;
    }

    public static String LJIIJ(String str, List list) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EJ6 ej6 = (EJ6) it.next();
            if (str.equalsIgnoreCase(ej6.LIZ)) {
                return ej6.LIZIZ;
            }
        }
        return "";
    }

    public static synchronized C65019PfT LJII(String str, List list, C65238Pj0 c65238Pj0) {
        C65019PfT LJ;
        synchronized (C65083PgV.class) {
            LJ = LJ(str, list, c65238Pj0, null, new C65093Pgf());
        }
        return LJ;
    }

    public static synchronized C65019PfT LJ(String str, List list, C65238Pj0 c65238Pj0, C65148PhY c65148PhY, InterfaceC64805Pc1 interfaceC64805Pc1) {
        ArrayList arrayList;
        C65019PfT LJFF;
        synchronized (C65083PgV.class) {
            ArrayList arrayList2 = null;
            if (c65238Pj0 != null) {
                arrayList = new ArrayList();
                arrayList.add(c65238Pj0);
            } else {
                arrayList = null;
            }
            if (c65148PhY != null) {
                arrayList2 = new ArrayList();
                arrayList2.add(c65148PhY);
            }
            LJFF = LJFF(list, arrayList, arrayList2, interfaceC64805Pc1, str);
        }
        return LJFF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0094, code lost:
    
        if (r3 == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized X.C65019PfT LJFF(java.util.List<X.InterfaceC37216Ej6> r8, java.util.List<X.AbstractC65022PfW> r9, java.util.List<X.AbstractC65069PgH> r10, X.InterfaceC64805Pc1 r11, java.lang.String r12) {
        /*
            java.lang.Class<X.PgV> r7 = X.C65083PgV.class
            monitor-enter(r7)
            if (r11 != 0) goto La
            X.Pgc r11 = new X.Pgc     // Catch: java.lang.Throwable -> Ld1
            r11.<init>()     // Catch: java.lang.Throwable -> Ld1
        La:
            X.PgC r2 = new X.PgC     // Catch: java.lang.Throwable -> Ld1
            r2.<init>()     // Catch: java.lang.Throwable -> Ld1
            r2.LJ(r12)     // Catch: java.lang.Throwable -> Ld1
            r2.LIZIZ = r11     // Catch: java.lang.Throwable -> Ld1
            X.Pc2 r0 = new X.Pc2     // Catch: java.lang.Throwable -> Ld1
            r0.<init>()     // Catch: java.lang.Throwable -> Ld1
            r2.LJI = r0     // Catch: java.lang.Throwable -> Ld1
            if (r9 != 0) goto L22
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld1
            r9.<init>()     // Catch: java.lang.Throwable -> Ld1
        L22:
            boolean r0 = r9.isEmpty()     // Catch: java.lang.Throwable -> Ld1
            if (r0 == 0) goto L2f
            X.Pj0 r0 = X.C65238Pj0.LJFF()     // Catch: java.lang.Throwable -> Ld1
            r9.add(r0)     // Catch: java.lang.Throwable -> Ld1
        L2f:
            java.util.Iterator r1 = r9.iterator()     // Catch: java.lang.Throwable -> Ld1
        L33:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r0 == 0) goto L43
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> Ld1
            X.PfW r0 = (X.AbstractC65022PfW) r0     // Catch: java.lang.Throwable -> Ld1
            r2.LIZIZ(r0)     // Catch: java.lang.Throwable -> Ld1
            goto L33
        L43:
            if (r10 == 0) goto L5f
            boolean r0 = r10.isEmpty()     // Catch: java.lang.Throwable -> Ld1
            if (r0 != 0) goto L5f
            java.util.Iterator r1 = r10.iterator()     // Catch: java.lang.Throwable -> Ld1
        L4f:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> Ld1
            X.PgH r0 = (X.AbstractC65069PgH) r0     // Catch: java.lang.Throwable -> Ld1
            r2.LIZ(r0)     // Catch: java.lang.Throwable -> Ld1
            goto L4f
        L5f:
            java.util.LinkedList r5 = new java.util.LinkedList     // Catch: java.lang.Throwable -> Ld1
            r5.<init>()     // Catch: java.lang.Throwable -> Ld1
            r6 = 0
            if (r8 == 0) goto L96
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch: java.lang.Throwable -> Ld1
            int r0 = r8.size()     // Catch: java.lang.Throwable -> Ld1
            if (r0 <= 0) goto L96
            java.util.Iterator r4 = r8.iterator()     // Catch: java.lang.Throwable -> Ld1
            r3 = 0
        L74:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r0 == 0) goto L94
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> Ld1
            X.Ej6 r1 = (X.InterfaceC37216Ej6) r1     // Catch: java.lang.Throwable -> Ld1
            boolean r0 = r1 instanceof com.bytedance.ttnet.retrofit.SsInterceptor     // Catch: java.lang.Throwable -> Ld1
            if (r0 == 0) goto L8b
            if (r3 != 0) goto L74
            r5.add(r1)     // Catch: java.lang.Throwable -> Ld1
            r3 = 1
            goto L90
        L8b:
            boolean r0 = r1 instanceof com.bytedance.frameworks.baselib.network.http.retrofit.RequestVertifyInterceptor     // Catch: java.lang.Throwable -> Ld1
            if (r0 == 0) goto L90
            goto L74
        L90:
            r5.add(r1)     // Catch: java.lang.Throwable -> Ld1
            goto L74
        L94:
            if (r3 != 0) goto L9e
        L96:
            com.bytedance.ttnet.retrofit.SsInterceptor r0 = new com.bytedance.ttnet.retrofit.SsInterceptor     // Catch: java.lang.Throwable -> Ld1
            r0.<init>()     // Catch: java.lang.Throwable -> Ld1
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r5, r6, r0)     // Catch: java.lang.Throwable -> Ld1
        L9e:
            java.util.concurrent.CopyOnWriteArrayList<X.Ej6> r0 = X.C65083PgV.LIZ     // Catch: java.lang.Throwable -> Ld1
            if (r0 == 0) goto Laf
            java.util.concurrent.CopyOnWriteArrayList<X.Ej6> r0 = X.C65083PgV.LIZ     // Catch: java.lang.Throwable -> Ld1
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Ld1
            if (r0 <= 0) goto Laf
            java.util.concurrent.CopyOnWriteArrayList<X.Ej6> r0 = X.C65083PgV.LIZ     // Catch: java.lang.Throwable -> Ld1
            r5.addAll(r0)     // Catch: java.lang.Throwable -> Ld1
        Laf:
            com.bytedance.frameworks.baselib.network.http.retrofit.RequestVertifyInterceptor r0 = new com.bytedance.frameworks.baselib.network.http.retrofit.RequestVertifyInterceptor     // Catch: java.lang.Throwable -> Ld1
            r0.<init>()     // Catch: java.lang.Throwable -> Ld1
            r5.add(r0)     // Catch: java.lang.Throwable -> Ld1
            java.util.Iterator r1 = r5.iterator()     // Catch: java.lang.Throwable -> Ld1
        Lbb:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r0 == 0) goto Lcb
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> Ld1
            X.Ej6 r0 = (X.InterfaceC37216Ej6) r0     // Catch: java.lang.Throwable -> Ld1
            r2.LIZJ(r0)     // Catch: java.lang.Throwable -> Ld1
            goto Lbb
        Lcb:
            X.PfT r0 = LIZ(r2)     // Catch: java.lang.Throwable -> Ld1
            monitor-exit(r7)
            return r0
        Ld1:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65083PgV.LJFF(java.util.List, java.util.List, java.util.List, X.Pc1, java.lang.String):X.PfT");
    }
}
