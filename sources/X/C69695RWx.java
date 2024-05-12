package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPointsBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBannerLabel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RWx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69695RWx implements InterfaceC27632Asu, InterfaceC69697RWz {
    public final List<Image> LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI;
    public final List<ProductBannerLabel> LJLJJI;
    public final DynamicSellingPointsBase LJLJJL;
    public final List<MediaItem> LJLJJLL;
    public final int LJLJL;

    @Override // X.InterfaceC27632Asu
    public final BrickStyle m() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.LJLIL.hashCode() * 31) + this.LJLILLLLZI) * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJLJJI, (hashCode2 + i) * 31, 31);
        DynamicSellingPointsBase dynamicSellingPointsBase = this.LJLJJL;
        if (dynamicSellingPointsBase == null) {
            hashCode = 0;
        } else {
            hashCode = dynamicSellingPointsBase.hashCode();
        }
        return this.LJLJJLL.hashCode() + ((LIZIZ + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HeaderBannerVO(images=");
        LIZ.append(this.LJLIL);
        LIZ.append(", skuImageCount=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", hasSizeChart=");
        LIZ.append(this.LJLJI);
        LIZ.append(", labels=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", dynamicSellingPointsBase=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", mediaItems=");
        return C1NE.LIZIZ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    @Override // X.InterfaceC27632Asu
    public final int getBrickName() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC69697RWz
    public final List<Image> getImages() {
        return this.LJLIL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69695RWx)) {
            return false;
        }
        C69695RWx c69695RWx = (C69695RWx) obj;
        if (o.LJ(this.LJLIL, c69695RWx.LJLIL) && this.LJLILLLLZI == c69695RWx.LJLILLLLZI && this.LJLJI == c69695RWx.LJLJI && o.LJ(this.LJLJJI, c69695RWx.LJLJJI) && o.LJ(this.LJLJJL, c69695RWx.LJLJJL) && o.LJ(this.LJLJJLL, c69695RWx.LJLJJLL)) {
            return true;
        }
        return false;
    }

    public C69695RWx(List<Image> list, int i, boolean z, List<ProductBannerLabel> labels, DynamicSellingPointsBase dynamicSellingPointsBase, List<MediaItem> list2) {
        o.LJIIIZ(labels, "labels");
        this.LJLIL = list;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
        this.LJLJJI = labels;
        this.LJLJJL = dynamicSellingPointsBase;
        this.LJLJJLL = list2;
        this.LJLJL = EnumC27721AuL.HEADER.getValue();
    }
}
