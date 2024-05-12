package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Cr6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32616Cr6 {
    public final Integer LIZ;
    public final Long LIZIZ;
    public final long LIZJ;
    public final EnumC124204u8 LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32616Cr6)) {
            return false;
        }
        C32616Cr6 c32616Cr6 = (C32616Cr6) obj;
        return o.LJ(this.LIZ, c32616Cr6.LIZ) && o.LJ(this.LIZIZ, c32616Cr6.LIZIZ) && this.LIZJ == c32616Cr6.LIZJ && this.LIZLLL == c32616Cr6.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MatchItemAwardPopupTimestamp(itemType=");
        LIZ.append(this.LIZ);
        LIZ.append(", itemId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", showTimestamp=");
        LIZ.append(this.LIZJ);
        LIZ.append(", popupType=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.LIZ;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Long l = this.LIZIZ;
        if (l != null) {
            i = l.hashCode();
        }
        return this.LIZLLL.hashCode() + JBR.LIZJ(this.LIZJ, (i2 + i) * 31, 31);
    }

    public C32616Cr6(Integer num, Long l, long j, EnumC124204u8 popupType) {
        o.LJIIIZ(popupType, "popupType");
        this.LIZ = num;
        this.LIZIZ = l;
        this.LIZJ = j;
        this.LIZLLL = popupType;
    }
}
