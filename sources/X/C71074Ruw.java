package X;

import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardData;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.repository.bean.FeedEcCardResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ruw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71074Ruw {
    public static final C5H3 LIZ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C71080Rv2.LJLIL);

    public static C71076Ruy LIZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        C5H3 c5h3 = LIZ;
        C71076Ruy c71076Ruy = (C71076Ruy) ((ConcurrentHashMap) c5h3.getValue()).get(aid);
        if (c71076Ruy == null) {
            C71076Ruy c71076Ruy2 = new C71076Ruy(new WeakReference(aweme));
            ((ConcurrentHashMap) c5h3.getValue()).put(aid, c71076Ruy2);
            return c71076Ruy2;
        }
        return c71076Ruy;
    }

    public static OSZ LIZIZ(Aweme aweme) {
        if (aweme == null) {
            return new OSZ(null, null);
        }
        C71076Ruy LIZ2 = LIZ(aweme);
        FeedEcCardData feedEcCardData = LIZ2.LIZJ;
        if (feedEcCardData == null) {
            feedEcCardData = C71073Ruv.LIZ(aweme);
            if (feedEcCardData == null) {
                return new OSZ(null, null);
            }
            LIZ2.LIZJ = feedEcCardData;
        }
        return new OSZ(LIZ2, feedEcCardData);
    }

    public static C71076Ruy LIZJ(Aweme aweme, FeedEcCardResponse feedEcCardResponse, FeedEcCardData cardData) {
        Integer contentType;
        ArrayList arrayList;
        Integer num;
        Integer num2;
        int i;
        boolean z;
        List<EcUgProduct> list;
        Object obj;
        boolean z2;
        String productId;
        List<String> urls;
        String minSalesPrice;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(cardData, "cardData");
        ArrayList arrayList2 = null;
        if (feedEcCardResponse == null) {
            C71065Run.LIZJ = "card data invalid";
            return null;
        }
        FeedEcCardConfig cardConfig = cardData.getCardConfig();
        if (cardConfig == null || (contentType = cardConfig.getContentType()) == null || (contentType.intValue() != 1 && contentType.intValue() != 2)) {
            C71065Run.LIZJ = "content_type invalid";
            return null;
        }
        C71076Ruy LIZ2 = LIZ(aweme);
        LIZ2.LIZJ = cardData;
        List<EcUgProduct> productList = feedEcCardResponse.getProductList();
        if (productList != null) {
            arrayList = new ArrayList();
            for (EcUgProduct ecUgProduct : productList) {
                if (ecUgProduct == null || (productId = ecUgProduct.getProductId()) == null || ujb.o.LJJJJJL(productId) || ecUgProduct.getFirstImage() == null || (urls = ecUgProduct.getFirstImage().getUrls()) == null || urls.isEmpty() || ecUgProduct.getPrice() == null || (minSalesPrice = ecUgProduct.getPrice().getMinSalesPrice()) == null || ujb.o.LJJJJJL(minSalesPrice)) {
                    C71065Run.LIZJ = "content data invalid";
                } else {
                    arrayList.add(ecUgProduct);
                }
            }
        } else {
            arrayList = null;
        }
        FeedEcCardConfig cardConfig2 = cardData.getCardConfig();
        if (cardConfig2 != null) {
            num = cardConfig2.getProductShowNum();
        } else {
            num = null;
        }
        FeedEcCardConfig cardConfig3 = cardData.getCardConfig();
        if (cardConfig3 != null) {
            num2 = cardConfig3.getContentType();
        } else {
            num2 = null;
        }
        if (num != null && num.intValue() > 0) {
            i = num.intValue();
        } else {
            if (num2 != null) {
                if (num2.intValue() == 1) {
                    i = 3;
                } else if (num2.intValue() == 2) {
                    i = 6;
                } else {
                    num2.intValue();
                }
            }
            i = 1;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!Boolean.valueOf(z).booleanValue() && arrayList != null) {
            list = ORZ.LLILLL(arrayList, i);
        } else {
            list = null;
        }
        LIZ2.LJ = list;
        LIZ2.LIZLLL = list;
        if (list != null) {
            arrayList2 = new ArrayList();
            Iterator<EcUgProduct> it = list.iterator();
            while (it.hasNext()) {
                String productId2 = it.next().getProductId();
                if (productId2 != null) {
                    arrayList2.add(productId2);
                }
            }
        }
        LIZ2.LJFF = arrayList2;
        if (list != null && !list.isEmpty() && (!((z2 = list instanceof Collection)) || !list.isEmpty())) {
            Iterator<EcUgProduct> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().getBizType() != null) {
                    if (!z2 || !list.isEmpty()) {
                        Iterator<EcUgProduct> it3 = list.iterator();
                        while (it3.hasNext()) {
                            Integer bizType = it3.next().getBizType();
                            if (bizType == null || bizType.intValue() != 0) {
                                if (!z2 || !list.isEmpty()) {
                                    Iterator<EcUgProduct> it4 = list.iterator();
                                    while (it4.hasNext()) {
                                        Integer bizType2 = it4.next().getBizType();
                                        if (bizType2 == null || bizType2.intValue() != 2) {
                                            obj = 99;
                                            break;
                                        }
                                    }
                                }
                                obj = 2;
                                LIZ2.LJI = obj.toString();
                                LIZ2.LIZIZ.clear();
                                return LIZ2;
                            }
                        }
                    }
                    obj = 0;
                    LIZ2.LJI = obj.toString();
                    LIZ2.LIZIZ.clear();
                    return LIZ2;
                }
            }
        }
        obj = "";
        LIZ2.LJI = obj.toString();
        LIZ2.LIZIZ.clear();
        return LIZ2;
    }
}
