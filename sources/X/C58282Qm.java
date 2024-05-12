package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2Qm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58282Qm {
    public static final ConcurrentHashMap<Integer, String> LIZ = new ConcurrentHashMap<>();

    public static final String LIZ(int i) {
        String str;
        try {
            str = EF7.LIZIZ().getString(i);
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        LIZ.put(Integer.valueOf(i), str);
        return str;
    }
}
