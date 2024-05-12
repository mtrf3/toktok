package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPointsBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.GlobalWaistBanner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBannerLabel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RWw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69694RWw implements InterfaceC27632Asu, InterfaceC69697RWz {
    public final List<Image> LJLIL;
    public final int LJLILLLLZI;
    public final List<ProductBannerLabel> LJLJI;
    public final Boolean LJLJJI;
    public final DynamicSellingPointsBase LJLJJL;
    public final GlobalWaistBanner LJLJJLL;
    public final List<MediaItem> LJLJL;
    public final int LJLJLJ;

    @Override // X.InterfaceC27632Asu
    public final BrickStyle m() {
        return null;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJLJI, ((this.LJLIL.hashCode() * 31) + this.LJLILLLLZI) * 31, 31);
        Boolean bool = this.LJLJJI;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = (LIZIZ + hashCode) * 31;
        DynamicSellingPointsBase dynamicSellingPointsBase = this.LJLJJL;
        if (dynamicSellingPointsBase == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = dynamicSellingPointsBase.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        GlobalWaistBanner globalWaistBanner = this.LJLJJLL;
        if (globalWaistBanner != null) {
            i = globalWaistBanner.hashCode();
        }
        return this.LJLJL.hashCode() + ((i3 + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GlobalHeaderVO(images=");
        LIZ.append(this.LJLIL);
        LIZ.append(", skuImageCount=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", labels=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isFavorite=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", dynamicSellingPointsBase=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", globalWaistBanner=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", mediaItems=");
        return C1NE.LIZIZ(LIZ, this.LJLJL, ')', LIZ);
    }

    @Override // X.InterfaceC27632Asu
    public final int getBrickName() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC69697RWz
    public final List<Image> getImages() {
        return this.LJLIL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69694RWw)) {
            return false;
        }
        C69694RWw c69694RWw = (C69694RWw) obj;
        if (o.LJ(this.LJLIL, c69694RWw.LJLIL) && this.LJLILLLLZI == c69694RWw.LJLILLLLZI && o.LJ(this.LJLJI, c69694RWw.LJLJI) && o.LJ(this.LJLJJI, c69694RWw.LJLJJI) && o.LJ(this.LJLJJL, c69694RWw.LJLJJL) && o.LJ(this.LJLJJLL, c69694RWw.LJLJJLL) && o.LJ(this.LJLJL, c69694RWw.LJLJL)) {
            return true;
        }
        return false;
    }

    public C69694RWw(List<Image> list, int i, List<ProductBannerLabel> labels, Boolean bool, DynamicSellingPointsBase dynamicSellingPointsBase, GlobalWaistBanner globalWaistBanner, List<MediaItem> list2) {
        o.LJIIIZ(labels, "labels");
        this.LJLIL = list;
        this.LJLILLLLZI = i;
        this.LJLJI = labels;
        this.LJLJJI = bool;
        this.LJLJJL = dynamicSellingPointsBase;
        this.LJLJJLL = globalWaistBanner;
        this.LJLJL = list2;
        this.LJLJLJ = EnumC27721AuL.HEADER.getValue();
    }
}
