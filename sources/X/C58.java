package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.Group;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.bytedance.android.livesdk.broadcast.setting.BroadcastOverallScoreLevelMapping;
import com.google.gson.p;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class C58 {
    public static final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(8);

    public static HashMap LIZ() {
        HashMap<String, LiveSettingModel> hashMap = LIZ;
        if (hashMap.size() > 0) {
            return hashMap;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Group(new p((Number) 0), "default group", true));
        arrayList.add(new Group(new p((Number) 1), "remove old entrance", false));
        ScopeValue scopeValue = ScopeValue.BROADCAST;
        LiveSettingModel liveSettingModel = new LiveSettingModel("com.bytedance.android.livesdk.broadcast.interaction.toolbar.behavior.experiment.LiveOfflineSubOnlyLiveEntranceSetting", scopeValue, "int", "live_offline_sub_only_live_entrance", new p((Number) 0), "jasonsebastian", arrayList);
        Class<?> cls = Integer.TYPE;
        ArrayList LIZJ = AnonymousClass073.LIZJ(liveSettingModel, cls, hashMap, "com.bytedance.android.livesdk.broadcast.interaction.toolbar.behavior.experiment.LiveOfflineSubOnlyLiveEntranceSetting", liveSettingModel);
        Boolean bool = Boolean.FALSE;
        LIZJ.add(new Group(new p(bool), "default group", true));
        Boolean bool2 = Boolean.TRUE;
        LIZJ.add(new Group(new p(bool2), "experiment_group", false));
        LiveSettingModel liveSettingModel2 = new LiveSettingModel("com.bytedance.android.livesdk.broadcast.setting.BroadcastGamePreloadCover", scopeValue, "boolean", "ttlive_game_broadcast_preload_cover", new p(bool), "kangzhibo.1", LIZJ);
        Class cls2 = Boolean.TYPE;
        ArrayList LIZJ2 = AnonymousClass073.LIZJ(liveSettingModel2, cls2, hashMap, "com.bytedance.android.livesdk.broadcast.setting.BroadcastGamePreloadCover", liveSettingModel2);
        LIZJ2.add(new Group(new p(""), "default group", true));
        LiveSettingModel liveSettingModel3 = new LiveSettingModel("com.bytedance.android.livesdk.broadcast.setting.BroadcastOverallScoreLevelSetting", scopeValue, "BroadcastOverallScoreLevelMapping", "broadcast_overall_score_level", new p(""), "lijianchang", LIZJ2);
        ArrayList LIZJ3 = AnonymousClass073.LIZJ(liveSettingModel3, BroadcastOverallScoreLevelMapping.class, hashMap, "com.bytedance.android.livesdk.broadcast.setting.BroadcastOverallScoreLevelSetting", liveSettingModel3);
        LIZJ3.add(new Group(new p((Number) 50), "default group", true));
        LiveSettingModel liveSettingModel4 = new LiveSettingModel("com.bytedance.android.livesdk.broadcast.setting.BroadcastVideoE2EDelaySampleSetting", scopeValue, "int", "live_stream_linkmic_video_e2e_frame_interval", new p((Number) 50), "gengbaojin", LIZJ3);
        ArrayList LIZJ4 = AnonymousClass073.LIZJ(liveSettingModel4, cls, hashMap, "com.bytedance.android.livesdk.broadcast.setting.BroadcastVideoE2EDelaySampleSetting", liveSettingModel4);
        LIZJ4.add(new Group(new p(bool), "default group", true));
        LIZJ4.add(new Group(new p(bool2), "v1", false));
        LiveSettingModel liveSettingModel5 = new LiveSettingModel("com.bytedance.android.livesdk.broadcast.setting.OverrideCaptureResolutionFixSetting", scopeValue, "boolean", "live_stream_fix_resolution_override_enable", new p(bool), "chenhaohua", LIZJ4);
        ArrayList LIZJ5 = AnonymousClass073.LIZJ(liveSettingModel5, cls2, hashMap, "com.bytedance.android.livesdk.broadcast.setting.OverrideCaptureResolutionFixSetting", liveSettingModel5);
        LIZJ5.add(new Group(new p((Number) 0), "default group", true));
        LIZJ5.add(new Group(new p((Number) 1), "v1", false));
        LIZJ5.add(new Group(new p((Number) 2), "v2", false));
        LIZJ5.add(new Group(new p((Number) 3), "v3", false));
        LIZJ5.add(new Group(new p((Number) 4), "v4", false));
        LiveSettingModel liveSettingModel6 = new LiveSettingModel("com.bytedance.android.livesdk.broadcast.setting.PushStreamAppLogSwitch", scopeValue, "int", "push_stream_switch_applog", new p((Number) 0), "chenhaohua", LIZJ5);
        ArrayList LIZJ6 = AnonymousClass073.LIZJ(liveSettingModel6, cls, hashMap, "com.bytedance.android.livesdk.broadcast.setting.PushStreamAppLogSwitch", liveSettingModel6);
        LIZJ6.add(new Group(new p((Number) 200), "default group", true));
        LiveSettingModel liveSettingModel7 = new LiveSettingModel("com.bytedance.android.livesdk.broadcast.setting.RemoteVideoFrozenSetting", scopeValue, "int", "live_stream_linkmic_remote_video_frozen", new p((Number) 200), "gengbaojin", LIZJ6);
        ArrayList LIZJ7 = AnonymousClass073.LIZJ(liveSettingModel7, cls, hashMap, "com.bytedance.android.livesdk.broadcast.setting.RemoteVideoFrozenSetting", liveSettingModel7);
        LIZJ7.add(new Group(new p((Number) 0), "default group", true));
        LiveSettingModel liveSettingModel8 = new LiveSettingModel("com.bytedance.android.livesdk.broadcast.voicechat.setting.LiveVoiceChatVoiceEffectSwitchSetting", ScopeValue.LINKMIC, "int", "live_sdk_voice_chat_voice_effect_switch", new p((Number) 0), "wuweishan", LIZJ7);
        liveSettingModel8.setDefaultCustomClass(cls);
        hashMap.put("com.bytedance.android.livesdk.broadcast.voicechat.setting.LiveVoiceChatVoiceEffectSwitchSetting", liveSettingModel8);
        return hashMap;
    }
}
