package com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel;

import X.C27739Aud;
import X.C71361RzZ;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public final class ECommerceCommodityListViewModel extends ViewModel {
    public static final /* synthetic */ int LJLJJL = 0;
    public CommonVideoAnchorModel LJLILLLLZI;
    public boolean LJLJJI;
    public final MutableLiveData<GetItemProductInfoResponseData> LJLIL = new MutableLiveData<>();
    public List<ShopWindowAnchorModel> LJLJI = new ArrayList();

    public final void gv0(GetItemProductInfoResponseData getItemProductInfoResponseData) {
        List<PromotionItem> list;
        List<PromotionItem> list2;
        if (getItemProductInfoResponseData != null) {
            List<ShopWindowExtraModel> list3 = getItemProductInfoResponseData.products;
            if (list3 != null) {
                for (ShopWindowExtraModel shopWindowExtraModel : list3) {
                    String valueOf = String.valueOf(shopWindowExtraModel.productId);
                    HashMap hashMap = new HashMap();
                    PromotionView promotionView = shopWindowExtraModel.promotionView;
                    if (promotionView != null && (list2 = promotionView.promotion_items) != null) {
                        Iterator<PromotionItem> it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            HashMap<String, Object> LJII = C27739Aud.LJII(it.next().getLog_extra());
                            if (LJII != null) {
                                hashMap.put(valueOf, LJII);
                                break;
                            }
                        }
                    }
                    C71361RzZ c71361RzZ = C71361RzZ.LIZ;
                    PromotionView promotionView2 = shopWindowExtraModel.promotionView;
                    if (promotionView2 != null) {
                        list = promotionView2.promotion_items;
                    } else {
                        list = null;
                    }
                    c71361RzZ.getClass();
                    hashMap.put(valueOf, C71361RzZ.LJJJJJL(list, hashMap));
                    shopWindowExtraModel.promotionLogExtraInfo = hashMap;
                }
            }
            this.LJLIL.setValue(getItemProductInfoResponseData);
        }
    }
}
