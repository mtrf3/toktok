package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBannerLabel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;

/* renamed from: X.Rnh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70625Rnh {
    public final List<Image> LIZ;
    public final List<ProductBannerLabel> LIZIZ;
    public final List<MediaItem> LIZJ;

    public C70625Rnh(List<Image> list, List<ProductBannerLabel> list2, List<MediaItem> list3) {
        C00F.LJ(list, "images", list2, "labels", list3, "mediaItems");
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = list3;
    }
}
