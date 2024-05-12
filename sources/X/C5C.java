package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.Group;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.p;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class C5C {
    public static final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(1);

    public static HashMap LIZ() {
        HashMap<String, LiveSettingModel> hashMap = LIZ;
        if (hashMap.size() > 0) {
            return hashMap;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Group(new p((Number) 0), "default group", true));
        arrayList.add(new Group(new p((Number) 1), "exp v1", false));
        arrayList.add(new Group(new p((Number) 2), "exp v2", false));
        arrayList.add(new Group(new p((Number) 3), "exp v3", false));
        LiveSettingModel liveSettingModel = new LiveSettingModel("com.bytedance.android.livesdk.setting.GameLiveAutoRotateSetting", ScopeValue.BROADCAST, "int", "landscape_audience_auto_rotate", new p((Number) 0), "kangzhibo.1", arrayList);
        liveSettingModel.setDefaultCustomClass(Integer.TYPE);
        hashMap.put("com.bytedance.android.livesdk.setting.GameLiveAutoRotateSetting", liveSettingModel);
        return hashMap;
    }
}
