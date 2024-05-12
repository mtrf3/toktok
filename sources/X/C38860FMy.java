package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.FMy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38860FMy implements InterfaceC64427PQh, InterfaceC120964ou {
    public final java.util.Map<String, Long> LIZ = new HashMap();
    public final AtomicInteger LIZIZ = new AtomicInteger(0);
    public final Object LIZJ = new Object();

    @Override // X.InterfaceC64427PQh
    public final java.util.Map<String, Long> LIZIZ() {
        HashMap hashMap = new HashMap(this.LIZ);
        synchronized (this.LIZJ) {
            ((HashMap) this.LIZ).clear();
        }
        this.LIZIZ.getAndSet(0);
        return hashMap;
    }

    @Override // X.InterfaceC64427PQh
    public final void start() {
        synchronized (this.LIZJ) {
            ((HashMap) this.LIZ).clear();
        }
        this.LIZIZ.getAndSet(0);
        C38840FMe.LIZLLL().LJIIIIZZ.add(this);
    }

    @Override // X.InterfaceC64427PQh
    public final void stop() {
        C38840FMe.LIZLLL().LJIIIIZZ.remove(this);
    }

    @Override // X.InterfaceC120964ou
    public final void LIZ(java.util.Map<String, Long> map) {
        this.LIZIZ.getAndIncrement();
        int i = this.LIZIZ.get();
        if (i >= 1) {
            synchronized (this.LIZJ) {
                HashMap hashMap = new HashMap(map);
                for (String str : ((HashMap) this.LIZ).keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        ((HashMap) this.LIZ).put(str, Long.valueOf(((LIZJ(str, this.LIZ) * (i - 1)) + LIZJ(str, hashMap)) / i));
                        hashMap.remove(str);
                    }
                }
                for (String str2 : hashMap.keySet()) {
                    if (!TextUtils.isEmpty(str2)) {
                        ((HashMap) this.LIZ).put(str2, Long.valueOf(LIZJ(str2, hashMap) / i));
                    }
                }
            }
        }
    }

    public static long LIZJ(String str, java.util.Map map) {
        Long l;
        if (map != null && !TextUtils.isEmpty(str)) {
            HashMap hashMap = (HashMap) map;
            if (hashMap.containsKey(str) && (l = (Long) hashMap.get(str)) != null) {
                return l.longValue();
            }
        }
        return 0L;
    }
}
