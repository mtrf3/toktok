package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C70666RoM;
import X.C70689Roj;
import X.C70691Rol;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.ST9;
import X.STI;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;

/* loaded from: classes13.dex */
public class AqS3S1202000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i3;
    public int i4;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS3S1202000_12 aqS3S1202000_12, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        ST9 avatarStatus = (ST9) aqS3S1202000_12.l1;
        int i = aqS3S1202000_12.i3;
        int i2 = aqS3S1202000_12.i4;
        String str = aqS3S1202000_12.s0;
        Integer num = (Integer) aqS3S1202000_12.l2;
        o.LJIIIZ(avatarStatus, "avatarStatus");
        return new STI(avatarStatus, i, i2, str, num);
    }

    public static final Object invoke$1(AqS3S1202000_12 aqS3S1202000_12, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        C70666RoM.LJ(logView, (ReviewItemStruct) aqS3S1202000_12.l1, C70691Rol.LJIJ);
        logView.put("rank", Integer.valueOf(aqS3S1202000_12.i3));
        if (aqS3S1202000_12.i4 == 2) {
            C70666RoM.LIZLLL(logView, aqS3S1202000_12.s0);
        }
        logView.put("product_id", ((ProductReviewViewModel) aqS3S1202000_12.l2).LJLLL);
        logView.put("biz_type", Integer.valueOf(C70689Roj.LIZ(((ProductReviewViewModel) aqS3S1202000_12.l2).LJLLL).LJLLL));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S1202000_12(ST9 st9, int i, int i2, String str, Integer num, int i3) {
        super(1);
        this.$t = i3;
        this.l1 = st9;
        this.i3 = i;
        this.i4 = i2;
        this.s0 = str;
        this.l2 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S1202000_12(ReviewItemStruct reviewItemStruct, int i, int i2, String str, ProductReviewViewModel productReviewViewModel, int i3) {
        super(1);
        this.$t = i3;
        this.l1 = reviewItemStruct;
        this.i3 = i;
        this.i4 = i2;
        this.s0 = str;
        this.l2 = productReviewViewModel;
    }
}
