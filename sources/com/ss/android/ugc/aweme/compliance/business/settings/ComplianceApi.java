package com.ss.android.ugc.aweme.compliance.business.settings;

import X.AbstractC73672Svk;
import X.C62929Omr;
import X.E4Q;
import X.E4T;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.compliance.api.model.CmplRespForEncrypt;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.model.UltimateCmplSettings;

/* loaded from: classes11.dex */
public interface ComplianceApi {
    public static final C62929Omr LIZ = C62929Omr.LIZ;

    @E4Q("/aweme/v1/compliance/settings/")
    AbstractC73672Svk<ComplianceSetting> getComplianceSetting(@InterfaceC64986Pew("teen_mode_status") int i, @InterfaceC64986Pew("ftc_child_mode") int i2, @InterfaceC64986Pew("is_new_user") int i3);

    @E4Q("/tiktok/v1/ultimate/cmpl/settings/")
    AbstractC73672Svk<UltimateCmplSettings> getUltimateComplianceSettings();

    @E4T("/aweme/v1/cmpl/set/settings/")
    AbstractC73672Svk<CmplRespForEncrypt> setComplianceSettings(@InterfaceC64986Pew("settings") String str, @InterfaceC64986Pew("from_nuj") String str2);
}
