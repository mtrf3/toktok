package com.bytedance.framwork.core.sdkmonitor;

import X.C16880lQ;
import X.C1E2;
import X.C48660J7w;
import X.C48661J7x;
import X.C64009PAf;
import X.C64056PCa;
import X.InterfaceC64016PAm;
import X.PAH;
import X.PAU;
import X.PAZ;
import X.PCX;
import X.X1D;
import Y.ARunnableS15S0400000_11;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class SDKMonitorUtils {
    public static final ConcurrentHashMap<String, C64009PAf> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, List<String>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, List<String>> LIZJ = new ConcurrentHashMap<>();

    public static List<String> LIZ(List<String> list) {
        LinkedList linkedList = new LinkedList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                URL url = new URL(it.next());
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("https://");
                LIZ2.append(url.getHost());
                String LIZIZ2 = X1D.LIZIZ(LIZ2);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(LIZIZ2);
                LIZ3.append("/monitor/collect/");
                linkedList.add(X1D.LIZIZ(LIZ3));
            } catch (MalformedURLException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return linkedList;
    }

    public static C64009PAf LIZIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            ConcurrentHashMap<String, C64009PAf> concurrentHashMap = LIZ;
            if (concurrentHashMap.get(str) == null) {
                synchronized (SDKMonitorUtils.class) {
                    if (concurrentHashMap.get(str) == null) {
                        concurrentHashMap.put(str, new C64009PAf(str));
                    }
                }
            }
            return concurrentHashMap.get(str);
        }
        throw new IllegalArgumentException("param 'aid' is not allowed to assigned empty string");
    }

    public static synchronized void LIZLLL(String str, List<String> list) {
        synchronized (SDKMonitorUtils.class) {
            if (!TextUtils.isEmpty(str) && !C1E2.LIZ(list)) {
                try {
                    URL url = new URL((String) ListProtector.get(list, 0));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("https://");
                    LIZ2.append(url.getHost());
                    String LIZIZ2 = X1D.LIZIZ(LIZ2);
                    if (!TextUtils.isEmpty(LIZIZ2)) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(LIZIZ2);
                        LIZ3.append("/monitor/collect/c/exception");
                        C48660J7w.LIZJ = X1D.LIZIZ(LIZ3);
                    }
                } catch (Exception unused) {
                }
                LinkedList linkedList = new LinkedList();
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        URL url2 = new URL(it.next());
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("https://");
                        LIZ4.append(url2.getHost());
                        String LIZIZ3 = X1D.LIZIZ(LIZ4);
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append(LIZIZ3);
                        LIZ5.append("/monitor/appmonitor/v4/settings");
                        linkedList.add(X1D.LIZIZ(LIZ5));
                    } catch (MalformedURLException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                LIZJ.put(str, linkedList);
            }
        }
    }

    public static synchronized void LJ(String str, List<String> list) {
        synchronized (SDKMonitorUtils.class) {
            if (!TextUtils.isEmpty(str) && !C1E2.LIZ(list)) {
                LIZIZ.put(str, LIZ(list));
                try {
                    URL url = new URL((String) ListProtector.get(list, 0));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("https://");
                    LIZ2.append(url.getHost());
                    String LIZIZ2 = X1D.LIZIZ(LIZ2);
                    if (!TextUtils.isEmpty(LIZIZ2)) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(LIZIZ2);
                        LIZ3.append("/monitor/collect/c/exception");
                        C48660J7w.LIZJ = X1D.LIZIZ(LIZ3);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public static synchronized void LIZJ(Context context, String str, JSONObject jSONObject, InterfaceC64016PAm interfaceC64016PAm) {
        synchronized (SDKMonitorUtils.class) {
            if (context == null) {
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                if (jSONObject != null) {
                    ConcurrentHashMap<String, C64009PAf> concurrentHashMap = LIZ;
                    if (concurrentHashMap.get(str) != null && concurrentHashMap.get(str).LJIJ) {
                        return;
                    }
                    C64009PAf c64009PAf = concurrentHashMap.get(str);
                    if (c64009PAf == null) {
                        c64009PAf = new C64009PAf(str);
                        concurrentHashMap.put(str, c64009PAf);
                    }
                    List<String> remove = LIZJ.remove(str);
                    if (remove != null && !C1E2.LIZ(remove)) {
                        ((LinkedList) c64009PAf.LJIILLIIL).clear();
                        ((LinkedList) c64009PAf.LJIILLIIL).addAll(remove);
                    }
                    List<String> remove2 = LIZIZ.remove(str);
                    if (remove2 != null && !C1E2.LIZ(remove2)) {
                        PAH.LIZ.LIZLLL(remove2);
                    }
                    if (!c64009PAf.LJIJ) {
                        c64009PAf.LJIJ = true;
                        C64009PAf.LJJI = System.currentTimeMillis();
                        PAU.LIZ = PAZ.LIZ;
                        PCX pcx = C48661J7x.LIZ;
                        ARunnableS15S0400000_11 aRunnableS15S0400000_11 = new ARunnableS15S0400000_11(c64009PAf, context, jSONObject, interfaceC64016PAm, 1);
                        C64056PCa c64056PCa = pcx.LIZ;
                        c64056PCa.LIZIZ(Message.obtain(c64056PCa.LIZLLL, aRunnableS15S0400000_11), 5000L);
                    }
                    return;
                }
                throw new IllegalArgumentException("param 'headerInfo' is not allowed to be null");
            }
            throw new IllegalArgumentException("param 'aid' is not allowed to assigned empty string");
        }
    }
}
