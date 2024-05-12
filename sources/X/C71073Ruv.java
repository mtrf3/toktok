package X;

import Y.ARunnableS37S0100000_1;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ruv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71073Ruv {
    public static final /* synthetic */ int LIZ = 0;

    public static FeedEcCardData LIZ(Aweme aweme) {
        String str;
        CardInsertInfo cardInsertInfo;
        if (aweme != null && (cardInsertInfo = aweme.getCardInsertInfo()) != null) {
            str = cardInsertInfo.getCardInsertStatus();
        } else {
            str = null;
        }
        FeedEcCardData feedEcCardData = (FeedEcCardData) C67722lE.LIZ(FeedEcCardData.class, str);
        if (feedEcCardData != null) {
            feedEcCardData.parseInternalData();
        }
        return feedEcCardData;
    }

    public static void LIZJ(Image image) {
        int i;
        if (image == null) {
            return;
        }
        W5F LJIIIZ = W5U.LJIIIZ(image.toImageUrlModel());
        Integer width = image.getWidth();
        int i2 = 0;
        if (width != null) {
            i = width.intValue();
        } else {
            i = 0;
        }
        Integer height = image.getHeight();
        if (height != null) {
            i2 = height.intValue();
        }
        if (i > 0 && i2 > 0) {
            LJIIIZ.LJIIIZ = i;
            LJIIIZ.LJIIJ = i2;
        }
        LJIIIZ.LIZIZ("feed_ec_card");
        LJIIIZ.LJI();
    }

    public static void LIZIZ(Aweme aweme, boolean z, String failReason, int i) {
        FeedEcCardData feedEcCardData;
        FeedEcCardConfig cardConfig;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            failReason = "";
        }
        o.LJIIIZ(failReason, "failReason");
        if (aweme == null) {
            return;
        }
        try {
            ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS37S0100000_1(aweme, 153));
        } catch (Throwable unused) {
        }
        if (z) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C71065Run.LIZIZ(linkedHashMap);
        linkedHashMap.put("card_type", 4);
        linkedHashMap.put("request_id", ED2.LIZ(aweme.getRequestId()));
        C71076Ruy c71076Ruy = (C71076Ruy) C71074Ruw.LIZIZ(aweme).getFirst();
        if (c71076Ruy != null && (feedEcCardData = c71076Ruy.LIZJ) != null && (cardConfig = feedEcCardData.getCardConfig()) != null) {
            linkedHashMap.put("user_status", ED2.LIZ(cardConfig.getUserStatus()));
            linkedHashMap.put("trigger_condition", ED2.LIZ(Integer.valueOf(C71065Run.LIZLLL(cardConfig))));
            linkedHashMap.put("content_type", ED2.LIZ(cardConfig.getContentType()));
        }
        String str = C71065Run.LIZJ;
        if (!ujb.o.LJJJJJL(str)) {
            failReason = str;
        }
        linkedHashMap.put("fail_reason", failReason);
        C71065Run.LIZJ = "";
        C76542zS.LIZ("rd_tiktokec_feed_ec_card_load_fail", linkedHashMap);
    }
}
