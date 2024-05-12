package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.FTo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39032FTo {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C39032FTo() {
        /*
            r3 = this;
            r2 = 0
            r1 = 15
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39032FTo.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39032FTo)) {
            return false;
        }
        C39032FTo c39032FTo = (C39032FTo) obj;
        return o.LJ(this.LIZ, c39032FTo.LIZ) && o.LJ(this.LIZIZ, c39032FTo.LIZIZ) && this.LIZJ == c39032FTo.LIZJ && o.LJ(this.LIZLLL, c39032FTo.LIZLLL);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = (C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31) + this.LIZJ) * 31;
        String str = this.LIZLLL;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UploadData(categoryData=");
        LIZ.append(this.LIZ);
        LIZ.append(", selectedInterestData=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", selectedInterestsCount=");
        LIZ.append(this.LIZJ);
        LIZ.append(", topics=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public /* synthetic */ C39032FTo(String str, String str2, int i, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (String) null);
    }

    public C39032FTo(String categoryData, String selectedInterestData, int i, String str) {
        o.LJIIIZ(categoryData, "categoryData");
        o.LJIIIZ(selectedInterestData, "selectedInterestData");
        this.LIZ = categoryData;
        this.LIZIZ = selectedInterestData;
        this.LIZJ = i;
        this.LIZLLL = str;
    }
}
