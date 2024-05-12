package X;

import com.ss.android.ugc.gamora.editor.sticker.donation.model.MatchDonationText;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationModel;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationSearchResultModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Grf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42843Grf {
    public final String LIZ;
    public final boolean LIZIZ;
    public final List<OrganizationSearchResultModel> LIZJ;
    public final List<OrganizationModel> LIZLLL;
    public final String LJ;
    public final MatchDonationText LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;

    public C42843Grf() {
        this(null, false, null, null, null, null, false, false, false, false, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42843Grf)) {
            return false;
        }
        C42843Grf c42843Grf = (C42843Grf) obj;
        return o.LJ(this.LIZ, c42843Grf.LIZ) && this.LIZIZ == c42843Grf.LIZIZ && o.LJ(this.LIZJ, c42843Grf.LIZJ) && o.LJ(this.LIZLLL, c42843Grf.LIZLLL) && o.LJ(this.LJ, c42843Grf.LJ) && o.LJ(this.LJFF, c42843Grf.LJFF) && this.LJI == c42843Grf.LJI && this.LJII == c42843Grf.LJII && this.LJIIIIZZ == c42843Grf.LJIIIIZZ && this.LJIIIZ == c42843Grf.LJIIIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        List<OrganizationSearchResultModel> list = this.LIZJ;
        int hashCode2 = (i2 + (list == null ? 0 : list.hashCode())) * 31;
        List<OrganizationModel> list2 = this.LIZLLL;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.LJ;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MatchDonationText matchDonationText = this.LJFF;
        int hashCode5 = (hashCode4 + (matchDonationText != null ? matchDonationText.hashCode() : 0)) * 31;
        boolean z2 = this.LJI;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode5 + i3) * 31;
        boolean z3 = this.LJII;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.LJIIIIZZ;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        return ((i6 + i7) * 31) + (this.LJIIIZ ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Result(searchKeyword=");
        LIZ.append(this.LIZ);
        LIZ.append(", isSearchRequest=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", searchData=");
        LIZ.append(this.LIZJ);
        LIZ.append(", data=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", poweredByUrl=");
        LIZ.append(this.LJ);
        LIZ.append(", matchDonationText=");
        LIZ.append(this.LJFF);
        LIZ.append(", isLoading=");
        LIZ.append(this.LJI);
        LIZ.append(", loadSuccess=");
        LIZ.append(this.LJII);
        LIZ.append(", isLoadMore=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", hasMore=");
        return C48339Iy7.LIZJ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public C42843Grf(String str, boolean z, List list, List list2, String str2, MatchDonationText matchDonationText, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        str = (i & 1) != 0 ? null : str;
        z = (i & 2) != 0 ? false : z;
        list = (i & 4) != 0 ? null : list;
        list2 = (i & 8) != 0 ? null : list2;
        str2 = (i & 16) != 0 ? null : str2;
        matchDonationText = (i & 32) != 0 ? null : matchDonationText;
        z2 = (i & 64) != 0 ? true : z2;
        z3 = (i & 128) != 0 ? false : z3;
        z4 = (i & 256) != 0 ? false : z4;
        z5 = (i & 512) != 0 ? false : z5;
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = list;
        this.LIZLLL = list2;
        this.LJ = str2;
        this.LJFF = matchDonationText;
        this.LJI = z2;
        this.LJII = z3;
        this.LJIIIIZZ = z4;
        this.LJIIIZ = z5;
    }
}
