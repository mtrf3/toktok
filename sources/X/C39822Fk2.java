package X;

import com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import yq4.a;

/* renamed from: X.Fk2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39822Fk2 extends HybridSettingInitConfig.IThirdConfig {
    @Override // com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig.IThirdConfig
    public final boolean isThirdPartyUrl(String str) {
        IComplianceBusinessService LJFF = a.LJFF();
        if (str == null) {
            str = "";
        }
        if (LJFF.LIZLLL(str)) {
            return true;
        }
        return false;
    }
}
