package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8d1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215518d1 {
    public long LIZ;
    public long LIZIZ;
    public final List<C214998cB> LIZJ;
    public EnumC215768dQ LIZLLL;
    public int LJ;

    public C215518d1() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C215518d1)) {
            return false;
        }
        C215518d1 c215518d1 = (C215518d1) obj;
        return this.LIZ == c215518d1.LIZ && this.LIZIZ == c215518d1.LIZIZ && o.LJ(this.LIZJ, c215518d1.LIZJ) && this.LIZLLL == c215518d1.LIZLLL && this.LJ == c215518d1.LJ;
    }

    public final int hashCode() {
        return ((this.LIZLLL.hashCode() + AnonymousClass391.LIZIZ(this.LIZJ, JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31), 31)) * 31) + this.LJ;
    }

    public final String toString() {
        String str;
        String sb;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('[');
        long j = 1000;
        LIZ.append(this.LIZ / j);
        LIZ.append(',');
        LIZ.append(this.LIZIZ / j);
        LIZ.append(")\n");
        LIZ.append(this.LIZLLL.name());
        if (this.LIZLLL == EnumC215768dQ.APPEND) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(':');
            LIZ2.append(this.LJ);
            str = X1D.LIZIZ(LIZ2);
        } else {
            str = "";
        }
        LIZ.append(str);
        LIZ.append(':');
        Object[] array = this.LIZJ.toArray(new C214998cB[0]);
        if (array == null) {
            sb = "null";
        } else {
            int length = array.length;
            if (length > 429496729) {
                length = 429496729;
            }
            StringBuilder sb2 = new StringBuilder((length * 5) + 2);
            OQN.LJ(array, sb2, new ArrayList());
            sb = sb2.toString();
            o.LJIIIIZZ(sb, "StringBuilder(capacity).…builderAction).toString()");
        }
        LIZ.append(sb);
        return X1D.LIZIZ(LIZ);
    }

    public C215518d1(List list, EnumC215768dQ nextOperation) {
        o.LJIIIZ(nextOperation, "nextOperation");
        this.LIZ = 0L;
        this.LIZIZ = 0L;
        this.LIZJ = list;
        this.LIZLLL = nextOperation;
        this.LJ = 0;
    }
}
