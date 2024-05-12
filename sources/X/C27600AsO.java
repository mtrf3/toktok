package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.ProductDescVideoViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;

/* renamed from: X.AsO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27600AsO implements InterfaceC73050Sli {
    public final /* synthetic */ ProductDescVideoViewHolder LIZ;

    @Override // X.InterfaceC73050Sli
    public final void LIZ() {
        Video video;
        String str;
        Aweme aweme = this.LIZ.LJLJJL;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            ProductDescVideoViewHolder productDescVideoViewHolder = this.LIZ;
            C70414RkI c70414RkI = productDescVideoViewHolder.getViewModel().LLFII;
            if (c70414RkI != null) {
                Aweme aweme2 = productDescVideoViewHolder.LJLJJL;
                if (aweme2 != null) {
                    str = aweme2.getAid();
                } else {
                    str = null;
                }
                c70414RkI.LJJJJZ(video.getVideoLength() * 1000, str, "product_description");
            }
        }
    }

    public C27600AsO(ProductDescVideoViewHolder productDescVideoViewHolder) {
        this.LIZ = productDescVideoViewHolder;
    }
}
