package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.Group;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.bytedance.android.livesdk.workaround.Options;
import com.google.gson.p;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class C5I {
    public static final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(1);

    public static HashMap LIZ() {
        HashMap<String, LiveSettingModel> hashMap = LIZ;
        if (hashMap.size() > 0) {
            return hashMap;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Group(new p(""), "default", true));
        LiveSettingModel liveSettingModel = new LiveSettingModel("com.bytedance.android.livesdk.workaround.SurfaceViewAndroid10Workaround", ScopeValue.WATCHLIVE, "Options", "surfaceview_android10_workaround", new p(""), "wangyan.shang", arrayList);
        liveSettingModel.setDefaultCustomClass(Options.class);
        hashMap.put("com.bytedance.android.livesdk.workaround.SurfaceViewAndroid10Workaround", liveSettingModel);
        return hashMap;
    }
}
