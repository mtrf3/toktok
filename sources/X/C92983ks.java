package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3ks, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92983ks {
    public final java.util.Set<String> LIZ;
    public final java.util.Set<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92983ks)) {
            return false;
        }
        C92983ks c92983ks = (C92983ks) obj;
        return o.LJ(this.LIZ, c92983ks.LIZ) && o.LJ(this.LIZIZ, c92983ks.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReplyForwardControlData(haveWatchedVideoSet=");
        LIZ.append(this.LIZ);
        LIZ.append(", haveRepliedVideoSet=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C92983ks(java.util.Set<String> set, java.util.Set<String> set2) {
        this.LIZ = set;
        this.LIZIZ = set2;
    }
}
