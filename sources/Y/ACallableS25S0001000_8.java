package Y;

import X.C16880lQ;
import X.C47242IgQ;
import X.C50676Jui;
import X.EF7;
import X.FMX;
import X.IW6;
import X.IW7;
import X.IW8;
import X.WM7;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.g;
import com.google.gson.m;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.ml.ab.FeedLoadMorePlan;
import com.ss.android.ugc.aweme.ml.ab.SmartFeedLoadMoreStrategyConfig;
import com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService;
import defpackage.i0;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class ACallableS25S0001000_8 implements Callable {
    public final int $t;
    public int i0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS25S0001000_8 aCallableS25S0001000_8) {
        int i = aCallableS25S0001000_8.i0;
        HashMap hashMap = new HashMap();
        hashMap.put("position", Integer.toString(i));
        hashMap.put("search_type", C50676Jui.LIZ(i));
        FMX.LJIIL("search_tab_selected", hashMap);
        return null;
    }

    public static final Object call$1(ACallableS25S0001000_8 aCallableS25S0001000_8) {
        String jVar;
        String str;
        List<FeedLoadMorePlan> plans;
        switch (aCallableS25S0001000_8.i0) {
            case 0:
                SmartFeedPreloadService.instance().addResultListener(IW7.LIZJ);
                String smartPreloadStrategyV2ExperimentJsonString = SmartFeedPreloadService.instance().getSmartPreloadStrategyV2ExperimentJsonString();
                if (!TextUtils.isEmpty(smartPreloadStrategyV2ExperimentJsonString)) {
                    C47242IgQ.LIZ().setSmartPreloadAlgorithmJson(smartPreloadStrategyV2ExperimentJsonString);
                }
                if (!IW6.LIZ) {
                    IW6.LIZ = true;
                    IW6.LIZIZ = (m) i0.LJ(true, "video_smart_range_request_v1", 31744, m.class, null);
                }
                if (IW6.LIZIZ == null) {
                    jVar = null;
                } else {
                    m mVar = new m();
                    mVar.LJJII("video_smart_range_request_v1", IW6.LIZIZ);
                    jVar = mVar.toString();
                }
                if (!TextUtils.isEmpty(jVar)) {
                    C47242IgQ.LIZ().setSmartPreloadPlayTaskAlgorithmJson(jVar);
                }
                g gVar = new g();
                g gVar2 = new g();
                SmartFeedLoadMoreStrategyConfig LIZ = IW8.LIZ();
                if (LIZ != null && (plans = LIZ.getPlans()) != null) {
                    boolean z = false;
                    for (FeedLoadMorePlan feedLoadMorePlan : plans) {
                        if (feedLoadMorePlan.getPreloadPlan() != null) {
                            m mVar2 = new m();
                            mVar2.LJJIIJ("preload_duration", Integer.valueOf(feedLoadMorePlan.getPreloadDuration()));
                            mVar2.LJJII("preload_plan", GsonProtectorUtils.toJsonTree(new Gson(), feedLoadMorePlan.getPreloadPlan()));
                            gVar2.LJJII(mVar2);
                            boolean preload = feedLoadMorePlan.getPreload();
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("loadmore-");
                            LIZ2.append(preload);
                            String LIZIZ = X1D.LIZIZ(LIZ2);
                            gVar.LJJIIJ(LIZIZ);
                            if (IW8.LIZLLL == null) {
                                IW8.LIZLLL = new HashMap<>();
                            }
                            HashMap<Boolean, String> hashMap = IW8.LIZLLL;
                            if (hashMap != null) {
                                hashMap.put(Boolean.valueOf(feedLoadMorePlan.getPreload()), LIZIZ);
                            }
                            z = true;
                        }
                    }
                    IW8.LIZJ = z;
                }
                if (gVar.size() > 0 && gVar2.size() > 0) {
                    m mVar3 = new m();
                    mVar3.LJJII("lable_index_mapping", gVar);
                    mVar3.LJJII("plan", gVar2);
                    m mVar4 = new m();
                    mVar4.LJJII("timeliness_preload_config", mVar3);
                    str = mVar4.toString();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    C47242IgQ.LIZ().LJFF(str);
                }
                return null;
            default:
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("event", "feed_banned");
                    jSONObject.put(WM7.SCENE_SERVICE, "feed");
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_recordMiscLog(EF7.LIZIZ(), "app_perf", jSONObject);
                return null;
        }
    }

    public ACallableS25S0001000_8(int i, int i2) {
        this.$t = i2;
        switch (i2) {
            case 0:
                this.i0 = i;
                return;
            default:
                this.i0 = i;
                return;
        }
    }
}
