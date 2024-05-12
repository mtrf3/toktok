package X;

import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardStyle;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.card.container.view.biz.DefaultFeedEcCardBizView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Rup, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71067Rup extends TAT {
    public final /* synthetic */ SY4 LJLJJI;
    public final /* synthetic */ FeedEcCardStyle LJLJJL;
    public final /* synthetic */ Aweme LJLJJLL;
    public final /* synthetic */ FeedEcCardConfig LJLJL;
    public final /* synthetic */ DefaultFeedEcCardBizView LJLJLJ;

    @Override // X.TAT
    public final void LIZ(View view) {
        List<String> list;
        JSONObject jSONObject;
        int size;
        if (view != null) {
            Context context = this.LJLJJI.getContext();
            o.LJIIIIZZ(context, "context");
            String shopTabSchema = this.LJLJJL.getCardBtnSeeMoreSchema();
            Aweme aweme = this.LJLJJLL;
            FeedEcCardConfig cardConfig = this.LJLJL;
            FeedEcCardStyle cardStyle = this.LJLJJL;
            DefaultFeedEcCardBizView defaultFeedEcCardBizView = this.LJLJLJ;
            C71076Ruy c71076Ruy = defaultFeedEcCardBizView.LJLJJI;
            boolean z = defaultFeedEcCardBizView.LJLJL;
            o.LJIIIZ(aweme, "aweme");
            o.LJIIIZ(cardConfig, "cardConfig");
            o.LJIIIZ(cardStyle, "cardStyle");
            if (shopTabSchema == null || ujb.o.LJJJJJL(shopTabSchema)) {
                shopTabSchema = "";
            } else {
                String str = null;
                if (c71076Ruy != null) {
                    list = c71076Ruy.LJFF;
                } else {
                    list = null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String LIZ = ED2.LIZ(cardConfig.getUserStatus());
                String LIZ2 = ED2.LIZ(Integer.valueOf(C71065Run.LIZLLL(cardConfig)));
                String LIZ3 = ED2.LIZ(cardConfig.getContentType());
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(LIZ);
                LIZ4.append('_');
                LIZ4.append(LIZ2);
                LIZ4.append('_');
                LIZ4.append(LIZ3);
                String LIZIZ = X1D.LIZIZ(LIZ4);
                if (!ujb.o.LJJJJJL(LIZIZ)) {
                    linkedHashMap.put("mall_direct_trigger", LIZIZ);
                }
                String LIZ5 = ED2.LIZ(C35777E2j.LIZ(list));
                if (!ujb.o.LJJJJJL(LIZ5)) {
                    linkedHashMap.put("product_id", LIZ5);
                }
                if (list != null && (size = list.size()) > 0) {
                    linkedHashMap.put("product_cnt", Integer.valueOf(size));
                    linkedHashMap.put("product_show_cnt", Integer.valueOf(size));
                }
                java.util.Map<String, Object> trackParams = cardConfig.getTrackParams();
                if (trackParams != null) {
                    String LIZ6 = ED2.LIZ(trackParams.get("entrance_form"));
                    if (!ujb.o.LJJJJJL(LIZ6)) {
                        linkedHashMap.put("entrance_form", LIZ6);
                    }
                }
                String LIZ7 = ED2.LIZ(aweme.getAid());
                if (!ujb.o.LJJJJJL(LIZ7)) {
                    linkedHashMap.put("aweme_id", LIZ7);
                }
                FeedEcCardConfig.FeedEcCardInfo cardInfo = cardConfig.getCardInfo();
                if (cardInfo != null) {
                    str = cardInfo.getRecommendInfo();
                }
                linkedHashMap.put("rec_params", ED2.LIZ(str));
                linkedHashMap.put("request_id", ED2.LIZ(aweme.getRequestId()));
                o.LJIIIZ(shopTabSchema, "shopTabSchema");
                try {
                    android.net.Uri parse = UriProtector.parse(shopTabSchema);
                    if (LUT.LIZLLL(parse)) {
                        try {
                            jSONObject = new JSONObject(ED3.LJ(parse, "mall_extra_info"));
                        } catch (Throwable unused) {
                            jSONObject = new JSONObject();
                        }
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            if (!jSONObject.has((String) entry.getKey())) {
                                jSONObject.put((String) entry.getKey(), entry.getValue());
                            }
                        }
                        String jSONObject2 = jSONObject.toString();
                        o.LJIIIIZZ(jSONObject2, "mallExtraInfoJson.toString()");
                        android.net.Uri LIZIZ2 = ED3.LIZIZ(parse, "mall_extra_info", jSONObject2);
                        if (LIZIZ2 != null) {
                            String uri = LIZIZ2.toString();
                            if (uri != null) {
                                shopTabSchema = uri;
                            }
                        }
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    C78983UzD.LJIIZILJ(th);
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
            }
            boolean z2 = !ujb.o.LJJJJJL(shopTabSchema);
            if (z2) {
                C71066Ruo.LIZIZ = true;
                SmartRouter.buildRoute(context, shopTabSchema).open();
            }
            try {
                C38995FSd.LIZJ().execute(new RunnableC71068Ruq(c71076Ruy, z, aweme, cardConfig, cardStyle, null, z2));
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71067Rup(SY4 sy4, FeedEcCardStyle feedEcCardStyle, Aweme aweme, FeedEcCardConfig feedEcCardConfig, DefaultFeedEcCardBizView defaultFeedEcCardBizView) {
        super(700L);
        this.LJLJJI = sy4;
        this.LJLJJL = feedEcCardStyle;
        this.LJLJJLL = aweme;
        this.LJLJL = feedEcCardConfig;
        this.LJLJLJ = defaultFeedEcCardBizView;
    }
}
