package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.Group;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.bytedance.android.livesdk.rank.api.LiveRankLynxConfig;
import com.bytedance.android.livesdk.rank.api.LiveRankTypeConfig;
import com.google.gson.p;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class C5F {
    public static final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(2);

    public static HashMap LIZ() {
        HashMap<String, LiveSettingModel> hashMap = LIZ;
        if (hashMap.size() > 0) {
            return hashMap;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Group(new p(""), "default group", true));
        ScopeValue scopeValue = ScopeValue.RANK;
        LiveSettingModel liveSettingModel = new LiveSettingModel("com.bytedance.android.livesdk.rank.api.LiveRankLynxConfig", scopeValue, "Config", "live_rank_lynx_config", new p(""), "wuqi.257", arrayList);
        ArrayList LIZJ = AnonymousClass073.LIZJ(liveSettingModel, LiveRankLynxConfig.Config.class, hashMap, "com.bytedance.android.livesdk.rank.api.LiveRankLynxConfig", liveSettingModel);
        LIZJ.add(new Group(new p(""), "default group", true));
        LiveSettingModel liveSettingModel2 = new LiveSettingModel("com.bytedance.android.livesdk.rank.api.LiveRankTypeConfig", scopeValue, "Config", "live_rank_type_config", new p(""), "mengqingyu.21", LIZJ);
        liveSettingModel2.setDefaultCustomClass(LiveRankTypeConfig.Config.class);
        hashMap.put("com.bytedance.android.livesdk.rank.api.LiveRankTypeConfig", liveSettingModel2);
        return hashMap;
    }
}
