package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderAvailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PhoneCredit;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ai9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26965Ai9 {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final List<LogisticDTO> LIZLLL;
    public final LogisticDTO LJ;
    public final boolean LJFF;
    public final String LJI;
    public final List<C27959AyB> LJII;
    public final String LJIIIIZZ;
    public final Integer LJIIIZ;
    public final PhoneCredit LJIIJ;
    public final WarehouseTag LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final MainOrderAvailableInfo LJIILJJIL;
    public C26804AfY LJIILL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26965Ai9)) {
            return false;
        }
        C26965Ai9 c26965Ai9 = (C26965Ai9) obj;
        return o.LJ(this.LIZ, c26965Ai9.LIZ) && o.LJ(this.LIZIZ, c26965Ai9.LIZIZ) && this.LIZJ == c26965Ai9.LIZJ && o.LJ(this.LIZLLL, c26965Ai9.LIZLLL) && o.LJ(this.LJ, c26965Ai9.LJ) && this.LJFF == c26965Ai9.LJFF && o.LJ(this.LJI, c26965Ai9.LJI) && o.LJ(this.LJII, c26965Ai9.LJII) && o.LJ(this.LJIIIIZZ, c26965Ai9.LJIIIIZZ) && o.LJ(this.LJIIIZ, c26965Ai9.LJIIIZ) && o.LJ(this.LJIIJ, c26965Ai9.LJIIJ) && o.LJ(this.LJIIJJI, c26965Ai9.LJIIJJI) && o.LJ(this.LJIIL, c26965Ai9.LJIIL) && o.LJ(this.LJIILIIL, c26965Ai9.LJIILIIL) && o.LJ(this.LJIILJJIL, c26965Ai9.LJIILJJIL);
    }

    public final String toString() {
        return "MainOrderInfoVO(sellerId=" + this.LIZ + ", warehouseId=" + this.LIZIZ + ", hasAddress=" + this.LIZJ + ", logistics=" + this.LIZLLL + ", selectedLogistic=" + this.LJ + ", reachable=" + this.LJFF + ", unreachableReason=" + this.LJI + ", skuInfos=" + this.LJII + ", showTopSellerDiscount=" + this.LJIIIIZZ + ", productType=" + this.LJIIIZ + ", phoneCredit=" + this.LJIIJ + ", warehouseTag=" + this.LJIIJJI + ", shippingTitle=" + this.LJIIL + ", mainOrderId=" + this.LJIILIIL + ", availableInfo=" + this.LJIILJJIL + ')';
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
        String str = this.LIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.LIZIZ;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        boolean z = this.LIZJ;
        int i4 = 1;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int i6 = (i3 + i5) * 31;
        List<LogisticDTO> list = this.LIZLLL;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        LogisticDTO logisticDTO = this.LJ;
        if (logisticDTO == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = logisticDTO.hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        if (!this.LJFF) {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str3 = this.LJI;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJII, (i9 + hashCode5) * 31, 31);
        String str4 = this.LJIIIIZZ;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i10 = (LIZIZ + hashCode6) * 31;
        Integer num = this.LJIIIZ;
        if (num == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num.hashCode();
        }
        int i11 = (i10 + hashCode7) * 31;
        PhoneCredit phoneCredit = this.LJIIJ;
        if (phoneCredit == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = phoneCredit.hashCode();
        }
        int i12 = (i11 + hashCode8) * 31;
        WarehouseTag warehouseTag = this.LJIIJJI;
        if (warehouseTag == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = warehouseTag.hashCode();
        }
        int i13 = (i12 + hashCode9) * 31;
        String str5 = this.LJIIL;
        if (str5 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str5.hashCode();
        }
        int i14 = (i13 + hashCode10) * 31;
        String str6 = this.LJIILIIL;
        if (str6 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str6.hashCode();
        }
        int i15 = (i14 + hashCode11) * 31;
        MainOrderAvailableInfo mainOrderAvailableInfo = this.LJIILJJIL;
        if (mainOrderAvailableInfo != null) {
            i = mainOrderAvailableInfo.hashCode();
        }
        return i15 + i;
    }

    public C26965Ai9(String str, String str2, boolean z, List<LogisticDTO> list, LogisticDTO logisticDTO, boolean z2, String str3, List<C27959AyB> skuInfos, String str4, Integer num, PhoneCredit phoneCredit, WarehouseTag warehouseTag, String str5, String str6, MainOrderAvailableInfo mainOrderAvailableInfo) {
        o.LJIIIZ(skuInfos, "skuInfos");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = list;
        this.LJ = logisticDTO;
        this.LJFF = z2;
        this.LJI = str3;
        this.LJII = skuInfos;
        this.LJIIIIZZ = str4;
        this.LJIIIZ = num;
        this.LJIIJ = phoneCredit;
        this.LJIIJJI = warehouseTag;
        this.LJIIL = str5;
        this.LJIILIIL = str6;
        this.LJIILJJIL = mainOrderAvailableInfo;
    }
}
