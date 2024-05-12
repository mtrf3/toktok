package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.837, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass837 {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass837)) {
            return false;
        }
        AnonymousClass837 anonymousClass837 = (AnonymousClass837) obj;
        return o.LJ(this.LIZ, anonymousClass837.LIZ) && this.LIZIZ == anonymousClass837.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeIdAndTypePair(awemeId=");
        LIZ.append(this.LIZ);
        LIZ.append(", awemeType=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public AnonymousClass837(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
