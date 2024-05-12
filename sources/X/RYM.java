package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Price;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RYM {
    public final String[] LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;
    public final Price LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RYM)) {
            return false;
        }
        RYM rym = (RYM) obj;
        return o.LJ(this.LIZ, rym.LIZ) && o.LJ(this.LIZIZ, rym.LIZIZ) && o.LJ(this.LIZJ, rym.LIZJ) && o.LJ(this.LIZLLL, rym.LIZLLL) && o.LJ(this.LJ, rym.LJ) && this.LJFF == rym.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String[] strArr = this.LIZ;
        int hashCode = (strArr == null ? 0 : Arrays.hashCode(strArr)) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LIZJ;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Price price = this.LJ;
        int hashCode5 = (hashCode4 + (price != null ? price.hashCode() : 0)) * 31;
        boolean z = this.LJFF;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedState(checkedSpecIds=");
        LIZ.append(Arrays.toString(this.LIZ));
        LIZ.append(", checkedSpecValues=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", quantity=");
        LIZ.append(this.LIZJ);
        LIZ.append(", skuId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", price=");
        LIZ.append(this.LJ);
        LIZ.append(", isSelect=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public RYM(String[] strArr, String str, Integer num, String str2, Price price, boolean z) {
        this.LIZ = strArr;
        this.LIZIZ = str;
        this.LIZJ = num;
        this.LIZLLL = str2;
        this.LJ = price;
        this.LJFF = z;
    }

    public static RYM LIZ(RYM rym, String[] strArr, String str, Integer num, String str2, Price price, boolean z, int i) {
        boolean z2 = z;
        Price price2 = price;
        String str3 = str2;
        Integer num2 = num;
        String[] strArr2 = strArr;
        String str4 = str;
        if ((i & 1) != 0) {
            strArr2 = rym.LIZ;
        }
        if ((i & 2) != 0) {
            str4 = rym.LIZIZ;
        }
        if ((i & 4) != 0) {
            num2 = rym.LIZJ;
        }
        if ((i & 8) != 0) {
            str3 = rym.LIZLLL;
        }
        if ((i & 16) != 0) {
            price2 = rym.LJ;
        }
        if ((i & 32) != 0) {
            z2 = rym.LJFF;
        }
        return new RYM(strArr2, str4, num2, str3, price2, z2);
    }
}
