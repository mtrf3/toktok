package X;

import java.util.HashMap;

/* renamed from: X.00m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C005600m {
    public static final java.util.Map<String, AbstractC004900f> LIZ = new HashMap();
    public static final String LIZIZ = "live_default_window";

    public static AbstractC004900f LIZ(String str) {
        if (C38354F3m.LJ(str)) {
            return null;
        }
        return (AbstractC004900f) ((HashMap) LIZ).get(str);
    }
}
