package X;

import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.simkit.model.hwdec.PlayerTypeAbConfigV2;
import com.ss.android.ugc.aweme.video.bitrate.RateSettingCombineModel;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EKR extends EI3 {
    public BaseCombineMode LIZ;

    @Override // X.EI3
    public final void LJFF(SettingCombineModel settingCombineModel) {
    }

    @Override // X.EI4
    public final String LIZ() {
        if (EKS.LIZ()) {
            return "/aweme/v1/rate/settings/";
        }
        return null;
    }

    @Override // X.EI4
    public final BaseCombineMode LIZJ() {
        return this.LIZ;
    }

    @Override // X.EI4
    public final void LIZLLL(EHL transaction) {
        o.LJIIIZ(transaction, "transaction");
    }

    @Override // X.EI3
    public final boolean LJI(SettingCombineModel settingCombineModel) {
        RateSettingCombineModel rateSettingCombineModel;
        RateSettingsResponse<PlayerTypeAbConfigV2> rateSetting;
        SettingCombineDataModel data;
        if (settingCombineModel != null && (data = settingCombineModel.getData()) != null) {
            rateSettingCombineModel = data.getRateSettingCombineModel();
        } else {
            rateSettingCombineModel = null;
        }
        if (rateSettingCombineModel == null || (rateSetting = rateSettingCombineModel.getRateSetting()) == null || rateSetting.status_code != 0) {
            return false;
        }
        this.LIZ = rateSettingCombineModel;
        if (rateSettingCombineModel != null && rateSettingCombineModel.httpCode == 200) {
            return true;
        }
        return false;
    }
}
