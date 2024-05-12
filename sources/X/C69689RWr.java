package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DeductibleVoucherReminder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WaistBanner;
import kotlin.jvm.internal.o;

/* renamed from: X.RWr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69689RWr {
    public final String LIZ;
    public final FlashSale LIZIZ;
    public final WaistBanner LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final RV8 LJII;
    public final PickTag LJIIIIZZ;
    public final AbstractC70489RlV LJIIIZ;
    public final DeductibleVoucherReminder LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69689RWr)) {
            return false;
        }
        C69689RWr c69689RWr = (C69689RWr) obj;
        return o.LJ(this.LIZ, c69689RWr.LIZ) && o.LJ(this.LIZIZ, c69689RWr.LIZIZ) && o.LJ(this.LIZJ, c69689RWr.LIZJ) && this.LIZLLL == c69689RWr.LIZLLL && o.LJ(this.LJ, c69689RWr.LJ) && o.LJ(this.LJFF, c69689RWr.LJFF) && o.LJ(this.LJI, c69689RWr.LJI) && o.LJ(this.LJII, c69689RWr.LJII) && o.LJ(this.LJIIIIZZ, c69689RWr.LJIIIIZZ) && o.LJ(this.LJIIIZ, c69689RWr.LJIIIZ) && o.LJ(this.LJIIJ, c69689RWr.LJIIJ) && o.LJ(this.LJIIJJI, c69689RWr.LJIIJJI) && o.LJ(this.LJIIL, c69689RWr.LJIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        String str = this.LIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        FlashSale flashSale = this.LIZIZ;
        if (flashSale == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = flashSale.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        WaistBanner waistBanner = this.LIZJ;
        if (waistBanner == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = waistBanner.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        boolean z = this.LIZLLL;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int LJ = C79062V1e.LJ(this.LJI, C79062V1e.LJ(this.LJFF, C79062V1e.LJ(this.LJ, (i4 + i5) * 31, 31), 31), 31);
        RV8 rv8 = this.LJII;
        if (rv8 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = rv8.hashCode();
        }
        int i6 = (LJ + hashCode4) * 31;
        PickTag pickTag = this.LJIIIIZZ;
        if (pickTag == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = pickTag.hashCode();
        }
        int hashCode7 = (this.LJIIIZ.hashCode() + ((i6 + hashCode5) * 31)) * 31;
        DeductibleVoucherReminder deductibleVoucherReminder = this.LJIIJ;
        if (deductibleVoucherReminder == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = deductibleVoucherReminder.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.LJIIJJI, (hashCode7 + hashCode6) * 31, 31);
        String str2 = this.LJIIL;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return LJ2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WaistInfoVO(productId=");
        sb.append(this.LIZ);
        sb.append(", flashSale=");
        sb.append(this.LIZIZ);
        sb.append(", waistBanner=");
        sb.append(this.LIZJ);
        sb.append(", isIntervalPrice=");
        sb.append(this.LIZLLL);
        sb.append(", originPrice=");
        sb.append(this.LJ);
        sb.append(", realPrice=");
        sb.append(this.LJFF);
        sb.append(", discount=");
        sb.append(this.LJI);
        sb.append(", reminderVO=");
        sb.append(this.LJII);
        sb.append(", activityInfo=");
        sb.append(this.LJIIIIZZ);
        sb.append(", style=");
        sb.append(this.LJIIIZ);
        sb.append(", voucherReminder=");
        sb.append(this.LJIIJ);
        sb.append(", isSoldOut=");
        sb.append(this.LJIIJJI);
        sb.append(", pricePanelSchema=");
        return C07670Rv.LIZIZ(sb, this.LJIIL, ')');
    }

    public C69689RWr(String str, FlashSale flashSale, WaistBanner waistBanner, boolean z, String str2, String str3, String str4, RV8 rv8, PickTag pickTag, AbstractC70489RlV abstractC70489RlV, DeductibleVoucherReminder deductibleVoucherReminder, String str5, String str6) {
        this.LIZ = str;
        this.LIZIZ = flashSale;
        this.LIZJ = waistBanner;
        this.LIZLLL = z;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJII = rv8;
        this.LJIIIIZZ = pickTag;
        this.LJIIIZ = abstractC70489RlV;
        this.LJIIJ = deductibleVoucherReminder;
        this.LJIIJJI = str5;
        this.LJIIL = str6;
    }
}
