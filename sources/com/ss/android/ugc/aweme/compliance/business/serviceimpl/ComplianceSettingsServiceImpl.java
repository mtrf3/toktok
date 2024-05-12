package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.ActivityC45651qj;
import X.C208328Fo;
import X.C2U8;
import X.C47704Ins;
import X.C52241Ker;
import X.C58096Mr6;
import X.C61878OQg;
import X.C62910OmY;
import X.C62912Oma;
import X.C62913Omb;
import X.C62914Omc;
import X.C62915Omd;
import X.C62919Omh;
import X.C62921Omj;
import X.C62922Omk;
import X.C62928Omq;
import X.C73969T1h;
import X.C84763XOl;
import X.C9X3;
import X.EnumC62916Ome;
import X.FLK;
import X.InterfaceC62930Oms;
import X.InterfaceC62932Omu;
import X.T16;
import Y.ARunnableS45S0100000_9;
import Y.AfS62S0100000_10;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.service.ComplianceServiceImpl;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.model.LegalEntityChangeInfo;
import com.ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList;
import com.ss.android.ugc.aweme.compliance.api.model.PreferenceSettings;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.compliance.business.settings.ComplianceApi;
import com.ss.android.ugc.aweme.pipfeed.PipServiceImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes11.dex */
public final class ComplianceSettingsServiceImpl implements IComplianceSettingsService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void LJFF() {
        C62912Oma.LIZ(null);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void LJIIJJI() {
        C62913Omb.LIZLLL = false;
    }

