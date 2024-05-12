package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.j;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import com.ss.android.ugc.aweme.request_combine.PortraitCombineModel;
import com.ss.android.ugc.aweme.request_combine.common.ServerPortraitCollections;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EKI extends EI3 {
    public BaseCombineMode LIZ;

    @Override // X.EI4
    public final String LIZ() {
        return "/tiktok/v1/efficiency_portrait/";
    }

    @Override // X.EI4
    public final BaseCombineMode LIZJ() {
        return this.LIZ;
    }

    @Override // X.EI4
    public final java.util.Map<String, String> LIZIZ(Context context) {
        return C03660Ck.LIZJ("group_list", "bitrate_selection,socket_dynamic_timeout_strategy,echo_smart_preload");
    }

    @Override // X.EI4
    public final void LIZLLL(EHL transaction) {
        o.LJIIIZ(transaction, "transaction");
        ServerPortraitCollections.LIZJ();
    }

    @Override // X.EI3
    public final void LJFF(SettingCombineModel settingCombineModel) {
        SettingCombineDataModel data;
        PortraitCombineModel portraitCombineModel;
        if (settingCombineModel == null || (data = settingCombineModel.getData()) == null || (portraitCombineModel = data.getPortraitCombineModel()) == null) {
            return;
        }
        if (EKL.LIZ() != 0) {
            GsonProtectorUtils.fromJson(new Gson(), portraitCombineModel.getPortraitData(), new EKJ().getType()).getClass();
        }
        ServerPortraitCollections.LIZJ();
    }

    @Override // X.EI3
    public final boolean LJI(SettingCombineModel settingCombineModel) {
        PortraitCombineModel portraitCombineModel;
        SettingCombineDataModel data;
        j jVar = null;
        if (settingCombineModel != null && (data = settingCombineModel.getData()) != null) {
            portraitCombineModel = data.getPortraitCombineModel();
            if (portraitCombineModel != null) {
                jVar = portraitCombineModel.getPortraitData();
            }
        } else {
            portraitCombineModel = null;
        }
        if (jVar == null) {
            return false;
        }
        this.LIZ = portraitCombineModel;
        if (portraitCombineModel == null || portraitCombineModel.httpCode != 200) {
            return false;
        }
        return true;
    }
}
