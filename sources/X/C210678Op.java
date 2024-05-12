package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.8Op, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210678Op {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C210678Op)) {
            return false;
        }
        C210678Op c210678Op = (C210678Op) obj;
        return this.LIZ == c210678Op.LIZ && o.LJ(this.LIZIZ, c210678Op.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ButtonEventData(buttonCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", businessSide=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C210678Op(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
