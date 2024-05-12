package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.RecommendAfterAddData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecommendInfo;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;

/* renamed from: X.RdK, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69982RdK<T> implements InterfaceC64592gB {
    public static final C69982RdK<T> LJLIL = new C69982RdK<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        RecommendAfterAddData recommendAfterAddData;
        String str;
        RecommendInfo recommendInfo;
        Response response = (Response) obj;
        if (!response.isCodeOK() || (recommendAfterAddData = (RecommendAfterAddData) response.data) == null || recommendAfterAddData.recommendInfos == null) {
            return;
        }
        IEventCenter LJ = EventCenter.LJ();
        RecommendAfterAddData recommendAfterAddData2 = (RecommendAfterAddData) response.data;
        if (recommendAfterAddData2 != null && (recommendInfo = recommendAfterAddData2.recommendInfos) != null) {
            str = C27739Aud.LJI(recommendInfo);
        } else {
            str = "{}";
        }
        LJ.LIZ("ec_addon_recom_update", str);
    }
}
