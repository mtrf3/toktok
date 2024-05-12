package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPointsBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBannerLabel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RWy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69696RWy implements InterfaceC27632Asu, InterfaceC69697RWz {
    public final List<Image> LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI;
    public final List<ProductBannerLabel> LJLJJI;
    public final Boolean LJLJJL;
    public final int LJLJJLL;
    public final DynamicSellingPointsBase LJLJL;
    public final List<MediaItem> LJLJLJ;
    public final int LJLJLLL;

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
        Boolean bool = this.LJLJJL;
        int i2 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i3 = (((LIZIZ + hashCode) * 31) + this.LJLJJLL) * 31;
        DynamicSellingPointsBase dynamicSellingPointsBase = this.LJLJL;
        if (dynamicSellingPointsBase != null) {
            i2 = dynamicSellingPointsBase.hashCode();
        }
        return this.LJLJLJ.hashCode() + ((i3 + i2) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TtfHeaderBannerVO(images=");
        LIZ.append(this.LJLIL);
        LIZ.append(", skuImageCount=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isSkcHeader=");
        LIZ.append(this.LJLJI);
        LIZ.append(", labels=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", isFavorite=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", indicatorType=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", dynamicSellingPointsBase=");
        LIZ.append(this.LJLJL);
        LIZ.append(", mediaItems=");
        return C1NE.LIZIZ(LIZ, this.LJLJLJ, ')', LIZ);
    }

    @Override // X.InterfaceC27632Asu
    public final int getBrickName() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC69697RWz
    public final List<Image> getImages() {
        return this.LJLIL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69696RWy)) {
            return false;
        }
        C69696RWy c69696RWy = (C69696RWy) obj;
        if (o.LJ(this.LJLIL, c69696RWy.LJLIL) && this.LJLILLLLZI == c69696RWy.LJLILLLLZI && this.LJLJI == c69696RWy.LJLJI && o.LJ(this.LJLJJI, c69696RWy.LJLJJI) && o.LJ(this.LJLJJL, c69696RWy.LJLJJL) && this.LJLJJLL == c69696RWy.LJLJJLL && o.LJ(this.LJLJL, c69696RWy.LJLJL) && o.LJ(this.LJLJLJ, c69696RWy.LJLJLJ)) {
            return true;
        }
        return false;
    }

    public C69696RWy(List<Image> list, int i, boolean z, List<ProductBannerLabel> labels, Boolean bool, int i2, DynamicSellingPointsBase dynamicSellingPointsBase, List<MediaItem> list2) {
        o.LJIIIZ(labels, "labels");
        this.LJLIL = list;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
        this.LJLJJI = labels;
        this.LJLJJL = bool;
        this.LJLJJLL = i2;
        this.LJLJL = dynamicSellingPointsBase;
        this.LJLJLJ = list2;
        this.LJLJLLL = EnumC27721AuL.HEADER.getValue();
    }
}
