package X;

import Y.ARunnableS42S0100000_6;
import com.ss.android.ugc.aweme.lego.RunnableIdleTask;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.model.UserSettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchUserSettingRequest;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EIA extends EI3 {
    public BaseCombineMode LIZ;

    @Override // X.EI4
    public final String LIZ() {
        if (HG3.LJIILL().isLogin()) {
            return "/aweme/v1/user/settings/";
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
        transaction.LIZLLL(new FetchUserSettingRequest());
    }

    @Override // X.EI3
    public final void LJFF(SettingCombineModel settingCombineModel) {
        SettingCombineDataModel data;
        UserSettingCombineModel userSettingCombineModel;
        if (settingCombineModel != null && (data = settingCombineModel.getData()) != null && (userSettingCombineModel = data.getUserSettingCombineModel()) != null && userSettingCombineModel.httpCode == 200) {
            PushSettings pushSettings = userSettingCombineModel.getUserSetting();
            o.LJIIIZ(pushSettings, "pushSettings");
            if ((C33778DNm.LIZ() & 128) == 128) {
                C36089EEj c36089EEj = new C36089EEj(false, false);
                c36089EEj.LIZIZ(new RunnableIdleTask(new ARunnableS42S0100000_6(pushSettings, 86), "RealUpdatePushSettingTask"), true);
                c36089EEj.LIZJ();
            } else if (((Boolean) EIH.LIZIZ.getValue()).booleanValue()) {
                C38995FSd.LIZJ().execute(new ARunnableS42S0100000_6(pushSettings, 88));
            } else {
                C85921Xnp.LIZ(pushSettings);
            }
        }
    }

    @Override // X.EI3
    public final boolean LJI(SettingCombineModel settingCombineModel) {
        UserSettingCombineModel userSettingCombineModel;
        PushSettings userSetting;
        SettingCombineDataModel data;
        if (settingCombineModel != null && (data = settingCombineModel.getData()) != null) {
            userSettingCombineModel = data.getUserSettingCombineModel();
        } else {
            userSettingCombineModel = null;
        }
        if (userSettingCombineModel == null || (userSetting = userSettingCombineModel.getUserSetting()) == null || userSetting.status_code != 0) {
            return false;
        }
        this.LIZ = userSettingCombineModel;
        if (userSettingCombineModel != null && userSettingCombineModel.httpCode == 200) {
            return true;
        }
        return false;
    }
}
