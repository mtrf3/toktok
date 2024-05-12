package X;

import android.os.Build;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.common.applog.AppLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Eyp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38191Eyp {
    public static final java.util.Map LIZ(String str) {
        Object[] objArr;
        boolean LJ = o.LJ(EnumC38078Ex0.PUBLIC.toString(), str);
        List list = null;
        if (LJ) {
            SettingsManager.LIZLLL().getClass();
            Object LJII = SettingsManager.LJII("aweme_appinfo_safehost_fields", String[].class);
            if ((LJII instanceof String[]) && (objArr = (Object[]) LJII) != null) {
                list = ORY.LJJZZIII(objArr);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appVersion", EF7.LIZLLL());
        hashMap.put("device_id", AppLog.getServerDeviceId());
        hashMap.put("netType", C16880lQ.LLJILLL(EF7.LIZIZ()));
        hashMap.put("appName", EF7.LIZ());
        hashMap.put("aid", String.valueOf(EF7.LJIIIZ));
        hashMap.put("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        hashMap.put("versionCode", String.valueOf(EF7.LIZJ()));
        hashMap.put("channel", EF7.LJIILIIL);
        hashMap.put("os_version", Build.VERSION.RELEASE);
        hashMap.put("device_platform", "android");
        hashMap.put("ironManSupported", String.valueOf(C38499F9b.LIZ.LIZIZ().checkMiniAppEnable(EF7.LIZIZ())));
        hashMap.put("prefetch_enable", "1");
        hashMap.put("device_type", Build.MODEL);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashMap.remove(it.next());
            }
        }
        return hashMap;
    }
}
