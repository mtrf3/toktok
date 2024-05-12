package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Axv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27943Axv {
    public final java.util.Map<String, Object> LIZ = new HashMap();

    public final void LJ(java.util.Map<String, ? extends Object> value) {
        o.LJIIIZ(value, "value");
        ((HashMap) this.LIZ).putAll(value);
    }

    public static void LIZ(C27943Axv c27943Axv, java.util.Map value) {
        o.LJIIIZ(c27943Axv, "<this>");
        o.LJIIIZ(value, "value");
        ((HashMap) c27943Axv.LIZ).putAll(value);
    }

    public final void LIZIZ(String str, Object obj) {
        o.LJIIIZ(str, "<this>");
        if (obj != null) {
            ((HashMap) this.LIZ).put(str, obj);
        }
    }

    public final void LIZJ(String str, Object obj) {
        if (obj != null) {
            ((HashMap) this.LIZ).put(str, obj);
        }
    }

    public final void LIZLLL(String key, Object value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        ((HashMap) this.LIZ).put(key, value);
    }
}
