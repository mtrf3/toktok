package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.Group;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.bytedance.android.livesdk.model.BuriedFieldData;
import com.google.gson.p;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class C5H {
    public static final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(1);

    public static HashMap LIZ() {
        HashMap<String, LiveSettingModel> hashMap = LIZ;
        if (hashMap.size() > 0) {
            return hashMap;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Group(new p(""), "default group", true));
        LiveSettingModel liveSettingModel = new LiveSettingModel("com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting", ScopeValue.PERFORMANCE, "BuriedFieldData", "ttlive_buried_field_reduction_opt", new p(""), "shizhongyu.001", arrayList);
        liveSettingModel.setDefaultCustomClass(BuriedFieldData.class);
        hashMap.put("com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting", liveSettingModel);
        return hashMap;
    }
}
