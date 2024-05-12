package X;

import android.app.Activity;
import android.os.Looper;
import android.os.SystemClock;
import android.webkit.CookieManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.TTNetInit;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.Pat, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64735Pat {
    public static InterfaceC64804Pc0 LIZ;
    public static InterfaceC64666PZm LIZJ;
    public static InterfaceC64783Pbf LIZLLL;
    public static InterfaceC64715PaZ LJI;
    public static InterfaceC64760PbI LJII;
    public static InterfaceC64671PZr LJIIJJI;
    public static OCD LJIIL;
    public static volatile InterfaceC64785Pbh LJIILIIL;
    public static InterfaceC39184FZk LJIILL;
    public static final C64778Pba LIZIZ = new C64778Pba();
    public static InterfaceC39219FaJ LJ = null;
    public static String LJFF = null;
    public static volatile AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public static final Object LJIIIZ = new Object();
    public static CountDownLatch LJIIJ = new CountDownLatch(1);
    public static final java.util.Map<String, InterfaceC64764PbM> LJIILJJIL = new ConcurrentHashMap();
    public static volatile boolean LJIILLIIL = false;
    public static boolean LJIIZILJ = true;
    public static boolean LJIJ = false;

    public static void LJFF() {
        if (!LJIIIIZZ.get()) {
            LJIIIIZZ.getAndSet(true);
            CountDownLatch countDownLatch = LJIIJ;
            if (countDownLatch != null && countDownLatch.getCount() > 0) {
                LJIIJ.countDown();
            }
        }
        C56662Kg.LIZ().LJFF("feed_network_init_cookie_duration", false);
    }

    public static CookieManager LJIIIIZZ() {
        synchronized (LJIIIZ) {
            if (!LJIIIIZZ.get()) {
                try {
                    CountDownLatch countDownLatch = LJIIJ;
                    if (countDownLatch != null) {
                        countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
                        if (LJIIJ.getCount() == 1) {
                            LJIIJ.countDown();
                        }
                    }
                } catch (Exception unused) {
                }
                LJIIIIZZ.getAndSet(true);
            }
        }
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            try {
                if (!cookieManager.acceptCookie()) {
                    cookieManager.setAcceptCookie(true);
                    return cookieManager;
                }
                return cookieManager;
            } catch (Throwable unused2) {
                return cookieManager;
            }
        } catch (Throwable unused3) {
            return null;
        }
    }

    public static void LIZ(String str) {
        InterfaceC64671PZr interfaceC64671PZr;
        if (!C38354F3m.LJ(str) && (interfaceC64671PZr = LJIIJJI) != null) {
            C64734Pas c64734Pas = (C64734Pas) interfaceC64671PZr;
            if (C38354F3m.LJ(str)) {
                return;
            }
            try {
                if (c64734Pas.LJLIL) {
                    c64734Pas.LJIIZILJ();
                } else {
                    c64734Pas.LJIILLIIL();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static C64687Pa7 LJII(int i, java.util.Map<String, List<String>> map) {
        Activity activity;
        boolean z = false;
        if (i != 200 || C16880lQ.LLJJJJ() == Looper.myLooper()) {
            return new C64687Pa7(false);
        }
        if (LJIILIIL != null) {
            LJIILIIL.getClass();
            boolean[] zArr = {false};
            CountDownLatch countDownLatch = new CountDownLatch(1);
            TreeMap treeMap = (TreeMap) map;
            if (treeMap.containsKey("bdturing-verify")) {
                List list = (List) treeMap.get("bdturing-verify");
                if (list != null && list.size() >= 1) {
                    QNY qny = new QNY((String) ListProtector.get(list, 0));
                    QNE qne = OIP.LIZ;
                    InterfaceC64782Pbe interfaceC64782Pbe = qne.LIZ.LJIL;
                    if (interfaceC64782Pbe != null) {
                        activity = interfaceC64782Pbe.getActivity();
                    } else {
                        activity = null;
                    }
                    qne.LJ(activity, qny, new C64773PbV(countDownLatch, zArr));
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                treeMap.remove("bdturing-verify");
                return new C64687Pa7(z);
            }
            z = zArr[0];
            treeMap.remove("bdturing-verify");
            return new C64687Pa7(z);
        }
        return new C64687Pa7(false);
    }

    public static void LIZJ(String str, String str2, boolean z) {
        InterfaceC64671PZr interfaceC64671PZr;
        if (C38354F3m.LJ(str) || C38354F3m.LJ(str2) || (interfaceC64671PZr = LJIIJJI) == null) {
            return;
        }
        C64734Pas c64734Pas = (C64734Pas) interfaceC64671PZr;
        if (((CopyOnWriteArrayList) c64734Pas.LL).isEmpty()) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) c64734Pas.LL).iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (!C38354F3m.LJ(str3) && str.endsWith(str3)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str);
                    LIZ2.append(str2);
                    jSONObject.put("url", X1D.LIZIZ(LIZ2));
                    jSONObject.put("replace", z);
                    TTNetInit.monitorLogSend("api_http", jSONObject);
                } catch (Throwable unused) {
                }
                if (!TTNetInit.apiHttpInterceptEnabled() || z) {
                    return;
                } else {
                    throw new C64772PbU("Api http request is not allowed to be executed");
                }
            }
        }
    }

    public static C64687Pa7 LJI(C64668PZo c64668PZo, int i, InterfaceC64701PaL interfaceC64701PaL, java.util.Map<String, List<String>> map) {
        C64687Pa7 c64687Pa7 = new C64687Pa7(false);
        if (i != 200 || C16880lQ.LLJJJJ() == Looper.myLooper() || map.isEmpty() || ((ConcurrentHashMap) LJIILJJIL).isEmpty()) {
            return c64687Pa7;
        }
        TreeMap treeMap = (TreeMap) map;
        for (String str : treeMap.keySet()) {
            if (!C38354F3m.LJ(str) && str.toLowerCase().contains("verify")) {
                java.util.Set<String> keySet = treeMap.keySet();
                synchronized (C64735Pat.class) {
                    for (Map.Entry entry : ((ConcurrentHashMap) LJIILJJIL).entrySet()) {
                        for (String str2 : keySet) {
                            if (!C38354F3m.LJ(str2) && str2.equalsIgnoreCase((String) entry.getKey())) {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("x-tt-bypass-retry-by-");
                                LIZ2.append((String) entry.getKey());
                                String LIZIZ2 = interfaceC64701PaL.LIZIZ(X1D.LIZIZ(LIZ2));
                                if (!C38354F3m.LJ(LIZIZ2) && "1".equalsIgnoreCase(LIZIZ2)) {
                                    return c64687Pa7;
                                }
                                InterfaceC64764PbM interfaceC64764PbM = (InterfaceC64764PbM) entry.getValue();
                                if (interfaceC64764PbM == null) {
                                    return c64687Pa7;
                                }
                                c64668PZo.LJJIIZ = (String) entry.getKey();
                                long uptimeMillis = SystemClock.uptimeMillis();
                                C64687Pa7 LIZ3 = interfaceC64764PbM.LIZ(map);
                                c64668PZo.LJJIIZI = SystemClock.uptimeMillis() - uptimeMillis;
                                if (LIZ3.LIZ) {
                                    c64668PZo.LJJIIJZLJL = true;
                                    java.util.Map<String, String> map2 = LIZ3.LIZJ;
                                    if (map2 == null) {
                                        map2 = new HashMap<>();
                                    }
                                    StringBuilder LIZ4 = X1D.LIZ();
                                    LIZ4.append("x-tt-retry-by-");
                                    LIZ4.append((String) entry.getKey());
                                    map2.put(X1D.LIZIZ(LIZ4), "1");
                                    LIZ3.LIZJ = map2;
                                }
                                return LIZ3;
                            }
                        }
                    }
                    return c64687Pa7;
                }
            }
        }
        return c64687Pa7;
    }

    public static void LIZLLL(long j, long j2, String str, String str2, C64668PZo c64668PZo) {
        InterfaceC64760PbI interfaceC64760PbI = LJII;
        if (!C38354F3m.LJ(str) && j > 0 && interfaceC64760PbI != null) {
            if (!c64668PZo.LJJI || !c64668PZo.LJJIJ.get()) {
                if (c64668PZo.LJJI) {
                    c64668PZo.LJJIJ.set(true);
                }
                interfaceC64760PbI.LIZ(j, j2, str, str2, c64668PZo);
            }
        }
    }

    public static void LIZIZ(long j, long j2, String str, String str2, C64668PZo c64668PZo, Throwable th) {
        InterfaceC64760PbI interfaceC64760PbI;
        if (C38354F3m.LJ(str) || th == null || (interfaceC64760PbI = LJII) == null) {
            return;
        }
        if (c64668PZo.LJJI) {
            c64668PZo.LJJIJ.set(true);
        }
        interfaceC64760PbI.LIZIZ(j, j2, str, str2, c64668PZo, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJ(Throwable th, String str, long j, Request request, C64668PZo c64668PZo, Boolean bool) {
        if (th == 0) {
            LIZLLL(c64668PZo.LJII - j, j, request.getUrl(), str, c64668PZo);
            return;
        }
        if (th instanceof C64800Pbw) {
            C64800Pbw c64800Pbw = (C64800Pbw) th;
            if (c64800Pbw.needReport) {
                if (c64800Pbw.reportMonitorOk) {
                    LIZLLL(c64668PZo.LJII - j, j, request.getUrl(), str, c64668PZo);
                }
                if (!c64800Pbw.reportMonitorError) {
                    return;
                }
                LIZIZ(c64668PZo.LJII - j, j, request.getUrl(), str, c64668PZo, th);
                return;
            }
        }
        if (th instanceof InterfaceC64791Pbn) {
            if (!((InterfaceC64791Pbn) th).shouldReport()) {
                return;
            }
            LIZIZ(c64668PZo.LJII - j, j, request.getUrl(), str, c64668PZo, th);
        } else {
            if (!bool.booleanValue()) {
                return;
            }
            LIZIZ(c64668PZo.LJII - j, j, request.getUrl(), str, c64668PZo, th);
        }
    }
}
