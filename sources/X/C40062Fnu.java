package X;

import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.Fnu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40062Fnu {
    public static boolean LIZ(String url) {
        HybridSettingInitConfig LIZJ;
        HybridSettingInitConfig.IThirdConfig iThirdConfig;
        o.LJIIJ(url, "url");
        HybridMultiMonitor hybridMultiMonitor = HybridMultiMonitor.getInstance();
        o.LJFF(hybridMultiMonitor, "HybridMultiMonitor.getInstance()");
        InterfaceC40069Fo1 hybridSettingManager = hybridMultiMonitor.getHybridSettingManager();
        if (hybridSettingManager != null && (LIZJ = hybridSettingManager.LIZJ()) != null && (iThirdConfig = LIZJ.LJIIJ) != null) {
            return iThirdConfig.isThirdPartyUrl(url);
        }
        return false;
    }
}
