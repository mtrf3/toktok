package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpReviewViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.Au2S5S0400000_12;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AfT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26799AfT extends AbstractC65781Prl implements InterfaceC88473Ynt<View, ReviewMedia, Integer, C76800UCe> {
    public final /* synthetic */ PdpReviewViewHolder LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ ReviewItemStruct LJLJI;
    public final /* synthetic */ C119774mz LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26799AfT(PdpReviewViewHolder pdpReviewViewHolder, int i, ReviewItemStruct reviewItemStruct, C119774mz c119774mz) {
        super(3);
        this.LJLIL = pdpReviewViewHolder;
        this.LJLILLLLZI = i;
        this.LJLJI = reviewItemStruct;
        this.LJLJJI = c119774mz;
    }

    public final void invoke(View bindItems, ReviewMedia item, int i) {
        Object thumbFirstImageUrlModel;
        int i2;
        Video video;
        o.LJIIIZ(bindItems, "$this$bindItems");
        o.LJIIIZ(item, "item");
        Integer num = item.mediaType;
        if (num == null || num.intValue() != 1) {
            Integer num2 = item.mediaType;
            if (num2 != null && num2.intValue() == 2 && (video = item.video) != null) {
                thumbFirstImageUrlModel = video.postUrl;
            }
            thumbFirstImageUrlModel = null;
        } else {
            this.LJLIL.addPdpContentImageMonitor(item);
            Image image = item.image;
            if (image != null) {
                thumbFirstImageUrlModel = image.toThumbFirstImageUrlModel();
            }
            thumbFirstImageUrlModel = null;
        }
        W5F LIZLLL = C70759Rpr.LIZLLL(thumbFirstImageUrlModel);
        LIZLLL.LJIJJ = EnumC72807Shn.CENTER_CROP;
        LIZLLL.LJIILIIL = C7MY.LIZJ(bindItems, "context", R.attr.cj);
        LIZLLL.LJIJJLI = C70759Rpr.LIZIZ;
        LIZLLL.LJJIIJ = (SmartImageView) bindItems.findViewById(R.id.j0u);
        C16880lQ.LLJJJ(LIZLLL);
        View review_image = bindItems.findViewById(R.id.j0u);
        o.LJIIIIZZ(review_image, "review_image");
        C16880lQ.LJIIJ(new Au2S5S0400000_12(item, this.LJLIL, this.LJLJI, this.LJLJJI, 1), review_image);
        ImageView imageView = (ImageView) bindItems.findViewById(R.id.hrq);
        if (imageView != null) {
            Integer num3 = item.mediaType;
            if (num3 == null || num3.intValue() != 2 || i == 3) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            imageView.setVisibility(i2);
        }
        if (i == 3) {
            C26338AVi.LJI(bindItems, null, null, 0, null, false, 27);
        }
        if (this.LJLILLLLZI > 0 && i == 3) {
            bindItems.findViewById(R.id.jsb).setVisibility(0);
            if (C90193gN.LIZ()) {
                TextView textView = (TextView) bindItems.findViewById(R.id.jsb);
                StringBuilder sb = new StringBuilder();
                sb.append(this.LJLILLLLZI);
                sb.append('+');
                textView.setText(sb.toString());
                return;
            }
            ((TextView) bindItems.findViewById(R.id.jsb)).setText("+" + this.LJLILLLLZI);
            return;
        }
        bindItems.findViewById(R.id.jsb).setVisibility(8);
    }

    @Override // X.InterfaceC88473Ynt
    public /* bridge */ /* synthetic */ C76800UCe invoke(View view, ReviewMedia reviewMedia, Integer num) {
        invoke(view, reviewMedia, num.intValue());
        return C76800UCe.LIZ;
    }
}
