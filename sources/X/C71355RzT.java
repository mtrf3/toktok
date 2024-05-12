package X;

import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.model.EnterContext;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.RzT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71355RzT<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ List<String> LIZIZ;
    public final /* synthetic */ java.util.Map<String, EnterContext> LIZJ;
    public final /* synthetic */ ECommerceAnchorPanelViewModel LIZLLL;
    public final /* synthetic */ int LJ;
    public final /* synthetic */ RecyclerView LJFF;

    public C71355RzT(long j, List<String> list, java.util.Map<String, EnterContext> map, ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel, int i, RecyclerView recyclerView) {
        this.LIZ = j;
        this.LIZIZ = list;
        this.LIZJ = map;
        this.LIZLLL = eCommerceAnchorPanelViewModel;
        this.LJ = i;
        this.LJFF = recyclerView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C10I
    public final Object then(C10K c10k) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        Integer num;
        Integer num2;
        String str3;
        String str4;
        String str5;
        GetItemProductInfoResponseData getItemProductInfoResponseData;
        List<ShopWindowExtraModel> list;
        Object LJLLLL;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        BaseResponse baseResponse = (BaseResponse) c10k.LJIIJJI();
        if (baseResponse != null && baseResponse.status_code == 0) {
            z = true;
        } else {
            z = false;
        }
        Integer num3 = null;
        String str6 = null;
        if (z) {
            BaseResponse baseResponse2 = (BaseResponse) c10k.LJIIJJI();
            if (baseResponse2 != null && (serverTimeExtra = baseResponse2.extra) != null) {
                str2 = serverTimeExtra.logid;
            } else {
                str2 = null;
            }
            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime() - this.LIZ);
            BaseResponse baseResponse3 = (BaseResponse) c10k.LJIIJJI();
            if (baseResponse3 != null) {
                num = Integer.valueOf(baseResponse3.status_code);
            } else {
                num = null;
            }
            List<String> list2 = this.LIZIZ;
            Iterator<Map.Entry<String, EnterContext>> it = this.LIZJ.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    num2 = it.next().getValue().getReqType();
                    if (num2 != null) {
                        break;
                    }
                } else {
                    num2 = null;
                    break;
                }
            }
            ProductListModel productListModel = this.LIZLLL.LJLILLLLZI;
            if (productListModel != null) {
                str3 = productListModel.getEventType();
            } else {
                str3 = null;
            }
            ProductListModel productListModel2 = this.LIZLLL.LJLILLLLZI;
            if (productListModel2 != null) {
                str4 = productListModel2.getAuthorUid();
            } else {
                str4 = null;
            }
            ProductListModel productListModel3 = this.LIZLLL.LJLILLLLZI;
            if (productListModel3 != null) {
                str5 = productListModel3.getGroupId();
            } else {
                str5 = null;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.LIZLLL.getClass();
            C71363Rzb.LJIJJLI(1, this.LJ, num, num2, valueOf, Long.valueOf(elapsedRealtime - 0), str2, str3, str4, str5, list2);
            if (this.LJ == 1) {
                GetItemProductInfoResponseData getItemProductInfoResponseData2 = ((GetItemProductInfoResponse) c10k.LJIIJJI()).data;
                if (getItemProductInfoResponseData2 != null && (list = getItemProductInfoResponseData2.products) != null && (LJLLLL = ORZ.LJLLLL(list)) != null) {
                    this.LIZLLL.LJLJJLL.postValue(LJLLLL);
                }
            } else {
                this.LIZLLL.zv0(((GetItemProductInfoResponse) c10k.LJIIJJI()).data, false, this.LJFF, this.LJ);
            }
            GetItemProductInfoResponse getItemProductInfoResponse = (GetItemProductInfoResponse) c10k.LJIIJJI();
            if (getItemProductInfoResponse != null && (getItemProductInfoResponseData = getItemProductInfoResponse.data) != null && o.LJ(getItemProductInfoResponseData.containMultiPanelResp, Boolean.TRUE)) {
                ProductListModel productListModel4 = this.LIZLLL.LJLILLLLZI;
                if (productListModel4 != null) {
                    str6 = productListModel4.getAid();
                }
                C71370Rzi.LJIIJ(str6, "video_anchor", ((GetItemProductInfoResponse) c10k.LJIIJJI()).data);
            }
        } else {
            C71359RzX c71359RzX = C71359RzX.LIZ;
            ProductListModel productListModel5 = this.LIZLLL.LJLILLLLZI;
            if (productListModel5 != null) {
                str = productListModel5.getEventType();
            } else {
                str = null;
            }
            if (this.LIZLLL.LJLJJL.size() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.LIZ;
            BaseResponse baseResponse4 = (BaseResponse) c10k.LJIIJJI();
            if (baseResponse4 != null) {
                num3 = Integer.valueOf(baseResponse4.status_code);
            }
            C71359RzX.LIZJ(c71359RzX, 1, str, z2, elapsedRealtime2, num3);
        }
        return C76800UCe.LIZ;
    }
}
