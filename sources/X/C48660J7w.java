package X;

import Y.ARunnableS3S2100000_8;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.J7w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48660J7w {
    public static final AtomicInteger LIZ = new AtomicInteger(0);
    public static final boolean LIZIZ = true;
    public static String LIZJ;

    public static void LIZIZ(String str, byte[] bArr) {
        try {
            if (!C2NU.LIZ.LIZIZ() || bArr == null || bArr.length == 0) {
                return;
            }
            try {
                HashMap hashMap = new HashMap();
                byte[] LIZJ2 = P9Y.LIZJ(bArr, hashMap);
                HashMap hashMap2 = new HashMap(C63985P9h.LIZIZ());
                hashMap2.put("aid", "44444");
                C63985P9h.LIZ(EZT.LIZ(str, hashMap2), hashMap, LIZJ2);
            } catch (Throwable unused) {
            }
        } catch (Exception unused2) {
        }
    }

    public static void LIZ(String str, String str2, Throwable th) {
        if (!TextUtils.isEmpty(LIZJ) && LIZIZ) {
            AtomicInteger atomicInteger = LIZ;
            if (atomicInteger.get() >= 3) {
                return;
            }
            atomicInteger.incrementAndGet();
            C48661J7x.LIZ.LIZIZ(new ARunnableS3S2100000_8(str, th, str2, 0));
        }
    }
}
