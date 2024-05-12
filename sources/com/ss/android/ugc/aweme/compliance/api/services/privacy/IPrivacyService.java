package com.ss.android.ugc.aweme.compliance.api.services.privacy;

import X.AbstractC37594EpC;
import X.EE1;
import X.InterfaceC101453yX;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.List;

/* loaded from: classes8.dex */
public interface IPrivacyService {
    void LIZ();

    EE1 LIZIZ();

    PrivacySettingsRestrictionItem LIZJ(int i, String str);

    boolean LIZLLL();

    void LJ();

    InterfaceC101453yX LJFF();

    void LJI(String str);

    PrivacySettingsAgreementRecord LJII(String str);

    PrivacyUserSettingsV2 getPrivacyUserSettings();

    List<Class<? extends AbstractC37594EpC<?, ?>>> provideXBridgetIDLMethodList();
}
