package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.1dW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37461dW implements C11M {
    public final int LIZ = 1008;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AndroidPointerIcon(type=");
        return b0.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public final int hashCode() {
        return this.LIZ;
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
        if (!o.LJ(C37461dW.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        if (this.LIZ == ((C37461dW) obj).LIZ) {
            return true;
        }
        return false;
    }
}
