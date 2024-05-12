package X;

import com.bytedance.crash.ICommonParams;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.agilelogger.ALog;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.FLw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38832FLw implements ICommonParams {
    public final String LJLIL;
    public String LJLILLLLZI;

    @Override // com.bytedance.crash.ICommonParams
    public final List<String> getPatchInfo() {
        return null;
    }

    @Override // com.bytedance.crash.ICommonParams
    public final java.util.Map<String, Integer> getPluginInfo() {
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
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        QJY.LJI(hashMap2, true);
        hashMap.putAll(hashMap2);
        if (!hashMap.containsKey("release_build")) {
            if (AppLog.getSwitchToBdtracker()) {
                str = QI9.LJIIJ;
            } else {
                str = QK9.LJI;
            }
            hashMap.put("release_build", str);
        }
        String str2 = "3902";
        if ("3902".equals(this.LJLIL)) {
            hashMap.put("aid", "3902");
        } else if (!hashMap.containsKey("aid")) {
            String valueOf = String.valueOf(EF7.LJIIIZ);
            if (!"3902".equals(this.LJLIL)) {
                str2 = valueOf;
            }
            hashMap.put("aid", str2);
        }
        C34281Dcr.LIZ().LJIIJJI();
        hashMap.put("isGrayExtra", Boolean.FALSE);
        if (this.LJLILLLLZI == null) {
            String LIZIZ = F9D.LIZIZ(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
            this.LJLILLLLZI = LIZIZ;
            if (LIZIZ == null) {
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("Npth", "getScopedDeviceId: null");
            }
        }
        String str3 = this.LJLILLLLZI;
        if (str3 != null) {
            hashMap.put("scoped_device_id", str3);
        }
        return hashMap;
    }

    @Override // com.bytedance.crash.ICommonParams
    public final String getDeviceId() {
        return DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
    }

    @Override // com.bytedance.crash.ICommonParams
    public final String getSessionId() {
        return FVP.LIZIZ;
    }

    public C38832FLw(String str) {
        this.LJLIL = str;
    }
}
