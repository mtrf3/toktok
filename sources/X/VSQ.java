package X;

import Y.ARunnableS0S1200100_6;
import com.bytedance.netecho.result.DnsResolveResult;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.android.ugc.network.observer.bean.DetectorParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VSQ implements Runnable {
    public final ArrayList<VSP> LJLIL;
    public final CopyOnWriteArrayList<OSZ<InterfaceC88471Ynr<EnumC79770VSk, HashMap<String, HashMap<String, Object>>, C76800UCe>, InterfaceC88472Yns<HashMap<String, Object>, C76800UCe>>> LJLILLLLZI;
    public final CopyOnWriteArrayList<Long> LJLJI;
    public final HashMap<String, HashMap<String, Object>> LJLJJI;
    public final HashMap<String, VF8> LJLJJL;
    public final DetectorParam LJLJJLL;
    public final HHM LJLJL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.CountDownLatch, T] */
    public final void LIZ() {
        DetectorParam detectorParam = this.LJLJJLL;
        String[] strArr = detectorParam.targetList;
        long j = detectorParam.dnsTimeout;
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = new CountDownLatch(strArr.length);
        C68322mC c68322mC2 = new C68322mC();
        c68322mC2.element = new ConcurrentHashMap();
        for (String str : strArr) {
            new PthreadThread(new ARunnableS0S1200100_6(c68322mC2, str, c68322mC, j, 1), "er/DetectTask").start();
        }
        try {
            ((CountDownLatch) c68322mC.element).await(j + 1000, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        Iterator it = ((ConcurrentHashMap) c68322mC2.element).entrySet().iterator();
        while (true) {
            String str2 = null;
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                DnsResolveResult dnsResolveResult = (DnsResolveResult) ((OSZ) entry.getValue()).getFirst();
                this.LJLJJI.put(entry.getKey(), new HashMap());
                HashMap<String, Object> hashMap = this.LJLJJI.get(entry.getKey());
                if (hashMap != null) {
                    hashMap.put("dns_result", dnsResolveResult);
                }
                if (dnsResolveResult.getSuccess() && dnsResolveResult.getIp() != null) {
                    HashMap<String, VF8> hashMap2 = this.LJLJJL;
                    Object key = entry.getKey();
                    String ip = ((DnsResolveResult) ((OSZ) entry.getValue()).getFirst()).getIp();
                    if (ip != null) {
                        hashMap2.put(key, new VF8(ip, ((Number) ((OSZ) entry.getValue()).getSecond()).intValue()));
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                EnumC79770VSk enumC79770VSk = EnumC79770VSk.UNKNOWN_STATUS;
                try {
                    Iterator<VSP> it2 = this.LJLIL.iterator();
                    long j2 = -1;
                    long j3 = -1;
                    while (it2.hasNext()) {
                        VSP next = it2.next();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        VSO LIZ = next.LIZ();
                        if (next instanceof VSM) {
                            j3 = System.currentTimeMillis() - currentTimeMillis2;
                        } else if (next instanceof VSN) {
                            j2 = System.currentTimeMillis() - currentTimeMillis2;
                        }
                        if (!Thread.interrupted()) {
                            enumC79770VSk = LIZ.LJLILLLLZI;
                            if (!LIZ.LJLIL) {
                                break;
                            }
                        } else {
                            return;
                        }
                    }
                    long currentTimeMillis3 = System.currentTimeMillis();
                    if (enumC79770VSk == EnumC79770VSk.NETWORK_GOOD) {
                        VSR.LIZ = currentTimeMillis3;
                    }
                    if (enumC79770VSk == EnumC79770VSk.NO_NETWORK && this.LJLJJL.size() == 0) {
                        enumC79770VSk = EnumC79770VSk.UNKNOWN_STATUS;
                        str2 = "2";
                    }
                    long j4 = currentTimeMillis3 - currentTimeMillis;
                    DetectorParam detectorParam2 = this.LJLJJLL;
                    if (j4 > detectorParam2.pingTimeout + detectorParam2.tcpTimeout + 3000) {
                        enumC79770VSk = EnumC79770VSk.UNKNOWN_STATUS;
                        str2 = "3";
                    }
                    this.LJLJJI.put("extra_info", VSU.LIZ(str2, this.LJLJL));
                    Iterator<OSZ<InterfaceC88471Ynr<EnumC79770VSk, HashMap<String, HashMap<String, Object>>, C76800UCe>, InterfaceC88472Yns<HashMap<String, Object>, C76800UCe>>> it3 = this.LJLILLLLZI.iterator();
                    boolean z = false;
                    while (it3.hasNext()) {
                        OSZ<InterfaceC88471Ynr<EnumC79770VSk, HashMap<String, HashMap<String, Object>>, C76800UCe>, InterfaceC88472Yns<HashMap<String, Object>, C76800UCe>> next2 = it3.next();
                        next2.getFirst().invoke(enumC79770VSk, this.LJLJJI);
                        if (!z) {
                            HashMap<String, Object> hashMap3 = new HashMap<>();
                            hashMap3.put("network_status", String.valueOf(enumC79770VSk.ordinal()));
                            hashMap3.put("detect_start", Long.valueOf(currentTimeMillis));
                            if (j2 != -1) {
                                hashMap3.put("tcp_cost", Long.valueOf(j2));
                            }
                            if (j3 != -1) {
                                hashMap3.put("ping_cost", Long.valueOf(j3));
                            }
                            hashMap3.put("total_cost", Long.valueOf(j4));
                            hashMap3.put("network_status_detail", this.LJLJJI);
                            next2.getSecond().invoke(hashMap3);
                            z = true;
                        }
                    }
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public VSQ(DetectorParam param, HHM localParam) {
        o.LJIIJ(param, "param");
        o.LJIIJ(localParam, "localParam");
        this.LJLJJLL = param;
        this.LJLJL = localParam;
        ArrayList<VSP> arrayList = new ArrayList<>();
        this.LJLIL = arrayList;
        this.LJLILLLLZI = new CopyOnWriteArrayList<>();
        this.LJLJI = new CopyOnWriteArrayList<>();
        HashMap<String, HashMap<String, Object>> hashMap = new HashMap<>();
        this.LJLJJI = hashMap;
        HashMap<String, VF8> hashMap2 = new HashMap<>();
        this.LJLJJL = hashMap2;
        arrayList.add(new VSM(hashMap2, hashMap, param.pingTimeout));
        arrayList.add(new VSN(hashMap2, hashMap, param.tcpTimeout));
    }
}
