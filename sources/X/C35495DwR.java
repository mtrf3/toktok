package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.common.hydrogen.configs.ActivityCenterLibraSetting;

/* renamed from: X.DwR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35495DwR implements InterfaceC253409x2 {
    @Override // X.InterfaceC253409x2
    public final java.util.Map<String, String> getConfig() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        ActivityCenterLibraSetting.ActivityCenterSettingModel activityCenterSettingModel = ActivityCenterLibraSetting.LIZ;
        ActivityCenterLibraSetting.ActivityCenterSettingModel activityCenterSettingModel2 = (ActivityCenterLibraSetting.ActivityCenterSettingModel) LIZLLL.LJIIIIZZ("activity_center", ActivityCenterLibraSetting.ActivityCenterSettingModel.class, activityCenterSettingModel);
        if (activityCenterSettingModel2 != null) {
            activityCenterSettingModel = activityCenterSettingModel2;
        }
        OSZ[] oszArr = new OSZ[1];
        String str = activityCenterSettingModel.acEntry;
        if (str == null) {
            str = "aweme://webview?_pia_=1&hide_nav_bar=1&use_spark=1&show_loading=1&should_full_screen=1&allow_webview_gesture=1&url=https%3A%2F%2Finapp.tiktokv.com%2Ftpp%2Finapp%2Fpns_product_poseidon%2Factivity_center.html%3F_pia_%3D1%26hide_nav_bar%3D1%26use_spark%3D1%26show_loading%3D1%26should_full_screen%3D1%26allow_webview_gesture%3D1";
        }
        oszArr[0] = new OSZ("ac_entry_uri", str);
        return C113554cx.LJJJLZIJ(oszArr);
    }
}
