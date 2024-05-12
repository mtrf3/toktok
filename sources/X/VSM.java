package X;

import Y.ARunnableS6S0500000_14;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes15.dex */
public final class VSM implements VSP {
    public final HashMap<String, VF8> LIZ;
    public final HashMap<String, HashMap<String, Object>> LIZIZ;
    public final long LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.CountDownLatch, T] */
    @Override // X.VSP
    public final VSO LIZ() {
        EnumC79770VSk enumC79770VSk;
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = new CountDownLatch(this.LIZ.size());
        C34K c34k = new C34K();
        c34k.element = false;
        C68322mC c68322mC2 = new C68322mC();
        c68322mC2.element = new ConcurrentHashMap();
        Iterator<Map.Entry<String, VF8>> it = this.LIZ.entrySet().iterator();
        while (it.hasNext()) {
            new PthreadThread(new ARunnableS6S0500000_14(c68322mC, it.next(), this, c68322mC2, c34k, 1), "k/ICMPSubTask").start();
        }
        try {
            ((CountDownLatch) c68322mC.element).await(this.LIZJ + 1000, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        boolean z = c34k.element;
        for (Map.Entry entry : ((ConcurrentHashMap) c68322mC2.element).entrySet()) {
            HashMap<String, Object> hashMap = this.LIZIZ.get(entry.getKey());
            if (hashMap != null) {
                hashMap.put("icmp_result", entry.getValue());
            }
        }
        boolean z2 = !z;
        if (z) {
            enumC79770VSk = EnumC79770VSk.NETWORK_GOOD;
        } else {
            enumC79770VSk = EnumC79770VSk.NO_NETWORK;
        }
        return new VSO(z2, enumC79770VSk);
    }

    public VSM(HashMap<String, VF8> hashMap, HashMap<String, HashMap<String, Object>> hashMap2, long j) {
        this.LIZ = hashMap;
        this.LIZIZ = hashMap2;
        this.LIZJ = j;
    }
}
