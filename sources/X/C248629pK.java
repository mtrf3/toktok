package X;

import com.ss.android.ugc.aweme.model.Price;
import com.ss.android.ugc.aweme.model.PricesResponse;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.9pK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C248629pK implements C33Q {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final Price LJLJJI;
    public final Price LJLJJL;
    public final boolean LJLJJLL;
    public final C248559pD LJLJL;
    public final String LJLJLJ;
    public final String LJLJLLL;
    public final String LJLL;
    public final C248559pD LJLLI;
    public final String LJLLILLLL;
    public final boolean LJLLJ;
    public final boolean LJLLL;
    public final PricesResponse LJLLLL;
    public final C43I<C76800UCe> LJLLLLLL;
    public final AbstractC72932td<String> LJLZ;
    public final AbstractC72932td<C76800UCe> LJZ;
    public final EnumC248719pT LJZI;
    public final String LJZL;
    public final String LL;

    public C248629pK() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C248629pK)) {
            return false;
        }
        C248629pK c248629pK = (C248629pK) obj;
        return o.LJ(this.LJLIL, c248629pK.LJLIL) && o.LJ(this.LJLILLLLZI, c248629pK.LJLILLLLZI) && o.LJ(this.LJLJI, c248629pK.LJLJI) && o.LJ(this.LJLJJI, c248629pK.LJLJJI) && o.LJ(this.LJLJJL, c248629pK.LJLJJL) && this.LJLJJLL == c248629pK.LJLJJLL && o.LJ(this.LJLJL, c248629pK.LJLJL) && o.LJ(this.LJLJLJ, c248629pK.LJLJLJ) && o.LJ(this.LJLJLLL, c248629pK.LJLJLLL) && o.LJ(this.LJLL, c248629pK.LJLL) && o.LJ(this.LJLLI, c248629pK.LJLLI) && o.LJ(this.LJLLILLLL, c248629pK.LJLLILLLL) && this.LJLLJ == c248629pK.LJLLJ && this.LJLLL == c248629pK.LJLLL && o.LJ(this.LJLLLL, c248629pK.LJLLLL) && o.LJ(this.LJLLLLLL, c248629pK.LJLLLLLL) && o.LJ(this.LJLZ, c248629pK.LJLZ) && o.LJ(this.LJZ, c248629pK.LJZ) && this.LJZI == c248629pK.LJZI && o.LJ(this.LJZL, c248629pK.LJZL) && o.LJ(this.LL, c248629pK.LL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        String str = this.LJLIL;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.LJLILLLLZI;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.LJLJI;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Price price = this.LJLJJI;
        if (price == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = price.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Price price2 = this.LJLJJL;
        if (price2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = price2.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        boolean z = this.LJLJJLL;
        int i7 = 1;
        int i8 = z;
        if (z != 0) {
            i8 = 1;
        }
        int i9 = (i6 + i8) * 31;
        C248559pD c248559pD = this.LJLJL;
        if (c248559pD == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = c248559pD.hashCode();
        }
        int i10 = (i9 + hashCode6) * 31;
        String str4 = this.LJLJLJ;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int i11 = (i10 + hashCode7) * 31;
        String str5 = this.LJLJLLL;
        if (str5 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str5.hashCode();
        }
        int i12 = (i11 + hashCode8) * 31;
        String str6 = this.LJLL;
        if (str6 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str6.hashCode();
        }
        int i13 = (i12 + hashCode9) * 31;
        C248559pD c248559pD2 = this.LJLLI;
        if (c248559pD2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = c248559pD2.hashCode();
        }
        int i14 = (i13 + hashCode10) * 31;
        String str7 = this.LJLLILLLL;
        if (str7 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str7.hashCode();
        }
        int i15 = (i14 + hashCode11) * 31;
        boolean z2 = this.LJLLJ;
        int i16 = z2;
        if (z2 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        if (!this.LJLLL) {
            i7 = 0;
        }
        int i18 = (i17 + i7) * 31;
        PricesResponse pricesResponse = this.LJLLLL;
        if (pricesResponse == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = pricesResponse.hashCode();
        }
        int i19 = (i18 + hashCode12) * 31;
        C43I<C76800UCe> c43i = this.LJLLLLLL;
        if (c43i == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = c43i.hashCode();
        }
        int LIZ = C03090Af.LIZ(this.LJZ, C03090Af.LIZ(this.LJLZ, (i19 + hashCode13) * 31, 31), 31);
        EnumC248719pT enumC248719pT = this.LJZI;
        if (enumC248719pT == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = enumC248719pT.hashCode();
        }
        int i20 = (LIZ + hashCode14) * 31;
        String str8 = this.LJZL;
        if (str8 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str8.hashCode();
        }
        int i21 = (i20 + hashCode15) * 31;
        String str9 = this.LL;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return i21 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeriesDraftState(collectionId=");
        sb.append(this.LJLIL);
        sb.append(", title=");
        sb.append(this.LJLILLLLZI);
        sb.append(", description=");
        sb.append(this.LJLJI);
        sb.append(", selectedPrice=");
        sb.append(this.LJLJJI);
        sb.append(", selectedDiscountPrice=");
        sb.append(this.LJLJJL);
        sb.append(", discountCheckmark=");
        sb.append(this.LJLJJLL);
        sb.append(", coverImageUri=");
        sb.append(this.LJLJL);
        sb.append(", originalTitle=");
        sb.append(this.LJLJLJ);
        sb.append(", originalDescription=");
        sb.append(this.LJLJLLL);
        sb.append(", originalSelectedPriceInUsd=");
        sb.append(this.LJLL);
        sb.append(", originalCoverImageUri=");
        sb.append(this.LJLLI);
        sb.append(", originalSelectedDiscountPriceInUsd=");
        sb.append(this.LJLLILLLL);
        sb.append(", isTitleTooLong=");
        sb.append(this.LJLLJ);
        sb.append(", isDescriptionTooLong=");
        sb.append(this.LJLLL);
        sb.append(", prices=");
        sb.append(this.LJLLLL);
        sb.append(", couldntSaveEvent=");
        sb.append(this.LJLLLLLL);
        sb.append(", manageCollectionResponse=");
        sb.append(this.LJLZ);
        sb.append(", collectionDetailResponse=");
        sb.append(this.LJZ);
        sb.append(", operation=");
        sb.append(this.LJZI);
        sb.append(", manageCollectionRouterUrl=");
        sb.append(this.LJZL);
        sb.append(", enterFrom=");
        return C07670Rv.LIZIZ(sb, this.LL, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C248629pK(int r25) {
        /*
            r24 = this;
            r3 = 0
            com.bytedance.keva.Keva r2 = X.C248639pL.LIZ
            java.lang.String r1 = "limited_time_discount_checkmark"
            r0 = 1
            boolean r8 = r2.getBoolean(r1, r0)
            r15 = 0
            X.33X r19 = X.C33X.LIZ
            r2 = r24
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r9 = r3
            r10 = r3
            r11 = r3
            r12 = r3
            r13 = r3
            r14 = r3
            r16 = r15
            r17 = r3
            r18 = r3
            r20 = r19
            r21 = r3
            r22 = r3
            r23 = r3
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C248629pK.<init>(int):void");
    }

    public C248629pK(String str, String str2, String str3, Price price, Price price2, boolean z, C248559pD c248559pD, String str4, String str5, String str6, C248559pD c248559pD2, String str7, boolean z2, boolean z3, PricesResponse pricesResponse, C43I<C76800UCe> c43i, AbstractC72932td<String> manageCollectionResponse, AbstractC72932td<C76800UCe> collectionDetailResponse, EnumC248719pT enumC248719pT, String str8, String str9) {
        o.LJIIIZ(manageCollectionResponse, "manageCollectionResponse");
        o.LJIIIZ(collectionDetailResponse, "collectionDetailResponse");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = price;
        this.LJLJJL = price2;
        this.LJLJJLL = z;
        this.LJLJL = c248559pD;
        this.LJLJLJ = str4;
        this.LJLJLLL = str5;
        this.LJLL = str6;
        this.LJLLI = c248559pD2;
        this.LJLLILLLL = str7;
        this.LJLLJ = z2;
        this.LJLLL = z3;
        this.LJLLLL = pricesResponse;
        this.LJLLLLLL = c43i;
        this.LJLZ = manageCollectionResponse;
        this.LJZ = collectionDetailResponse;
        this.LJZI = enumC248719pT;
        this.LJZL = str8;
        this.LL = str9;
    }

    public static C248629pK LIZ(C248629pK c248629pK, String str, String str2, String str3, Price price, Price price2, boolean z, C248559pD c248559pD, String str4, String str5, String str6, C248559pD c248559pD2, String str7, boolean z2, boolean z3, PricesResponse pricesResponse, C43I c43i, AbstractC72932td abstractC72932td, AbstractC72932td abstractC72932td2, EnumC248719pT enumC248719pT, String str8, String str9, int i) {
        String str10 = str9;
        EnumC248719pT enumC248719pT2 = enumC248719pT;
        AbstractC72932td collectionDetailResponse = abstractC72932td2;
        AbstractC72932td manageCollectionResponse = abstractC72932td;
        boolean z4 = z;
        String str11 = str8;
        C43I c43i2 = c43i;
        Price price3 = price2;
        Price price4 = price;
        String str12 = str3;
        String str13 = str;
        String str14 = str2;
        PricesResponse pricesResponse2 = pricesResponse;
        C248559pD c248559pD3 = c248559pD;
        String str15 = str4;
        String str16 = str6;
        String str17 = str5;
        String str18 = str7;
        C248559pD c248559pD4 = c248559pD2;
        boolean z5 = z2;
        boolean z6 = z3;
        if ((i & 1) != 0) {
            str13 = c248629pK.LJLIL;
        }
        if ((i & 2) != 0) {
            str14 = c248629pK.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str12 = c248629pK.LJLJI;
        }
        if ((i & 8) != 0) {
            price4 = c248629pK.LJLJJI;
        }
        if ((i & 16) != 0) {
            price3 = c248629pK.LJLJJL;
        }
        if ((i & 32) != 0) {
            z4 = c248629pK.LJLJJLL;
        }
        if ((i & 64) != 0) {
            c248559pD3 = c248629pK.LJLJL;
        }
        if ((i & 128) != 0) {
            str15 = c248629pK.LJLJLJ;
        }
        if ((i & 256) != 0) {
            str17 = c248629pK.LJLJLLL;
        }
        if ((i & 512) != 0) {
            str16 = c248629pK.LJLL;
        }
        if ((i & 1024) != 0) {
            c248559pD4 = c248629pK.LJLLI;
        }
        if ((i & 2048) != 0) {
            str18 = c248629pK.LJLLILLLL;
        }
        if ((i & 4096) != 0) {
            z5 = c248629pK.LJLLJ;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            z6 = c248629pK.LJLLL;
        }
        if ((i & 16384) != 0) {
            pricesResponse2 = c248629pK.LJLLLL;
        }
        if ((32768 & i) != 0) {
            c43i2 = c248629pK.LJLLLLLL;
        }
        if ((65536 & i) != 0) {
            manageCollectionResponse = c248629pK.LJLZ;
        }
        if ((131072 & i) != 0) {
            collectionDetailResponse = c248629pK.LJZ;
        }
        if ((262144 & i) != 0) {
            enumC248719pT2 = c248629pK.LJZI;
        }
        if ((524288 & i) != 0) {
            str11 = c248629pK.LJZL;
        }
        if ((i & 1048576) != 0) {
            str10 = c248629pK.LL;
        }
        c248629pK.getClass();
        o.LJIIIZ(manageCollectionResponse, "manageCollectionResponse");
        o.LJIIIZ(collectionDetailResponse, "collectionDetailResponse");
        C43I c43i3 = c43i2;
        AbstractC72932td abstractC72932td3 = manageCollectionResponse;
        AbstractC72932td abstractC72932td4 = collectionDetailResponse;
        EnumC248719pT enumC248719pT3 = enumC248719pT2;
        String str19 = str11;
        String str20 = str17;
        String str21 = str16;
        C248559pD c248559pD5 = c248559pD4;
        String str22 = str18;
        boolean z7 = z5;
        boolean z8 = z6;
        PricesResponse pricesResponse3 = pricesResponse2;
        return new C248629pK(str13, str14, str12, price4, price3, z4, c248559pD3, str15, str20, str21, c248559pD5, str22, z7, z8, pricesResponse3, c43i3, abstractC72932td3, abstractC72932td4, enumC248719pT3, str19, str10);
    }
}