    public static IComplianceSettingsService LJJIFFI() {
        Object LIZ = C58096Mr6.LIZ(IComplianceSettingsService.class, false);
        if (LIZ != null) {
            return (IComplianceSettingsService) LIZ;
        }
        if (C58096Mr6.LLZ == null) {
            synchronized (IComplianceSettingsService.class) {
                if (C58096Mr6.LLZ == null) {
                    C58096Mr6.LLZ = new ComplianceSettingsServiceImpl();
                }
            }
        }
        return C58096Mr6.LLZ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final String LIZJ() {
        String str;
        C62914Omc c62914Omc = C62913Omb.LIZIZ;
        String str2 = c62914Omc.LJI;
        if (str2 != null) {
            return str2;
        }
        Keva keva = c62914Omc.LIZIZ;
        ComplianceSetting LIZ = c62914Omc.LIZ();
        if (LIZ != null) {
            str = LIZ.getComplianceEncrypt();
        } else {
            str = null;
        }
        String string = keva.getString("cmpl_enc", str);
        if (string != null) {
            return string;
        }
        return "unknown";
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void LJIIIZ() {
        C62913Omb.LIZIZ.LIZIZ(null);
        a.LJIIJJI().LIZ();
        C62913Omb.LIZIZ(null, 0);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final ComplianceSetting LJIIL() {
        return C62913Omb.LIZIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final int LJIILLIIL() {
        ComplianceSetting LIZ = C62913Omb.LIZIZ.LIZ();
        if (LIZ != null) {
            return LIZ.isMixedAge();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final boolean LJIJI() {
        Integer enableImpressum;
        String str;
        C62914Omc c62914Omc = C62913Omb.LIZIZ;
        ComplianceSetting LIZ = c62914Omc.LIZ();
        if (LIZ == null || (enableImpressum = LIZ.getEnableImpressum()) == null || enableImpressum.intValue() == 0) {
            return false;
        }
        ComplianceSetting LIZ2 = c62914Omc.LIZ();
        if (LIZ2 == null || (str = LIZ2.getImpressumUrl()) == null) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final EnumC62916Ome LJIL() {
        PreferenceSettings preferenceSettings;
        C62928Omq c62928Omq = EnumC62916Ome.Companion;
        ComplianceSetting LJIIL = LJIIL();
        Integer num = null;
        if (LJIIL != null && (preferenceSettings = LJIIL.getPreferenceSettings()) != null) {
            num = Integer.valueOf(preferenceSettings.getStemFeedStatus());
        }
        c62928Omq.getClass();
        for (EnumC62916Ome enumC62916Ome : EnumC62916Ome.values()) {
            int value = enumC62916Ome.getValue();
            if (num != null && value == num.intValue()) {
                return enumC62916Ome;
            }
        }
        return EnumC62916Ome.UNKNOWN;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final List<String> LIZ() {
        List<String> blackSetting;
        ComplianceSetting LJIIL = LJIIL();
        if (LJIIL == null || (blackSetting = LJIIL.getBlackSetting()) == null) {
            return new ArrayList();
        }
        return blackSetting;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final String LIZIZ() {
        ComplianceSetting LJIIL = LJIIL();
        if (LJIIL != null) {
            return LJIIL.getInterfaceControlSettingsString();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final String LJI() {
        LegalEntityChangeInfo legalEntityChangeInfo;
        String title;
        ComplianceSetting LJIIL = LJIIL();
        if (LJIIL == null || (legalEntityChangeInfo = LJIIL.getLegalEntityChangeInfo()) == null || (title = legalEntityChangeInfo.getTitle()) == null) {
            return "";
        }
        return title;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final AdPersonalitySettings LJII() {
        ComplianceSetting LJIIL = LJIIL();
        if (LJIIL != null) {
            return LJIIL.getAdPersonalitySettings();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final List<PolicyBodyLinkList> LJIJJ() {
        LegalEntityChangeInfo legalEntityChangeInfo;
        List<PolicyBodyLinkList> bodyLinkList;
        ComplianceSetting LJIIL = LJIIL();
        if (LJIIL == null || (legalEntityChangeInfo = LJIIL.getLegalEntityChangeInfo()) == null || (bodyLinkList = legalEntityChangeInfo.getBodyLinkList()) == null) {
            return C61878OQg.INSTANCE;
        }
        return bodyLinkList;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final String LJIJJLI() {
        LegalEntityChangeInfo legalEntityChangeInfo;
        String body;
        ComplianceSetting LJIIL = LJIIL();
        if (LJIIL == null || (legalEntityChangeInfo = LJIIL.getLegalEntityChangeInfo()) == null || (body = legalEntityChangeInfo.getBody()) == null) {
            return "";
        }
        return body;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final boolean LJJ() {
        Boolean enableTermsConsentPopup;
        ComplianceSetting LJIIL = LJIIL();
        if (LJIIL != null && (enableTermsConsentPopup = LJIIL.getEnableTermsConsentPopup()) != null) {
            return enableTermsConsentPopup.booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final String LJJI() {
        String privacyPolicyUrl;
        ComplianceSetting LJIIL = LJIIL();
        if (LJIIL == null || (privacyPolicyUrl = LJIIL.getPrivacyPolicyUrl()) == null) {
            return "";
        }
        return privacyPolicyUrl;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final boolean LIZLLL() {
        return C62913Omb.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final boolean LJIILIIL() {
        return C62913Omb.LJ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void LJ(ComplianceSetting complianceSetting) {
        PreferenceSettings preferenceSettings;
        PreferenceSettings preferenceSettings2;
        PipServiceImpl.LJJII().LJIIIIZZ();
        if (complianceSetting != null) {
            if (complianceSetting.isMixedAge() != 0) {
                C2U8.LIZ(new C62921Omj(complianceSetting.isMixedAge()));
            }
            if (C52241Ker.LIZ() && (preferenceSettings = complianceSetting.getPreferenceSettings()) != null) {
                int stemFeedStatus = preferenceSettings.getStemFeedStatus();
                ComplianceSetting LIZ = C62913Omb.LIZIZ.LIZ();
                if (LIZ == null || (preferenceSettings2 = LIZ.getPreferenceSettings()) == null || preferenceSettings2.getStemFeedStatus() != stemFeedStatus) {
                    C2U8.LIZ(new C62910OmY());
                }
            }
            C62913Omb.LIZ(complianceSetting);
        }
        ComplianceServiceImpl.LIZ().LJIJ();
        if (C62913Omb.LJ()) {
            AppsFlyerLib.getInstance().setSharingFilterForAllPartners();
        }
        C9X3.LIZ.LIZ.erase("appeal_status_source");
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null && (LJIIIIZZ instanceof ActivityC45651qj)) {
            LJIIIIZZ.runOnUiThread(new ARunnableS45S0100000_9(LJIIIIZZ, 129));
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void LJIIJ(FLK flk) {
        C62915Omd LIZJ = C62913Omb.LIZJ();
        LIZJ.getClass();
        ((ComplianceApi) LIZJ.LIZ.getValue()).getUltimateComplianceSettings().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS62S0100000_10(flk, 33), new AfS62S0100000_10(flk, 34));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void LJIILJJIL(ComplianceSetting complianceSetting) {
        C62913Omb.LIZIZ.LIZIZ(complianceSetting);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void LJIIIIZZ(InterfaceC62932Omu interfaceC62932Omu, int i) {
        C62913Omb.LIZIZ(interfaceC62932Omu, i);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void LJIILL(String str, InterfaceC62930Oms interfaceC62930Oms) {
        C62913Omb.LIZJ().LIZIZ(str, null, interfaceC62930Oms);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void LJIIZILJ(String str, C47704Ins c47704Ins) {
        C62913Omb.LIZJ().LIZIZ(str, "1", c47704Ins);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final SpannableStringBuilder LJIJ(Context context, String str, List<PolicyBodyLinkList> list) {
        o.LJIIIZ(context, "context");
        return C208328Fo.LIZ(context, str, list, C62919Omh.LJLIL, C62922Omk.LJLIL);
    }
}
