package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3Bx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79973Bx<T> {
    public static final C3C0 LIZIZ = new C3C0();
    public final Object LIZ;

    public final int hashCode() {
        Object obj = this.LIZ;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return LIZIZ(this.LIZ);
    }

    public /* synthetic */ C79973Bx(Object obj) {
        this.LIZ = obj;
    }

    public static final Throwable LIZ(Object obj) {
        C79993Bz c79993Bz;
        if (!(obj instanceof C79993Bz) || (c79993Bz = (C79993Bz) obj) == null) {
            return null;
        }
        return c79993Bz.LIZ;
    }

    public static String LIZIZ(Object obj) {
        if (obj instanceof C79993Bz) {
            return obj.toString();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Value(");
        LIZ.append(obj);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        Object obj2 = this.LIZ;
        if (!(obj instanceof C79973Bx) || !o.LJ(obj2, ((C79973Bx) obj).LIZ)) {
            return false;
        }
        return true;
    }
}
