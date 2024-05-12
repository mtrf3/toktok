package X;

import kotlin.jvm.internal.o;

/* renamed from: X.536, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass536 extends C53C {
    public final AnonymousClass523 LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass536) && o.LJ(this.LIZ, ((AnonymousClass536) obj).LIZ);
    }

    public final int hashCode() {
        AnonymousClass523 anonymousClass523 = this.LIZ;
        if (anonymousClass523 == null) {
            return 0;
        }
        return anonymousClass523.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BackClickAction(funcItem=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public AnonymousClass536(AnonymousClass523 anonymousClass523) {
        this.LIZ = anonymousClass523;
    }
}
