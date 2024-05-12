package X;

import com.ss.android.ugc.aweme.commerce.tools.tcm.TCMPostPageSubmitTextModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.GOv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41457GOv {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final String LJII;
    public final TCMPostPageSubmitTextModel LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41457GOv)) {
            return false;
        }
        C41457GOv c41457GOv = (C41457GOv) obj;
        return o.LJ(this.LIZ, c41457GOv.LIZ) && o.LJ(this.LIZIZ, c41457GOv.LIZIZ) && o.LJ(this.LIZJ, c41457GOv.LIZJ) && o.LJ(this.LIZLLL, c41457GOv.LIZLLL) && this.LJ == c41457GOv.LJ && this.LJFF == c41457GOv.LJFF && this.LJI == c41457GOv.LJI && o.LJ(this.LJII, c41457GOv.LJII) && o.LJ(this.LJIIIIZZ, c41457GOv.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PageModel(brandedContentType=");
        LIZ.append(this.LIZ);
        LIZ.append(", brandOrganicType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", campaignInfo=");
        LIZ.append(this.LIZJ);
        LIZ.append(", tcmParams=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", adsOnly=");
        LIZ.append(this.LJ);
        LIZ.append(", adsAuthorization=");
        LIZ.append(this.LJFF);
        LIZ.append(", isAccountAdSettingsOpen=");
        LIZ.append(this.LJI);
        LIZ.append(", deliverableId=");
        LIZ.append(this.LJII);
        LIZ.append(", submitText=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C41457GOv() {
        this(CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, null, null, false, false, false, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        String str = this.LIZJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.LIZLLL;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        boolean z = this.LJ;
        int i4 = 1;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int i6 = (i3 + i5) * 31;
        boolean z2 = this.LJFF;
        int i7 = z2;
        if (z2 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        if (!this.LJI) {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str3 = this.LJII;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i10 = (i9 + hashCode3) * 31;
        TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel = this.LJIIIIZZ;
        if (tCMPostPageSubmitTextModel != null) {
            i = tCMPostPageSubmitTextModel.hashCode();
        }
        return i10 + i;
    }

    public C41457GOv(String brandedContentType, String brandOrganicType, String str, String str2, boolean z, boolean z2, boolean z3, String str3, TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel) {
        o.LJIIIZ(brandedContentType, "brandedContentType");
        o.LJIIIZ(brandOrganicType, "brandOrganicType");
        this.LIZ = brandedContentType;
        this.LIZIZ = brandOrganicType;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = z3;
        this.LJII = str3;
        this.LJIIIIZZ = tCMPostPageSubmitTextModel;
    }
}
