package X;

import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import java.util.ArrayList;
import java.util.List;
import ujb.s;

/* renamed from: X.6eb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165536eb {
    public static final String LIZ(InfoStickerModel infoStickerModel) {
        List<StickerItemModel> list;
        String str;
        String LJIIL = ECommerceAnchorService.LJJJJI().LJIIL();
        if (LJIIL == null || (list = infoStickerModel.stickers) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StickerItemModel stickerItemModel : list) {
            StickerItemModel stickerItemModel2 = stickerItemModel;
            if (stickerItemModel2 != null && (str = stickerItemModel2.extra) != null && s.LJJJLZIJ(str, LJIIL, false)) {
                arrayList.add(stickerItemModel);
            }
        }
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        return ORZ.LLD(arrayList, null, null, null, C165546ec.LJLIL, 31);
    }
}
