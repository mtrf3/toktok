package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.Group;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.p;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class C5B {
    public static final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(4);

    public static HashMap LIZ() {
        HashMap<String, LiveSettingModel> hashMap = LIZ;
        if (hashMap.size() > 0) {
            return hashMap;
        }
        ArrayList arrayList = new ArrayList();
        Boolean bool = Boolean.FALSE;
        arrayList.add(new Group(new p(bool), "default group", true));
        LiveSettingModel liveSettingModel = new LiveSettingModel("com.bytedance.android.livesdk.impl.revenue.subscription.SubscriptionPayoutOnboardingAPISetting", ScopeValue.WATCHLIVE, "boolean", "subscription_payout_onboarding_new_api", new p(bool), "Daniel.Li", arrayList);
        Class cls = Boolean.TYPE;
        ArrayList LIZJ = AnonymousClass073.LIZJ(liveSettingModel, cls, hashMap, "com.bytedance.android.livesdk.impl.revenue.subscription.SubscriptionPayoutOnboardingAPISetting", liveSettingModel);
        LIZJ.add(new Group(new p(bool), "default group", true));
        ScopeValue scopeValue = ScopeValue.SUBSCRIPTION;
        LiveSettingModel liveSettingModel2 = new LiveSettingModel("com.bytedance.android.livesdk.impl.revenue.subscription.ui.spotlight.SpotlightFeatureDisable", scopeValue, "boolean", "disable_sub_spotlight", new p(bool), "Daniel.Li", LIZJ);
        ArrayList LIZJ2 = AnonymousClass073.LIZJ(liveSettingModel2, cls, hashMap, "com.bytedance.android.livesdk.impl.revenue.subscription.ui.spotlight.SpotlightFeatureDisable", liveSettingModel2);
        LIZJ2.add(new Group(new p((Number) 5), "default group", true));
        LiveSettingModel liveSettingModel3 = new LiveSettingModel("com.bytedance.android.livesdk.impl.revenue.subscription.ui.spotlight.SpotlightLoopInterval", scopeValue, "int", "subscription_spotlight_loop_query_interval", new p((Number) 5), "Daniel.Li", LIZJ2);
        Class<?> cls2 = Integer.TYPE;
        ArrayList LIZJ3 = AnonymousClass073.LIZJ(liveSettingModel3, cls2, hashMap, "com.bytedance.android.livesdk.impl.revenue.subscription.ui.spotlight.SpotlightLoopInterval", liveSettingModel3);
        LIZJ3.add(new Group(new p((Number) 4), "default group", true));
        LiveSettingModel liveSettingModel4 = new LiveSettingModel("com.bytedance.android.livesdk.impl.revenue.subscription.ui.spotlight.SpotlightLoopTimes", scopeValue, "int", "subscription_spotlight_loop_query_times", new p((Number) 4), "Daniel.Li", LIZJ3);
        liveSettingModel4.setDefaultCustomClass(cls2);
        hashMap.put("com.bytedance.android.livesdk.impl.revenue.subscription.ui.spotlight.SpotlightLoopTimes", liveSettingModel4);
        return hashMap;
    }
}
