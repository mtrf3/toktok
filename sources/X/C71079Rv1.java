package X;

import Y.ARunnableS48S0100000_12;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardData;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardStyle;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSource;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rv1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71079Rv1 {
    public static volatile int LIZ;

    public static void LIZIZ(Aweme aweme) {
        try {
            if (FCZ.LIZ()) {
                C38995FSd.LIZJ().execute(new ARunnableS48S0100000_12(aweme, 116));
                return;
            }
            CardInsertInfo cardInsertInfo = aweme.getCardInsertInfo();
            if (cardInsertInfo != null && cardInsertInfo.getCardType() == 4) {
                OSZ LIZIZ = C71074Ruw.LIZIZ(aweme);
                C71076Ruy c71076Ruy = (C71076Ruy) LIZIZ.getFirst();
                FeedEcCardData feedEcCardData = (FeedEcCardData) LIZIZ.getSecond();
                if (c71076Ruy == null || feedEcCardData == null) {
                    return;
                }
                FeedEcCardStyle cardStyle = feedEcCardData.getCardStyle();
                if (cardStyle != null) {
                    C71073Ruv.LIZJ(cardStyle.getCardBgImg());
                    C71073Ruv.LIZJ(cardStyle.getCardBgPendantImg());
                    C71073Ruv.LIZJ(cardStyle.getCardContentBgImg());
                }
                List<? extends Object> list = c71076Ruy.LIZLLL;
                if (list != null && !list.isEmpty()) {
                    for (Object obj : list) {
                        if (obj instanceof EcUgProduct) {
                            C71073Ruv.LIZJ(((EcUgProduct) obj).getFirstImage());
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void LIZ(Aweme aweme, FeedEcCardData cardData, PageSourceInfo pageSourceInfo, InterfaceC88472Yns interfaceC88472Yns) {
        boolean z;
        String str;
        String str2;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(cardData, "cardData");
        String cardConfigJson = cardData.getCardConfigJson();
        if (cardConfigJson == null || ujb.o.LJJJJJL(cardConfigJson)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            interfaceC88472Yns.invoke(null);
            return;
        }
        FeedEcCardConfig cardConfig = cardData.getCardConfig();
        if (cardConfig != null) {
            str = cardConfig.getPriceType();
        } else {
            str = null;
        }
        if (pageSourceInfo != null) {
            PageSource pageSource = (PageSource) ORZ.LLFII(pageSourceInfo.sourcePageList);
            if (pageSource != null) {
                if (pageSource.extra == null) {
                    pageSource.extra = new LinkedHashMap();
                }
                java.util.Map<String, String> map = pageSource.extra;
                if (map != null) {
                    map.put("feed_ec_card_price_type", C40207FqF.LIZ(str));
                }
            }
            str2 = C27739Aud.LJI(pageSourceInfo);
        } else {
            str2 = "";
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZIZ), null, null, new C36048ECu(cardConfigJson, str2, interfaceC88472Yns, null), 3);
    }
}
