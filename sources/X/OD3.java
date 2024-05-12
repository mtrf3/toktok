package X;

import com.bytedance.geckox.GeckoGlobalConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class OD3 implements InterfaceC64016PAm {
    public final /* synthetic */ GeckoGlobalConfig.IMonitorConfig LIZ;
    public final /* synthetic */ GeckoGlobalConfig LIZIZ;

    @Override // X.InterfaceC64016PAm
    public final String getSessionId() {
        return null;
    }

    @Override // X.InterfaceC64016PAm
    public final java.util.Map<String, String> getCommonParams() {
        String str;
        java.util.Map<String, String> commonParams = this.LIZ.getCommonParams();
        if (commonParams == null) {
            commonParams = new HashMap<>();
        }
        if (this.LIZ.isOversea()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        commonParams.put("oversea", str);
        commonParams.put("host_aid", String.valueOf(this.LIZIZ.getAppId()));
        return commonParams;
    }

    public OD3(GeckoGlobalConfig.IMonitorConfig iMonitorConfig, GeckoGlobalConfig geckoGlobalConfig) {
        this.LIZ = iMonitorConfig;
        this.LIZIZ = geckoGlobalConfig;
    }
}
