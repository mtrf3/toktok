package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.common.hydrogen.configs.DYDLibraSetting;

/* loaded from: classes11.dex */
public final class OPO implements InterfaceC253409x2 {
    @Override // X.InterfaceC253409x2
    public final java.util.Map<String, String> getConfig() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        DYDLibraSetting.DYDSettingModel dYDSettingModel = DYDLibraSetting.LIZ;
        DYDLibraSetting.DYDSettingModel dYDSettingModel2 = (DYDLibraSetting.DYDSettingModel) LIZLLL.LJIIIIZZ("dyd_inapp", DYDLibraSetting.DYDSettingModel.class, dYDSettingModel);
        if (dYDSettingModel2 != null) {
            dYDSettingModel = dYDSettingModel2;
        }
        OSZ[] oszArr = new OSZ[5];
        String str = dYDSettingModel.dydMainUri;
        if (str == null) {
            str = "aweme://webview?container_color_auto_dark=1&use_spark=1&hide_nav_bar=1&url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Fdownload-your-data";
        }
        oszArr[0] = new OSZ("dyd_main", str);
        String str2 = dYDSettingModel.dydGuestUri;
        if (str2 == null) {
            str2 = "aweme://webview?container_color_auto_dark=1&use_spark=1&hide_nav_bar=1&url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Fdownload-your-data%2Fguest";
        }
        oszArr[1] = new OSZ("dyd_guest", str2);
        String str3 = dYDSettingModel.dydGuestDownload;
        if (str3 == null) {
            str3 = "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Fdownload-your-data%2Fguest%2Fdownload";
        }
        oszArr[2] = new OSZ("dyd_guest_download", str3);
        String str4 = dYDSettingModel.dydUnregistered;
        if (str4 == null) {
            str4 = "aweme://webview?container_color_auto_dark=1&use_spark=1&hide_nav_bar=1&url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Fdownload-your-data%2Funregistered-user";
        }
        oszArr[3] = new OSZ("dyd_unregistered_user", str4);
        String str5 = dYDSettingModel.dydUnregisteredDownload;
        if (str5 == null) {
            str5 = "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Fdownload-your-data%2Funregistered-user%2Fdownload";
        }
        oszArr[4] = new OSZ("dyd_unregistered_user_download", str5);
        return C113554cx.LJJL(oszArr);
    }
}
