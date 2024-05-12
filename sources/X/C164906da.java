package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6da, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164906da {
    public final String LIZ;
    public final EnumC61598OFm LIZIZ;

    public final boolean LIZ() {
        if (this.LIZIZ == EnumC61598OFm.GRANTED) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('[');
        LIZ.append(this.LIZ);
        LIZ.append(':');
        LIZ.append(this.LIZIZ);
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
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
        if (!o.LJ(C164906da.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.ies.powerpermissions.model.PermissionResult");
        C164906da c164906da = (C164906da) obj;
        if (o.LJ(this.LIZ, c164906da.LIZ) && this.LIZIZ == c164906da.LIZIZ) {
            return true;
        }
        return false;
    }

    public C164906da(String permission, EnumC61598OFm result) {
        o.LJIIIZ(permission, "permission");
        o.LJIIIZ(result, "result");
        this.LIZ = permission;
        this.LIZIZ = result;
    }
}
