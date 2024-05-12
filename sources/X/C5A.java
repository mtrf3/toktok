package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.Group;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.p;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class C5A {
    public static final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(4);

    public static HashMap LIZ() {
        HashMap<String, LiveSettingModel> hashMap = LIZ;
        if (hashMap.size() > 0) {
            return hashMap;
        }
        ArrayList arrayList = new ArrayList();
        Float valueOf = Float.valueOf(0.15f);
        arrayList.add(new Group(new p((Number) valueOf), "default group", true));
        ScopeValue scopeValue = ScopeValue.BROADCAST;
        LiveSettingModel liveSettingModel = new LiveSettingModel("com.bytedance.android.livesdk.livesetting.broadcast.LiveBGMDefaultVolumeSetting", scopeValue, "float", "live_bg_music_default_volume_v2", new p((Number) valueOf), "zhutianye", arrayList);
        Class cls = Float.TYPE;
        ArrayList LIZJ = AnonymousClass073.LIZJ(liveSettingModel, cls, hashMap, "com.bytedance.android.livesdk.livesetting.broadcast.LiveBGMDefaultVolumeSetting", liveSettingModel);
        Float valueOf2 = Float.valueOf(0.3f);
        LIZJ.add(new Group(new p((Number) valueOf2), "default group", true));
        LiveSettingModel liveSettingModel2 = new LiveSettingModel("com.bytedance.android.livesdk.livesetting.broadcast.LiveBgMusicDefaultVolumeSetting", scopeValue, "float", "live_bg_music_default_volume", new p((Number) valueOf2), "liukan.kk", LIZJ);
        ArrayList LIZJ2 = AnonymousClass073.LIZJ(liveSettingModel2, cls, hashMap, "com.bytedance.android.livesdk.livesetting.broadcast.LiveBgMusicDefaultVolumeSetting", liveSettingModel2);
        LIZJ2.add(new Group(new p(""), "default group", true));
        LiveSettingModel liveSettingModel3 = new LiveSettingModel("com.bytedance.android.livesdk.livesetting.broadcast.LiveForbbidenDetailPageSetting", scopeValue, "java.lang.String", "live_forbbiden_detail_page", new p(""), "lishuo.oo", LIZJ2);
        ArrayList LIZJ3 = AnonymousClass073.LIZJ(liveSettingModel3, String.class, hashMap, "com.bytedance.android.livesdk.livesetting.broadcast.LiveForbbidenDetailPageSetting", liveSettingModel3);
        LIZJ3.add(new Group(new p((Number) 0), "default group", true));
        LiveSettingModel liveSettingModel4 = new LiveSettingModel("com.bytedance.android.livesdk.livesetting.watchlive.LivePipDefaultOpenSetting", ScopeValue.WATCHLIVE, "int", "live_pip_default_open", new p((Number) 0), "sunqiang.2759", LIZJ3);
        liveSettingModel4.setDefaultCustomClass(Integer.TYPE);
        hashMap.put("com.bytedance.android.livesdk.livesetting.watchlive.LivePipDefaultOpenSetting", liveSettingModel4);
        return hashMap;
    }
}
