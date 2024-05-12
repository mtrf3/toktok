package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.7ai, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188607ai {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C188607ai)) {
            return false;
        }
        C188607ai c188607ai = (C188607ai) obj;
        return o.LJ(this.LIZ, c188607ai.LIZ) && o.LJ(this.LIZIZ, c188607ai.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EventData(tagType=");
        LIZ.append(this.LIZ);
        LIZ.append(", tagCode=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C188607ai(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
