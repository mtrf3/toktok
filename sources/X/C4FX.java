package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.4FX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FX {
    public final String LIZ;
    public final String LIZIZ;
    public final C4FZ LIZJ;
    public final String LIZLLL;

    public C4FX() {
        this(null, null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4FX)) {
            return false;
        }
        C4FX c4fx = (C4FX) obj;
        return o.LJ(this.LIZ, c4fx.LIZ) && o.LJ(this.LIZIZ, c4fx.LIZIZ) && o.LJ(this.LIZJ, c4fx.LIZJ) && o.LJ(this.LIZLLL, c4fx.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C4FZ c4fz = this.LIZJ;
        int hashCode3 = (hashCode2 + (c4fz == null ? 0 : c4fz.hashCode())) * 31;
        String str3 = this.LIZLLL;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SendNudgeEventTrackData(enterFrom=");
        LIZ.append(this.LIZ);
        LIZ.append(", enterMethod=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", interactionEventTrackData=");
        LIZ.append(this.LIZJ);
        LIZ.append(", activeStatus=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C4FX(String str, String str2, C4FZ c4fz, String str3, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        c4fz = (i & 4) != 0 ? null : c4fz;
        str3 = (i & 8) != 0 ? null : str3;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c4fz;
        this.LIZLLL = str3;
    }
}
