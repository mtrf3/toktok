package X;

import com.bytedance.crash.ICommonParams;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.FLx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38833FLx implements ICommonParams {
    @Override // com.bytedance.crash.ICommonParams
    public final String getDeviceId() {
        if (C64264PKa.LJII(null)) {
            return AppLog.getServerDeviceId();
        }
        return F9J.LIZIZ(null, 0, "applog_stats").getString("device_id", "");
    }

    @Override // com.bytedance.crash.ICommonParams
    public final List<String> getPatchInfo() {
        return null;
    }

    @Override // com.bytedance.crash.ICommonParams
    public final String getSessionId() {
        return null;
    }

    @Override // com.bytedance.crash.ICommonParams
    public final long getUserId() {
        try {
            return CastLongProtector.parseLong(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getUserId());
        } catch (NumberFormatException e) {
            C16880lQ.LLLLIIL(e);
            return 0L;
        }
    }

    @Override // com.bytedance.crash.ICommonParams
    public final java.util.Map<String, Object> getCommonParams() {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        QJY.LJI(hashMap2, true);
        hashMap.putAll(hashMap2);
        hashMap.putAll(null);
        if (!hashMap.containsKey("channel")) {
            if (AppLog.getSwitchToBdtracker()) {
                str2 = DeviceRegisterManager.getChannel(null);
            } else {
                str2 = QK9.LIZ;
            }
            hashMap.put("channel", str2);
        }
        if (!hashMap.containsKey("release_build")) {
            if (AppLog.getSwitchToBdtracker()) {
                str = QI9.LJIIJ;
            } else {
                str = QK9.LJI;
            }
            hashMap.put("release_build", str);
        }
        return hashMap;
    }

    @Override // com.bytedance.crash.ICommonParams
    public final java.util.Map<String, Integer> getPluginInfo() {
        List<String> installedPackageNames;
        try {
            HashMap hashMap = new HashMap();
            IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
            if (LIZLLL != null && (installedPackageNames = LIZLLL.getInstalledPackageNames()) != null && !installedPackageNames.isEmpty()) {
                for (String str : installedPackageNames) {
                    LIZLLL.LIZIZ();
                    hashMap.put(str, 0);
                }
            }
            return hashMap;
        } catch (Exception unused) {
            return null;
        }
    }
}
