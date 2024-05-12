package X;

import java.util.HashMap;

/* renamed from: X.0UG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0UG {
    public final java.util.Map<C0NR, Object> LIZ = new HashMap();
    public final java.util.Map<C0NR, Object> LIZIZ = new HashMap();

    public final <T extends java.util.Map> T LIZ(C0UB c0ub, C0NR c0nr) {
        return (T) ((HashMap) (C0UB.VENDOR == c0ub ? this.LIZ : this.LIZIZ)).get(c0nr);
    }

    public final <T extends java.util.Map> void LIZIZ(C0UB c0ub, C0NR c0nr, T t) {
        ((HashMap) (C0UB.VENDOR == c0ub ? this.LIZ : this.LIZIZ)).put(c0nr, t);
    }
}
