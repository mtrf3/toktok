package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.RoN, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70667RoN extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ ReviewItemStruct.MainReview LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ C70691Rol LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70667RoN(String str, int i, ReviewItemStruct.MainReview mainReview, String str2, boolean z, String str3, C70691Rol c70691Rol) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = mainReview;
        this.LJLJJI = str2;
        this.LJLJJL = z;
        this.LJLJJLL = str3;
        this.LJLJL = c70691Rol;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        Object obj;
        Object obj2;
        LaneParams logWhenShow = laneParams;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        int i = C70691Rol.LJIJJLI;
        if (i != 1) {
            if (i != 2) {
                obj = "product_detail";
            } else {
                obj = "shop_review";
            }
        } else {
            obj = "product_review";
        }
        logWhenShow.plusAssign("page_name", obj);
        int i2 = C70691Rol.LJIJJLI;
        if (i2 == 2 || i2 == 1) {
            logWhenShow.plusAssign("previous_page", "product_detail");
        }
        logWhenShow.plusAssign("photo_id", this.LJLIL);
        logWhenShow.plusAssign("rank", Integer.valueOf(this.LJLILLLLZI));
        ReviewItemStruct.MainReview mainReview = this.LJLJI;
        Object obj3 = null;
        if (mainReview != null) {
            obj2 = mainReview.reviewId;
        } else {
            obj2 = null;
        }
        logWhenShow.plusAssign("review_id", obj2);
        logWhenShow.plusAssign("sku_id", this.LJLJJI);
        logWhenShow.plusAssign("is_self", Integer.valueOf(this.LJLJJL ? 1 : 0));
        ReviewItemStruct.MainReview mainReview2 = this.LJLJI;
        if (mainReview2 != null) {
            obj3 = mainReview2.rating;
        }
        logWhenShow.plusAssign("rate", obj3);
        if (C70691Rol.LJIJJLI == 2) {
            C70666RoM.LIZLLL(logWhenShow, this.LJLJJLL);
        }
        logWhenShow.plusAssign("product_id", this.LJLJL.LIZIZ);
        logWhenShow.plusAssign("biz_type", String.valueOf(this.LJLJL.LIZJ));
        return C76800UCe.LIZ;
    }
}
