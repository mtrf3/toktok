package X;

import Y.ARunnableS42S0100000_6;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.model.UnifiedSettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchUnifiedSettingRequest;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EI2 extends EI3 {
    public BaseCombineMode LIZ;

    @Override // X.EI4
    public final String LIZ() {
        return "/service/settings/v3/";
    }

    @Override // X.EI3
    public final void LJFF(SettingCombineModel settingCombineModel) {
    }

    @Override // X.EI4
    public final BaseCombineMode LIZJ() {
        return this.LIZ;
    }

    @Override // X.EI4
    public final void LIZLLL(EHL transaction) {
        o.LJIIIZ(transaction, "transaction");
        transaction.LIZLLL(new FetchUnifiedSettingRequest(0));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("creator_fund_investigate action = creator_fund_setting_finished, success = false, is_combine = true, is_v3 = ");
        FH5.LIZIZ().getClass();
        LIZ.append(true);
        LIZ.append(", is_v3_api = true");
        C36922EeM.LJ(X1D.LIZIZ(LIZ));
        if (!C3PG.LIZIZ.LIZ("config_fetch_success")) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("status", CardStruct.IStatusCode.DEFAULT);
            c188727au.LJIIIZ("source", CardStruct.IStatusCode.DEFAULT);
            c188727au.LJIIIZ("is_combine", "1");
            FMX.LJIIL("config_fetch_success", c188727au.LIZ);
        }
    }

    @Override // X.EI3
    public final boolean LJI(SettingCombineModel settingCombineModel) {
        UnifiedSettingCombineModel unifiedSettingCombineModel;
        boolean z;
        SettingCombineDataModel data;
        if (settingCombineModel != null && (data = settingCombineModel.getData()) != null) {
            unifiedSettingCombineModel = data.getUnifiedSetting();
        } else {
            unifiedSettingCombineModel = null;
        }
        this.LIZ = unifiedSettingCombineModel;
        if (unifiedSettingCombineModel == null) {
            return false;
        }
        if (unifiedSettingCombineModel.httpCode == 200) {
            ARunnableS42S0100000_6 aRunnableS42S0100000_6 = new ARunnableS42S0100000_6(unifiedSettingCombineModel, 129);
            AqS156S0100000_6 aqS156S0100000_6 = new AqS156S0100000_6(aRunnableS42S0100000_6, 136);
            AqS156S0100000_6 aqS156S0100000_62 = new AqS156S0100000_6(aRunnableS42S0100000_6, 137);
            if ((C33778DNm.LIZ() & 1024) == 1024) {
                z = true;
            } else {
                z = false;
            }
            E3F.LIZJ("CombinedUnifiedSettingScheduleTask_idle", aqS156S0100000_6, aqS156S0100000_62, z);
            if (unifiedSettingCombineModel == null) {
                return false;
            }
        }
        if (unifiedSettingCombineModel.httpCode != 200) {
            return false;
        }
        return true;
    }
}
