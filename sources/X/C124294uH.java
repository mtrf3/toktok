package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4uH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124294uH {
    public final List<String> LIZ;
    public final List<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C124294uH)) {
            return false;
        }
        C124294uH c124294uH = (C124294uH) obj;
        return o.LJ(this.LIZ, c124294uH.LIZ) && o.LJ(this.LIZIZ, c124294uH.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TagRecord(tagList=");
        LIZ.append(this.LIZ);
        LIZ.append(", showTagList=");
        return C1NE.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C124294uH(List<String> list, List<String> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
