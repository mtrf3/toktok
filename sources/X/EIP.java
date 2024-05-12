package X;

import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.model.ShareSettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchShareSettingRequest;
import com.ss.android.ugc.aweme.setting.model.ShareSettings;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EIP extends EI3 {
    public BaseCombineMode LIZ;

    @Override // X.EI4
    public final String LIZ() {
        return "/aweme/v2/platform/share/settings/";
    }

    @Override // X.EI4
    public final BaseCombineMode LIZJ() {
        return this.LIZ;
    }

    @Override // X.EI4
    public final void LIZLLL(EHL transaction) {
        o.LJIIIZ(transaction, "transaction");
        transaction.LIZLLL(new FetchShareSettingRequest());
    }

    @Override // X.EI3
    public final void LJFF(SettingCombineModel settingCombineModel) {
        SettingCombineDataModel data;
        ShareSettingCombineModel shareSettingCombineModel;
        if (settingCombineModel != null && (data = settingCombineModel.getData()) != null && (shareSettingCombineModel = data.getShareSettingCombineModel()) != null && shareSettingCombineModel.httpCode == 200) {
            C36698Eak.LIZIZ().LIZ(shareSettingCombineModel.getShareSetting());
        }
    }

    @Override // X.EI3
    public final boolean LJI(SettingCombineModel settingCombineModel) {
        ShareSettingCombineModel shareSettingCombineModel;
        ShareSettings shareSetting;
        SettingCombineDataModel data;
        if (settingCombineModel != null && (data = settingCombineModel.getData()) != null) {
            shareSettingCombineModel = data.getShareSettingCombineModel();
        } else {
            shareSettingCombineModel = null;
        }
        if (shareSettingCombineModel == null || (shareSetting = shareSettingCombineModel.getShareSetting()) == null || shareSetting.status_code != 0) {
            return false;
        }
        this.LIZ = shareSettingCombineModel;
        if (shareSettingCombineModel != null && shareSettingCombineModel.httpCode == 200) {
            return true;
        }
        return false;
    }
}
