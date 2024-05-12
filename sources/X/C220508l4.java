package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.8l4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220508l4 extends AbstractC220518l5 {
    public final long LIZLLL;
    public final QaStruct LJ;
    public final AddYoursStickerStruct LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C220508l4)) {
            return false;
        }
        C220508l4 c220508l4 = (C220508l4) obj;
        return this.LIZLLL == c220508l4.LIZLLL && o.LJ(this.LJ, c220508l4.LJ) && o.LJ(this.LJFF, c220508l4.LJFF) && o.LJ(this.LJI, c220508l4.LJI);
    }

    public final int hashCode() {
        int hashCode = (this.LJ.hashCode() + (C16880lQ.LLJIJIL(this.LIZLLL) * 31)) * 31;
        AddYoursStickerStruct addYoursStickerStruct = this.LJFF;
        int hashCode2 = (hashCode + (addYoursStickerStruct == null ? 0 : addYoursStickerStruct.hashCode())) * 31;
        String str = this.LJI;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QnaSticker(questionId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", qaSticker=");
        LIZ.append(this.LJ);
        LIZ.append(", addYoursSticker=");
        LIZ.append(this.LJFF);
        LIZ.append(", title=");
        return q.LIZIZ(LIZ, this.LJI, ')', LIZ);
    }

    public C220508l4(long j, QaStruct qaStruct, String str) {
        super(j, str, 2);
        this.LIZLLL = j;
        this.LJ = qaStruct;
        this.LJFF = null;
        this.LJI = str;
    }
}
