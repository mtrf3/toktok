package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ArW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27546ArW implements InterfaceC27632Asu {
    public final String LJLIL;
    public final Image LJLILLLLZI;
    public final String LJLJI;
    public final Long LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final StoreOfficialLabel LJLJLJ;
    public final boolean LJLJLLL;
    public final List<SellerDetailInfo> LJLL;
    public final Integer LJLLI;
    public final Integer LJLLILLLL;
    public final Boolean LJLLJ;
    public final String LJLLL;
    public final SellerSellingPoint LJLLLL;
    public final int LJLLLLLL = EnumC27721AuL.SELLER_INFO.getValue();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27546ArW)) {
            return false;
        }
        C27546ArW c27546ArW = (C27546ArW) obj;
        return o.LJ(this.LJLIL, c27546ArW.LJLIL) && o.LJ(this.LJLILLLLZI, c27546ArW.LJLILLLLZI) && o.LJ(this.LJLJI, c27546ArW.LJLJI) && o.LJ(this.LJLJJI, c27546ArW.LJLJJI) && o.LJ(this.LJLJJL, c27546ArW.LJLJJL) && o.LJ(this.LJLJJLL, c27546ArW.LJLJJLL) && o.LJ(this.LJLJL, c27546ArW.LJLJL) && o.LJ(this.LJLJLJ, c27546ArW.LJLJLJ) && this.LJLJLLL == c27546ArW.LJLJLLL && o.LJ(this.LJLL, c27546ArW.LJLL) && o.LJ(this.LJLLI, c27546ArW.LJLLI) && o.LJ(this.LJLLILLLL, c27546ArW.LJLLILLLL) && o.LJ(this.LJLLJ, c27546ArW.LJLLJ) && o.LJ(this.LJLLL, c27546ArW.LJLLL) && o.LJ(this.LJLLLL, c27546ArW.LJLLLL);
    }

    @Override // X.InterfaceC27632Asu
    public final BrickStyle m() {
        return null;
    }

    public final String toString() {
        return "ShopProfileVO(seller=" + this.LJLIL + ", shopImage=" + this.LJLILLLLZI + ", shopName=" + this.LJLJI + ", shopCount=" + this.LJLJJI + ", shopRate=" + this.LJLJJL + ", link=" + this.LJLJJLL + ", shopLink=" + this.LJLJL + ", officialLabel=" + this.LJLJLJ + ", hasDivider=" + this.LJLJLLL + ", shopDetailInfos=" + this.LJLL + ", ratingPercentile=" + this.LJLLI + ", ratingStyle=" + this.LJLLILLLL + ", ratingShowNA=" + this.LJLLJ + ", sloganText=" + this.LJLLL + ", sellerSellingPoint=" + this.LJLLLL + ')';
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
        String str = this.LJLIL;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Image image = this.LJLILLLLZI;
        if (image == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = image.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJLJI, (i2 + hashCode2) * 31, 31);
        Long l = this.LJLJJI;
        if (l == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.LJLJJLL, C79062V1e.LJ(this.LJLJJL, (LJ + hashCode3) * 31, 31), 31);
        String str2 = this.LJLJL;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i3 = (LJ2 + hashCode4) * 31;
        StoreOfficialLabel storeOfficialLabel = this.LJLJLJ;
        if (storeOfficialLabel == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = storeOfficialLabel.hashCode();
        }
        int i4 = (i3 + hashCode5) * 31;
        boolean z = this.LJLJLLL;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        List<SellerDetailInfo> list = this.LJLL;
        if (list == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Integer num = this.LJLLI;
        if (num == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        Integer num2 = this.LJLLILLLL;
        if (num2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num2.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        Boolean bool = this.LJLLJ;
        if (bool == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = bool.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        String str3 = this.LJLLL;
        if (str3 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str3.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        SellerSellingPoint sellerSellingPoint = this.LJLLLL;
        if (sellerSellingPoint != null) {
            i = sellerSellingPoint.hashCode();
        }
        return i11 + i;
    }

    @Override // X.InterfaceC27632Asu
    public final int getBrickName() {
        return this.LJLLLLLL;
    }

    public C27546ArW(String str, Image image, String str2, Long l, String str3, String str4, String str5, StoreOfficialLabel storeOfficialLabel, boolean z, List<SellerDetailInfo> list, Integer num, Integer num2, Boolean bool, String str6, SellerSellingPoint sellerSellingPoint) {
        this.LJLIL = str;
        this.LJLILLLLZI = image;
        this.LJLJI = str2;
        this.LJLJJI = l;
        this.LJLJJL = str3;
        this.LJLJJLL = str4;
        this.LJLJL = str5;
        this.LJLJLJ = storeOfficialLabel;
        this.LJLJLLL = z;
        this.LJLL = list;
        this.LJLLI = num;
        this.LJLLILLLL = num2;
        this.LJLLJ = bool;
        this.LJLLL = str6;
        this.LJLLLL = sellerSellingPoint;
    }
}
