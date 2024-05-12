package X;

import java.util.HashMap;

/* renamed from: X.1Yl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC34871Yl extends AbstractC20690rZ {
    public final String LIZ;
    public long LIZIZ;

    public java.util.Map<String, Object> LIZLLL() {
        HashMap hashMap = new HashMap();
        long j = this.LIZIZ;
        if (j >= 0) {
            hashMap.put("cost_total", Long.valueOf(j));
        }
        return hashMap;
    }

    public AbstractC34871Yl(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
    }
}
