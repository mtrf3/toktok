package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1dV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37451dV implements C11M {
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AndroidPointerIcon(pointerIcon=");
        LIZ.append((Object) null);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        throw null;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(C37451dV.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return o.LJ(null, null);
    }
}
