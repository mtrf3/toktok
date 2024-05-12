package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpReviewImageViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.AqS0S3201000_12;

/* renamed from: X.AfR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26797AfR extends TAT {
    public final /* synthetic */ PdpReviewImageViewHolder LJLJJI;
    public final /* synthetic */ C26798AfS LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    @Override // X.TAT
    public final void LIZ(View view) {
        String str;
        Image image;
        if (view != null) {
            PdpViewModel pdpViewModel = (PdpViewModel) this.LJLJJI.LJLIL.getValue();
            C26798AfS c26798AfS = this.LJLJJL;
            pdpViewModel.Gw0(c26798AfS.LIZJ, view, "photo", c26798AfS.LIZIZ);
            C70414RkI c70414RkI = ((PdpViewModel) this.LJLJJI.LJLIL.getValue()).LLFII;
            if (c70414RkI != null) {
                C26798AfS c26798AfS2 = this.LJLJJL;
                String str2 = c26798AfS2.LIZIZ;
                if (str2 == null) {
                    str2 = "";
                }
                ReviewMedia reviewMedia = c26798AfS2.LJFF;
                String str3 = null;
                if (reviewMedia != null && (image = reviewMedia.image) != null) {
                    str = image.getUri();
                } else {
                    str = null;
                }
                String valueOf = String.valueOf(str);
                int i = this.LJLJJLL;
                Boolean valueOf2 = Boolean.valueOf(this.LJLJJL.LIZLLL);
                Integer num = this.LJLJJL.LJ;
                if (num != null) {
                    str3 = num.toString();
                }
                C76542zS.LIZJ("tiktokec_photo_click", new AqS0S3201000_12(c70414RkI, valueOf, i, str2, valueOf2, str3, 1));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26797AfR(PdpReviewImageViewHolder pdpReviewImageViewHolder, C26798AfS c26798AfS, int i) {
        super(700L);
        this.LJLJJI = pdpReviewImageViewHolder;
        this.LJLJJL = c26798AfS;
        this.LJLJJLL = i;
    }
}
