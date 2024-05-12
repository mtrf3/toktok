package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4us, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124664us {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Long LIZLLL;
    public final Long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C124664us)) {
            return false;
        }
        C124664us c124664us = (C124664us) obj;
        return o.LJ(this.LIZ, c124664us.LIZ) && o.LJ(this.LIZIZ, c124664us.LIZIZ) && o.LJ(this.LIZJ, c124664us.LIZJ) && o.LJ(this.LIZLLL, c124664us.LIZLLL) && o.LJ(this.LJ, c124664us.LJ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        String str = this.LIZJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        Long l = this.LIZLLL;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Long l2 = this.LJ;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerResourceParam(stickerIcon=");
        LIZ.append(this.LIZ);
        LIZ.append(", stickerPath=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", stickerId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", startTime=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", endTime=");
        return JBR.LJ(LIZ, this.LJ, ')', LIZ);
    }

    public C124664us(String str, Long l, Long l2, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = l;
        this.LJ = l2;
    }
}
