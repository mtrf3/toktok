package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0k3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16030k3 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final InterfaceC16050k5 LIZ;

    public final int hashCode() {
        return this.LIZ.LIZ().hashCode();
    }

    public final String toString() {
        return this.LIZ.LIZ();
    }

    public C16030k3(InterfaceC16050k5 platformLocale) {
        o.LJIIIZ(platformLocale, "platformLocale");
        this.LIZ = platformLocale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C16030k3)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return o.LJ(this.LIZ.LIZ(), ((C16030k3) obj).LIZ.LIZ());
    }
}
