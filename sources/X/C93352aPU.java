package X;

import java.util.HashMap;

/* renamed from: X.aPU, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public class C93352aPU<T> {
    public final java.util.Map<T, R0A> LIZ = new HashMap();
    public final java.util.Map<R0A, T> LIZIZ = new HashMap();

    public final void LIZ(R0A r0a) {
        Object obj = ((HashMap) this.LIZIZ).get(r0a);
        ((HashMap) this.LIZIZ).remove(r0a);
        ((HashMap) this.LIZ).remove(obj);
    }
}
