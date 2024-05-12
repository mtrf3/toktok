package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.settings.LiveSDKSettingResponse;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import com.ss.android.ugc.aweme.request_combine.model.LiveSettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchLiveSettingRequest;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EKT extends EI3 {
    public BaseCombineMode LIZ;

    @Override // X.EI4
    public final String LIZ() {
        return "/webcast/setting/";
    }

    @Override // X.EI4
    public final BaseCombineMode LIZJ() {
        return this.LIZ;
    }

    @Override // X.EI4
    public final java.util.Map<String, String> LIZIZ(Context context) {
        HashMap hashMap = new HashMap();
        LiveOuterService.LJJJLL().LJJIZ().LJJIJIIJIL();
        LiveOuterService.LJJJLL().LJJIZ().LJJIJIIJIL();
        INetworkService iNetworkService = (INetworkService) CN1.LIZ(INetworkService.class);
        if (iNetworkService != null) {
            iNetworkService.fl(hashMap);
        }
        return hashMap;
    }

    @Override // X.EI4
    public final void LIZLLL(EHL transaction) {
        o.LJIIIZ(transaction, "transaction");
        transaction.LIZLLL(new FetchLiveSettingRequest());
    }

    @Override // X.EI3
    public final void LJFF(SettingCombineModel settingCombineModel) {
        SettingCombineDataModel data;
        LiveSettingCombineModel liveSetting;
        if (settingCombineModel != null && (data = settingCombineModel.getData()) != null && (liveSetting = data.getLiveSetting()) != null && liveSetting.httpCode == 200) {
            C0F0.LIZIZ();
            C62046OWs.LJI(liveSetting.getLiveSetting());
        }
    }

    @Override // X.EI3
    public final boolean LJI(SettingCombineModel settingCombineModel) {
        LiveSDKSettingResponse liveSetting;
        SettingCombineDataModel data;
        LiveSettingCombineModel liveSettingCombineModel = null;
        if (settingCombineModel != null && (data = settingCombineModel.getData()) != null) {
            liveSettingCombineModel = data.getLiveSetting();
        }
        if (liveSettingCombineModel == null || (liveSetting = liveSettingCombineModel.getLiveSetting()) == null || liveSetting.status_code != 0) {
            return false;
        }
        this.LIZ = liveSettingCombineModel;
        if (liveSettingCombineModel != null && liveSettingCombineModel.httpCode == 200 && liveSettingCombineModel.getLiveSetting() != null && liveSettingCombineModel.getLiveSetting().status_code == 0) {
            return true;
        }
        return false;
    }
}
