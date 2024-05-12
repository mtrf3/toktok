package com.ss.android.ugc.aweme.commercialize.feed.assem.product;

import X.C214098aj;
import X.C33Q;
import X.C58655N0h;
import X.C58704N2e;
import X.WM7;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdProductTileVM extends FeedBaseViewModel<C214098aj> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C214098aj(null);
    }

    public final void lv0() {
        AwemeRawAd awemeRawAd;
        Aweme aweme;
        VideoItemParams gv0 = gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow", awemeRawAd);
        LIZLLL.LIZJ("card", "refer");
        LIZLLL.LIZIZ("AdPlp", WM7.SCENE_SERVICE);
        LIZLLL.LIZIZ("native_product_tile", "cardType");
        LIZLLL.LJI();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final C214098aj iv0(C214098aj state, VideoItemParams item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        item.getAweme().setAdDescMaxLines(2);
        super.iv0(state, item);
        return state;
    }

    public final void kv0(int i, String productId) {
        AwemeRawAd awemeRawAd;
        Aweme aweme;
        o.LJIIIZ(productId, "productId");
        VideoItemParams gv0 = gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "card_product_show", awemeRawAd);
        LIZLLL.LIZJ("card", "refer");
        LIZLLL.LIZIZ("AdPlp", WM7.SCENE_SERVICE);
        LIZLLL.LIZIZ("native_product_tile", "cardType");
        LIZLLL.LIZIZ(productId, "productId");
        LIZLLL.LIZIZ(Integer.valueOf(i), "card_index");
        LIZLLL.LJI();
    }
}
