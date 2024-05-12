package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardStyle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ruo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71066Ruo {
    public static final C71066Ruo LIZ = new C71066Ruo();
    public static boolean LIZIZ;
    public static boolean LIZJ;

    public static final void LIZ(Context context, EcUgProduct clickProduct, Aweme aweme, FeedEcCardConfig cardConfig, FeedEcCardStyle cardStyle, C71076Ruy cardCache) {
        String str;
        int i;
        Object obj;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(clickProduct, "clickProduct");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(cardConfig, "cardConfig");
        o.LJIIIZ(cardStyle, "cardStyle");
        o.LJIIIZ(cardCache, "cardCache");
        String schema = clickProduct.getSchema();
        if (schema == null || ujb.o.LJJJJJL(schema)) {
            str = "";
        } else {
            List<String> list = cardCache.LJFF;
            if (list != null) {
                Iterator<String> it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (o.LJ(it.next(), clickProduct.getProductId())) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            i = -1;
            LinkedHashMap LIZ2 = C0JU.LIZ("previous_page", "fyp_ecom_card_page");
            java.util.Map<String, Object> trackParams = cardConfig.getTrackParams();
            if (trackParams != null) {
                String LIZ3 = ED2.LIZ(trackParams.get("entrance_form"));
                if (!ujb.o.LJJJJJL(LIZ3)) {
                    LIZ2.put("entrance_form", LIZ3);
                }
            }
            String LIZ4 = ED2.LIZ(clickProduct.getPlatform());
            if (!ujb.o.LJJJJJL(LIZ4)) {
                LIZ2.put("product_source", LIZ4);
            }
            String LIZ5 = ED2.LIZ(clickProduct.getSourceFrom());
            if (!ujb.o.LJJJJJL(LIZ5)) {
                LIZ2.put("source_from", LIZ5);
            }
            Integer bizType = clickProduct.getBizType();
            if (bizType != null && bizType.intValue() != 0) {
                LIZ2.put("biz_type", bizType);
            }
            HashMap<String, Object> LJII = C27739Aud.LJII(clickProduct.getLogExtra());
            String str2 = null;
            if (LJII != null) {
                obj = LJII.get("author_id");
            } else {
                obj = null;
            }
            String LIZ6 = ED2.LIZ(obj);
            if (!ujb.o.LJJJJJL(LIZ6)) {
                LIZ2.put("author_id", LIZ6);
            }
            LIZ2.put("is_ad", 0);
            LIZ2.put("purchase_path", "normal");
            String LIZ7 = ED2.LIZ(Integer.valueOf(C71065Run.LIZLLL(cardConfig)));
            String LJI = C71065Run.LJI(LIZ7);
            if (!ujb.o.LJJJJJL(LJI)) {
                LIZ2.put("source_module", LJI);
            }
            String sourceContentId = aweme.getGroupId();
            o.LJIIIIZZ(sourceContentId, "sourceContentId");
            if (!ujb.o.LJJJJJL(sourceContentId)) {
                LIZ2.put("source_content_id", sourceContentId);
            }
            LIZ2.put("enter_click_area", "product");
            String LIZ8 = ED2.LIZ(cardConfig.getUserStatus());
            String LIZ9 = ED2.LIZ(cardConfig.getContentType());
            String LIZ10 = ED2.LIZ(aweme.getRequestId());
            LIZ2.put("track_id", C71065Run.LIZJ(i + 1, LIZ8, LIZ7, LIZ9, LIZ10, ED2.LIZ(clickProduct.getProductId())));
            LIZ2.put("rec_params", C71065Run.LJ(cardConfig.getProductInfoList(), clickProduct));
            LIZ2.put("request_id", LIZ10);
            FeedEcCardConfig.FeedEcCardInfo cardInfo = cardConfig.getCardInfo();
            if (cardInfo != null) {
                str2 = cardInfo.getSessionId();
            }
            LIZ2.put("rec_session_id", ED2.LIZ(str2));
            str = ED4.LIZIZ(schema, LIZ2);
        }
        boolean z = !ujb.o.LJJJJJL(str);
        if (z) {
            LIZIZ = true;
            SmartRouter.buildRoute(context, str).open();
        }
        LIZJ(clickProduct, cardCache, cardConfig, cardStyle, aweme, "product", "normal", z, false);
    }

    public static void LIZIZ(boolean z, C71076Ruy c71076Ruy, Aweme aweme, FeedEcCardConfig feedEcCardConfig, FeedEcCardStyle feedEcCardStyle, String str, Boolean bool, String str2, int i) {
        String str3;
        long j;
        List<String> list;
        String str4 = str2;
        Boolean bool2 = bool;
        String str5 = null;
        if ((i & 64) != 0) {
            bool2 = null;
        }
        if ((i & 128) != 0) {
            str4 = null;
        }
        try {
            if (FCZ.LIZ()) {
                C38995FSd.LIZJ().execute(new RunnableC71070Rus(c71076Ruy, feedEcCardConfig, feedEcCardStyle, aweme, bool2, str, str4, z));
                return;
            }
            if (o.LJ(bool2, Boolean.TRUE)) {
                str3 = "down";
            } else if (o.LJ(bool2, Boolean.FALSE)) {
                str3 = "up";
            } else {
                str3 = null;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (c71076Ruy != null) {
                j = c71076Ruy.LJII;
            } else {
                j = 0;
            }
            long j2 = elapsedRealtime - j;
            if (c71076Ruy != null) {
                list = c71076Ruy.LJFF;
            } else {
                list = null;
            }
            if (c71076Ruy != null) {
                str5 = c71076Ruy.LJI;
            }
            C71065Run.LJIIL(list, ED2.LIZ(str5), z, aweme, feedEcCardConfig, feedEcCardStyle, j2, str, str3, str4);
        } catch (Throwable unused) {
        }
    }

    public static void LIZJ(EcUgProduct ecUgProduct, C71076Ruy c71076Ruy, FeedEcCardConfig feedEcCardConfig, FeedEcCardStyle feedEcCardStyle, Aweme aweme, String str, String str2, boolean z, boolean z2) {
        try {
            C38995FSd.LIZJ().execute(new RunnableC71064Rum(ecUgProduct, c71076Ruy, feedEcCardConfig, feedEcCardStyle, aweme, str, str2, z, z2));
        } catch (Throwable unused) {
        }
    }
}
