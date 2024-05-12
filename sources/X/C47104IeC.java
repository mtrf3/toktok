package X;

import android.util.LruCache;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.IeC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47104IeC {
    public static final C47104IeC LIZJ = new C47104IeC();
    public final Object LIZ = new Object();
    public final LinkedList<C47108IeG> LIZIZ;

    public C47104IeC() {
        new LruCache(100);
        this.LIZIZ = new LinkedList<>();
    }

    public final void LIZ(long j, HashMap<String, Object> hashMap) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j2;
        if (this.LIZIZ.isEmpty()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.LIZ) {
            Iterator<C47108IeG> it = this.LIZIZ.iterator();
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            while (true) {
                j2 = 0;
                if (!it.hasNext()) {
                    break;
                }
                C47108IeG next = it.next();
                long j3 = next.LIZJ;
                if (j3 > 0 && next.LIZ > 0 && next.LIZIZ > 0) {
                    long j4 = next.LIZ + j3;
                    if (j4 <= j) {
                        i4++;
                        it.remove();
                    } else if (j3 < j) {
                        i5++;
                        it.remove();
                    } else if (j3 > j && j4 <= currentTimeMillis) {
                        i3++;
                        if (i3 == 1) {
                            hashMap.put("download_size_first", Long.valueOf(next.LIZIZ));
                            hashMap.put("download_time_first", Long.valueOf(next.LIZ));
                            hashMap.put("internet_speed_first", Long.valueOf(((next.LIZIZ / next.LIZ) * 1000) / 1024));
                        }
                        i = (int) (i + next.LIZIZ);
                        i2 = (int) (i2 + next.LIZ);
                        it.remove();
                    }
                } else {
                    it.remove();
                }
            }
        }
        hashMap.put("download_size_sum", Integer.valueOf(i));
        hashMap.put("download_time_sum", Integer.valueOf(i2));
        if (i2 != 0) {
            j2 = ((i / i2) * 1000) / 1024;
        }
        hashMap.put("internet_speed_avg", Long.valueOf(j2));
        hashMap.put("range_count", Integer.valueOf(i3));
        hashMap.put("invalid_count", Integer.valueOf(i4));
        hashMap.put("dismiss_count", Integer.valueOf(i5));
    }
}
