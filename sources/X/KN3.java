package X;

import com.ss.android.ugc.aweme.recommendationcard.data.CardContent;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KN3 {
    public final String LIZ;
    public final String LIZIZ;
    public final List<CardContent> LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final boolean LJI;

    public KN3() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KN3)) {
            return false;
        }
        KN3 kn3 = (KN3) obj;
        return o.LJ(this.LIZ, kn3.LIZ) && o.LJ(this.LIZIZ, kn3.LIZIZ) && o.LJ(this.LIZJ, kn3.LIZJ) && o.LJ(this.LIZLLL, kn3.LIZLLL) && o.LJ(this.LJ, kn3.LJ) && o.LJ(this.LJFF, kn3.LJFF) && this.LJI == kn3.LJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<CardContent> list = this.LIZJ;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJFF;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.LJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode6 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EffectRecommendationCardState(titleText=");
        LIZ.append(this.LIZ);
        LIZ.append(", actionButtonText=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", effects=");
        LIZ.append(this.LIZJ);
        LIZ.append(", musicUrl=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", musicId=");
        LIZ.append(this.LJ);
        LIZ.append(", cardMaterialKey=");
        LIZ.append(this.LJFF);
        LIZ.append(", isNetworkError=");
        return C48339Iy7.LIZJ(LIZ, this.LJI, ')', LIZ);
    }

    public /* synthetic */ KN3(int i) {
        this(null, null, null, false, null, null, null);
    }

    public KN3(String str, String str2, List list, boolean z, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = list;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = z;
    }

    public static KN3 LIZ(KN3 kn3, String str, String str2, List list, String str3, String str4, String str5, boolean z, int i) {
        boolean z2 = z;
        String str6 = str2;
        String str7 = str;
        List list2 = list;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        if ((i & 1) != 0) {
            str7 = kn3.LIZ;
        }
        if ((i & 2) != 0) {
            str6 = kn3.LIZIZ;
        }
        if ((i & 4) != 0) {
            list2 = kn3.LIZJ;
        }
        if ((i & 8) != 0) {
            str8 = kn3.LIZLLL;
        }
        if ((i & 16) != 0) {
            str9 = kn3.LJ;
        }
        if ((i & 32) != 0) {
            str10 = kn3.LJFF;
        }
        if ((i & 64) != 0) {
            z2 = kn3.LJI;
        }
        return new KN3(str7, str6, list2, z2, str8, str9, str10);
    }
}
