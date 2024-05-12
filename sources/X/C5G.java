package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.Group;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.p;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class C5G {
    public static final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(1);

    public static HashMap LIZ() {
        HashMap<String, LiveSettingModel> hashMap = LIZ;
        if (hashMap.size() > 0) {
            return hashMap;
        }
        ArrayList arrayList = new ArrayList();
        Boolean bool = Boolean.TRUE;
        arrayList.add(new Group(new p(bool), "default group", true));
        LiveSettingModel liveSettingModel = new LiveSettingModel("com.bytedance.android.livesdk.share.ShareDialogOptSetting", ScopeValue.BROADCAST, "boolean", "broadcast_share_dialog_opt", new p(bool), "wuweishan", arrayList);
        liveSettingModel.setDefaultCustomClass(Boolean.TYPE);
        hashMap.put("com.bytedance.android.livesdk.share.ShareDialogOptSetting", liveSettingModel);
        return hashMap;
    }
}
