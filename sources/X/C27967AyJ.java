package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AyJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27967AyJ {
    public final Image LIZ;
    public final String LIZIZ;
    public final List<PromotionLogo> LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Integer LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27967AyJ)) {
            return false;
        }
        C27967AyJ c27967AyJ = (C27967AyJ) obj;
        return o.LJ(this.LIZ, c27967AyJ.LIZ) && o.LJ(this.LIZIZ, c27967AyJ.LIZIZ) && o.LJ(this.LIZJ, c27967AyJ.LIZJ) && o.LJ(this.LIZLLL, c27967AyJ.LIZLLL) && o.LJ(this.LJ, c27967AyJ.LJ) && o.LJ(this.LJFF, c27967AyJ.LJFF);
    }

    public final int hashCode() {
        Image image = this.LIZ;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<PromotionLogo> list = this.LIZJ;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJ;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.LJFF;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftSkuInfoVO(productImg=");
        LIZ.append(this.LIZ);
        LIZ.append(", productTitle=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", promotionLogos=");
        LIZ.append(this.LIZJ);
        LIZ.append(", productSpec=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", lightText=");
        LIZ.append(this.LJ);
        LIZ.append(", quantity=");
        return s0.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public C27967AyJ(Image image, String str, List<PromotionLogo> list, String str2, String str3, Integer num) {
        this.LIZ = image;
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = num;
    }
}
