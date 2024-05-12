package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.Group;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.p;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class C59 {
    public static final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(7);

    public static HashMap LIZ() {
        HashMap<String, LiveSettingModel> hashMap = LIZ;
        if (hashMap.size() > 0) {
            return hashMap;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Group(new p((Number) 0), "default group", true));
        LiveSettingModel liveSettingModel = new LiveSettingModel("com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSeiTalkEqualSetting", ScopeValue.LINKMIC, "int", "multi_guest_sei_talk_equal", new p((Number) 0), "chenzepeng", arrayList);
        Class cls = Integer.TYPE;
        ArrayList LIZJ = AnonymousClass073.LIZJ(liveSettingModel, cls, hashMap, "com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSeiTalkEqualSetting", liveSettingModel);
        Boolean bool = Boolean.FALSE;
        LIZJ.add(new Group(new p(bool), "default group", true));
        ScopeValue scopeValue = ScopeValue.ROOMFUNCTION;
        LiveSettingModel liveSettingModel2 = new LiveSettingModel("com.bytedance.android.livesdk.livesetting.roomfunction.LiveMtMockLandscapeSetting", scopeValue, "boolean", "live_mt_mock_landscape", new p(bool), "chenwenjie.19931007", LIZJ);
        Class cls2 = Boolean.TYPE;
        ArrayList LIZJ2 = AnonymousClass073.LIZJ(liveSettingModel2, cls2, hashMap, "com.bytedance.android.livesdk.livesetting.roomfunction.LiveMtMockLandscapeSetting", liveSettingModel2);
        LIZJ2.add(new Group(new p((Number) 0), "default group", true));
        LIZJ2.add(new Group(new p((Number) 1), "group1", false));
        LIZJ2.add(new Group(new p((Number) 2), "group2", false));
        LIZJ2.add(new Group(new p((Number) 3), "group3", false));
        LIZJ2.add(new Group(new p((Number) 4), "group4", false));
        LiveSettingModel liveSettingModel3 = new LiveSettingModel("com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameLandscapeDesignOptimizeSetting", scopeValue, "int", "ttlive_game_landscape_design_optimize", new p((Number) 0), "taoxi.tallsy", LIZJ2);
        ArrayList LIZJ3 = AnonymousClass073.LIZJ(liveSettingModel3, cls, hashMap, "com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameLandscapeDesignOptimizeSetting", liveSettingModel3);
        Boolean bool2 = Boolean.TRUE;
        LIZJ3.add(new Group(new p(bool2), "default", true));
        ScopeValue scopeValue2 = ScopeValue.WATCHLIVE;
        LiveSettingModel liveSettingModel4 = new LiveSettingModel("com.bytedance.android.livesdk.livesetting.watchlive.LiveMaskLayerCheckSetting", scopeValue2, "boolean", "live_mask_layer_check", new p(bool2), "zengwei.godv", LIZJ3);
        ArrayList LIZJ4 = AnonymousClass073.LIZJ(liveSettingModel4, cls2, hashMap, "com.bytedance.android.livesdk.livesetting.watchlive.LiveMaskLayerCheckSetting", liveSettingModel4);
        LIZJ4.add(new Group(new p(bool), "default", true));
        LiveSettingModel liveSettingModel5 = new LiveSettingModel("com.bytedance.android.livesdk.livesetting.watchlive.LiveNetworkRequestSync", scopeValue2, "boolean", "live_network_request_sync", new p(bool), "zengwei.godv", LIZJ4);
        ArrayList LIZJ5 = AnonymousClass073.LIZJ(liveSettingModel5, cls2, hashMap, "com.bytedance.android.livesdk.livesetting.watchlive.LiveNetworkRequestSync", liveSettingModel5);
        LIZJ5.add(new Group(new p(bool), "default", true));
        LIZJ5.add(new Group(new p(bool2), "v1", false));
        LiveSettingModel liveSettingModel6 = new LiveSettingModel("com.bytedance.android.livesdk.livesetting.watchlive.LiveNetworkRequestV2", scopeValue2, "boolean", "live_network_request_v2", new p(bool), "zengwei.godv", LIZJ5);
        ArrayList LIZJ6 = AnonymousClass073.LIZJ(liveSettingModel6, cls2, hashMap, "com.bytedance.android.livesdk.livesetting.watchlive.LiveNetworkRequestV2", liveSettingModel6);
        LIZJ6.add(new Group(new p(""), "default", true));
        LiveSettingModel liveSettingModel7 = new LiveSettingModel("com.bytedance.android.livesdk.livesetting.watchlive.LiveNetworkSyncBlockList", scopeValue2, "java.lang.String[]", "live_network_sync_block_list", new p(""), "zengwei.godv", LIZJ6);
        liveSettingModel7.setDefaultCustomClass(String[].class);
        hashMap.put("com.bytedance.android.livesdk.livesetting.watchlive.LiveNetworkSyncBlockList", liveSettingModel7);
        return hashMap;
    }
}
