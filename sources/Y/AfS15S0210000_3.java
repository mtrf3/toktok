package Y;

import X.C191937g5;
import X.C193027hq;
import X.C2U8;
import X.C76800UCe;
import X.FMX;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import X.OSZ;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.poi.collect.PoiCollectStatusViewModel;
import kotlin.jvm.internal.AqS46S0110000_3;

/* loaded from: classes4.dex */
public class AfS15S0210000_3 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS15S0210000_3 afS15S0210000_3, Object obj) {
        if (afS15S0210000_3.z2) {
            FMX.LJIILL("collection_add_videos", new OSZ(((C193027hq) afS15S0210000_3.l0).LJLJI, "enter_from"), new OSZ(((CollectionDetail) afS15S0210000_3.l1).id, "collection_id"));
        }
        if (afS15S0210000_3.z2) {
            C2U8.LIZ(new C191937g5(new CollectionManageRequest(3, null, null, null, null, null, null, null, null, 510, null), null));
        } else {
            C2U8.LIZ(new C191937g5(new CollectionManageRequest(1, null, null, null, null, null, null, null, null, 510, null), null));
        }
    }

    public static final void accept$1(AfS15S0210000_3 afS15S0210000_3, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse == null || baseResponse.status_code != 0) {
            return;
        }
        ((PoiCollectStatusViewModel) afS15S0210000_3.l0).setState(new AqS46S0110000_3((InterfaceC88472Yns) afS15S0210000_3.l1, (InterfaceC88472Yns<? super Boolean, C76800UCe>) afS15S0210000_3.z2, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS15S0210000_3(Object obj, PoiCollectStatusViewModel poiCollectStatusViewModel, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, boolean z) {
        this.$t = z ? 1 : 0;
        this.l0 = obj;
        this.l1 = poiCollectStatusViewModel;
        this.z2 = interfaceC88472Yns;
    }
}
