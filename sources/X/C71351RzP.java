package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.EcommerceCommentAnchorViewModel;
import com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.EnterContext;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.model.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShowTextInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.RzP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71351RzP<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ List<String> LIZIZ;
    public final /* synthetic */ java.util.Map<String, EnterContext> LIZJ;
    public final /* synthetic */ EcommerceCommentAnchorViewModel LIZLLL;
    public final /* synthetic */ boolean LJ;

    public C71351RzP(long j, List<String> list, java.util.Map<String, EnterContext> map, EcommerceCommentAnchorViewModel ecommerceCommentAnchorViewModel, boolean z) {
        this.LIZ = j;
        this.LIZIZ = list;
        this.LIZJ = map;
        this.LIZLLL = ecommerceCommentAnchorViewModel;
        this.LJ = z;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        boolean z;
        String str;
        String str2;
        Integer num;
        Integer num2;
        String str3;
        String str4;
        String str5;
        String str6;
        List<ShopWindowExtraModel> list;
        ShopWindowExtraModel shopWindowExtraModel;
        ProductBase productBase;
        GetItemProductInfoResponseData getItemProductInfoResponseData;
        String str7;
        List<ShopWindowExtraModel> list2;
        ShopWindowExtraModel shopWindowExtraModel2;
        String str8;
        ShowTextInfo showTextInfo;
        Integer num3;
        List<PromotionItem> list3;
        PromotionItem promotionItem;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        BaseResponse baseResponse = (BaseResponse) c10k.LJIIJJI();
        if (baseResponse != null && baseResponse.status_code == 0) {
            z = true;
        } else {
            z = false;
        }
        Integer num4 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        String str9 = null;
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
            List<String> list4 = this.LIZIZ;
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
            CommonVideoAnchorModel commonVideoAnchorModel = this.LIZLLL.LJLIL;
            if (commonVideoAnchorModel != null) {
                str3 = commonVideoAnchorModel.getEventType();
            } else {
                str3 = null;
            }
            CommonVideoAnchorModel commonVideoAnchorModel2 = this.LIZLLL.LJLIL;
            if (commonVideoAnchorModel2 != null) {
                str4 = commonVideoAnchorModel2.getAuthorUid();
            } else {
                str4 = null;
            }
            CommonVideoAnchorModel commonVideoAnchorModel3 = this.LIZLLL.LJLIL;
            if (commonVideoAnchorModel3 != null) {
                str5 = commonVideoAnchorModel3.getGroupId();
            } else {
                str5 = null;
            }
            C71363Rzb.LJIJJLI(3, 2, num, num2, valueOf, null, str2, str3, str4, str5, list4);
            GetItemProductInfoResponseData getItemProductInfoResponseData2 = ((GetItemProductInfoResponse) c10k.LJIIJJI()).data;
            if (getItemProductInfoResponseData2 != null && (list2 = getItemProductInfoResponseData2.products) != null && (shopWindowExtraModel2 = (ShopWindowExtraModel) ORZ.LJLLLL(list2)) != null) {
                EcommerceCommentAnchorViewModel ecommerceCommentAnchorViewModel = this.LIZLLL;
                C71352RzQ value = ecommerceCommentAnchorViewModel.LJLILLLLZI.getValue();
                if (value == null) {
                    value = new C71352RzQ();
                }
                C71352RzQ c71352RzQ = value;
                PromotionView promotionView = shopWindowExtraModel2.promotionView;
                if (promotionView != null && (list3 = promotionView.promotion_items) != null && (promotionItem = (PromotionItem) ORZ.LJLLLL(list3)) != null) {
                    str8 = promotionItem.getName();
                } else {
                    str8 = null;
                }
                c71352RzQ.LIZIZ = str8;
                ProductBase productBase2 = shopWindowExtraModel2.productBase;
                if (productBase2 != null && (num3 = productBase2.soldCount) != null && num3.intValue() >= 10) {
                    c71352RzQ.LIZJ = Integer.valueOf(num3.intValue());
                }
                ProductBase productBase3 = shopWindowExtraModel2.productBase;
                if (productBase3 != null) {
                    showTextInfo = productBase3.soldTextInfo;
                } else {
                    showTextInfo = null;
                }
                c71352RzQ.LIZLLL = showTextInfo;
                ecommerceCommentAnchorViewModel.LJLILLLLZI.postValue(c71352RzQ);
            }
            GetItemProductInfoResponse getItemProductInfoResponse = (GetItemProductInfoResponse) c10k.LJIIJJI();
            if (getItemProductInfoResponse != null && (getItemProductInfoResponseData = getItemProductInfoResponse.data) != null && o.LJ(getItemProductInfoResponseData.containMultiPanelResp, Boolean.TRUE)) {
                CommonVideoAnchorModel commonVideoAnchorModel4 = this.LIZLLL.LJLIL;
                if (commonVideoAnchorModel4 != null) {
                    str7 = commonVideoAnchorModel4.getAid();
                } else {
                    str7 = null;
                }
                C71370Rzi.LJIIJ(str7, "comment_anchor", ((GetItemProductInfoResponse) c10k.LJIIJJI()).data);
            }
            CommonVideoAnchorModel commonVideoAnchorModel5 = this.LIZLLL.LJLIL;
            if (commonVideoAnchorModel5 != null) {
                str6 = commonVideoAnchorModel5.getAid();
            } else {
                str6 = null;
            }
            GetItemProductInfoResponseData getItemProductInfoResponseData3 = ((GetItemProductInfoResponse) c10k.LJIIJJI()).data;
            if (getItemProductInfoResponseData3 != null && (list = getItemProductInfoResponseData3.products) != null && (shopWindowExtraModel = (ShopWindowExtraModel) ORZ.LJLLLL(list)) != null && (productBase = shopWindowExtraModel.productBase) != null) {
                str9 = productBase.daInfo;
            }
            C71370Rzi.LJIIJJI(str6, C27739Aud.LJII(str9));
        } else {
            C71359RzX c71359RzX = C71359RzX.LIZ;
            CommonVideoAnchorModel commonVideoAnchorModel6 = this.LIZLLL.LJLIL;
            if (commonVideoAnchorModel6 != null) {
                str = commonVideoAnchorModel6.getEventType();
            } else {
                str = null;
            }
            boolean z2 = !this.LJ;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.LIZ;
            BaseResponse baseResponse4 = (BaseResponse) c10k.LJIIJJI();
            if (baseResponse4 != null) {
                num4 = Integer.valueOf(baseResponse4.status_code);
            }
            C71359RzX.LIZJ(c71359RzX, 3, str, z2, elapsedRealtime, num4);
        }
        return C76800UCe.LIZ;
    }
}
