package X;

import Y.ACallableS109S0100000_6;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import com.ss.android.ugc.aweme.request_combine.model.ComplianceSettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchComplianceSettingRequest;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes7.dex */
public final class EKQ extends EI3 {
    public final String LIZ = "/aweme/v1/compliance/settings/";
    public BaseCombineMode LIZIZ;

    @Override // X.EI3
    public final void LJFF(SettingCombineModel settingCombineModel) {
    }

    @Override // X.EI4
    public final String LIZ() {
        return this.LIZ;
    }

    @Override // X.EI4
    public final BaseCombineMode LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.EI4
    public final void LIZLLL(EHL transaction) {
        o.LJIIIZ(transaction, "transaction");
        transaction.LIZLLL(new FetchComplianceSettingRequest(EFN.IDLE));
        a.LJIIZILJ().LJ(null);
    }

    @Override // X.EI3
    public final boolean LJI(SettingCombineModel settingCombineModel) {
        ComplianceSettingCombineModel complianceSettingCombineModel;
        ComplianceSetting complianceSetting;
        SettingCombineDataModel data;
        if (settingCombineModel != null && (data = settingCombineModel.getData()) != null) {
            complianceSettingCombineModel = data.getComplianceSetting();
        } else {
            complianceSettingCombineModel = null;
        }
        if (complianceSettingCombineModel == null || (complianceSetting = complianceSettingCombineModel.getComplianceSetting()) == null || complianceSetting.status_code != 0) {
            return false;
        }
        this.LIZIZ = complianceSettingCombineModel;
        if (complianceSettingCombineModel.getComplianceSetting() != null) {
            C10K.LIZJ(new ACallableS109S0100000_6(complianceSettingCombineModel, 17));
        }
        BaseCombineMode baseCombineMode = this.LIZIZ;
        if (baseCombineMode != null && baseCombineMode.httpCode == 200) {
            return true;
        }
        return false;
    }
}
