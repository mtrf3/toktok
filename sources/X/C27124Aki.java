package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticItem;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.SpendMoreForFree;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Aki, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27124Aki {
    public final Price LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;
    public final List<String> LJIIJ;
    public final String LJIIJJI;
    public final SpendMoreForFree LJIIL;
    public final java.util.Map<String, String> LJIILIIL;
    public final String LJIILJJIL;
    public final LogisticItem LJIILL;
    public final Integer LJIILLIIL;
    public final Integer LJIIZILJ;
    public final LogisticTextDTO LJIJ;
    public final WarehouseTag LJIJI;
    public final LogisticLinkRichText LJIJJ;
    public final List<LogisticLinkRichText> LJIJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27124Aki)) {
            return false;
        }
        C27124Aki c27124Aki = (C27124Aki) obj;
        return o.LJ(this.LIZ, c27124Aki.LIZ) && o.LJ(this.LIZIZ, c27124Aki.LIZIZ) && this.LIZJ == c27124Aki.LIZJ && this.LIZLLL == c27124Aki.LIZLLL && o.LJ(this.LJ, c27124Aki.LJ) && o.LJ(this.LJFF, c27124Aki.LJFF) && o.LJ(this.LJI, c27124Aki.LJI) && o.LJ(this.LJII, c27124Aki.LJII) && o.LJ(this.LJIIIIZZ, c27124Aki.LJIIIIZZ) && this.LJIIIZ == c27124Aki.LJIIIZ && o.LJ(this.LJIIJ, c27124Aki.LJIIJ) && o.LJ(this.LJIIJJI, c27124Aki.LJIIJJI) && o.LJ(this.LJIIL, c27124Aki.LJIIL) && o.LJ(this.LJIILIIL, c27124Aki.LJIILIIL) && o.LJ(this.LJIILJJIL, c27124Aki.LJIILJJIL) && o.LJ(this.LJIILL, c27124Aki.LJIILL) && o.LJ(this.LJIILLIIL, c27124Aki.LJIILLIIL) && o.LJ(this.LJIIZILJ, c27124Aki.LJIIZILJ) && o.LJ(this.LJIJ, c27124Aki.LJIJ) && o.LJ(this.LJIJI, c27124Aki.LJIJI) && o.LJ(this.LJIJJ, c27124Aki.LJIJJ) && o.LJ(this.LJIJJLI, c27124Aki.LJIJJLI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Price price = this.LIZ;
        int hashCode = (price == null ? 0 : price.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.LIZLLL;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        String str2 = this.LJ;
        int hashCode3 = (i4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJFF;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJI;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJII;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJIIIIZZ;
        int hashCode7 = (((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + (this.LJIIIZ ? 1 : 0)) * 31;
        List<String> list = this.LJIIJ;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.LJIIJJI;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        SpendMoreForFree spendMoreForFree = this.LJIIL;
        int hashCode10 = (hashCode9 + (spendMoreForFree == null ? 0 : spendMoreForFree.hashCode())) * 31;
        java.util.Map<String, String> map = this.LJIILIIL;
        int hashCode11 = (hashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        String str8 = this.LJIILJJIL;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        LogisticItem logisticItem = this.LJIILL;
        int hashCode13 = (hashCode12 + (logisticItem == null ? 0 : logisticItem.hashCode())) * 31;
        Integer num = this.LJIILLIIL;
        int hashCode14 = (hashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJIIZILJ;
        int hashCode15 = (hashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        LogisticTextDTO logisticTextDTO = this.LJIJ;
        int hashCode16 = (hashCode15 + (logisticTextDTO == null ? 0 : logisticTextDTO.hashCode())) * 31;
        WarehouseTag warehouseTag = this.LJIJI;
        int hashCode17 = (hashCode16 + (warehouseTag == null ? 0 : warehouseTag.hashCode())) * 31;
        LogisticLinkRichText logisticLinkRichText = this.LJIJJ;
        int hashCode18 = (hashCode17 + (logisticLinkRichText == null ? 0 : logisticLinkRichText.hashCode())) * 31;
        List<LogisticLinkRichText> list2 = this.LJIJJLI;
        return hashCode18 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "ProductDeliveryInfo(price=" + this.LIZ + ", originPrice=" + this.LIZIZ + ", reachable=" + this.LIZJ + ", shippingDiscount=" + this.LIZLLL + ", deliveryStatusText=" + this.LJ + ", discountDescText=" + this.LJFF + ", leadTimeText=" + this.LJI + ", thresholdText=" + this.LJII + ", thresholdTextEn=" + this.LJIIIIZZ + ", freeShipping=" + this.LJIIIZ + ", discountContents=" + this.LJIIJ + ", daInfo=" + this.LJIIJJI + ", spendMoreForFree=" + this.LJIIL + ", eventTrackInfo=" + this.LJIILIIL + ", deliveryName=" + this.LJIILJJIL + ", promotionItem=" + this.LJIILL + ", deliveryMaxDays=" + this.LJIILLIIL + ", deliveryMinDays=" + this.LJIIZILJ + ", logisticText=" + this.LJIJ + ", warehouseTag=" + this.LJIJI + ", logisticRichText=" + this.LJIJJ + ", logisticRichTextList=" + this.LJIJJLI + ')';
    }

    public C27124Aki(Price price, String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, String str6, boolean z3, List<String> list, String str7, SpendMoreForFree spendMoreForFree, java.util.Map<String, String> map, String str8, LogisticItem logisticItem, Integer num, Integer num2, LogisticTextDTO logisticTextDTO, WarehouseTag warehouseTag, LogisticLinkRichText logisticLinkRichText, List<LogisticLinkRichText> list2) {
        this.LIZ = price;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJII = str5;
        this.LJIIIIZZ = str6;
        this.LJIIIZ = z3;
        this.LJIIJ = list;
        this.LJIIJJI = str7;
        this.LJIIL = spendMoreForFree;
        this.LJIILIIL = map;
        this.LJIILJJIL = str8;
        this.LJIILL = logisticItem;
        this.LJIILLIIL = num;
        this.LJIIZILJ = num2;
        this.LJIJ = logisticTextDTO;
        this.LJIJI = warehouseTag;
        this.LJIJJ = logisticLinkRichText;
        this.LJIJJLI = list2;
    }
}
