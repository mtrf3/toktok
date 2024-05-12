package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.Group;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.p;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class C5D {
    public static final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(1);

    public static HashMap LIZ() {
        HashMap<String, LiveSettingModel> hashMap = LIZ;
        if (hashMap.size() > 0) {
            return hashMap;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Group(new p((Number) 0), "experiment_group", false));
        arrayList.add(new Group(new p((Number) 1), "default_group", true));
        LiveSettingModel liveSettingModel = new LiveSettingModel("com.bytedance.android.livesdk.comp.impl.game.linkmic.settings.GameLinkMicSetting", ScopeValue.LINKMIC, "int", "ttlive_game_link_mic_switch", new p((Number) 1), "dongshangyong", arrayList);
        liveSettingModel.setDefaultCustomClass(Integer.TYPE);
        hashMap.put("com.bytedance.android.livesdk.comp.impl.game.linkmic.settings.GameLinkMicSetting", liveSettingModel);
        return hashMap;
    }
}
