package X;

import com.ss.android.ugc.aweme.badge.EditProfileBadgeCampaignModel;
import com.ss.android.ugc.aweme.badge.EditProfileBadgeModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Dyc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35630Dyc {
    public final Integer LIZ;
    public final String LIZIZ;
    public final List<EditProfileBadgeModel> LIZJ;
    public final EditProfileBadgeCampaignModel LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public C35630Dyc() {
        this(null, false, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35630Dyc)) {
            return false;
        }
        C35630Dyc c35630Dyc = (C35630Dyc) obj;
        return o.LJ(this.LIZ, c35630Dyc.LIZ) && o.LJ(this.LIZIZ, c35630Dyc.LIZIZ) && o.LJ(this.LIZJ, c35630Dyc.LIZJ) && o.LJ(this.LIZLLL, c35630Dyc.LIZLLL) && this.LJ == c35630Dyc.LJ && this.LJFF == c35630Dyc.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<EditProfileBadgeModel> list = this.LIZJ;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        EditProfileBadgeCampaignModel editProfileBadgeCampaignModel = this.LIZLLL;
        int hashCode4 = (hashCode3 + (editProfileBadgeCampaignModel != null ? editProfileBadgeCampaignModel.hashCode() : 0)) * 31;
        boolean z = this.LJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode4 + i) * 31) + (this.LJFF ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Result(statusCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", statusMsg=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", data=");
        LIZ.append(this.LIZJ);
        LIZ.append(", campaign=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isLoading=");
        LIZ.append(this.LJ);
        LIZ.append(", loadSuccess=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public /* synthetic */ C35630Dyc(List list, boolean z, int i) {
        this(null, null, (i & 4) != 0 ? null : list, null, (i & 16) != 0 ? true : z, false);
    }

    public C35630Dyc(Integer num, String str, List<EditProfileBadgeModel> list, EditProfileBadgeCampaignModel editProfileBadgeCampaignModel, boolean z, boolean z2) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = editProfileBadgeCampaignModel;
        this.LJ = z;
        this.LJFF = z2;
    }
}
