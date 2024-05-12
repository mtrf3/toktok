package X;

import java.util.HashMap;

/* renamed from: X.Cjz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32175Cjz extends HashMap<String, Object> {
    public C32175Cjz(String str, int i, int i2, String str2, Throwable th) {
        put("id", str);
        put("key", Integer.valueOf(i));
        put("value", Integer.valueOf(i2));
        put("logInfo", str2);
        put("throwable", th.toString());
    }
}
