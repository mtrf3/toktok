package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C70691Rol;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;

/* loaded from: classes13.dex */
public class AqS8S1210000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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

    public static final Object invoke$0(AqS8S1210000_12 aqS8S1210000_12, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        C70691Rol c70691Rol = (C70691Rol) aqS8S1210000_12.l1;
        ReviewItemStruct reviewItemStruct = (ReviewItemStruct) aqS8S1210000_12.l2;
        String str = aqS8S1210000_12.s0;
        boolean z = aqS8S1210000_12.z3;
        c70691Rol.getClass();
        C70691Rol.LJ(logView, reviewItemStruct, str, z);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS8S1210000_12 aqS8S1210000_12, Object obj) {
        LaneParams logWhenShow = (LaneParams) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        C70691Rol c70691Rol = (C70691Rol) aqS8S1210000_12.l1;
        ReviewItemStruct reviewItemStruct = (ReviewItemStruct) aqS8S1210000_12.l2;
        String str = aqS8S1210000_12.s0;
        boolean z = aqS8S1210000_12.z3;
        c70691Rol.getClass();
        C70691Rol.LJ(logWhenShow, reviewItemStruct, str, z);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS8S1210000_12(C70691Rol c70691Rol, ReviewItemStruct reviewItemStruct, String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l1 = c70691Rol;
        this.l2 = reviewItemStruct;
        this.s0 = str;
        this.z3 = z;
    }
}
