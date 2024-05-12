package X;

import com.ss.android.ugc.aweme.feed.model.FeedAppLogParams;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FVI<V> implements Callable {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ FeedAppLogParams LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ long LJLJJLL;

    public FVI(boolean z, int i, long j, FeedAppLogParams feedAppLogParams, String str, long j2) {
        this.LJLIL = z;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
        this.LJLJJI = feedAppLogParams;
        this.LJLJJL = str;
        this.LJLJJLL = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FeedItemList feedItemList;
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_first", String.valueOf(this.LJLIL));
            jSONObject.put("is_success", String.valueOf(this.LJLILLLLZI));
            if (this.LJLIL) {
                jSONObject.put("app_to_success", String.valueOf(this.LJLJI));
            }
            FeedAppLogParams feedAppLogParams = this.LJLJJI;
            if (feedAppLogParams != null && (feedItemList = feedAppLogParams.mLastFeedItemList) != null) {
                boolean z = feedItemList.isFromLocalCache;
                jSONObject.put("is_cache", String.valueOf(z));
                if (z) {
                    str = String.valueOf(this.LJLJJI.mLastFeedItemList.getItems().size());
                } else {
                    str = "-1";
                }
                jSONObject.put("cache_count", str);
                if (z) {
                    str2 = String.valueOf(C1A7.LJIIL().LIZ.getLong("key_feed_cache_time", 0L));
                } else {
                    str2 = "";
                }
                jSONObject.put("cache_time", str2);
                if (z) {
                    jSONObject.put("cache_aid", FW5.LIZIZ(this.LJLJJI.mLastFeedItemList));
                }
            } else {
                jSONObject.put("cache_count", "null");
                jSONObject.put("is_cache", "null");
                jSONObject.put("cache_time", "null");
            }
            jSONObject.put("request_method", this.LJLJJL);
            jSONObject.put("duration", String.valueOf(this.LJLJJLL));
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        FUA.LIZJ("feed_cache_response", jSONObject);
        return null;
    }
}
