package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.8l3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220498l3 extends AbstractC220518l5 {
    public final long LIZLLL;
    public final AddYoursStickerStruct LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C220498l3)) {
            return false;
        }
        C220498l3 c220498l3 = (C220498l3) obj;
        return this.LIZLLL == c220498l3.LIZLLL && o.LJ(this.LJ, c220498l3.LJ) && o.LJ(this.LJFF, c220498l3.LJFF);
    }

    public final int hashCode() {
        int hashCode = (this.LJ.hashCode() + (C16880lQ.LLJIJIL(this.LIZLLL) * 31)) * 31;
        String str = this.LJFF;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddYoursSticker(tId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", addYoursSticker=");
        LIZ.append(this.LJ);
        LIZ.append(", title=");
        return q.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public C220498l3(long j, AddYoursStickerStruct addYoursStickerStruct, String str) {
        super(j, str, 1);
        this.LIZLLL = j;
        this.LJ = addYoursStickerStruct;
        this.LJFF = str;
    }
}
