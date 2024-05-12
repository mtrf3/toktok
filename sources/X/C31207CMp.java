package X;

import com.bytedance.android.live_settings.LiveSettingModel;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.CMp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31207CMp extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends LiveSettingModel>> {
    public static final C31207CMp LJLIL = new C31207CMp();

    public C31207CMp() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends LiveSettingModel> invoke() {
        List<LiveSettingModel> models = SettingsManager.INSTANCE.getModels();
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(models, 10));
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        for (LiveSettingModel liveSettingModel : models) {
            linkedHashMap.put(liveSettingModel.getSettingsKey(), liveSettingModel);
        }
        return linkedHashMap;
    }
}
