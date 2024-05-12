package X;

import com.ss.android.ugc.aweme.recommendationcard.data.CardContent;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.KMn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51589KMn {
    public final String LIZ;
    public final String LIZIZ;
    public final List<CardContent> LIZJ;
    public final CardContent LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final Integer LJI;

    public C51589KMn() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51589KMn)) {
            return false;
        }
        C51589KMn c51589KMn = (C51589KMn) obj;
        return o.LJ(this.LIZ, c51589KMn.LIZ) && o.LJ(this.LIZIZ, c51589KMn.LIZIZ) && o.LJ(this.LIZJ, c51589KMn.LIZJ) && o.LJ(this.LIZLLL, c51589KMn.LIZLLL) && o.LJ(this.LJ, c51589KMn.LJ) && this.LJFF == c51589KMn.LJFF && o.LJ(this.LJI, c51589KMn.LJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<CardContent> list = this.LIZJ;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        CardContent cardContent = this.LIZLLL;
        int hashCode4 = (hashCode3 + (cardContent == null ? 0 : cardContent.hashCode())) * 31;
        String str3 = this.LJ;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z = this.LJFF;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode5 + i) * 31;
        Integer num = this.LJI;
        return i2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EffectRecommendationCarouselState(titleText=");
        LIZ.append(this.LIZ);
        LIZ.append(", actionButtonText=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", effects=");
        LIZ.append(this.LIZJ);
        LIZ.append(", currentEffect=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", cardMaterialKey=");
        LIZ.append(this.LJ);
        LIZ.append(", isNetworkError=");
        LIZ.append(this.LJFF);
        LIZ.append(", currentPosition=");
        return s0.LIZJ(LIZ, this.LJI, ')', LIZ);
    }

    public /* synthetic */ C51589KMn(int i) {
        this(null, null, null, null, null, false, 0);
    }

    public C51589KMn(String str, String str2, List<CardContent> list, CardContent cardContent, String str3, boolean z, Integer num) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = list;
        this.LIZLLL = cardContent;
        this.LJ = str3;
        this.LJFF = z;
        this.LJI = num;
    }

    public static C51589KMn LIZ(C51589KMn c51589KMn, String str, String str2, List list, String str3, boolean z, Integer num, int i) {
        CardContent cardContent;
        Integer num2 = num;
        boolean z2 = z;
        String str4 = str3;
        List list2 = list;
        String str5 = str;
        String str6 = str2;
        if ((i & 1) != 0) {
            str5 = c51589KMn.LIZ;
        }
        if ((i & 2) != 0) {
            str6 = c51589KMn.LIZIZ;
        }
        if ((i & 4) != 0) {
            list2 = c51589KMn.LIZJ;
        }
        if ((i & 8) != 0) {
            cardContent = c51589KMn.LIZLLL;
        } else {
            cardContent = null;
        }
        if ((i & 16) != 0) {
            str4 = c51589KMn.LJ;
        }
        if ((i & 32) != 0) {
            z2 = c51589KMn.LJFF;
        }
        if ((i & 64) != 0) {
            num2 = c51589KMn.LJI;
        }
        return new C51589KMn(str5, str6, list2, cardContent, str4, z2, num2);
    }
}
