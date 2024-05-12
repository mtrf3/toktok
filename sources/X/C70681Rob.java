package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.Au2S0S0501000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Rob, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70681Rob extends FrameLayout {
    public InterfaceC70680Roa LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI;

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final InterfaceC70680Roa getListener() {
        return this.LJLIL;
    }

    public final void setListener(InterfaceC70680Roa interfaceC70680Roa) {
        this.LJLIL = interfaceC70680Roa;
    }

    public final void setOnItemMediaClickListener(InterfaceC70680Roa listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70681Rob(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLILLLLZI = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a5w, this, true);
    }

    public final void LIZIZ(ReviewMedia reviewMedia, SmartImageView smartImageView) {
        Object thumbFirstImageUrlModel;
        Video video;
        Integer num = reviewMedia.mediaType;
        if (num == null || num.intValue() != 1) {
            Integer num2 = reviewMedia.mediaType;
            if (num2 != null && num2.intValue() == 2 && (video = reviewMedia.video) != null) {
                thumbFirstImageUrlModel = video.postUrl;
            }
            thumbFirstImageUrlModel = null;
        } else {
            Image image = reviewMedia.image;
            if (image != null) {
                thumbFirstImageUrlModel = image.toThumbFirstImageUrlModel();
            }
            thumbFirstImageUrlModel = null;
        }
        W5F LIZLLL = C70759Rpr.LIZLLL(thumbFirstImageUrlModel);
        LIZLLL.LJIJJ = EnumC72807Shn.CENTER_CROP;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        LIZLLL.LJIILIIL = C79045V0n.LJIIIIZZ(R.attr.cj, context);
        LIZLLL.LJJIIJ = smartImageView;
        C16880lQ.LLJJJ(LIZLLL);
    }

    public final void LIZJ(ReviewMedia reviewMedia, ProductReviewViewModel productReviewViewModel, SmartImageView smartImageView, C70677RoX c70677RoX) {
        C70691Rol c70691Rol;
        String str;
        Integer num = reviewMedia.mediaType;
        boolean z = false;
        if (num == null || num.intValue() != 1) {
            Integer num2 = reviewMedia.mediaType;
            if (num2 != null && num2.intValue() == 2) {
                Video video = reviewMedia.video;
                C70691Rol c70691Rol2 = productReviewViewModel.LJLLILLLL;
                if (c70691Rol2 != null) {
                    ReviewItemStruct reviewItemStruct = c70677RoX.LIZ;
                    if (video != null) {
                        str = video.id;
                    } else {
                        str = null;
                    }
                    String valueOf = String.valueOf(str);
                    Boolean bool = c70677RoX.LIZ.isOwner;
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                    c70691Rol2.LJJIL(smartImageView, reviewItemStruct, valueOf, z);
                }
            }
        } else {
            Image image = reviewMedia.image;
            if (image != null && image.getUri() != null && (c70691Rol = productReviewViewModel.LJLLILLLL) != null) {
                ReviewItemStruct.MainReview mainReview = c70677RoX.LIZ.review;
                String valueOf2 = String.valueOf(reviewMedia.image.getUri());
                ReviewItemStruct reviewItemStruct2 = c70677RoX.LIZ;
                String str2 = reviewItemStruct2.skuId;
                Boolean bool2 = reviewItemStruct2.isOwner;
                if (bool2 != null) {
                    z = bool2.booleanValue();
                }
                c70691Rol.LJIL(smartImageView, mainReview, valueOf2, str2, 1, z, c70677RoX.LIZJ);
            }
        }
        C16880lQ.LJIIJ(new Au2S0S0501000_12(this, reviewMedia, productReviewViewModel, smartImageView, c70677RoX, 1), smartImageView);
    }
}
