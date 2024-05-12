package X;

import com.squareup.wire.Message;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionCountAgent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.tiktok.ConvertHelper;
import org.json.JSONObject;

/* renamed from: X.Lt1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55667Lt1 implements InterfaceC55669Lt3 {
    public final void LIZ(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.put("error_code", 0);
            jSONObject.put("error_desc", str);
            jSONObject.put("type", "error");
            jSONObject2.put("type", "error");
        } catch (Exception e) {
            C36922EeM.LJFF(e);
        }
        C09900aA.LJI("foru_data_parse_monitor", jSONObject2, jSONObject3, jSONObject);
        if (C35168DrA.LIZ()) {
            C56742Ko c56742Ko = new C56742Ko();
            c56742Ko.LIZ(String.valueOf(1), "isSuccess");
            c56742Ko.LIZ(String.valueOf(0), "code");
            c56742Ko.LIZ(str, "errMsg");
            c56742Ko.LIZ("convertPb", "source");
            C9K4.LIZLLL(c56742Ko.LIZ, "", C9K6.REQUEST_DATA, null);
        }
    }

    public final void LIZIZ(long j, Object obj, Message message, boolean z) {
        FeedItemList com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList;
        if (z) {
            if (obj instanceof FeedItemList) {
                com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList = (FeedItemList) obj;
            } else {
                return;
            }
        } else if (!z && (message instanceof RKZ)) {
            com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList = ConvertHelper.com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList((RKZ) message, null);
        } else {
            return;
        }
        if (com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject.put("duration", j);
                LogPbBean logPbBean = com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.logPb;
                if (logPbBean != null) {
                    jSONObject.put("logid", logPbBean.getImprId());
                }
                jSONObject.put("content_type", "json");
                if (com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.status_code == 0 && com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.getItems().size() != 0) {
                    jSONObject.put("count", com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.getItems().size());
                    jSONObject.put("type", "normal");
                    jSONObject2.put("type", "normal");
                    if (C52535Kjb.LIZ()) {
                        for (Aweme aweme : com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.getItems()) {
                            AwemeCollectionAgent.LJIIZILJ().LJIIJ(Boolean.valueOf(aweme.isCollected()), aweme.getAid());
                            if (aweme.getStatistics() == null) {
                                AwemeCollectionCountAgent.LJIILJJIL().LJIIJ(0L, aweme.getAid());
                            } else {
                                AwemeCollectionCountAgent.LJIILJJIL().LJIIJ(Long.valueOf(aweme.getStatistics().getCollectCount()), aweme.getAid());
                            }
                        }
                    }
                } else if (com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.getItems().size() == 0) {
                    jSONObject.put("count", 0);
                    jSONObject.put("type", "server_empty");
                    jSONObject2.put("type", "server_empty");
                } else {
                    jSONObject.put("error_code", com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.status_code);
                    jSONObject.put("error_desc", com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.status_msg);
                    jSONObject.put("type", "error");
                    jSONObject2.put("type", "error");
                }
            } catch (Exception e) {
                C36922EeM.LJFF(e);
            }
            C09900aA.LJI("foru_data_parse_monitor", jSONObject2, jSONObject3, jSONObject);
            C9K4.LIZIZ("response convert ComposePbAndJson success", "");
        }
    }
}
