package X;

import com.bytedance.geckox.GeckoGlobalConfig;
import java.util.HashMap;

/* loaded from: classes11.dex */
public class O5X implements GeckoGlobalConfig.IMonitorConfig {
    @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
    public final String getMonitorHost() {
        return "https://mon.isnssdk.com";
    }

    @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
    public final String getPackageId() {
        return null;
    }

    @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
    public final boolean isOversea() {
        return true;
    }

    @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
    public final java.util.Map<String, String> getCommonParams() {
        HashMap hashMap = new HashMap();
        QJY.LJI(hashMap, true);
        hashMap.remove("mac_address");
        hashMap.remove("uuid");
        hashMap.remove("openudid");
        hashMap.remove("aliyun_uuid");
        hashMap.remove("oaid");
        return hashMap;
    }

    @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
    public final String getUpdateVersionCode() {
        return String.valueOf(EF7.LJFF());
    }

    @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
    public final String getChannel() {
        return EF7.LJIILIIL;
    }
}
