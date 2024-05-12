package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RX8 {
    public final List<SaleProp> LIZ;
    public final Image LIZIZ;
    public final List<Image> LIZJ;
    public final boolean LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RX8)) {
            return false;
        }
        RX8 rx8 = (RX8) obj;
        return o.LJ(this.LIZ, rx8.LIZ) && o.LJ(this.LIZIZ, rx8.LIZIZ) && o.LJ(this.LIZJ, rx8.LIZJ) && this.LIZLLL == rx8.LIZLLL && this.LJ == rx8.LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        List<SaleProp> list = this.LIZ;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        Image image = this.LIZIZ;
        if (image != null) {
            i = image.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.LIZJ, (i2 + i) * 31, 31);
        boolean z = this.LIZLLL;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        return ((LIZIZ + i3) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PdpSkuVOV2(saleProps=");
        LIZ.append(this.LIZ);
        LIZ.append(", productImage=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", images=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isSingleSku=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", checkedSkuIdsHashCode=");
        return b0.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public RX8(List<SaleProp> list, Image image, List<Image> list2, boolean z, int i) {
        this.LIZ = list;
        this.LIZIZ = image;
        this.LIZJ = list2;
        this.LIZLLL = z;
        this.LJ = i;
    }
}
