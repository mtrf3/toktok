package X;

import android.content.Context;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.ReviewCellViewHolder;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RoT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70673RoT extends AbstractC65781Prl implements InterfaceC88473Ynt<SmartImageView, ReviewMedia, Integer, C76800UCe> {
    public final /* synthetic */ ReviewCellViewHolder LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ List<String> LJLJJI;
    public final /* synthetic */ List<ReviewMedia> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70673RoT(ReviewCellViewHolder reviewCellViewHolder, boolean z, int i, List<String> list, List<ReviewMedia> list2) {
        super(3);
        this.LJLIL = reviewCellViewHolder;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
        this.LJLJJI = list;
        this.LJLJJL = list2;
    }

    public final void invoke(SmartImageView bindItems, ReviewMedia item, int i) {
        Object thumbFirstImageUrlModel;
        ReviewItemStruct reviewItemStruct;
        String str;
        boolean z;
        Image image;
        C70691Rol c70691Rol;
        Video video;
        Video video2;
        o.LJIIIZ(bindItems, "$this$bindItems");
        o.LJIIIZ(item, "item");
        int i2 = i + 1;
        if (i2 % 4 == 0) {
            C26338AVi.LJI(bindItems, null, null, 0, null, false, 27);
        }
        Integer num = item.mediaType;
        String str2 = null;
        if (num == null || num.intValue() != 1) {
            Integer num2 = item.mediaType;
            if (num2 != null && num2.intValue() == 2 && (video2 = item.video) != null) {
                thumbFirstImageUrlModel = video2.postUrl;
            }
            thumbFirstImageUrlModel = null;
        } else {
            Image image2 = item.image;
            if (image2 != null) {
                thumbFirstImageUrlModel = image2.toThumbFirstImageUrlModel();
            }
            thumbFirstImageUrlModel = null;
        }
        W5F LIZLLL = C70759Rpr.LIZLLL(thumbFirstImageUrlModel);
        LIZLLL.LJIJJ = EnumC72807Shn.CENTER_CROP;
        LIZLLL.LJIJJLI = C70759Rpr.LIZIZ;
        Context context = bindItems.getContext();
        o.LJIIIIZZ(context, "context");
        LIZLLL.LJIILIIL = C79045V0n.LJIIIIZZ(R.attr.cj, context);
        LIZLLL.LJJIIJ = bindItems;
        C16880lQ.LLJJJ(LIZLLL);
        C16880lQ.LJIIJ(new C70675RoV(this.LJLIL, this.LJLILLLLZI, i, this.LJLJI, this.LJLJJI, item), bindItems);
        ReviewCellViewHolder reviewCellViewHolder = this.LJLIL;
        C70677RoX c70677RoX = reviewCellViewHolder.LJLJLJ;
        if (c70677RoX != null && (reviewItemStruct = c70677RoX.LIZ) != null) {
            List<ReviewMedia> list = this.LJLJJL;
            Integer num3 = item.mediaType;
            if (num3 == null || num3.intValue() != 1) {
                Integer num4 = item.mediaType;
                if (num4 == null || num4.intValue() != 2 || (c70691Rol = reviewCellViewHolder.Q().LJLLILLLL) == null) {
                    return;
                }
                ReviewMedia reviewMedia = (ReviewMedia) ORZ.LJLLLLLL(i, list);
                if (reviewMedia != null && (video = reviewMedia.video) != null) {
                    str2 = video.id;
                }
                c70691Rol.LJJIL(bindItems, reviewItemStruct, String.valueOf(str2), reviewCellViewHolder.T());
                return;
            }
            C70691Rol c70691Rol2 = reviewCellViewHolder.Q().LJLLILLLL;
            if (c70691Rol2 == null) {
                return;
            }
            ReviewItemStruct.MainReview mainReview = reviewItemStruct.review;
            ReviewMedia reviewMedia2 = (ReviewMedia) ORZ.LJLLLLLL(i, list);
            if (reviewMedia2 != null && (image = reviewMedia2.image) != null) {
                str = image.getUri();
            } else {
                str = null;
            }
            String valueOf = String.valueOf(str);
            String str3 = reviewItemStruct.skuId;
            Boolean bool = reviewItemStruct.isOwner;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            C70677RoX c70677RoX2 = reviewCellViewHolder.LJLJLJ;
            if (c70677RoX2 != null) {
                str2 = c70677RoX2.LIZJ;
            }
            c70691Rol2.LJIL(bindItems, mainReview, valueOf, str3, i2, z, str2);
        }
    }

    @Override // X.InterfaceC88473Ynt
    public /* bridge */ /* synthetic */ C76800UCe invoke(SmartImageView smartImageView, ReviewMedia reviewMedia, Integer num) {
        invoke(smartImageView, reviewMedia, num.intValue());
        return C76800UCe.LIZ;
    }
}
