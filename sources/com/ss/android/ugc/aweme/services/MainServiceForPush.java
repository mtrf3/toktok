package com.ss.android.ugc.aweme.services;

import X.C16880lQ;
import X.EF7;
import X.QSE;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;

/* loaded from: classes7.dex */
public class MainServiceForPush implements QSE {
    public String filterUrl(Context context, String str) {
        return str;
    }

    @Override // X.QSE
    public String getDefaultUninstallQuestionUrl() {
        Uri parse = UriProtector.parse("https://www.tiktokv.com/aweme/i18n/uninstall/");
        try {
            parse = parse.buildUpon().appendQueryParameter("app_id", String.valueOf(EF7.LJIIIZ)).appendQueryParameter("device_type", Build.MODEL).appendQueryParameter("device_id", AppLog.getServerDeviceId()).appendQueryParameter("language", SettingServiceImpl.LIZ().getSysLanguage()).build();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return parse.toString();
    }
}
