package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.SmartCheckSettingModel;

/* renamed from: X.Dxw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35588Dxw {
    public static final SmartCheckSettingModel LIZ = new SmartCheckSettingModel(false, null, null, 7, null);

    public static final SmartCheckSettingModel LIZ() {
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            SmartCheckSettingModel smartCheckSettingModel = LIZ;
            SmartCheckSettingModel smartCheckSettingModel2 = (SmartCheckSettingModel) LIZLLL.LJIIIIZZ("smart_check_setting", SmartCheckSettingModel.class, smartCheckSettingModel);
            if (smartCheckSettingModel2 != null) {
                return smartCheckSettingModel2;
            }
            return smartCheckSettingModel;
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setting: ");
            LIZ2.append(th);
            C35589Dxx.LIZ(X1D.LIZIZ(LIZ2));
            return LIZ;
        }
    }
}
