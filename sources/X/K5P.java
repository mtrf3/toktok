package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K5P implements Serializable {
    public KBA LJLIL;
    public boolean LJLILLLLZI;
    public String LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public String LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;
    public final String LJLJLLL;
    public final String LJLL;
    public final String LJLLI;
    public final String LJLLILLLL;
    public final String LJLLJ;
    public final String LJLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public K5P() {
        /*
            r17 = this;
            r1 = 0
            r2 = 0
            r15 = 16383(0x3fff, float:2.2957E-41)
            r0 = r17
            r3 = r1
            r4 = r2
            r5 = r2
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r1
            r13 = r1
            r14 = r1
            r16 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K5P.<init>():void");
    }

    public static /* synthetic */ K5P copy$default(K5P k5p, KBA kba, boolean z, String str, boolean z2, boolean z3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        KBA kba2 = kba;
        boolean z4 = z;
        String str11 = str;
        boolean z5 = z2;
        boolean z6 = z3;
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        String str16 = str6;
        String str17 = str7;
        String str18 = str8;
        String str19 = str9;
        String str20 = str10;
        if ((i & 1) != 0) {
            kba2 = k5p.LJLIL;
        }
        if ((i & 2) != 0) {
            z4 = k5p.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str11 = k5p.LJLJI;
        }
        if ((i & 8) != 0) {
            z5 = k5p.LJLJJI;
        }
        if ((i & 16) != 0) {
            z6 = k5p.LJLJJL;
        }
        if ((i & 32) != 0) {
            str12 = k5p.LJLJJLL;
        }
        if ((i & 64) != 0) {
            str13 = k5p.LJLJL;
        }
        if ((i & 128) != 0) {
            str14 = k5p.LJLJLJ;
        }
        if ((i & 256) != 0) {
            str15 = k5p.LJLJLLL;
        }
        if ((i & 512) != 0) {
            str16 = k5p.LJLL;
        }
        if ((i & 1024) != 0) {
            str17 = k5p.LJLLI;
        }
        if ((i & 2048) != 0) {
            str18 = k5p.LJLLILLLL;
        }
        if ((i & 4096) != 0) {
            str19 = k5p.LJLLJ;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str20 = k5p.LJLLL;
        }
        return k5p.copy(kba2, z4, str11, z5, z6, str12, str13, str14, str15, str16, str17, str18, str19, str20);
    }

    public final K5P copy(KBA kba, boolean z, String str, boolean z2, boolean z3, String str2, String hintWord, String hintCouponInfo, String promotionInfo, String hintWordId, String str3, String singleTabType, String str4, String str5) {
        o.LJIIIZ(hintWord, "hintWord");
        o.LJIIIZ(hintCouponInfo, "hintCouponInfo");
        o.LJIIIZ(promotionInfo, "promotionInfo");
        o.LJIIIZ(hintWordId, "hintWordId");
        o.LJIIIZ(singleTabType, "singleTabType");
        return new K5P(kba, z, str, z2, z3, str2, hintWord, hintCouponInfo, promotionInfo, hintWordId, str3, singleTabType, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K5P)) {
            return false;
        }
        K5P k5p = (K5P) obj;
        return o.LJ(this.LJLIL, k5p.LJLIL) && this.LJLILLLLZI == k5p.LJLILLLLZI && o.LJ(this.LJLJI, k5p.LJLJI) && this.LJLJJI == k5p.LJLJJI && this.LJLJJL == k5p.LJLJJL && o.LJ(this.LJLJJLL, k5p.LJLJJLL) && o.LJ(this.LJLJL, k5p.LJLJL) && o.LJ(this.LJLJLJ, k5p.LJLJLJ) && o.LJ(this.LJLJLLL, k5p.LJLJLLL) && o.LJ(this.LJLL, k5p.LJLL) && o.LJ(this.LJLLI, k5p.LJLLI) && o.LJ(this.LJLLILLLL, k5p.LJLLILLLL) && o.LJ(this.LJLLJ, k5p.LJLLJ) && o.LJ(this.LJLLL, k5p.LJLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        KBA kba = this.LJLIL;
        int i = 0;
        if (kba == null) {
            hashCode = 0;
        } else {
            hashCode = kba.hashCode();
        }
        int i2 = hashCode * 31;
        boolean z = this.LJLILLLLZI;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (i2 + i4) * 31;
        String str = this.LJLJI;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        boolean z2 = this.LJLJJI;
        int i7 = z2;
        if (z2 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        if (!this.LJLJJL) {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        String str2 = this.LJLJJLL;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJLL, C79062V1e.LJ(this.LJLJLLL, C79062V1e.LJ(this.LJLJLJ, C79062V1e.LJ(this.LJLJL, (i9 + hashCode3) * 31, 31), 31), 31), 31);
        String str3 = this.LJLLI;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.LJLLILLLL, (LJ + hashCode4) * 31, 31);
        String str4 = this.LJLLJ;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i10 = (LJ2 + hashCode5) * 31;
        String str5 = this.LJLLL;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i10 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SearchEcommerceModel(deepLinkEcParams=");
        sb.append(this.LJLIL);
        sb.append(", isFromMallUGDeepLink=");
        sb.append(this.LJLILLLLZI);
        sb.append(", backToPage=");
        sb.append(this.LJLJI);
        sb.append(", isExistMallTab=");
        sb.append(this.LJLJJI);
        sb.append(", needBackToPage=");
        sb.append(this.LJLJJL);
        sb.append(", pageSchema=");
        sb.append(this.LJLJJLL);
        sb.append(", hintWord=");
        sb.append(this.LJLJL);
        sb.append(", hintCouponInfo=");
        sb.append(this.LJLJLJ);
        sb.append(", promotionInfo=");
        sb.append(this.LJLJLLL);
        sb.append(", hintWordId=");
        sb.append(this.LJLL);
        sb.append(", defaultHintWord=");
        sb.append(this.LJLLI);
        sb.append(", singleTabType=");
        sb.append(this.LJLLILLLL);
        sb.append(", sourceProductId=");
        sb.append(this.LJLLJ);
        sb.append(", clickRecomSearchEntrance=");
        return C07670Rv.LIZIZ(sb, this.LJLLL, ')');
    }

    public final String getBackToPage() {
        return this.LJLJI;
    }

    public final String getClickRecomSearchEntrance() {
        return this.LJLLL;
    }

    public final KBA getDeepLinkEcParams() {
        return this.LJLIL;
    }

    public final String getDefaultHintWord() {
        return this.LJLLI;
    }

    public final String getHintCouponInfo() {
        return this.LJLJLJ;
    }

    public final String getHintWord() {
        return this.LJLJL;
    }

    public final String getHintWordId() {
        return this.LJLL;
    }

    public final boolean getNeedBackToPage() {
        return this.LJLJJL;
    }

    public final String getPageSchema() {
        return this.LJLJJLL;
    }

    public final String getPromotionInfo() {
        return this.LJLJLLL;
    }

    public final String getSingleTabType() {
        return this.LJLLILLLL;
    }

    public final String getSourceProductId() {
        return this.LJLLJ;
    }

    public final boolean isExistMallTab() {
        return this.LJLJJI;
    }

    public final boolean isFromMallUGDeepLink() {
        return this.LJLILLLLZI;
    }

    public final void setBackToPage(String str) {
        this.LJLJI = str;
    }

    public final void setDeepLinkEcParams(KBA kba) {
        this.LJLIL = kba;
    }

    public final void setExistMallTab(boolean z) {
        this.LJLJJI = z;
    }

    public final void setFromMallUGDeepLink(boolean z) {
        this.LJLILLLLZI = z;
    }

    public final void setNeedBackToPage(boolean z) {
        this.LJLJJL = z;
    }

    public final void setPageSchema(String str) {
        this.LJLJJLL = str;
    }

    public K5P(KBA kba, boolean z, String str, boolean z2, boolean z3, String str2, String hintWord, String hintCouponInfo, String promotionInfo, String hintWordId, String str3, String singleTabType, String str4, String str5) {
        o.LJIIIZ(hintWord, "hintWord");
        o.LJIIIZ(hintCouponInfo, "hintCouponInfo");
        o.LJIIIZ(promotionInfo, "promotionInfo");
        o.LJIIIZ(hintWordId, "hintWordId");
        o.LJIIIZ(singleTabType, "singleTabType");
        this.LJLIL = kba;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
        this.LJLJJI = z2;
        this.LJLJJL = z3;
        this.LJLJJLL = str2;
        this.LJLJL = hintWord;
        this.LJLJLJ = hintCouponInfo;
        this.LJLJLLL = promotionInfo;
        this.LJLL = hintWordId;
        this.LJLLI = str3;
        this.LJLLILLLL = singleTabType;
        this.LJLLJ = str4;
        this.LJLLL = str5;
    }

    public /* synthetic */ K5P(KBA kba, boolean z, String str, boolean z2, boolean z3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new KBA(null, null, null, null, null, 31, null) : kba, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? false : z2, (i & 16) == 0 ? z3 : false, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? null : str7, (i & 2048) == 0 ? str8 : "", (i & 4096) != 0 ? null : str9, (i & FileUtils.BUFFER_SIZE) == 0 ? str10 : null);
    }
}
