package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.im.core.api.experiment.IMReadReceiptOptimizationSettingModel;

/* renamed from: X.3zU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102043zU {
    public static final IMReadReceiptOptimizationSettingModel LIZ = new IMReadReceiptOptimizationSettingModel(false, 0, 0, false, 0, 0, false, 127, null);

    public static final IMReadReceiptOptimizationSettingModel LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        IMReadReceiptOptimizationSettingModel iMReadReceiptOptimizationSettingModel = LIZ;
        IMReadReceiptOptimizationSettingModel iMReadReceiptOptimizationSettingModel2 = (IMReadReceiptOptimizationSettingModel) LIZLLL.LJIIIIZZ("im_read_receipt_optimization_setting", IMReadReceiptOptimizationSettingModel.class, iMReadReceiptOptimizationSettingModel);
        if (iMReadReceiptOptimizationSettingModel2 == null) {
            return iMReadReceiptOptimizationSettingModel;
        }
        return iMReadReceiptOptimizationSettingModel2;
    }
}
